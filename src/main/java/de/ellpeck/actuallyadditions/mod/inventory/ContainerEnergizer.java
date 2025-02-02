/*
 * This file ("ContainerEnergizer.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.mod.inventory;

import com.mojang.datafixers.util.Pair;
import de.ellpeck.actuallyadditions.mod.inventory.slot.ArmorSlot;
import de.ellpeck.actuallyadditions.mod.inventory.slot.SlotItemHandlerUnconditioned;
import de.ellpeck.actuallyadditions.mod.inventory.slot.SlotOutput;
import de.ellpeck.actuallyadditions.mod.tile.TileEntityEnergizer;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.InventoryMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.capabilities.Capabilities;

import java.util.Objects;

public class ContainerEnergizer extends AbstractContainerMenu {

    public static final EquipmentSlot[] VALID_EQUIPMENT_SLOTS = new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET};
    public final TileEntityEnergizer energizer;

    public static ContainerEnergizer fromNetwork(int windowId, Inventory inv, FriendlyByteBuf data) {
        return new ContainerEnergizer(windowId, inv, (TileEntityEnergizer) Objects.requireNonNull(inv.player.level().getBlockEntity(data.readBlockPos())));
    }

    public ContainerEnergizer(int windowId, Inventory inventory, TileEntityEnergizer tile) {
        super(ActuallyContainers.ENERGIZER_CONTAINER.get(), windowId);
        this.energizer = tile;

        this.addSlot(new SlotItemHandlerUnconditioned(this.energizer.inv, 0, 76, 73) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                return super.mayPlace(stack) && stack.getCapability(Capabilities.EnergyStorage.ITEM, null) != null;
            }
        });
        this.addSlot(new SlotOutput(this.energizer.inv, 1, 76, 42));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                this.addSlot(new Slot(inventory, j + i * 9 + 9, 8 + j * 18, 97 + i * 18));
            }
        }
        for (int i = 0; i < 9; i++) {
            this.addSlot(new Slot(inventory, i, 8 + i * 18, 155));
        }

        for (int k = 0; k < 4; ++k) {
            EquipmentSlot slot = VALID_EQUIPMENT_SLOTS[k];
            ResourceLocation resourcelocation = InventoryMenu.TEXTURE_EMPTY_SLOTS.getOrDefault(slot, InventoryMenu.EMPTY_ARMOR_SLOT_SHIELD);
            this.addSlot(new ArmorSlot(inventory, slot, 36 + 3 - k, 102, 19 + k * 18, resourcelocation) {});
        }

        this.addSlot(new Slot(inventory, 40, 120, 19 + 3 * 18) {
            @Override
            public void setByPlayer(ItemStack newStack, ItemStack oldStack) {
                inventory.player.onEquipItem(EquipmentSlot.OFFHAND, oldStack, newStack);
                super.setByPlayer(newStack, oldStack);
            }

            @Override
            public Pair<ResourceLocation, ResourceLocation> getNoItemIcon() {
                return Pair.of(InventoryMenu.BLOCK_ATLAS, InventoryMenu.EMPTY_ARMOR_SLOT_SHIELD);
            }
        });
    }

    @Override
    public ItemStack quickMoveStack(Player player, int slot) {
        int inventoryStart = 2;
        int inventoryEnd = inventoryStart + 26;
        int hotbarStart = inventoryEnd + 1;
        int hotbarEnd = hotbarStart + 8;

        Slot theSlot = this.slots.get(slot);

        if (theSlot != null && theSlot.hasItem()) {
            ItemStack newStack = theSlot.getItem();
            ItemStack currentStack = newStack.copy();

            //Slots in Inventory to shift from
            if (slot == 1) {
                if (!this.moveItemStackTo(newStack, inventoryStart, hotbarEnd + 1, true)) {
                    return ItemStack.EMPTY;
                }
                theSlot.onQuickCraft(newStack, currentStack);
            }
            //Other Slots in Inventory excluded
            else if (slot >= inventoryStart) {
                //Shift from Inventory
                if (newStack.getCapability(Capabilities.EnergyStorage.ITEM, null) != null) {
                    if (!this.moveItemStackTo(newStack, 0, 1, false)) {
                        return ItemStack.EMPTY;
                    }
                }
                //

                else if (slot >= inventoryStart && slot <= inventoryEnd) {
                    if (!this.moveItemStackTo(newStack, hotbarStart, hotbarEnd + 1, false)) {
                        return ItemStack.EMPTY;
                    }
                } else if (slot >= inventoryEnd + 1 && slot < hotbarEnd + 1 && !this.moveItemStackTo(newStack, inventoryStart, inventoryEnd + 1, false)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.moveItemStackTo(newStack, inventoryStart, hotbarEnd + 1, false)) {
                return ItemStack.EMPTY;
            }

            if (newStack.isEmpty()) {
                theSlot.set(ItemStack.EMPTY);
            } else {
                theSlot.setChanged();
            }

            if (newStack.getCount() == currentStack.getCount()) {
                return ItemStack.EMPTY;
            }
            theSlot.onTake(player, newStack);

            return currentStack;
        }
        return ItemStack.EMPTY;
    }

    @Override
    public boolean stillValid(Player player) {
        return this.energizer.canPlayerUse(player);
    }
}
