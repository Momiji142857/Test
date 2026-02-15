package vanilla.expansion;

import mindustry.mod.Mod;
import mindustry.world.meta.Attribute;
import vanilla.expansion.content.*;

public class VanillaExpansion extends Mod {

    public static final Attribute plant = Attribute.add("plant");

    // 从饱和火力抄过来的qwq
    public static String name(String add) {
        return "ve2" + "-" + add;
    }

    @Override
    public void loadContent() {
        VeSounds.load();
        VeItems.load();
        VeStatusEffects.load();
        VeLiquids.load();
        VeWeathers.load();
        VeUnitTypes.load();
        VeBlocks.load();
        VePlanets.load();
        VeSectors.load();
        VeTechTree.load();
        VeOverride.load();
        SetShownPlanets.load();
    }
}
