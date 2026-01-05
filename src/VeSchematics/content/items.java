package VeSchematics.content;

import arc.graphics.Color;
import mindustry.type.Item;

import VeSchematics.content.items;

public class items {
    public static Item
            aluminium, capacitor, catalyzon, silicide, carbonShaleCobble;

    public static void load(){
        aluminium = new Item("aluminium", Color.valueOf("eae3c3")) {{
            hardness = 1;
            cost = 0.2f;
            healthScaling = 0;
        }};

        capacitor = new Item("capacitor", Color.valueOf("e8d174")) {{
            explosiveness = 1f;
            charge = 3.6f;
            cost = 1.2f;
            healthScaling = 0;
        }};

        catalyzon = new Item("catalyzon", Color.valueOf("a799a6")) {{
            charge = 0.2f;
            hardness = 2;
            cost = 0.7f;
            healthScaling = 0;
        }};

        silicide = new Item("silicide", Color.valueOf("646567")) {{
            flammability = -1f;
            cost = 1.6f;
            healthScaling = 1.6f;
        }};

        carbonShaleCobble = new Item("carbonShaleCobble", Color.valueOf("3c4448")) {{
            flammability = 0.5f;
            hardness = 7;
            cost = 0.7f;
            lowPriority = true;
        }};
    }
}
