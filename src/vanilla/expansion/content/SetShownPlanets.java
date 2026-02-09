package vanilla.expansion.content;

import mindustry.content.Planets;
import mindustry.type.Item;
import mindustry.type.Liquid;
import mindustry.type.Planet;

public class SetShownPlanets {
    public static void load() {

        // Items
        addPlanetToItems(
                Planets.serpulo,
                VeItems.quartz, VeItems.silicide, VeItems.salt
        );
        addPlanetToItems(
                VePlanets.cyclant,
                VeItems.aluminium, VeItems.quartz, VeItems.catalyzon, VeItems.silicide, VeItems.salt,
                VeItems.plantMatter, VeItems.chromium, VeItems.sodium, VeItems.carbonShaleCobble, VeItems.shaleCobble,
                VeItems.nitroalkoss, VeItems.cobalt, VeItems.fibralt, VeItems.fusionFuel, VeItems.capacitor,
                VeItems.warpNucleus
        );
        addPlanetToItems(
                VePlanets.phoon,
                VeItems.aluminium, VeItems.quartz, VeItems.catalyzon, VeItems.silicide, VeItems.salt,
                VeItems.plantMatter, VeItems.chromium, VeItems.sodium, VeItems.carbonShaleCobble, VeItems.shaleCobble,
                VeItems.nitroalkoss, VeItems.cobalt, VeItems.fibralt, VeItems.fusionFuel, VeItems.capacitor,
                VeItems.warpNucleus
        );
        addPlanetToItems(
                VePlanets.sitrullus,
                VeItems.quartz, VeItems.silicide, VeItems.nitroalkoss, VeItems.ferrum, VeItems.silver,
                VeItems.melonDirt, VeItems.sugar
        );
        addPlanetToItems(
                VePlanets.maress,
                VeItems.aluminium, VeItems.quartz, VeItems.catalyzon, VeItems.silicide, VeItems.salt,
                VeItems.chromium, VeItems.sodium, VeItems.nitroalkoss, VeItems.fibralt, VeItems.fusionFuel,
                VeItems.capacitor, VeItems.warpNucleus, VeItems.redSoil, VeItems.ferrum, VeItems.reflectorMatter,
                VeItems.ferricShaleCobble, VeItems.silver, VeItems.astroPlate, VeItems.phecteel
        );

        // Liquids
        VeLiquids.lava.shownPlanets.addAll(VePlanets.cyclant, VePlanets.phoon, VePlanets.maress);
        VeLiquids.chlorine.shownPlanets.addAll(VePlanets.cyclant, VePlanets.phoon, VePlanets.maress);
        VeLiquids.melonWater.shownPlanets.add(VePlanets.sitrullus);

    }

    // 将一个星球添加到多个物品的shownPlanets列表
    public static void addPlanetToItems(Planet planet, Item... items) {
        for (Item item : items) {
            item.shownPlanets.add(planet);
        }
    }

    // 将一个星球添加到多个液体的shownPlanets列表
    public static void addPlanetToLiquids(Planet planet, Liquid... liquids) {
        for (Liquid liquid : liquids) {
            liquid.shownPlanets.add(planet);
        }
    }

}
