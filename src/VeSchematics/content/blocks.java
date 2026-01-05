package VeSchematics.content;

import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.production.GenericCrafter;

public class blocks {
    public static Block
        carbonShaleSmelter, catalyzon_crafter;

    public static void load(){
        carbonShaleSmelter = new GenericCrafter("carbon-shale-smelter"){{
            requirements(Category.crafting, ItemStack.with(items.aluminium, 60, Items.lead, 55, items.silicide, 30));

            outputItem = new ItemStack(Items.silicon, 2);
            craftTime = 120f;
            hasItems = true;
            hasPower = true;
            itemCapacity = 20;
            size = 2;
            consumePower(1.3f);

            consumeItem(items.carbonShaleCobble, 2);
        }};
    }
}
