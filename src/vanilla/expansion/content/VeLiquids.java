package vanilla.expansion.content;


import arc.graphics.Color;
import mindustry.content.Liquids;
import mindustry.content.StatusEffects;
import mindustry.type.Liquid;

public class VeLiquids {
    public static Liquid
            lava, chlorine, melonWater, sandboxBlastLiquid;

    public static void load() {

        lava = new Liquid("lava", Color.valueOf("f17e10")) {{
            barColor = Color.valueOf("df1717");
            lightColor = Color.valueOf("df171744");
            heatCapacity = 0.2f;
            temperature = 1.2f;
            viscosity = 0.95f;
            effect = StatusEffects.melting;
            boilPoint = 2f;
            canStayOn.add(Liquids.slag);
        }};

        chlorine = new Liquid("chlorine", Color.valueOf("e6f66c")) {{
            gas = true;
            barColor = Color.valueOf("e6f66c");
            flammability = 0.8f;
            explosiveness = 0.6f;
        }};

        melonWater = new Liquid("melon-water", Color.valueOf("e44646")) {{
            gasColor = Color.valueOf("ffffff");
            temperature = 0.4f;
            heatCapacity = 0.6f;
            viscosity = 0.55f;
            effect = StatusEffects.wet;
            boilPoint = 0.6f;
        }};

        sandboxBlastLiquid = new Liquid("sandbox-blast-liquid", Color.valueOf("f25555")) {{
            gas = true;
            barColor = Color.valueOf("f25555");
            explosiveness = 100f;
            hidden = true;
        }};

    }
}
