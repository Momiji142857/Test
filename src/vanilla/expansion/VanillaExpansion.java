package vanilla.expansion;


import mindustry.mod.Mod;
import vanilla.expansion.content.*;

public class VanillaExpansion extends Mod {
    @Override
    public void loadContent() {
        VeItems.load();
        VeStatusEffects.load();
        VeWeathers.load();
        VeLiquids.load();
        VeUnitTypes.load();
        VeBlocks.load();
        VePlanets.load();
        VeSectors.load();
        VeTechTree.load();
    }
}
