package vanilla.expansion.content;

import static mindustry.content.TechTree.node;
import static mindustry.content.TechTree.nodeRoot;
import static mindustry.type.ItemStack.with;
import static vanilla.expansion.content.VeBlocks.*;

public class VeTechTree {
    public static void load() {
        VePlanets.cyclant.techTree = nodeRoot("ve-cyclant", isomorphicCoreShard, () -> {
            node(rail, with(VeItems.aluminium, 10), () -> {

            });
        });
    }
}
