package vanilla.expansion.content;


import arc.graphics.Color;
import mindustry.content.Liquids;
import mindustry.content.StatusEffects;
import mindustry.type.Liquid;

public class VeLiquids {
    public static Liquid
            lava, chlorine, melonWater,
            sandboxBlastLiquid;

    public static void load() {

        lava = new Liquid("lava", Color.valueOf("f17e10")) {{
            barColor = Color.valueOf("df1717");
            lightColor = Color.valueOf("df171744");
            temperature = 1.2f;
            heatCapacity = 0.2f;
            viscosity = 0.95f;
            boilPoint = 2f;
            effect = StatusEffects.melting;
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
            boilPoint = 0.6f;
            effect = StatusEffects.wet;
        }};

        sandboxBlastLiquid = new Liquid("sandbox-blast-liquid", Color.valueOf("f25555")) {{
            gas = true;
            barColor = Color.valueOf("f25555");
            explosiveness = 100f;
            hidden = true;
        }};

        /*
        liquid = new Liquid("", Color.valueOf("")) {{
            gas = ; // false 是否为气体
            gasColor = Color.valueOf(""); // = Color 气态下的颜色
            barColor = Color.valueOf(""); // 界面中的颜色
            lightColor = Color.valueOf(""); // 发出的光的颜色
            hidden = ; // 是否隐藏

            // 属性
            flammability = f; // 燃烧性
            temperature = f; // 0.5f 温度
            heatCapacity = f; // 0.5f 热容量
            viscosity = f; // 0.5f 粘度
            explosiveness = f; // 爆炸性
            boilPoint = f; // 2f 沸点
            coolant = ; // true 能否作为冷却液
            incinerable = ; // true 能否被焚毁
            effect = StatusEffects.; // none 关联的状态效果

            // 水坑相关
            moveThroughBlocks = ; // true 形成的水坑能否穿过物块
            particleEffect = Fx.; // none 水坑中显示的粒子效果
            particleSpacing = f; // 60f 粒子效果的间距
            capPuddles = ; // true 水坑大小是否被限制
            vaporEffect = Fx.; // none 蒸发时产生的粒子效果

            // 其他液体相关
            blockReactive = ; // true 是否与物块里其他液体发生反应
            canStayOn.add(Liquids.); // 会浮在哪些液体上

            // UnlockableContent
            alwaysUnlocked = ; // false 是否在科技树中始终解锁
            inlineDescription = ; // true 是否在研究界面显示描述
            hideDetails = ; // true 如果未在战役中解锁, 是否隐藏细节
            hideDatabase = ; // false 是否在核心数据库中隐藏
            allDatabaseTabs = ; // false 如果为真, 则在所有数据库标签页中显示
            shownPlanets.add(Planets.); // 包含此内容的星球. 如果为空则按照物品需求决定一个星球, 目前仅对方块有用
            databaseTabs.add(Planets.);
        }};
        */

        /*
        liquid = new Liquid("", Color.valueOf("")) {{
            gas = ; // false 是否为气体
            gasColor = Color.valueOf(""); // = Color 气态下的颜色
            barColor = Color.valueOf(""); // 界面中的颜色
            lightColor = Color.valueOf(""); // 发出的光的颜色
            flammability = f; // 燃烧性
            temperature = f; // 0.5f 温度
            heatCapacity = f; // 0.5f 热容量
            viscosity = f; // 0.5f 粘度
            explosiveness = f; // 爆炸性
            blockReactive = ; // true 是否与物块里其他液体发生反应
            coolant = ; // true 能否作为冷却液
            moveThroughBlocks = ; // true 形成的水坑能否穿过物块
            incinerable = ; // true 能否被焚毁
            effect = StatusEffects.; // none 关联的状态效果
            particleEffect = Fx.; // none 水坑中显示的粒子效果
            particleSpacing = f; // 60f 粒子效果的间距
            boilPoint = f; // 2f 沸点
            capPuddles = ; // true 水坑大小是否被限制
            vaporEffect = Fx.; // none 蒸发时产生的粒子效果
            hidden = ; // 是否隐藏
            canStayOn.add(Liquids.); // 会浮在哪些液体上

            // UnlockableContent
            alwaysUnlocked = ; // false 是否在科技树中始终解锁
            inlineDescription = ; // true 是否在研究界面显示描述
            hideDetails = ; // true 如果未在战役中解锁, 是否隐藏细节
            hideDatabase = ; // false 是否在核心数据库中隐藏
            allDatabaseTabs = ; // false 如果为真, 则在所有数据库标签页中显示
            shownPlanets.add(Planets.); // 包含此内容的星球. 如果为空则按照物品需求决定一个星球, 目前仅对方块有用
            databaseTabs.add(Planets.);
        }};
        */

    }
}
