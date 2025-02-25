package raccoonman.reterraforged.data.worldgen.preset.settings;

import raccoonman.reterraforged.data.worldgen.preset.settings.ClimateSettings.BiomeNoise;
import raccoonman.reterraforged.data.worldgen.preset.settings.ClimateSettings.BiomeShape;
import raccoonman.reterraforged.data.worldgen.preset.settings.ClimateSettings.RangeValue;
import raccoonman.reterraforged.data.worldgen.preset.settings.FilterSettings.Erosion;
import raccoonman.reterraforged.data.worldgen.preset.settings.FilterSettings.Smoothing;
import raccoonman.reterraforged.data.worldgen.preset.settings.RiverSettings.Lake;
import raccoonman.reterraforged.data.worldgen.preset.settings.RiverSettings.River;
import raccoonman.reterraforged.data.worldgen.preset.settings.RiverSettings.Wetland;
import raccoonman.reterraforged.data.worldgen.preset.settings.TerrainSettings.General;
import raccoonman.reterraforged.data.worldgen.preset.settings.TerrainSettings.Terrain;
import raccoonman.reterraforged.data.worldgen.preset.settings.WorldSettings.Continent;
import raccoonman.reterraforged.data.worldgen.preset.settings.WorldSettings.ControlPoints;
import raccoonman.reterraforged.data.worldgen.preset.settings.WorldSettings.Properties;
import raccoonman.reterraforged.world.worldgen.cell.continent.MushroomIslandPopulator;
import raccoonman.reterraforged.world.worldgen.noise.function.DistanceFunction;

public class Presets {

	public static Preset makeLegacyDefault() {
		return new Preset(
			new WorldSettings(
				new Continent(ContinentType.MULTI_IMPROVED, DistanceFunction.EUCLIDEAN, 3000, 0.7F, 0.25F, 0.25F, 5, 0.26F, 4.33F),
				new ControlPoints(MushroomIslandPopulator.DEFAULT_INLAND_POINT, MushroomIslandPopulator.DEFAULT_COAST_POINT, 0.1F, 0.25F, 0.327F, 0.448F, 0.502F), 
				new Properties(SpawnType.CONTINENT_CENTER, 320, 64, 63, -54)
			), 
			new CaveSettings(0.0F, 1.5625F, 1.0F, 1.0F, 1.0F, 0.14285715F, 0.07F, 0.02F, true, false),
			new ClimateSettings(
				new RangeValue(0, 6, 2, 0.0F, 0.98F, 0.05F), 
				new RangeValue(0, 6, 1, 0.0F, 1.0F, 0.0F), 
				new BiomeShape(225, 8, 150, 80),
				new BiomeNoise(ClimateSettings.BiomeNoise.EdgeType.SIMPLEX, 24, 2, 0.5F, 2.65F, 14)
			), 
			new TerrainSettings(
				new General(0, 1200, 0.98F, 1.0F, true),
				new Terrain(1.0F, 1.0F, 1.0F, 1.0F), 
				new Terrain(2.0F, 1.0F, 1.0F, 1.0F), 
				new Terrain(2.0F, 1.0F, 1.0F, 1.0F),
				new Terrain(1.5F, 1.0F, 1.0F, 1.0F),
				new Terrain(1.5F, 1.0F, 1.0F, 1.0F), 
				new Terrain(1.0F, 1.0F, 1.0F, 1.0F), 
				new Terrain(2.0F, 1.0F, 1.0F, 1.0F), 
				new Terrain(2.5F, 1.0F, 1.0F, 1.0F),
				new Terrain(5.0F, 1.0F, 1.0F, 1.0F)
		    ), 
			new RiverSettings(
				0, 8, 
				new River(5, 2, 6, 20, 8, 0.75F),
				new River(4, 1, 4, 14, 5, 0.975F), 
				new Lake(0.3F, 0.0F, 0.03F, 10, 75, 150, 2, 10),
				new Wetland(0.6F, 175, 225)
			), 
			new FilterSettings(
				new Erosion(135, 12, 0.7F, 0.7F, 0.5F, 0.5F),
				new Smoothing(1, 1.8F, 0.9F)
			), 
			new StructureSettings(),
			new MiscellaneousSettings(true, 600, true, true, true, false, true, true, true, true, true, 0.4F, 0.4F)
		); 
	}
	
	public static Preset makeLegacyVanillaish() {
		return new Preset(
			new WorldSettings(
				new Continent(ContinentType.MULTI, DistanceFunction.EUCLIDEAN, 2000, 0.763F, 0.25F, 0.25F, 5, 0.26F, 4.33F),
				new ControlPoints(MushroomIslandPopulator.DEFAULT_INLAND_POINT, MushroomIslandPopulator.DEFAULT_COAST_POINT, 0.1F, 0.25F, 0.326F, 0.448F, 0.5F), 
				new Properties(SpawnType.WORLD_ORIGIN, 320, 64, 63, -54)
			), 
			new CaveSettings(1.0F, 1.5625F, 1.0F, 1.0F, 1.0F, 0.15F, 0.07F, 0.021F, true, false),
			new ClimateSettings(
				new RangeValue(0, 4, 1, 0.0F, 0.98F, 0.05F), 
				new RangeValue(0, 5, 1, 0.0F, 1.0F, 0.0F), 
				new BiomeShape(176, 6, 150, 80),
				new BiomeNoise(ClimateSettings.BiomeNoise.EdgeType.SIMPLEX, 24, 2, 0.5F, 2.65F, 14)
			), 
			new TerrainSettings(
				new General(0, 690, 0.629F, 0.629F, false),
				new Terrain(1.0F, 1.0F, 1.0F, 1.0F), 
				new Terrain(1.25F, 1.0F, 1.0F, 1.0F), 
				new Terrain(2.5F, 1.0F, 1.0F, 1.0F),
				new Terrain(2.0F, 1.0F, 1.0F, 1.0F),
				new Terrain(2.5F, 1.0F, 1.0F, 1.0F), 
				new Terrain(1.5F, 1.0F, 1.0F, 1.0F), 
				new Terrain(3.0F, 1.0F, 1.0F, 1.0F), 
				new Terrain(3.5F, 1.0F, 1.0F, 1.0F),
				new Terrain(6.0F, 1.0F, 1.0F, 1.0F)
			), 
			new RiverSettings(
				0, 11, 
				new River(5, 2, 6, 20, 8, 0.507F),
				new River(4, 1, 4, 14, 5, 0.493F), 
				new Lake(0.462F, 0.0F, 0.028F, 10, 75, 150, 2, 10),
				new Wetland(0.796F, 196, 255)
			), 
			new FilterSettings(
				new Erosion(100, 12, 0.699F, 0.699F, 0.5F, 0.5F),
				new Smoothing(2, 1.8F, 0.75F)
			), 
			new StructureSettings(),
			new MiscellaneousSettings(false, 600, false, true, false, false, false, false, true, true, true, 1.0F, 0.75F)
		); 
	}
	
	//TODO make mushroom islands bigger
	public static Preset makeLegacyBeautiful() {
		return new Preset(
			new WorldSettings(
				new Continent(ContinentType.MULTI, DistanceFunction.EUCLIDEAN, 3000, 0.8F, 0.25F, 0.25F, 5, 0.26F, 4.33F),
				new ControlPoints(MushroomIslandPopulator.DEFAULT_INLAND_POINT, MushroomIslandPopulator.DEFAULT_COAST_POINT, 0.1F, 0.25F, 0.326F, 0.448F, 0.5F), 
				new Properties(SpawnType.CONTINENT_CENTER, 320, 64, 63, -54)
			), 
			new CaveSettings(0.0F, 1.5625F, 1.0F, 1.0F, 1.0F, 0.14285715F, 0.07F, 0.02F, true, false),
			new ClimateSettings(
				new RangeValue(0, 7, 1, 0.0F, 1.0F, -0.004F), 
				new RangeValue(0, 6, 1, 0.0F, 1.0F, 0.0F), 
				new BiomeShape(185, 8, 150, 80),
				new BiomeNoise(ClimateSettings.BiomeNoise.EdgeType.SIMPLEX, 24, 2, 0.5F, 2.65F, 14)
			), 
			new TerrainSettings(
				new General(0, 1356, 1.0F, 1.175F, true),
				new Terrain(1.519F, 1.0F, 1.0F, 1.0F), 
				new Terrain(2.164F, 1.0F, 1.0F, 1.0F), 
				new Terrain(2.706F, 1.0F, 1.0F, 1.0F),
				new Terrain(1.184F, 1.0F, 1.0F, 1.0F),
				new Terrain(2.576F, 1.0F, 1.0F, 1.0F), 
				new Terrain(1.493F, 1.0F, 1.0F, 1.0F), 
				new Terrain(3.555F, 1.0F, 1.0F, 1.0F), 
				new Terrain(2.911F, 1.0F, 1.0F, 1.0F),
				new Terrain(7.5F, 1.0F, 1.0F, 1.0F)
			), 
			new RiverSettings(
				0, 14, 
				new River(5, 1, 4, 20, 5, 0.504F),
				new River(3, 1, 2, 12, 4, 0.5F), 
				new Lake(0.671F, 0.0F, 0.028F, 8, 75, 150, 2, 7),
				new Wetland(0.865F, 134, 201)
			), 
			new FilterSettings(
				new Erosion(175, 12, 0.648F, 0.657F, 0.5F, 0.5F),
				new Smoothing(1, 1.855F, 0.916F)
			), 
			new StructureSettings(),
			new MiscellaneousSettings(true, 684, true, true, true, false, true, true, true, true, false, 0.853F, 0.855F)
		); 
	}
	
	public static Preset makeLegacyLite() {
		return new Preset(
			new WorldSettings(
				new Continent(ContinentType.MULTI, DistanceFunction.EUCLIDEAN, 2000, 0.765F, 0.25F, 0.25F, 5, 0.26F, 4.33F),
				new ControlPoints(-1.0F, -1.0F, 0.1F, 0.25F, 0.326F, 0.448F, 0.5F), 
				new Properties(SpawnType.CONTINENT_CENTER, 320, 64, 63, -54)
			),
			new CaveSettings(0.0F, 1.5625F, 1.0F, 1.0F, 1.0F, 0.14285715F, 0.07F, 0.02F, false, false),
			new ClimateSettings(
				new RangeValue(0, 4, 1, 0.0F, 0.98F, 0.05F),
				new RangeValue(0, 5, 1, 0.0F, 1.0F, 0.0F), 
				new BiomeShape(176, 6, 150, 80),
				new BiomeNoise(ClimateSettings.BiomeNoise.EdgeType.SIMPLEX, 24, 2, 0.5F, 2.65F, 14)
			), 
			new TerrainSettings(
				new General(0, 690, 0.629F, 0.629F, false),
				new Terrain(1.0F, 1.0F, 1.0F, 1.0F), 
				new Terrain(1.25F, 1.0F, 1.0F, 1.0F), 
				new Terrain(2.5F, 1.0F, 1.0F, 1.0F),
				new Terrain(2.0F, 1.0F, 1.0F, 1.0F),
				new Terrain(2.5F, 1.0F, 1.0F, 1.0F), 
				new Terrain(1.5F, 1.0F, 1.0F, 1.0F), 
				new Terrain(3.0F, 1.0F, 1.0F, 1.0F), 
				new Terrain(3.5F, 1.0F, 1.0F, 1.0F),
				new Terrain(6.0F, 1.0F, 1.0F, 1.0F)
			), 
			new RiverSettings(
				0, 11, 
				new River(5, 2, 6, 20, 8, 0.507F),
				new River(4, 1, 4, 14, 5, 0.493F), 
				new Lake(0.462F, 0.0F, 0.028F, 10, 75, 150, 2, 10),
				new Wetland(0.796F, 196, 255)
			), 
			new FilterSettings(
				new Erosion(100, 12, 0.699F, 0.699F, 0.5F, 0.5F),
				new Smoothing(2, 1.799F, 0.75F)
			), 
			new StructureSettings(),
			new MiscellaneousSettings(true, 600, false, true, true, false, true, true, true, true, true, 1.0F, 0.75F)
		);
	}
	
	public static Preset makeLegacyHugeBiomes() {
		return new Preset(
			new WorldSettings(
				new Continent(ContinentType.MULTI, DistanceFunction.EUCLIDEAN, 4029, 0.8F, 0.25F, 0.25F, 5, 0.26F, 4.33F),
				new ControlPoints(-1.0F, -1.0F, 0.1F, 0.25F, 0.326F, 0.448F, 0.5F), 
				new Properties(SpawnType.CONTINENT_CENTER, 320, 64, 63, -54)
			), 
			new CaveSettings(0.0F, 1.5625F, 1.0F, 1.0F, 1.0F, 0.14285715F, 0.07F, 0.02F, true, false),
			new ClimateSettings(
				new RangeValue(0, 4, 2, 0.0F, 1.0F, 0.097F), 
				new RangeValue(0, 3, 1, 0.0F, 1.0F, 0.0F), 
				new BiomeShape(402, 5, 180, 110),
				new BiomeNoise(ClimateSettings.BiomeNoise.EdgeType.PERLIN2, 24, 1, 0.5F, 2.65F, 60)
			), 
			new TerrainSettings(
				new General(0, 1507, 1.0F, 1.175F, true),
				new Terrain(1.0F, 1.0F, 1.0F, 1.0F), 
				new Terrain(2.0F, 1.0F, 1.0F, 1.0F), 
				new Terrain(2.0F, 1.0F, 1.0F, 1.0F),
				new Terrain(1.5F, 1.0F, 1.0F, 1.0F),
				new Terrain(1.5F, 1.0F, 1.0F, 1.0F), 
				new Terrain(1.0F, 1.0F, 1.0F, 1.0F), 
				new Terrain(2.0F, 1.0F, 1.0F, 1.0F), 
				new Terrain(2.5F, 1.0F, 1.0F, 1.0F),
				new Terrain(5.0F, 1.0F, 1.0F, 1.0F)
			), 
			new RiverSettings(
				0, 13, 
				new River(5, 1, 5, 28, 9, 0.27F),
				new River(3, 1, 3, 18, 3, 0.7F), 
				new Lake(0.595F, 0.0F, 0.028F, 10, 75, 150, 2, 10),
				new Wetland(0.86F, 175, 225)
			), 
			new FilterSettings(
				new Erosion(165, 15, 0.612F, 0.652F, 0.5F, 0.5F),
				new Smoothing(1, 1.799F, 0.898F)
			), 
			new StructureSettings(),
			new MiscellaneousSettings(true, 721, true, true, true, false, true, true, true, true, false, 0.902F, 0.945F)
		);
	}
	
	//TODO
	public static Preset makeRTFDefault() {
		return new Preset(
			new WorldSettings(
				new Continent(ContinentType.MULTI_IMPROVED, DistanceFunction.EUCLIDEAN, 3000, 0.7F, 0.25F, 0.25F, 5, 0.26F, 4.33F),
				new ControlPoints(MushroomIslandPopulator.DEFAULT_INLAND_POINT, MushroomIslandPopulator.DEFAULT_COAST_POINT, 0.1F, 0.25F, 0.327F, 0.448F, 0.502F), 
				new Properties(SpawnType.CONTINENT_CENTER, 320, 64, 63, -54)
			), 
			new CaveSettings(0.0F, 1.5625F, 1.0F, 1.0F, 1.0F, 0.14285715F, 0.07F, 0.01F, true, true),
			new ClimateSettings(
				new RangeValue(0, 6, 2, 0.0F, 0.98F, 0.05F), 
				new RangeValue(0, 6, 1, 0.0F, 1.0F, 0.0F), 
				new BiomeShape(225, 8, 150, 80),
				new BiomeNoise(ClimateSettings.BiomeNoise.EdgeType.SIMPLEX, 24, 2, 0.5F, 2.65F, 14)
			), 
			new TerrainSettings(
				new General(0, 1200, 0.98F, 1.0F, true),
				new Terrain(1.0F, 1.0F, 1.0F, 1.0F), 
				new Terrain(2.0F, 1.0F, 1.0F, 1.0F), 
				new Terrain(2.0F, 1.0F, 1.0F, 1.0F),
				new Terrain(1.5F, 1.0F, 1.0F, 1.0F),
				new Terrain(1.5F, 1.0F, 1.0F, 1.0F), 
				new Terrain(1.0F, 1.0F, 1.0F, 1.0F), 
				new Terrain(2.0F, 1.0F, 1.0F, 1.0F), 
				new Terrain(2.5F, 1.0F, 1.0F, 1.0F),
				new Terrain(5.0F, 1.0F, 1.0F, 1.0F)
			), 
			new RiverSettings(
				0, 8, 
				new River(5, 2, 6, 20, 8, 0.75F),
				new River(4, 1, 4, 14, 5, 0.975F), 
				new Lake(0.3F, 0.0F, 0.03F, 10, 75, 150, 2, 10),
				new Wetland(0.6F, 175, 225)
			), 
			new FilterSettings(
				new Erosion(135, 12, 0.7F, 0.7F, 0.5F, 0.5F),
				new Smoothing(1, 1.8F, 0.9F)
			), 
			new StructureSettings(),
			new MiscellaneousSettings(true, 600, true, true, true, false, true, true, true, true, true, 0.4F, 0.4F)
		); 
	}
	
	public static Preset makeLegacy1_18() {
		throw new UnsupportedOperationException("TODO");
	}
}
