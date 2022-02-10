package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import dev.acousticjamm.underveil.network.UnderveilModVariables;

public class VeilCastleSpawn1OnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("underveil", "castle_fix"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos((int) x, (int) (y - 10), (int) z), new BlockPos((int) x, (int) (y - 10), (int) z),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
						3);
			}
		}
		UnderveilModVariables.MapVariables.get(world).firstLoad = true;
		UnderveilModVariables.MapVariables.get(world).syncData(world);
		if (!entity.level.isClientSide())
			entity.discard();
	}
}
