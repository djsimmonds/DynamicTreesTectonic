package com.djs.dttectonic;

import net.minecraft.data.worldgen.biome.OverworldBiomes;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegisterTectonicBiomes {

	public static final DeferredRegister<Biome> REGISTER = DeferredRegister.create(ForgeRegistries.BIOMES, "tectonic");
	public static final RegistryObject<Biome> ALPINE_MEADOW = REGISTER.register("alpine_meadow", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.meadow()).build();
	});
	public static final RegistryObject<Biome> AUTUMN_BIRCH_FOREST = REGISTER.register("autumn_birch_forest", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.darkForest()).build();
	});
	public static final RegistryObject<Biome> AUTUMN_FOREST = REGISTER.register("autumn_forest", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.darkForest()).build();
	});
	public static final RegistryObject<Biome> COLD_BEACH = REGISTER.register("cold_beach", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.theVoid()).build();
	});
	public static final RegistryObject<Biome> COLD_CLIFFS = REGISTER.register("cold_cliffs", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.stonyPeaks()).build();
	});
	public static final RegistryObject<Biome> COLD_PLAINS = REGISTER.register("cold_plains", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.meadow()).build();
	});
	public static final RegistryObject<Biome> COLD_RIVER = REGISTER.register("cold_river", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.river(true)).build();
	});
	public static final RegistryObject<Biome> CORAL_RIVER = REGISTER.register("coral_river", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.river(true)).build();
	});
	public static final RegistryObject<Biome> DESERT_DUNES = REGISTER.register("desert_dunes", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.desert()).build();
	});
	public static final RegistryObject<Biome> DRIPSTONE_RIVER = REGISTER.register("dripstone_river", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.river(true)).build();
	});
	public static final RegistryObject<Biome> GRASSLANDS = REGISTER.register("grasslands", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.meadow()).build();
	});
	public static final RegistryObject<Biome> ICY_CLIFFS = REGISTER.register("icy_cliffs", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.stonyPeaks()).build();
	});
	public static final RegistryObject<Biome> ICY_RIVER = REGISTER.register("icy_river", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.river(true)).build();
	});
	public static final RegistryObject<Biome> ISLAND = REGISTER.register("island", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.meadow()).build();
	});
	public static final RegistryObject<Biome> LAGOON = REGISTER.register("lagoon", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.theVoid()).build();
	});
	public static final RegistryObject<Biome> LANTERN_RIVER = REGISTER.register("lantern_river", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.river(true)).build();
	});
	public static final RegistryObject<Biome> LUKEWARM_BEACH = REGISTER.register("lukewarm_beach", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.theVoid()).build();
	});
	public static final RegistryObject<Biome> LUKEWARM_CLIFFS = REGISTER.register("lukewarm_cliffs", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.stonyPeaks()).build();
	});
	public static final RegistryObject<Biome> LUSH_RIVER = REGISTER.register("lush_river", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.river(true)).build();
	});
	public static final RegistryObject<Biome> OLD_GROWTH_SNOWY_TAIGA = REGISTER.register("old_growth_snowy_taiga", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.darkForest()).build();
	});
	public static final RegistryObject<Biome> RED_DESERT = REGISTER.register("red_desert", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.desert()).build();
	});
	public static final RegistryObject<Biome> RED_DESERT_DUNES = REGISTER.register("red_desert_dunes", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.desert()).build();
	});
	public static final RegistryObject<Biome> SANDSTONE_CLIFFS = REGISTER.register("sandstone_cliffs", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.desert()).build();
	});
	public static final RegistryObject<Biome> WARM_RIVER = REGISTER.register("warm_river", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.river(true)).build();
	});
	public static final RegistryObject<Biome> BADLANDS_SPIRES = REGISTER.register("badlands_spires", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.desert()).build();
	});
	public static final RegistryObject<Biome> EVERGREEN_FOREST = REGISTER.register("evergreen_forest", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.darkForest()).build();
	});
	public static final RegistryObject<Biome> OLD_GROWTH_EVERGREEN_FOREST = REGISTER.register("old_growth_evergreen_forest", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.darkForest()).build();
	});
	public static final RegistryObject<Biome> WHITE_CLIFFS = REGISTER.register("white_cliffs", () -> {
		return Biome.BiomeBuilder.from(OverworldBiomes.stonyPeaks()).build();
	});
	
//    @SubscribeEvent	
    public static void register(IEventBus bus) {
        REGISTER.register(bus);
    }

}