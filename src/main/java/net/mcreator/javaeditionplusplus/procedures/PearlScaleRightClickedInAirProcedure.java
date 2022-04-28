package net.mcreator.javaeditionplusplus.procedures;

import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class PearlScaleRightClickedInAirProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
			Arrow entityToSpawn = new Arrow(_ent_sa.level, _ent_sa);
			entityToSpawn.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 5, 0);
			entityToSpawn.setBaseDamage(5);
			entityToSpawn.setKnockback(5);
			_ent_sa.level.addFreshEntity(entityToSpawn);
		}
	}
}
