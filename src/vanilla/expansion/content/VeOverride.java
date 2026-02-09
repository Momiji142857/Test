package vanilla.expansion.content;

import arc.struct.Seq;
import mindustry.content.*;
import mindustry.ctype.UnlockableContent;
import mindustry.game.Objectives;
import mindustry.type.Item;
import mindustry.type.Liquid;
import mindustry.type.Planet;
import mindustry.world.blocks.units.UnitFactory;

import static mindustry.type.ItemStack.with;
import static vanilla.expansion.content.VeItems.*;

public class VeOverride {

    public static TechTree.TechNode context = null;

    public static void load() {

        // Items
        Items.pyratite.hardness = 2;

        addPlanetToItems(VePlanets.cyclant,
                Items.lead, Items.metaglass, Items.graphite, Items.sand, Items.coal,
                Items.titanium,  Items.thorium, Items.scrap, Items.silicon, Items.plastanium,
                Items.phaseFabric, Items.surgeAlloy, Items.sporePod, Items.blastCompound, Items.pyratite
        );
        addPlanetToItems(VePlanets.phoon,
                Items.lead, Items.metaglass, Items.graphite, Items.sand, Items.coal,
                Items.titanium,  Items.thorium, Items.scrap, Items.silicon, Items.plastanium,
                Items.phaseFabric, Items.surgeAlloy, Items.sporePod, Items.blastCompound, Items.pyratite
        );
        addPlanetToItems(VePlanets.sitrullus,
                Items.graphite, Items.coal, Items.silicon
        );
        addPlanetToItems(VePlanets.maress,
                Items.lead, Items.metaglass, Items.graphite, Items.sand, Items.coal,
                Items.thorium, Items.silicon, Items.phaseFabric, Items.surgeAlloy, Items.blastCompound,
                Items.pyratite
        );

        // StatusEffects
        StatusEffects.corroded.buildSpeedMultiplier = 1.75f;
        StatusEffects.corroded.damage = 0.3f;

        // Liquids
        addPlanetToLiquids(
                VePlanets.cyclant,
                Liquids.water, Liquids.slag,  Liquids.oil, Liquids.cryofluid, Liquids.hydrogen
        );
        addPlanetToLiquids(
                VePlanets.phoon,
                Liquids.water, Liquids.slag,  Liquids.oil, Liquids.cryofluid, Liquids.hydrogen
        );
        addPlanetToLiquids(
                VePlanets.sitrullus,
                Liquids.water, Liquids.hydrogen
        );
        addPlanetToLiquids(
                VePlanets.maress,
                Liquids.water, Liquids.hydrogen
        );

        // Blocks
        Blocks.worldMessage.forceDark = true;
        Blocks.worldSwitch.forceDark = true;
        ((UnitFactory)Blocks.groundFactory).plans.add(
                new UnitFactory.UnitPlan(UnitTypes.flare, 60f * 40, with(Items.silicon, 30, Items.lead, 15, VeItems.silicide, 20)),
                new UnitFactory.UnitPlan(UnitTypes.mono, 60f * 25, with(Items.silicon, 30, Items.lead, 20)),
                new UnitFactory.UnitPlan(UnitTypes.risso, 60f * 25, with(Items.silicon, 30, Items.lead, 20))
        );
        ((UnitFactory)Blocks.airFactory).plans.add(
                new UnitFactory.UnitPlan(UnitTypes.dagger, 60f * 20, with(Items.silicon, 20, Items.graphite, 20)),
                new UnitFactory.UnitPlan(UnitTypes.crawler, 60f * 25, with(Items.silicon, 30, Items.graphite, 20)),
                new UnitFactory.UnitPlan(UnitTypes.nova, 60f * 20, with(Items.silicon, 25, Items.lead, 10)),
                new UnitFactory.UnitPlan(UnitTypes.risso, 60f * 55, with(Items.silicon, 45, VeItems.quartz, 20))
        );

        // TechTree
        addAfter(
                SectorPresets.groundZero,
                TechTree.node(VeSectors.classic175, Seq.with(new Objectives.OnSector(SectorPresets.groundZero)), () -> {
                    TechTree.node(VeSectors.classic222, Seq.with(new Objectives.OnSector(SectorPresets.frozenForest)), () -> {
                        TechTree.node(VeSectors.classic223, Seq.with(new Objectives.OnSector(SectorPresets.frozenForest)), () -> {
                            TechTree.node(VeSectors.classic133, Seq.with(new Objectives.OnSector(SectorPresets.overgrowth)), () -> {});
                            TechTree.node(VeSectors.classic195, Seq.with(new Objectives.OnSector(SectorPresets.frontier)), () -> {});
                            TechTree.node(VeSectors.classic7, Seq.with(new Objectives.OnSector(SectorPresets.nuclearComplex)), () -> {});
                        });
                        TechTree.node(VeSectors.classic85, Seq.with(new Objectives.OnSector(SectorPresets.frozenForest)), () -> {});
                    });
                })
        );
        addAfter(
                Items.sand,
                TechTree.nodeProduce(quartz, () -> {
                    TechTree.nodeProduce(silicide, () -> {});
                })
        );

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

    /* 在已有节点后面添加新节点
    * addAfter(父节点解锁的内容, 要添加的新节点) */
    public static void addAfter(UnlockableContent c, TechTree.TechNode newNode) {
        context = TechTree.all.find((t) -> t.content == c);

        if (context == null) {
            throw new IllegalArgumentException("未找到父节点, 预期解锁内容: " + c);
        }

        if (newNode == null) {
            throw new IllegalArgumentException("新节点不能为空");
        }

        context.children.add(newNode);
        newNode.parent = context;
    }

}
