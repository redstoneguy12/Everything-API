package io.github.fabriccommunity.everything.api.event.v3.implementation;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Objects;
import java.util.Optional;

import io.github.fabriccommunity.everything.api.event.v3.Event;

public class BlockEvents {
	public interface ADD_BLOCK extends Event {
		void accept(World world, BlockState newBlockState, BlockState oldBlockState, Block newBlock, Block oldBlock, BlockPos blockPosition, boolean moved);

		static int staticId() {
			return Objects.hash("add_block");
		}

		@Override
		default int dynamicId() {
			return staticId();
		}
	}

	public interface REMOVE_BLOCK extends Event {
		void accept(World world, Optional<BlockEntity> blockEntity, BlockState newBlockState, BlockState oldBlockState, Block newBlock, Block oldBlock, BlockPos blockPosition, boolean moved);

		static int staticId() {
			return Objects.hash("remove_block");
		}

		@Override
		default int dynamicId() {
			return staticId();
		}
	}

	public interface BREAK_BLOCK extends Event {
		void accept(World world, Optional<BlockEntity> blockEntity, BlockState blockState, Block block, BlockPos blockPosition, PlayerEntity player, ItemStack stack);

		static int staticId() {
			return Objects.hash("break_block");
		}

		@Override
		default int dynamicId() {
			return staticId();
		}
	}

	public interface PLACE_BLOCK extends Event {
		void accept(World world, BlockState blockState, Block block, BlockPos blockPosition, Optional<LivingEntity> placer, ItemStack stack);

		static int staticId() {
			return Objects.hash("place_block");
		}

		@Override
		default int dynamicId() {
			return staticId();
		}
	}

	public interface USE_BLOCK extends Event {
		void accept(World world, Optional<BlockEntity> blockEntity, BlockState blockState, Block block, BlockPos blockPosition, PlayerEntity player, Hand hand, BlockHitResult hitResult);

		static int staticId() {
			return Objects.hash("use_block");
		}

		@Override
		default int dynamicId() {
			return staticId();
		}
	}

	public interface STEP_ON_BLOCK extends Event {
		void accept(World world, Optional<BlockEntity> blockEntity, BlockState blockState, Block block, BlockPos blockPosition, Entity entity);

		static int staticId() {
			return Objects.hash("step_on_block");
		}

		@Override
		default int dynamicId() {
			return staticId();
		}
	}

	public interface LAND_ON_BLOCK extends Event {
		void accept(World world, Optional<BlockEntity> blockEntity, BlockState blockState, Block block, BlockPos blockPosition, Entity entity, float distance);

		static int staticId() {
			return Objects.hash("land_on_block");
		}

		@Override
		default int dynamicId() {
			return staticId();
		}
	}

	public interface COLLIDE_WITH_BLOCK extends Event {
		void accept(World world, Optional<BlockEntity> blockEntity, BlockState blockState, Block block, BlockPos blockPosition, Entity entity);

		static int staticId() {
			return Objects.hash("collide_with_block");
		}

		@Override
		default int dynamicId() {
			return staticId();
		}
	}
}
