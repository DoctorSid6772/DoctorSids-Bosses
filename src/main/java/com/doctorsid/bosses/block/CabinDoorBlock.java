package com.doctorsid.bosses.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class CabinDoorBlock extends Block {
    private boolean locked;

    public CabinDoorBlock(Settings settings) {
        super(settings);
        this.locked = true; // The door is locked by default
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(Properties.OPEN);
    }

    @Override
    public ActionResult onUse(World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack stack = player.getStackInHand(hand);
        Item keyItem = /* Your key item here */;

        if (locked && stack.getItem() == keyItem) {
            locked = false; // Unlock the door
            // Additional logic to change the door state to unlocked
            return ActionResult.success(world.isClient());
        }
        if (!locked) {
            // Logic to open the door
            return ActionResult.success(world.isClient());
        }
        return ActionResult.FAIL;
    }

    @Override
    public boolean hasBlockStateProperties() {
        return true;
    }
}