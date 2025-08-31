/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.daniilsswords.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.daniilsswords.item.NinjatoItem;
import net.mcreator.daniilsswords.DaniilsSwordsMod;

public class DaniilsSwordsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DaniilsSwordsMod.MODID);
	public static final RegistryObject<Item> NINJATO = REGISTRY.register("ninjato", () -> new NinjatoItem());
	// Start of user code block custom items
	// End of user code block custom items
}