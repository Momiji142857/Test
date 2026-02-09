package vanilla.expansion;

import mindustry.mod.Mod;
import vanilla.expansion.content.*;

public class VanillaExpansion extends Mod {

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

// 模板
// Item
        /*
        item = new Item("", Color.valueOf("")) {{
            explosiveness = f; // 0f 爆炸性
            flammability = f; // 0f 燃烧性
            radioactivity = f; // 放射性
            charge = f; // 0f 放电性
            hardness = ; // 0 硬度
            cost = f; // 1f 建造时间花费
            healthScaling = f; // 0f 建筑血量系数
            lowPriority = ; // 被挖掘时, 是否是最低优先级
            buildable = ; // true 该物品进入核心时能否被焚毁
            hidden = ; // false 是否隐藏

            // 动态贴图
            frames = ; // 0 是否具有动态贴图
            transitionFrames = ; // 0 动态贴图每帧之间的过度帧数量
            frameTime = f; // 5f 动画之间的间隔时间

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

// statusEffect
        /*
        statusEffect = new StatusEffect("") {{
            damageMultiplier = f; // 1f 伤害倍率
            healthMultiplier = f; // 1f 生命值倍率
            speedMultiplier = f; // 1f 速度倍率
            reloadMultiplier = f; // 1f 开火速率倍率
            buildSpeedMultiplier = f; // 1f 建造速度倍率
            dragMultiplier = f; // 1f 移动阻力倍率
            disarm = ; // false 是否缴械
            reactive = ; // 是否仅用于元素反应
            show = ; // true 是否在数据库中显示

            // 伤害
            transitionDamage = f; // 0f 元素反应的伤害
            damage = f; // 每帧伤害
            intervalDamageTime = f; // 间隔伤害的时间间隔
            intervalDamage = f; // 间隔伤害
            intervalDamagePierce = ; // false 间隔伤害是否穿甲

            // 产生的粒子效果
            color = Color.valueOf(""); // 状态效果的颜色
            effect = new (); // Fx.none // 单位上随机生成的粒子效果
            effectChance = f; // 0.15f 粒子效果出现的概率
            parentizeEffect = ; // 粒子效果是否应该有一个父级
            permanent = ; // 粒子效果是否会消失

            // 应用效果
            applyEffect = new (); // Fx.none // 单位被赋予该状态效果时产生的粒子效果
            applyExtend = ; // 当单位已拥有此状态效果时, 是否仍然显示应用效果
            applyColor = Color.valueOf(""); // 应用效果的颜色
            parentizeApplyEffect = ; // 应用效果是否应有一个父级

            outline = ; // true 如果为false, 将禁用轮廓线

            init(() -> {
                opposite(StatusEffects., StatusEffects.); // 互斥的状态效果

                affinity(StatusEffects., (unit, result, time) -> {
                    unit.damagePierce();
                    result.set(StatusEffects., Math.min(time + result.time, 300.0F));
                });

            });
        }};
        */

// Liquid
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

// Weathers
        /*
        weather = new ParticleWeather("") {{
            // = new ParticleWeather("") {{
            particleRegion = ""; // "circle-shadow"
            color = Color.valueOf("");
            noiseColor = Color.valueOf("");
            yspeed = f; // -2f
            xspeed = f; // 0.25f
            padding = f; // 16f
            sizeMin = f; // 2.4f
            sizeMax = f; // 12f
            density = f; // 1200f
            minAlpha = f; // 1f
            maxAlpha = f; // 1f
            force = f; // 0f
            noiseScale = f; // 2000f
            baseSpeed = f; // 6.1f
            sinSclMin = f; // 30f
            sinSclMax = f; // 80f
            sinMagMin = f; // 1f
            sinMagMax = f; // 7f
            drawNoise = ; // false
            drawParticles = ; // true
            useWindVector = ; // false
            randomParticleRotation = ; // false
            noiseLayers = ; // 1
            noiseLayerSpeedM = f; // 1.1f
            noiseLayerAlphaM = f; // 0.8f
            noiseLayerSclM = f; // 0.99f
            noiseLayerColorM = f; // 1f
            noisePath = "";
            noise = ;

            // = new RainWeather() {{
            yspeed = f; // 5f
            xspeed = f; // 1.5f
            padding = f; // 16f
            density = f; // 1200f
            stroke = f; // 0.75f
            sizeMin = f; // 8f
            sizeMax = f; // 40f
            splashTimeScale = f; // 22f
            liquid = Liquids.; // water
            splashes = ; // new TextureRegion[12];
            color = Color.valueOf("");

            boundMax = f;
            duration = f; // 10f * Time.toMinutes
            opacityMultiplier = f; // 1f;
            attrs.set(Attribute., );
            sound = Sounds.; // none
            soundVol = f; // 0.1f
            soundVolMin = f; // 0f
            soundVolOscMag = f; // 0f
            soundVolOscScl = f; // 20f
            hidden = ; // false
            status = StatusEffects.; // none
            statusDuration = f; // 60f * 2
            statusAir = ; // true
            statusGround = ; // true
        }};
         */

// UnitType
        /*
        unit = new UnitType("") {{
            constructor = UnitEntity::create;

//            "flying": UnitEntity::create;
//            "mech": MechUnit::create;
//            "legs": LegsUnit::create;
//            "naval": UnitWaterMove::create;
//            "payload": PayloadUnit::create;
//            "missile": TimedKillUnit::create;
//            "tank": TankUnit::create;
//            "hover": ElevationMoveUnit::create;
//            "tether": BuildingTetherPayloadUnit::create;
//            "crawl": CrawlUnit::create;

            // 属性
            health = f; // 200f 生命值
            armor = f; // 0f 护甲
            range = f; // -1f 最小攻击范围
            maxRange = f; // -1f 最大攻击范围
            aimDst = f; // -1f 武器可瞄准的最小距离
            hitSize = f; // 6f 碰撞箱边长大小
            mineRange = f; // 70f 挖掘范围
            mineSpeed = f; // 1f 挖掘速度
            mineTier = ; // -1 可挖掘的矿石最大硬度
            mineWalls = ; // false 能否从墙壁挖掘
            mineFloor = ; // true 能否从地板挖掘
            mineHardnessScaling = ; // true 更硬的矿石挖掘时间是否延长
            buildRange = ; // 220f 建造范围
            buildSpeed = f; // -1f 建造速度倍率
            rotateToBuilding = ; // true 是否面向正在建造的物体
            itemCapacity = ; // -1 可携带物品数量
            pickupUnits = ; // true 该单位能否搬起其他单位
            payloadCapacity = Mathf.sqr(f) * tilePayload; // 8 载荷容量
            createScorch = ; // true 死亡时是否会产生烧痕
            createWreck = ; // true 死亡时是否掉落残骸
            wreckHealthMultiplier = f; // 0.25f 残骸生命值倍率
            crashDamageMultiplier = f; // 1f 坠落伤害倍率
            dpsEstimate = f; // -1f DPS粗略估计
            canDrown = ; // true 能否被淹没
            drownTimeMultiplier = f; // -1f 沉没速度倍率
            fogRadius = f; // -1f 战争迷雾视野半径
            researchCostMultiplier = f; // 50f 研究成本倍数
            isEnemy = ; // true 是否被视为敌人
            flying = ; // false 是否为飞行单位
            wobble = ; // true 飞行单位是否摇晃
            targetBuildingsMobile = ; // true 仅移动端, 当玩家附身该单位时, 是否自动瞄准建筑进行附着
            allowedInPayloads = ; // true 能否被移动到载荷中
            logicControllable = ; // true 逻辑能否控制此单位
            playerControllable = ; // true 玩家能否控制该单位
            controlSelectGlobal = ; // true 能否被shift+g选中
            physics = ; // true 该单位能否与其他单位发生物理碰撞
            useUnitCap = ; // true 是否忽略单位上限, 无限生成
            coreUnitDock = ; // false 该核心机在解除附身之后是否重新出现
            hoverable = ; // true 是否显示悬停提示
            hidden = ; // false 是否隐藏
            bounded = ; // true 能否被推离地图边界

            // 移动
            speed = f; // 1.1f 移动速度
            strafePenalty = f; // 0.5f 侧向移动速度惩罚倍率
            boostMultiplier = f; // 1f 助推速度倍率
            floorMultiplier = f; // 1f 受地形影响的程度
            rotateSpeed = f; // 5f 身体转向速度
            baseRotateSpeed = f; // 5f 机甲转向速度
            drag = f; // 0.3f 移动阻力与移动速度的比例
            accel = f; // 0.5f 加速度与移动速度的比例
            riseSpeed = f; // 0.08f 助推时上升速度
            fallSpeed = f; // 0.018f 无助推时下落速度
            canBoost = ; // false 能否助推
            boostWhenBuilding = ; // true 处于建造者AI时助推
            boostWhenMining = ; // true 处于挖矿AI时助推
            hovering = ; // false 是否受下方地板影响
            omniMovement = ; // true 能否向任意方向移动, 如果为false, 则只能向前方移动
            rotateMoveFirst = ; // false 单位在实际移动前是否需要先面朝移动方向

            // 战斗
            targetPriority = f; // 0f 目标优先级
            canHeal = ; // false 能否修复建筑
            singleTarget = ; // false 武器是否攻击同一目标
            forceMultiTarget = ; // false 是否强制拥有多个目标
            canAttack = ; // true 能否攻击
            targetAir = ; // true 是否尝试攻击空中单位
            targetGround = ; // true 是否尝试攻击地面单位
            faceTarget = ; // true 攻击时是否面向目标
            circleTarget = ; // false 是否围绕目标盘旋
            circleTargetRadius = f; // 80f 围绕目标盘旋的范围
            autoDropBombs = ; // false 如果为true, 即使该单位不在其"真实"目标旁边, 也会投下炸弹, 用于地毯式轰炸机
            hittable = ; // true 能否被子弹或爆炸打中
            killable = ; // true 单位能否受伤和被击杀
            targetable = ; // true 能否被索敌
            vulnerableWithPayloads = ; // false 当该单位携带载荷时, 能否被索敌和被击中
            targetUnderBlocks = ; // true 是否攻击类似传送带的"下方"的建筑
            alwaysShootWhenMoving = ; // false 是否在移动时始终射击

            // 渲染
            clipSize = f; // -1f 单位渲染范围大小
            deathShake = f; // -1f 单位死亡时的震动强度
            stepShake = f; // -1f 单位行走时的震动强度
            rippleScale = f; // 1f 行走时扬起的尘埃云大小
            groundLayer = f; // 60f 地面单位渲染时所处的图层
            flyingLayer = f; // -1 飞行单位渲染时所处的图层
            lowAltitude = ; // false 是否在效果或子弹下方绘制
            drawCell = ; // true 是否绘制队伍指示器/单元格
            drawBody = ; // true 是否绘制单位身体
            squareShape = ; // false 是否具有方块阴影
            shadowElevation = f; // -1f 阴影垂直偏移量
            shadowElevationScl = f; // 1f 阴影缩放比例
            drawSoftShadow = ; // true 是否绘制软阴影
            softShadowScl = f; // 1f 软阴影缩放比例
            drawBuildBeam = ; // true 是否绘制建造光束
            buildBeamOffset = f; // 3.8f 建造光束向前的偏移量
            drawMineBeam = ; // true 是否绘制挖掘光束
            mineBeamOffset = f; // = hitSize / 2f 挖掘光束向前的偏移量
            drawShields = ; // true 是否绘制单位护盾
            shieldColor = Color.valueOf(""); // 单位护盾的颜色
            drawItems = ; // true 是否绘制携带物品
            itemOffsetY = f; // 3f 物品y轴偏移量
            drawMinimap = ; // true 是否在小地图上绘制
            internal = ; // false 是否仅用于内部用途且没有贴图
            internalGenerateSprites = ; // false 对于内部使用的单位, 是否仍然需要贴图
            // 轮廓
            alwaysCreateOutline = ; // false 是否始终生成轮廓区域
            outlineColor = Color.valueOf(""); // 565666 贴图轮廓颜色
            outlineRadius = ; // 3 贴图轮廓厚度
            outlines = ; // true 有无贴图轮廓
            //引擎
            setEnginesMirror(); // 引擎
            engineOffset = f; // 5f 引擎向后的偏移量
            engineSize = f; // 2.5f 引擎半径
            engineLayer = f; // -1f 引擎所处的图层
            useEngineElevation = ; // true 引擎是否始终以正常尺寸显示
            engineColor = Color.valueOf(""); // null 引擎颜色
            engineColorInner = Color.valueOf(""); // white 引擎内部颜色
            // 轨迹
            waveTrailX = f; // 4f 波纹轨迹水平偏移量
            waveTrailY = f; // -3f 波纹轨迹垂直偏移量
            trailScl = f; // 1f 轨迹缩放比例
            trailLength = ; // 0 引擎尾迹或波浪尾迹长度
            trailColor = Color.valueOf(""); // 尾迹颜色
            //光照
            lightRadius = f; // -1f 光照半径
            lightOpacity = f; // 0.6f 光照不透明度
            lightColor = Color.valueOf(""); // fbd367 单位产生的光照的颜色
            // 治疗
            healFlash = ; // true 被治疗时是否闪光
            healColor = Color.valueOf(""); // 98ffa9 收到治疗时闪光的颜色

            // 音效
            deathSound = Sounds.; // unset 死亡音效
            deathSoundVolume = f; // 1f 死亡音效音量
            wreckSound = Sounds.; // unset 坠毁音效
            wreckSoundVolume = f; // 1f 坠毁音效音量
            loopSound = Sounds.; // none 单位在附近时循环播放的音效
            loopSoundVolume = f; // 0.5f 循环音效的音量
            stepSound = Sounds.; // mechStepSmall 步进音效
            stepSoundVolume = f; // 0.5f 步进音量
            stepSoundPitch = f; // 1f 步进音效的音高
            stepSoundPitchRange = f; // 0.1f 步进音效的音高范围
            moveSound = Sounds.; // none 移动音效
            moveSoundVolume = f; // 1f 移动音效的音量
            moveSoundPitchMin = f; // 1f 基于速度的移动音效的音高范围
            moveSoundPitchMax = f; // 1f
            mineSound = Sounds.; // loopMineBeam 挖掘音效
            mineSoundVolume = f; // 0.6f 挖掘音效音量

            // 粒子效果
            fallEffect = Fx.; // fallSmoke 坠毁时产生的粒子效果
            fallEngineEffect = Fx.; // fallSmoke 坠毁时引擎处产生的粒子效果
            deathExplosionEffect = Fx.; // dynamicExplosion 死亡时产生的粒子效果

            //LEG UNITS
            allowLegStep = ; // false 对于有腿的单位, 能否跨过方块
            legPhysicsLayer = ; // true 腿部是否强行处于地面物理层
            legCount = ; // 4 拥有腿的数量
            legGroupSize = ; // 2 腿的组数

            legLength = f; // 10f 单条腿的总长度
            legSpeed = f; // 0.1f 单条腿的移动速度
            legForwardScl = f; // 1f 腿部向前放置的距离与单位速度的比例
            legBaseOffset = f; // 0f 腿部相对于中心的偏移量
            legMoveSpace = f; // 1f 腿部移动间距比例
            legExtension = f; // 0f 腿部关节覆盖偏移
            legPairOffset = f; // 0f 腿部组间同步移动的偏移量
            legLengthScl = f; // 1f 腿部试图与单位保持的距离
            legStraightLength = f; // 1f 腿部水平伸展距离比例
            legMaxLength = f; // 1.75f 腿部最大伸展长度比例
            legMinLength = f; // 0f 腿部最小伸展长度比例
            legSplashDamage = f; // 0f 腿部触地时产生的溅射伤害
            legSplashRange = f; // 5f 腿部触地伤害的范围
            baseLegStraightness = f; // 0f 腿部基座排列直线度
            legStraightness = f; // 0f 腿部外展角度直线度

            legBaseUnder = ; // false 腿部区域是否绘制在下方
            lockLegBase = ; // false 腿部是否被锁定在单位基座上
            legContinuousMove = ; // 当单位停止移动时, 腿部是否始终尝试移动
            emitWalkSound = ; // true 踩中液体的音效
            emitWalkEffect = ; // true 踩中液体的粒子效果

            //MECH UNITS
            mechLandShake = f; // 0f 机甲落地时的震动强度
            mechSideSway = f; // 0.54f 机甲侧向摆动的幅度
            mechFrontSway = f; // 0.1f 机甲前后摆动的幅度
            mechStride = f; // -1f 机甲步幅长度
            mechStepParticles = ; // false 机甲在迈出一步后是否产生粒子效果
            mechLegColor = Color.valueOf(""); // 6e7080 机甲腿部移动时的颜色

            //TANK UNITS
            treadRects = new Rect[]{}; // 履带矩形区域列表, 相对于中心
            treadFrames = ; // 18 履带动画帧数
            treadPullOffset = ; // 0 履带顶部裁剪偏移
            tankMoveSound = Sounds.; // tankMove 坦克移动音效
            tankMoveVolume = f; // 0.5f 坦克移动音效的音量
            treadEffect = Fx.; // 坦克移动时产生的粒子效果

            //MISSILE UNITS
            lifetime = f; // 5f * 60f 导弹的生命周期
            homingDelay = f; // 10f 导弹开始追踪前需要经过的帧数
            missileAccelTime = f; // 0f 导弹加速到全速所须时间

            // 行为
            allowChangeCommands = ; // true 是否在单位工厂中隐藏命令更改界面
            mineItems = Seq.with(Items., Items.); // 目标矿石, 用于采矿AI

            commands.add(); // 可用命令列表
            defaultCommand = UnitCommand.; // 默认命令
            stances = ; // 单位可拥有的行为
            flowfieldPathType = ; // -1 寻路相关
            pathCost = ; //

            // 环境需求
            envRequired = ; // 0 必要的环境
            envEnabled = ; // 可以存在的环境
            envDisabled = ; // 无法存在的环境

            immunities.add(StatusEffects.); // 免疫的状态效果
            targetFlags = new BlockFlag[]{BlockFlag., BlockFlag.}; // 目标
            ammoCapacity = ; // -1 弹药容量
            ammoType = new ItemAmmoType(Items.); // copper 使用的弹药

            parts.add(); // 额外的动画部件
            abilities.add(); // 能力
            weapons.add(new Weapon(VanillaExpansion.name("")) {{
                display = ; // true 是否显示在单位属性中
                showStatSprite = ; // true 是否在数据库中显示武器贴图
                mirror = ; // true 有无镜像
                noAttack = ; // false 该武器能否用于攻击
                alternate = ; // true 不同副本是否依次射击
                shootOnDeath = ; // false 是否死亡时射击
                useAttackRange = ; // true 是否用于攻击范围计算
                minShootVelocity = f; // -1f 该武器射击所需的最小速度
                useAmmo = ; // true 当对应规则启用时, 是否消耗弹药
                targetInterval = f; // 40f 更换目标间的等待时间
                targetSwitchInterval = f; // 70f 目标切换间隔

                // 旋转
                rotate = ; // false 是否独立于单位旋转
                ignoreRotation = ; // false 射击时是否忽略单位旋转
                baseRotation = f; // 0f 起始旋转角度
                rotateSpeed = f; // 20f 武器旋转速度
                rotationLimit = f; // 361f 武器旋转限制

                // 视觉效果
                region = ""; // 显示纹理区域
                heatRegion = ""; // 发热纹理区域
                cellRegion = ""; // 能量单元纹理区域
                outlineRegion = ""; // 轮廓纹理区域
                top = ; // true 是否在顶部绘制轮廓
                layerOffset = f; // 0f 图层偏移量
                shootX = f; // 0f 弹道/特效相对于武器中心的偏移量
                shootY = f; // 3f
                x = f; // 5f 武器对于单位的偏移量
                y = f; // 0f
                xRand = f; // 0f X/Y轴上的随机散布
                yRand = f; // 0f
                shadow = f; // -1f 武器阴影半径
                shake = f; // 0f 射击后屏幕震动强度
                shoot. = ; // 用于子弹的图案
                ejectEffect = Fx.; // none 弹壳抛出效果
                parentizeEffects = ; // 射击效果是否跟随单位
                recoil = f; // 1.5f 视觉上的后坐力
                recoils = f; // -1f 额外的后坐力计数器数量
                recoilTime = f; // = reload 后坐力复位时间
                recoilPow = f; // 1.8f 后坐力功率曲线
                cooldownTime = f; // 20f 冷却热区所用时间
                minWarmup = f; // 0f 最小开火预热值
                shootWarmupSpeed = f; // 0.1f 射击预热速度
                smoothReloadSpeed = f; // 0.15f 平滑装填速度
                heatColor = Color.valueOf(""); // ab3400 发热区域颜色
                mountType = WeaponMount::new; // 武器挂架类型

                // 音效
                soundPitchMin = f; // 0.8f 射击音效随机音高范围
                soundPitchMax = f; // 1f
                activeSound = Sounds.; // none 射击循环音效
                activeSoundVolume = f; // 1f 射击循环音效的音量
                shootSound = Sounds.; // shoot 射击音效
                shootSoundVolume = f; // 1f 射击音效音量
                initialShootSound = Sounds.; // none 首次开火音效
                chargeSound = Sounds.; // none 充能音效

                // 子弹
                continuous = ; // 是否保持子弹在射击位置
                alwaysContinuous = ; // 是否无装填连续射击
                aimChangeSpeed = f; // Float.1/0f 改变炮塔瞄准距离的速度, 仅用于点激光子弹
                controllable = ; // true 是否可由玩家手动瞄准
                aiControllable = ; // true 是否可由单位自动瞄准
                alwaysShooting = ; // false 是否始终射击
                autoTarget = ; // false 是否自动瞄准目标
                predictTarget = ; // true 是否预测目标轨迹
                reload = f; // 77f 重新装填的帧数
                inaccuracy = f; // 0f 射击时的不精准度
                velocityRnd = f; // 0f 速度随机分量比例
                extraVelocity = f; // 0f 额外速度比例
                shootCone = f; // 5f 射击起始锥角半径
                shootStatus = StatusEffects.; // none 射击施加的状态效果
                shootStatusDuration = f; // 5f * 60f 射击状态效果持续时间

                parts.add(); // 额外动画部件
                bullet = new ();
            }});
        }};
        */

// Planets
        /*
        planet = new Planet("", , f, ) {{
            alwaysUnlocked = ; // false

            // 基础属性
            generator = new (); // 区块生成器
            camRadius = f; // 摄像机半径偏移
            minZoom = f; // 0.5f 视角最小缩放
            maxZoom = f; // 2f 视角最大缩放
            drawOrbit = ; // true 有无公转轨道
            orbitRadius = f; // 公转轨道半径
            orbitTime = f; // 公转周期
            rotateTime = f; // 24f * 60f 自转周期
            tidalLock = ; // false 是否潮汐锁定
            accessible = ; // true 是否在星球选择界面显示
            defaultEnv = Env. | Env.; // 环境
            defaultAttributes.set(Attribute., ); // 属性
            launchMusic = Musics.; // launch 星球界面播放的音乐
            defaultCore = Blocks.; // coreShard 默认核心类型
            techTree = TechTree.all.find((t) -> t.content == ); // 在此星球打开科技树时默认的根节点
            autoAssignPlanet = ; // true 是否自动将该星球添加到科技树内容的shownPlanets列表里
            unlockedOnLand.add(); // 着陆时自动解锁

            // 外观
            updateLighting = ; // false 昼夜循环
            lightSrcFrom = f; // 0f 光源起始位置
            lightSrcTo = f; // 0.8f 光源终止位置
            lightDstFrom = f; // 0.2f 光源距离起始值
            lightDstTo = f; // 1f 光源距离最大值

            bloom = ; // false 是否启用泛光渲染效果
            visible = ; // true 是否在星系中显示
            landCloudColor = Color.valueOf(""); // 着陆时显示的云的颜色
            lightColor = Color.valueOf(""); // 仅用于恒星, 照射到行星上的颜色
            atmosphereColor = Color.valueOf(""); // 大气颜色
            iconColor = Color.valueOf(""); // 行星列表中的图标颜色
            hasAtmosphere = ; // true 有无大气层
            atmosphereRadIn = f; // 0f 大气层内径
            atmosphereRadOut = f; // 0.3f 大气层外径

            // 区块相关
            startSector = ; // 0 默认起始区块
            sectorSeed = ; // -1 区块基地生成种子
            allowLaunchSchematics = ; // false 能否使用发射蓝图
            allowLaunchLoadout = ; // false 指定发射时消耗的资源
            launchCapacityMultiplier = f; // 0.25f 发射时可携带物品的最大数量与核心容量的比例
            allowSectorInvasion = ; // false 是否启用敌人反攻
            allowLegacyLaunchPads = ; // false 是否启用旧版发射台
            clearSectorOnLose = ; // false 丢失区块时是否重置区块
            enemyBuildSpeedMultiplier = f; // 1f 敌方重建建筑的速度倍率
            enemyInfiniteItems = ; // true 敌方是否始终拥有无限物品
            enemyCoreSpawnReplace = ; // false 是否启用核心生成
            prebuildBase = ; // false 着陆时是否清除核心附近建筑并在冲击波中重建
            allowWaves = ; // false 区块丢失时是否生成波次
            allowLaunchToNumbered = ; // true 是否启用数字区块
            allowCampaignRules = ; // false 能否在星球界面更改难度和规则
            allowSelfSectorLaunch = ; // 星际加速器能否去往该星球的任意区块

            // 规则相关
            campaignRules. = ; // 全局难度/修改器设置
            campaignRuleDefaults. = ; // 规则的默认值
            ruleSetter = r -> {
                r. = ;
            }; // 游戏加载时为该星球上的任意区块设置规则
            showRtsAIRule = ; // false 能否自定义Rts AI

            // 地形和云层
            meshLoader = () -> new MultiMesh();
            cloudMeshLoader = () -> new MultiMesh();

            // 与其他星球关联
            solarSystem = Planets.; // 所处星系的中心天体
            children.add(Planets.); // 所有卫星, 按半径升序排列
            launchCandidates.addAll(Planets.); // 能从该星球发射去往的目标星球列表
            updateGroup.add(); // 可同时进行后台运算的星球
        }};
        */

// Sector
        /*
        Sector = new SectorPreset("", Planets., ) {{
            captureWave = ; // 0
            difficulty = f; // 0-10
            startWaveTimeMultiplier = f; // 2f
            addStartingItems = ; // false
            noLighting = ; // false
            isLastSector = ;
            requireUnlock = ; // true
            showSectorLandInfo = ; // true
            overrideLaunchDefaults = ; // false
            allowLaunchSchematics = ; // false
            allowLaunchLoadout = ; // false
            attackAfterWaves = ; // false
            originalPosition = ;
        }};
         */

// Bullet
        /*
        bullet = new () {{
            // new BasicBulletType(f, f) {{
            width = f; // 5f
            height = f; // 7f
            shrinkX = f; // 0f
            shrinkY = f; // 0.5f
            shrinkInterp = Interp.; // linear
            spin = f; // 0f
            rotationOffset = f; // 0f
            sprite = "";

            // new LightningBulletType() {{

            // 仅炮塔
            shootPattern = null;
            shootSound = Sounds.; // none
            ammoMultiplier = f; // 2f
            reloadMultiplier = f; // 1f
            targetBlocks = ; // true
            targetMissiles = ; // true
            rangeChange = f; // 0f
            // 液体子弹
            puddles = ;
            puddleRange = f;
            puddleAmount = f; // 5f
            puddleLiquid = Liquids.; // water
            // 弹药消耗量显示
            displayAmmoMultiplier = ; // true
            statLiquidConsumed = f;

            // 仅单位
            recoil = f;

            // 通用
            lifetime = f; // 40f
            lifeScaleRandMin = f; // 1f
            lifeScaleRandMax = f; // 1f
            speed = f; // 1f
            velocityScaleRandMin = f; // 1f
            velocityScaleRandMax = f; // 1f
            damage = f; // 1f
            hitSize = f; // 4f
            drawSize = f; // 40f
            angleOffset = f; // 0f
            randomAngleOffset = f; // 0f
            drag = f; // 0f
            accel = f; // 0f

            // 穿透
            pierce = ;
            pierceBuilding = ;
            pierceCap = ; // -1
            pierceDamageFactor = f; // 0f
            maxDamageFraction = f; // -1f

            laserAbsorb = ; // true
            optimalLifeFract = f; // 0f
            layer = ; // Layer.bullet
            hitEffect = new (); // Fx.hitBulletSmall
            despawnEffect = new (); // Fx.hitBulletSmall
            shootEffect = new (); // Fx.shootSmall
            chargeEffect = new (); // Fx.none
            smokeEffect = new (); // Fx.shootSmallSmoke
            hitSound = Sounds.; // none
            despawnSound = Sounds.; // none
            inaccuracy = f; // 0f
            buildingDamageMultiplier = f; // 1f
            shieldDamageMultiplier = f; // 1f
            killShooter = ;
            instantDisappear = ;
            knockback = f;
            impact = ;
            status = StatusEffects.; // none
            statusDuration = f; // 60 * 8f

            // 碰撞
            collidesTiles = ; // true
            collidesTeam = ; // false
            collidesAir = ; // true
            collidesGround = ; // true
            collides = ; // true
            collideFloor = ; // false
            collideTerrain = ; // false

            keepVelocity = ; // true
            scaleLife = ;
            hittable = ; // true
            reflectable = ; // true
            absorbable = ; // true
            ignoreSpawnAngle = ; // false
            createChance = f; // 1f
            range = f; // 0f
            healPercent = f; // 0f
            healAmount = f; // 0f
            lifesteal = f; // 0f

            // 引燃相关
            makeFire = ; // false
            incendAmount = ; // 0
            incendSpread = f; // 8f
            incendChance = f; // 1f

            fragOnHit = ; // true
            fragOnAbsorb = ; // true
            pierceArmor = ; // false
            sticky = ; // false
            stickyExtraLifetime = f; // 0f
            hitColor = Color.valueOf("");

            // 抖动效果
            hitShake = f; // 0f
            despawnShake = f; // 0f

            // 轨迹
            trailColor = Color.valueOf("");
            trailChance = f; // -0.0001f
            trailInterval = f; // 0f
            trailMinVelocity = f; // 0f
            trailEffect = Fx.; // missileTrail
            trailSpread = f; // 0f
            trailParam = f; // 2f
            trailRotation = ; // false
            trailInterp = Interp.; // one
            trailLength = f; // -1f
            trailWidth = f; // 2f
            trailSinMag = f; // 0f
            trailSinScl = f; // 3f

            // 子弹环绕射击者
            circleShooter = ; // false
            circleShooterRadius = f; // 13f
            circleShooterRadiusSmooth = f; // 10f
            circleShooterRotateSpeed = f; // 0.3f

            // 跟踪效果
            homingPower = f; // 0f
            homingRange = f; // 50f
            homingDelay = f; // -1f
            followAimSpeed = f; // 0f

            // 修复压制
            suppressionRange = f; // -1f
            suppressionDuration = f; // 60 * 8f
            suppressionEffectChance = f; // 50f
            suppressColor = Color.valueOf("");

            // 子弹曲线飞行
            weaveScale = f; // 1f
            weaveMag = f; // 0f
            weaveRandom = ; // true;
            rotateSpeed = f; // 0f

            // 子弹光效
            lightRadius = f; // -1f
            lightOpacity = f; // 0.3f
            lightColor = Color.valueOf("");

            //  额外效果
            despawnHit = ; // false
            setDefaults = ; // true

            // 分裂子弹
            fragBullet = new (); // null
            delayFrags = ; // false
            fragRandomSpread = f; // 360f
            fragSpread = f; // 0f
            fragAngle = f; // 0f
            fragBullets = ; // 9
            fragVelocityMin = f; // 0.2f
            fragVelocityMax = f; // 1f
            fragLifeMin = f; // 1f
            fragLifeMax = f; // 1f
            fragOffsetMin = f; // 1f
            fragOffsetMax = f; // 7f
            pierceFragCap = ; // -1

            // 固定间隔生成子弹
            intervalBullet = new ();
            bulletInterval = f; // 20f
            intervalBullets = ; // 1
            intervalRandomSpread = f; // 360f
            intervalSpread = f; // 0f
            intervalAngle = f; // 0f
            intervalDelay = f; // -1f

            // 导弹
            spawnUnit = new MissileUnitType("");
            despawnUnit = new MissileUnitType("");
            despawnUnitChance = f; // 1f
            despawnUnitCount = ; // 1
            despawnUnitRadius = f; // 0.1f
            faceOutwards = ; // false

            // 溅射伤害
            splashDamage = f; // 0f
            scaledSplashDamage = ; // false
            splashDamageRadius = f; // -1f
            splashDamagePierce = ; // false

            // 子弹产生的闪电效果
            lightningColor = Color.valueOf("");
            lightning = ;
            lightningLength = ; // 5
            lightningLengthRand = ; // 0
            lightningDamage = f; // -1f
            lightningCone = f; // 360f
            lightningAngle = f; // 0f
            lightningType = new (); // null

        }};
         */

// Effect
        /*
        Effect = new () {{
            // new WaveEffect() {{
            colorFrom = Color.valueOf("");
            colorTo = Color.valueOf("");
            lightColor = Color.valueOf("");
            sizeFrom = f; // 0f
            sizeTo = f; // 100f
            lightScl = f; // 3f
            lightOpacity = f; // 0.8f
            sides = ; // -1
            rotation = f; // 0f
            strokeFrom = f; // 2f
            strokeTo = f; // 0f
            interp = Interp.; // linear
            lightInterp = Interp.; // reverse
            offsetX = f;
            offsetY = f;

            lifetime = f; // 50f
            clip = f;
            startDelay = f;
            baseRotation = ;
            followParent = ; // true
            rotWithParent = ;
            layer = f; // Layer.effect
            layerDuration = f;
        }};
         */

// UnlockableContent
            /*
            alwaysUnlocked = ; // false 是否在科技树中始终解锁
            inlineDescription = ; // true 是否在研究界面显示描述
            hideDetails = ; // true 如果未在战役中解锁, 是否隐藏细节
            hideDatabase = ; // false 是否在核心数据库中隐藏
            allDatabaseTabs = ; // false 如果为真, 则在所有数据库标签页中显示
            shownPlanets.add(Planets.); // 包含此内容的星球. 如果为空则按照物品需求决定一个星球, 目前仅对方块有用
            databaseTabs.add(Planets.);
            */
