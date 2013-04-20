/**
 * This Code is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 */
// Created @ 20 Apr 2013
package vazkii.gencreator.world.staticspawner;

import java.util.Arrays;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.ReflectionHelper;

/**
 * ModifierEmerald
 *
 * The Emerald modifier, it prevents the entity from dropping
 * any held/equipped items upon death.
 *
 * @author Vazkii
 */
public class ModifierEmerald implements IModifier {

	@Override
	public void apply(ItemStack stack, EntityLiving entity) {
		float[] values = new float[5];
		Arrays.fill(values, 0F);
		changeEntityDropChances(entity, values);
	}

	public void changeEntityDropChances(EntityLiving entity, float[] values) {
		ReflectionHelper.setPrivateValue(EntityLiving.class, entity, values, 67);
	}
}
