
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
            databaseCategory = ""; // default 数据库类别
            databaseTag = ""; // default 数据库标签
        }};
        */

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
            frames = ; // 0 是否具有动态贴图
            transitionFrames = ; // 0 动态贴图每帧之间的过度帧数量
            frameTime = f; // 5f 动画之间的间隔时间
            buildable = ; // true 该物品进入核心时能否被焚毁
            hidden = ; // false 是否隐藏

            // UnlockableContent
            alwaysUnlocked = ; // false 是否在科技树中始终解锁
            inlineDescription = ; // true 是否在研究界面显示描述
            hideDetails = ; // true 如果未在战役中解锁, 是否隐藏细节
            hideDatabase = ; // false 是否在核心数据库中隐藏
            allDatabaseTabs = ; // false 如果为真, 则在所有数据库标签页中显示
            shownPlanets.add(Planets.); // 包含此内容的星球. 如果为空则按照物品需求决定一个星球, 目前仅对方块有用
            databaseTabs.add(Planets.);
            databaseCategory = ""; // default 数据库类别
            databaseTag = ""; // default 数据库标签
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

            // UnlockableContent
            alwaysUnlocked = ; // false 是否在科技树中始终解锁
            inlineDescription = ; // true 是否在研究界面显示描述
            hideDetails = ; // true 如果未在战役中解锁, 是否隐藏细节
            hideDatabase = ; // false 是否在核心数据库中隐藏
            allDatabaseTabs = ; // false 如果为真, 则在所有数据库标签页中显示
            shownPlanets.add(Planets.); // 包含此内容的星球. 如果为空则按照物品需求决定一个星球, 目前仅对方块有用
            databaseTabs.add(Planets.);
            databaseCategory = ""; // default 数据库类别
            databaseTag = ""; // default 数据库标签
        }};
        */

        /*
        statusEffect = new StatusEffect("") {{
            damageMultiplier = f; // 1f 伤害倍率
            healthMultiplier = f; // 1f 生命值倍率
            speedMultiplier = f; // 1f 速度倍率
            reloadMultiplier = f; // 1f 开火速率倍率
            buildSpeedMultiplier = f; // 1f 建造速度倍率
            dragMultiplier = f; // 1f 移动阻力倍率
            transitionDamage = f; // 0f 元素反应的伤害
            disarm = ; // false 是否缴械
            damage = f; // 每帧伤害
            intervalDamageTime = f; // 间隔伤害的时间间隔
            intervalDamage = f; // 间隔伤害
            intervalDamagePierce = ; // false 间隔伤害是否穿甲
            effectChance = f; // 0.15f 粒子效果出现的概率
            parentizeEffect = ; // 粒子效果是否应该有一个父级
            permanent = ; // 粒子效果是否会消失
            reactive = ; // 是否仅用于元素反应
            show = ; // true 是否在数据库中显示
            color = Color.valueOf(""); // 状态效果的颜色
            effect = new (); // Fx.none // 单位上随机生成的粒子效果
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

            // UnlockableContent
            alwaysUnlocked = ; // false 是否在科技树中始终解锁
            inlineDescription = ; // true 是否在研究界面显示描述
            hideDetails = ; // true 如果未在战役中解锁, 是否隐藏细节
            hideDatabase = ; // false 是否在核心数据库中隐藏
            allDatabaseTabs = ; // false 如果为真, 则在所有数据库标签页中显示
            shownPlanets.add(Planets.); // 包含此内容的星球. 如果为空则按照物品需求决定一个星球, 目前仅对方块有用
            databaseTabs.add(Planets.);
            databaseCategory = ""; // default 数据库类别
            databaseTag = ""; // default 数据库标签
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
            databaseCategory = ""; // default 数据库类别
            databaseTag = ""; // default 数据库标签
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
            databaseCategory = ""; // default 数据库类别
            databaseTag = ""; // default 数据库标签
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
            descentSpeed = f; // 0.08f 无助推时下落速度
            fallSpeed = f; // 0.018f 死亡时的坠落速度
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
            // 光照
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

            // 环境需求
            envRequired = ; // 0 必要的环境
            envEnabled = ; // 可以存在的环境
            envDisabled = ; // 无法存在的环境

            speed = f; // 1.1f 移动速度
            boostMultiplier = f; // 1f 助推速度倍率
            floorMultiplier = f; // 1f 受地形影响的程度
            rotateSpeed = f; // 5f 身体转向速度
            baseRotateSpeed = f; // 5f 机甲转向速度
            drag = f; // 0.3f 移动阻力与移动速度的比例
            accel = f; // 0.5f 加速度与移动速度的比例
            hitSize = f; // 6f 碰撞箱边长大小
            deathShake = f; // -1f 单位死亡时的震动强度
            stepShake = f; // -1f 单位行走时的震动强度
            rippleScale = f; // 1f 行走时扬起的尘埃云大小
            riseSpeed = f; // 0.08f 助推时上升速度
            descentSpeed = f; // 0.08f 无助推时下落速度
            fallSpeed = f; // 0.018f 死亡时的坠落速度
            missileAccelTime = f; // 0f 导弹加速到全速所须时间
            health = f; // 200f 生命值
            armor = f; // 0f 护甲
            range = f; // -1f 最小攻击范围
            maxRange = f; // -1f 最小攻击范围
            mineRange = f; // 70f 挖掘范围
            buildRange = ; // 220f 建造范围
            circleTargetRadius = f; // 80f 围绕目标盘旋的范围
            crashDamageMultiplier = f; // 1f 坠落伤害倍率
            wreckHealthMultiplier = f; // 0.25f 残骸生命值倍率
            dpsEstimate = f; // -1f DPS粗略估计
            clipSize = f; // -1f 单位渲染范围大小
            drownTimeMultiplier = f; // -1f 沉没速度倍率
            strafePenalty = f; // 0.5f 侧向移动速度惩罚倍率
            researchCostMultiplier = f; // 50f 研究成本倍数
            groundLayer = f; // 60f 地面单位渲染时所处的图层
            flyingLayer = f; // -1 飞行单位渲染时所处的图层
            payloadCapacity = Mathf.sqr(f) * tilePayload; // 8 载荷容量
            buildSpeed = f; // -1f 建造速度倍率
            aimDst = f; // -1f 武器可瞄准的最小距离
            buildBeamOffset = f; // 3.8f 建造光束向前的偏移量
            mineBeamOffset = f; // = hitSize / 2f 挖掘光束向前的偏移量
            targetPriority = f; // 0f 目标优先级
            shadowElevation = f; // -1f 阴影垂直偏移量
            shadowElevationScl = f; // 1f 阴影缩放比例
            engineOffset = f; // 5f 引擎向后的偏移量
            engineSize = f; // 2.5f 引擎半径
            engineLayer = f; // -1f 引擎所处的图层
            itemOffsetY = f; // 3f 物品y轴偏移量
            lightRadius = f; // -1f 光照半径
            lightOpacity = f; // 0.6f 光照不透明度
            softShadowScl = f; // 1f 软阴影缩放比例
            fogRadius = f; // -1f 战争迷雾视野半径

            waveTrailX = f; // 4f 波纹轨迹水平偏移量
            waveTrailY = f; // -3f 波纹轨迹垂直偏移量
            trailScl = f; // 1f 轨迹缩放比例

            isEnemy = ; // true 是否被视为敌人
            flying = ; // false 是否为飞行单位
            wobble = ; // true 飞行单位是否摇晃
            targetAir = ; // true 是否尝试攻击空中单位
            targetGround = ; // true 是否尝试攻击地面单位
            faceTarget = ; // true 攻击时是否面向目标
            circleTarget = ; // false 是否围绕目标盘旋
            autoDropBombs = ; // false 如果为true, 即使该单位不在其"真实"目标旁边, 也会投下炸弹, 用于地毯式轰炸机
            targetBuildingsMobile = ; // true 仅移动端, 当玩家附身该单位时, 是否自动瞄准建筑进行附着
            canBoost = ; // false 能否助推
            boostWhenBuilding = ; // true 处于建造者AI时助推
            boostWhenMining = ; // true 处于挖矿AI时助推
            logicControllable = ; // true 逻辑能否控制此单位
            playerControllable = ; // true 玩家能否控制该单位
            controlSelectGlobal = ; // true 能否被shift+g选中
            allowedInPayloads = ; // true 能否被移动到载荷中
            hittable = ; // true 能否被子弹或爆炸打中
            killable = ; // true 单位能否受伤和被击杀
            targetable = ; // true 能否被索敌
            vulnerableWithPayloads = ; // false 当该单位携带载荷时, 能否被索敌和被击中
            pickupUnits = ; // true 该单位能否搬起其他单位
            physics = ; // true 该单位能否与其他单位发生物理碰撞
            canDrown = ; // true 能否被淹没
            useUnitCap = ; // true 是否忽略单位上限, 无限生成
            coreUnitDock = ; // false 该核心机在解除附身之后是否重新出现
            createWreck = ; // true 死亡时是否掉落残骸
            createScorch = ; // true 死亡时是否会产生烧痕
            lowAltitude = ; // false 是否在效果或子弹下方绘制
            rotateToBuilding = ; // true 是否面向正在建造的物体
            allowLegStep = ; // false 对于有腿的单位, 能否跨过方块
            legPhysicsLayer = ; // true 腿部是否强行处于地面物理层
            hovering = ; // false 是否受下方地板影响
            omniMovement = ; // true 能否向任意方向移动, 如果为false, 则只能向前方移动
            rotateMoveFirst = ; // false 单位在实际移动前是否需要先面朝移动方向
            healFlash = ; // true 被治疗时是否闪光
            canHeal = ; // false 能否修复建筑
            singleTarget = ; // false 武器是否攻击同一目标
            forceMultiTarget = ; // false 是否强制拥有多个目标
            canAttack = ; // true 能否攻击
            hidden = ; // false 是否隐藏
            internal = ; // false 是否仅用于内部用途且没有贴图
            internalGenerateSprites = ; // false 对于内部使用的单位, 是否仍然需要贴图
            bounded = ; // true 能否被推离地图边界
            targetUnderBlocks = ; // true 是否攻击类似传送带的"下方"的建筑
            alwaysShootWhenMoving = ; // false 是否在移动时始终射击

            hoverable = ; // true 是否显示悬停提示
            alwaysCreateOutline = ; // false 是否始终生成轮廓区域
            squareShape = ; // false 是否具有方块阴影
            drawBuildBeam = ; // true 是否绘制建造光束
            drawMineBeam = ; // true 是否绘制挖掘光束
            drawCell = ; // true 是否绘制队伍指示器/单元格
            drawItems = ; // true 是否绘制携带物品
            drawShields = ; // true 是否绘制单位护盾
            drawBody = ; // true 是否绘制单位身体
            drawSoftShadow = ; // true 是否绘制软阴影
            drawMinimap = ; // true 是否在小地图上绘制

            abilities.add(); // 能力
            weapons.add(); // 武器
            immunities.add(StatusEffects.); // 免疫的状态效果

            healColor = Color.valueOf(""); // 98ffa9 收到治疗时闪光的颜色
            lightColor = Color.valueOf(""); // fbd367 单位产生的光照的颜色
            shieldColor = Color.valueOf(""); // 单位护盾的颜色
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
            tankMoveSound = Sounds.; // tankMove 坦克移动音效
            moveSound = Sounds.; // none 移动音效
            moveSoundVolume = f; // 1f 移动音效的音量
            moveSoundPitchMin = f; // 1f 基于速度的移动音效的音高
            moveSoundPitchMax = f; // 1f
            tankMoveVolume = f; // 0.5f 坦克移动音效的音量
            fallEffect = Fx.; // fallSmoke 坠毁时产生的粒子效果
            fallEngineEffect = Fx.; // fallSmoke 坠毁时引擎处产生的粒子效果
            deathExplosionEffect = Fx.; // dynamicExplosion 死亡时产生的粒子效果
            treadEffect = Fx.; // 坦克移动时产生的粒子效果
            parts.add(); // 额外的部件
            setEnginesMirror(); // 引擎
            useEngineElevation = ; // true 推进器是否始终以正常尺寸显示
            engineColor = Color.valueOf(""); // null 引擎颜色
            engineColorInner = Color.valueOf(""); // white 引擎内部颜色
            trailLength = ; // 0 引擎尾迹或波浪尾迹长度
            trailColor = Color.valueOf(""); // 尾迹颜色

            flowfieldPathType = ; // -1 寻路相关
            pathCost = ; //

            targetFlags = new BlockFlag[]{BlockFlag., BlockFlag.}; // 目标
            allowChangeCommands = ; // true 是否在单位工厂中隐藏命令更改界面
            commands.add(); // 可用命令列表
            defaultCommand = UnitCommand.; // 默认命令
            stances = ; // 单位可拥有的行为

            outlineColor = Color.valueOf(""); // 565666 贴图轮廓颜色
            outlineRadius = ; // 3 贴图轮廓厚度
            outlines = ; // true 有无贴图轮廓

            itemCapacity = ; // -1 可携带物品数量
            ammoCapacity = ; // -1 弹药容量
            ammoType = new ItemAmmoType(Items.); // copper 使用的弹药

            mineTier = ; // -1 可挖掘的矿石最大硬度
            mineSpeed = f; // 1f 挖掘速度
            mineWalls = ; // false 能否从墙壁挖掘
            mineFloor = ; // true 能否从地板挖掘
            mineHardnessScaling = ; // true 更硬的矿石挖掘时间是否延长
            mineSound = Sounds.; // loopMineBeam 挖掘音效
            mineSoundVolume = f; // 0.6f 挖掘音效音量
            mineItems = Seq.with(Items., Items.); // 目标矿石, 用于采矿AI

            //LEG UNITS
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

            //MISSILE UNITS
            lifetime = f; // 5f * 60f 导弹的生命周期
            homingDelay = f; // 10f 导弹开始追踪前需要经过的帧数

            weapons.add(new Weapon(VanillaExpansion.name("")) {{
                bullet = new ();
                ejectEffect = Fx.; // none 弹壳抛出效果
                display = ; // true 是否显示在单位属性中
                useAmmo = ; // true 当对应规则启用时, 是否消耗弹药
                mirror = ; // true 有无镜像
                alternate = ; // true 不同副本是否依次射击
                rotate = ; // false 是否独立于单位旋转
                showStatSprite = ; // true 是否在数据库中显示武器贴图
                baseRotation = f; // 0f 起始旋转角度
                top = ; // true 是否在顶部绘制轮廓
                continuous = ; // 是否保持子弹在射击位置
                alwaysContinuous = ; // 是否无装填连续射击
                aimChangeSpeed = f; // Float.1/0f 改变炮塔瞄准距离的速度, 仅用于点激光子弹
                controllable = ; // true 是否可由玩家手动瞄准
                aiControllable = ; // true 是否可由单位自动瞄准
                alwaysShooting = ; // false 是否始终射击
                autoTarget = ; // false 是否自动瞄准目标
                predictTarget = ; // true 是否预测目标轨迹
                useAttackRange = ; // true 是否用于攻击范围计算
                targetInterval = f; // 40f 更换目标间的等待时间
                targetSwitchInterval = f; // 70f 目标切换间隔
                rotateSpeed = f; // 20f 武器旋转速度
                reload = f; // 77f 重新装填的帧数
                inaccuracy = f; // 0f 射击时的不精准度
                shake = f; // 0f 射击后屏幕震动强度
                recoil = f; // 1.5f 视觉上的后坐力
                recoils = f; // -1f 额外的后坐力计数器数量
                recoilTime = f; // = reload 后坐力复位时间
                recoilPow = f; // 1.8f 后坐力功率曲线
                cooldownTime = f; // 20f 冷却热区所用时间
                shootX = f; // 0f 弹道/特效相对于武器中心的偏移量
                shootY = f; // 3f
                x = f; // 5f 武器对于单位的偏移量
                y = f; // 0f
                xRand = f; // 0f X/Y轴上的随机散布
                yRand = f; // 0f
                shoot. = ; //
                shadow = f; // -1f 武器阴影半径
                velocityRnd = f; // 0f 速度随机分量比例
                extraVelocity = f; // 0f 额外速度比例
                shootCone = f; // 5f 射击起始锥角半径
                rotationLimit = f; // 361f 武器旋转限制
                minWarmup = f; // 0f 最小开火预热值
                shootWarmupSpeed = f; // 0.1f 射击预热速度
                smoothReloadSpeed = f; // 0.15f 平滑装填速度
                soundPitchMin = f; // 0.8f 射击音效随机音高范围
                soundPitchMax = f; // 1f
                ignoreRotation = ; // false 射击时是否忽略单位旋转
                noAttack = ; // false 该武器能否用于攻击
                minShootVelocity = f; // -1f 该武器射击所需的最小速度
                parentizeEffects = ; // 射击效果是否跟随单位
                layerOffset = f; // 0f 图层偏移量
                activeSound = Sounds.; // none 射击循环音效
                activeSoundVolume = f; // 1f 射击循环音效的音量
                shootSound = Sounds.; // shoot 射击音效
                shootSoundVolume = f; // 1f 射击音效音量
                initialShootSound = Sounds.; // none 首次开火音效
                chargeSound = Sounds.; // none 充能音效
                region = ""; // 显示纹理区域
                heatRegion = ""; // 发热纹理区域
                cellRegion = ""; // 能量单元纹理区域
                outlineRegion = ""; // 轮廓纹理区域
                heatColor = Color.valueOf(""); // ab3400 发热区域颜色
                shootStatus = StatusEffects.; // none 射击施加的状态效果
                mountType = WeaponMount::new; // 武器挂架类型
                shootStatusDuration = ; // 5f * 60f 射击状态效果持续时间
                shootOnDeath = ; // false 死亡时是否射击
                parts.add(); // 额外动画部件
            }});
        }};
        */


// Block
// Floor
        /*
        floor = new Floor("", variants) {{
            // = new Floor("", variants) {{
                // = new ShallowLiquid("") {{
                liquidBase = Blocks.; // 液体基础
                floorBase = Blocks.; // 地板基础
                liquidOpacity = f; // 0.35f 液体不透明度

                // = new OverlayFloor("") {{
                    // = new OreBlock("", Items.ore) {{
                    localizedName = ore.localizedName;
                    itemDrop = ore;
                    variants = 3;
                    mapColor.set(ore.color);
                    useColor = true;

                // OverlayFloor
                useColor = false;

            // Floow
            // 属性
            speedMultiplier = f; // 1f 移动速度倍率
            dragMultiplier = f; // 1f 阻力倍率
            damageTaken = f; // 0f 对上方单位造成的伤害
            drownTime = f; // 0f 沉没时间
            status = StatusEffects.; // none 对上方单位造成的状态效果
            statusDuration = f; // 60f 状态效果的时长
            isLiquid = ; // 是否为液体
            supportsOverlay = ; // false 是否支持覆盖层地板
            shallow = ; // false 是否为浅水
            wall = Blocks.; // 对应的墙壁
            decoration = Blocks.; // 对应的装饰块
            needsSurface = ; // true 这个覆盖层是否需要放在表面上
            allowCorePlacement = ; // false 核心能否放置在该地板上
            // 资源
            liquidDrop = Liquids.; // 泵可抽取的液体
            liquidMultiplier = f; // 1f 泵送液体的倍率
            oreDefault = ; // false 对于矿石, 是否默认在地图中生成
            oreScale = ; // 24f 矿石生成参数
            oreThreshold = ; // 0.828f
            wallOre = ; // false 该矿石能否放置在墙上
            itemDrop = Items.; // 被钻头开采时, 能够开采出的物品
            playerUnmineable = ; // false 如果为false, 该方块无法被玩家手动开采
            attributes.set(Attribute., ); // 对某些事物的效率加成

            // 渲染
            edge = ; // "stone" // 边缘填充纹理
            overlayAlpha = f; // 0.65f 对于液体, 上方覆盖层的不透明度
            blendGroup = ; // this 不绘制边缘的方块组
            canShadow = ; // true 单位能否在其上绘制阴影
            forceDrawLight = ; // false 这个地板是否忽略覆盖层的阻光标志
            tilingVariants = ; // 0 大型平铺变体的数量
            autotile = ; // false 是否使用自动拼接
            autotileMidVariants = ; // 1 自动拼接中间区域的随机变体数量
            autotileVariants = ; // 1 主自动拼接精灵的变体数量
            drawEdgeIn = ; // true 是否在其他地板上绘制这个地板的边缘
            drawEdgeOut = ; // true 是否将这个地板的边缘绘制到其他地板上
            // 粒子效果
            walkEffect = Fx.; // none 上方单位移动时产生的粒子效果
            drownUpdateEffect = Fx.; // bubble 沉没时产生的粒子效果
            // 音效
            walkSound = Sounds.; // none 上方单位移动时产生的音效
            walkSoundVolume = f; // 0.1f 移动音效音量
            walkSoundPitchMin = f; // 0.8f 移动音效音高范围
            walkSoundPitchMax = f; // 1.2f

            // Block
            placeableLiquid = true; // 能否放置在任何液体上
            allowRectanglePlacement = true; // 是否为矩形放置, 而非线性放置
            ignoreBuildDarkness = true; // 能否在黑暗区域放置, 用于编辑静态墙
            variants = 3; // 0 不同的变体贴图数量
            obstructsLight = false; // 是否遮挡其他方块发出的光线
            placeEffect = Fx.rotateBlock; // 放置效果

        }};
        */

// Prop
        /*
        prop = new Prop("") {{
            // = new Prop("") {{
                // = new SeaBush("") {{
                lobesMin = ; // 7
                lobesMax = ; // 7
                botAngle = f; // 60f
                origin = f; // 0.1f
                sclMin = f; // 30f
                sclMax = f; // 50f
                magMin = f; // 5f
                magMax = f; // 15f
                timeRange = f; // 40f
                spread = f; // 0f

                variants = 0; // 0 不同的变体贴图数量
                obstructsLight = false; // true 是否遮挡其他方块发出的光线

                // = new Seaweed("") {{
                obstructsLight = false; // true 是否遮挡其他方块发出的光线

                // = new WobbleProp("") {{
                wscl = f; // 25f
                wmag = f; // 0.4f
                wtscl = f; // 1f
                wmag2 = f; // 1f

                breakSound = Sounds.plantBreak; // unset 拆除音效

                // = new StaticWall("") {{
                    // = new StaticTree("") {{
                    variants = 0; // 0 不同的变体贴图数量

                // StaticWall
                solid = true; // 是否为实体
                breakable = alwaysReplace = unitMoveBreakable = false;
                // 是否可以用右键直接拆除这个方块; 是否在所有情况下都可以被替换; 如果为true, 某些单位踩到或移动到该方块上时会破坏该方块
                placeableLiquid = true; // false 能否放置在任何液体上
                allowRectanglePlacement = true; // false 是否为矩形放置, 而非线性放置
                ignoreBuildDarkness = true; // false 能否在黑暗区域放置, 用于编辑静态墙
                variants = 2; // 0 不同的变体贴图数量
                cacheLayer = CacheLayer.walls; // 缓存渲染层类型
                placeEffect = Fx.rotateBlock; // placeBlock 放置效果
                instantBuild = true;

            // Prop
            layer = Layer.; // blockProp 图层

            // Block
            breakable = true; // 是否可以用右键直接拆除这个方块
            alwaysReplace = true; // false 是否在所有情况下都可以被替换
            instantDeconstruct = true; // false 是否立即拆除, 不返还资源
            unitMoveBreakable = true; // 如果为true, 某些单位踩到或移动到该方块上时会破坏该方块
            breakSound = Sounds.rockBreak; // unset 拆除音效
            breakEffect = Fx.breakProp; // breakBlock 拆除效果
        }};
        */

// Drill
        /*
        drill = new Drill("") {{
            requirements(Category.distribution, BuildVisibility.hidden, ItemStack.with(Items., ));

             // = new Drill("") {{
                // = new BurstDrill("") {{
                shake = f; // 2f 挖掘时的震动强度
                speedCurve = Interp.; // pow2In
                invertedTime = f; // 200f 动画周期
                arrowSpacing = f; // 4f 箭头之间的间隔距离
                arrowOffset = f; // 0f 箭头位置的偏移量
                arrows = ; // 3 显示的箭头数量
                arrowColor = Color.valueOf(""); // feb380 箭头颜色
                baseArrowColor = Color.valueOf(""); // 6e7080 箭头底座颜色
                glowColor = Color.valueOf(""); // = arrowColor 发光颜色
                drillSound = Sounds.; // drillImpact 钻头工作时的声效
                drillSoundVolume = f; // 0.6f 钻头声效音量
                drillSoundPitchRand = f; // 0.1f 钻头音效音调随机变化范围

                // Drill
                hardnessDrillMultiplier = 0f; // 50f 硬度乘数 (未被使用)
                drillEffect = Fx.shockwave; // mine 产出物品时产生的粒子效果
                drillEffectRnd = 0f; // -1f 挖掘效果的随机范围
                ambientSound = Sounds.drillCharge; // none 空闲时发出的声音
                ambientSoundVolume = 0.18f; // 0.05f 空闲音效音量

            // BurstDrill
            // 挖掘速度
            hardnessDrillMultiplier = f; // 50f 硬度乘数
            tier = ; // 可开采的最大硬度
            drillTime = f; // 300f 基础开采时间
            liquidBoostIntensity = f; // 1.6f 液体加速倍率
            warmupSpeed = f; // 0.015f 钻头预热速度
            drillMultipliers.put(Items., f); // 不同矿石的开采速度倍率

            // 挖掘物品
            blockedItem = Items.; // 禁止开采的物品
            blockedItems = ; // 禁止开采的物品列表

            // 渲染
            drawMineItem = ; // true 是否绘制正在开采的物品
            drillEffect = Fx.; // mine 产出物品时产生的粒子效果
            drillEffectRnd = f; // -1f 挖掘效果的随机范围
            drillEffectChance = f; // 0.02f 挖掘效果出现的概率
            rotateSpeed = f; // 2f 钻头旋转的速度
            updateEffect = Fx.; // pulverizeSmall 钻头工作时随机产生的粒子效果
            updateEffectChance = f; // 0.02f 工作效果出现的概率
            drawRim = ; // false 是否绘制边框
            drawSpinSprite = ; // true 是否绘制旋转的钻头贴图
            heatColor = Color.valueOf(""); // ff5512 钻头发热时的颜色

            // Block
            flags = EnumSet.of(BlockFlag.drill); // 方块的标志集合，用于AI索引
            update = true; // 该方块是否具有持续更新的方块实体
            solid = true; // 是否为实心方块
            group = BlockGroup.drills; // 属于哪个组, 同组方块可以相互替换
            envEnabled |= Env.space; // Env.terrestrial 可运行环境
            hasItems = true; // 是否拥有物品模块
            hasLiquids = true; // 是否拥有液体模块
            ambientSound = Sounds.loopDrill; // none 空闲时发出的声音
            ambientSoundVolume = 0.019f; // 0.05f 空闲音效音量

            // = new BeamDrill("") {{
            // 挖掘速度
            drillTime = f; // 200f 基础开采时间
            range = ; // 5 开采距离
            tier = ; // 1 可开采的最大硬度
            laserWidth = f; // 0.65f
            optionalBoostIntensity = f; // 2.5f 增强倍率
            drillMultipliers.put(Items., f); // 不同矿石的开采速度倍率

            // 挖掘物品
            blockedItem = Items.; // 禁止开采的物品
            blockedItems = ; // 禁止开采的物品列表

            // 渲染
            sparkColor = Color.valueOf(""); // fd9e81 火花颜色
            glowColor = Color.valueOf(""); // white 辉光颜色
            glowIntensity = f; // 0.2f 辉光强度
            pulseIntensity = f; // 0.07f 脉冲强度
            glowScl = f; // 3f 辉光缩放
            sparks = ; // 7 火花数量
            sparkRange = f; // 10f 火花扩散范围
            sparkLife = f; // 27f 火花存在时间
            sparkRecurrence = f; // 4f 火花重复间隔
            sparkSpread = f; // 45f 火花散开角度
            sparkSize = f; // 3.5f 火花大小
            boostHeatColor = Color.valueOf(""); // Color.sky.cpy().mul(0.87f); 加速时的颜色
            heatColor = Color.valueOf(""); // 无加速时的颜色
            heatPulse = f; // 0.3f 脉冲强度
            heatPulseScl = f; // 7f 脉冲频率

            // Block
            flags = EnumSet.of(BlockFlag.drill); // 方块的标志集合，用于AI索引
            update = true; // 该方块是否具有持续更新的方块实体
            solid = true; // 是否为实心方块
            rotate = true; // 是否可旋转
            ignoreLineRotation = true; // false 如果为true, 该方块的朝向不会朝向拖动方向
            envEnabled |= Env.space; // Env.terrestrial 可运行环境
            hasItems = true; // 是否拥有物品模块
            drawArrow = false; // true 是否绘制旋转箭头
            ambientSound = Sounds.loopMineBeam; // none 空闲时发出的声音
            ambientSoundVolume = 0.05f; // 0.05f 空闲音效音量 -

            armor = f; // 0f 护甲
            size = ; // 1 方块大小
            itemCapacity = ; // 10 物品容量
            liquidCapacity = f; // -1f 液体容量
            hasPower = ; // 是否拥有电力模块
            conductivePower = ; // false 能否通过接触传导电力
            dumpTime = ; // 5 尝试输出的时间间隔, 填5即每秒尝试输出12次
            consumeLiquid(Liquids., f / 60f); // + .boost(); 消耗的液体 + 强化
            consumeLiquids(LiquidStack.with(Liquids., f/ 60f));
            consumeCoolant(f); // + .boost(); 消耗任意冷却液 + 强化
            consumePower(f / 60f); // 消耗的电力
            consumeItem(Items., ); // 消耗的物品
            consumeItems(ItemStack.with(Items., , Items., ));
            squareSprite = ; // true 贴图是否为完整方块

            researchCostMultiplier = f; // 1f 研究成本倍数
        }};
        */

// Distribution
        /*
        distribution = new ("") {{
            // = new Conveyor("") {{
                // = new ArmoredConveyor("") {{
                noSideBlend = true;

            itemSpace = f; // 0.4f 物品之间的最小间隔
            capacity = ; // 3 每节传送带最多容纳的物品数量
            speed = f; // 0f 运输速率
            displayedSpeed = f; // 0f 显示的速率
            pushUnits = ; // true 是否推动站在上面的单位
            junctionReplacement = Blocks.; // 交叉器
            bridgeReplacement = Blocks.; // 桥
            // Block
            update = true; // 该方块是否具有持续更新的方块实体
            underBullets = true; // 如果为true, 则该方块除非被明确指定, 否则无法被子弹击中
            group = BlockGroup.transportation; // 属于哪个组, 同组方块可以相互替换
            conveyorPlacement = true; // 是否使用传送带式放置模式
            priority = TargetPriority.transport; // TargetPriority.base 敌人瞄准优先级
            rotate = true; // 是否可旋转
            noUpdateDisabled = false; // false 当方块被禁用时，是否停止更新
            hasItems = true; // 是否拥有物品模块
            itemCapacity = capacity; // 10 物品容量
            unloadable = false; // true 装卸器能否作用于该方块
            ambientSound = Sounds.loopConveyor; // none 空闲时发出的声音
            ambientSoundVolume = 0.0022f; // 0.05f 空闲音效音量

            // = new StackConveyor("") {{
            glowAlpha = f; // 1f 发光透明度
            glowColor = Color.valueOf(""); // Pal.redLight 发光颜色
            baseEfficiency = f; // 0f 基础运力倍率, 强化后倍率为 this +1
            speed = f; // 0f 运输速率, 运力 = 单次装载数 * this * 60f
            outputRouter = ; // true 是否输出到路由器
            recharge = f; // 2f 填满一条线所需的最小装载点数量
            loadEffect = Fx.; // conveyorPoof 装载时的粒子效果
            unloadEffect = Fx.; // conveyorPoof 卸载时的粒子效果
            // Block
            priority = TargetPriority.transport; // TargetPriority.base 敌人瞄准优先级
            update = true; // 该方块是否具有持续更新的方块实体
            underBullets = true; // 如果为true, 则该方块除非被明确指定, 否则无法被子弹击中
            group = BlockGroup.transportation; // 属于哪个组, 同组方块可以相互替换
            conveyorPlacement = true; // 是否使用传送带式放置模式
            rotate = true; // 是否可旋转
            hasItems = true; // 是否拥有物品模块
            itemCapacity = 10; // 10 物品容量
            ambientSound = Sounds.loopConveyor; // none 空闲时发出的声音
            ambientSoundVolume = 0.004f; // 0.05f 空闲音效音量

            // = new Junction("") {{
            speed = f; // 26 物品经过需要的时间
            capacity = ; // 6 物品容量
            displayedSpeed = f; // 13f 显示的速率
            // Block
            update = true; // 该方块是否具有持续更新的方块实体
            solid = false; // 是否为实体
            underBullets = true; // 如果为true, 则该方块除非被明确指定, 否则无法被子弹击中
            group = BlockGroup.transportation; // 属于哪个组, 同组方块可以相互替换
            noUpdateDisabled = true; // false 当方块被禁用时，是否停止更新
            unloadable = false; // true 装卸器能否作用于该方块

            // = new ItemBridge("") {{
                // = new BufferedItemBridge("") {{
                speed = f; // 40f 物品经过需要的时间
                bufferCapacity = ; // 50 缓冲区容量
                displayedSpeed = f; // 11f 显示给玩家的速度
                // Block
                canOverdrive = true; // true 能否超速
                hasItems = true; // 是否拥有物品模块
                hasPower = false; // 是否拥有电力模块

            range = ; // 最大连接距离
            transportTime = f; // 物品从一端传输到另一端所需的时间
            fadeIn = ; // true 是否渐显
            moveArrows = ; // true 是否显示移动的箭头
            pulse = ; // false 是否启用脉冲效果
            arrowSpacing = f; // 4f 箭头之间的间隔距离
            arrowOffset = f; // 2f 箭头位置的偏移量
            arrowPeriod = f; // 0.4f 箭头动画周期
            arrowTimeScl = f; // 6.2f 箭头动画时间缩放
            bridgeWidth = f; // 6.5f 桥身绘制的宽度
            // Block
            update = true; // 该方块是否具有持续更新的方块实体
            solid = true; // 是否为实体
            underBullets = true; // 如果为true, 则该方块除非被明确指定, 否则无法被子弹击中
            group = BlockGroup.transportation; // 属于哪个组, 同组方块可以相互替换
            delayLandingConfig = true; // 如果为true, 则在着陆构建动画中, 该方块的配置操作会被延迟, 未来可能会被移除
            allowDiagonal = false; // true 能否使用对角线放置模式(ctrl)
            priority = TargetPriority.transport; // TargetPriority.base 敌人瞄准优先级
            copyConfig = false; // true 能否通过选取操作复制配置
            allowConfigInventory = false; // true 物品库存是否与配置界面一起显示
            ignoreResizeConfig = true; // 如果为true, 在地图大小改变时, 不会有名为transform的点配置
            noUpdateDisabled = true; // false 当方块被禁用时，是否停止更新
            configurable = true; // false 能否被逻辑配置
            hasItems = true; // 是否拥有物品模块
            itemCapacity = 10; // 10 物品容量
            unloadable = false; // true 装卸器能否作用于该方块
            hasPower = true; // 是否拥有电力模块

            // = new Sorter("") {{
            invert = ; // 效果反向
            // Block
            update = false; // 该方块是否具有持续更新的方块实体
            underBullets = true; // 如果为true, 则该方块除非被明确指定, 否则无法被子弹击中
            group = BlockGroup.transportation; // 属于哪个组, 同组方块可以相互替换
            destructible = true; // 该方块是否具有生命值并可摧毁. update为true时, 该项为false不会有任何效果
            saveConfig = true; // false 是否保存上一次的配置并应用到新方块
            clearOnDoubleTap = true; // true 能否通过双击清除配置
            configurable = true;  // 能否被点击并打开配置界面
            unloadable = false; // true 装卸器能否作用于该方块
            instantTransfer = true; // false 是否支持瞬时传输(光传)

            // = new Router("") {{
            speed = f; // 8f
            // Block
            update = true; // 该方块是否具有持续更新的方块实体
            solid = false; // 是否为实体
            underBullets = true; // 如果为true, 则该方块除非被明确指定, 否则无法被子弹击中
            group = BlockGroup.transportation; // 属于哪个组, 同组方块可以相互替换
            noUpdateDisabled = true; // false 当方块被禁用时，是否停止更新
            hasItems = true; // 是否拥有物品模块
            itemCapacity = 1; // 10 物品容量
            unloadable = false; // true 装卸器能否作用于该方块

            // = new OverflowGate("") {{
            speed = f; // 1f
            invert = ; // false 效果反向
            // Block
            canOverdrive = false; // true 能否超速
            update = false; // 该方块是否具有持续更新的方块实体
            underBullets = true; // 如果为true, 则该方块除非被明确指定, 否则无法被子弹击中
            group = BlockGroup.transportation; // 属于哪个组, 同组方块可以相互替换
            destructible = true; // 该方块是否具有生命值并可摧毁. update为true时, 该项为false不会有任何效果
            hasItems = true; // 是否拥有物品模块
            itemCapacity = 0; // 10 物品容量
            unloadable = false; // true 装卸器能否作用于该方块
            instantTransfer = true; // false 是否支持瞬时传输(光传)

            // = new Unloader("") {{
            speed = f; // 1f 每次装卸的时间间隔
            allowCoreUnload = ; // true 能否从核心卸载
            // Block
            health = 70; // -1 生命值, 跳过scaledHealth
            update = true; // 该方块是否具有持续更新的方块实体
            solid = true; // 是否为实体
            saveConfig = true; // false 是否保存上一次的配置并应用到新方块
            clearOnDoubleTap = true; // true 能否通过双击清除配置
            configurable = true; // 能否被点击并打开配置界面
            noUpdateDisabled = true; // false 当方块被禁用时，是否停止更新
            hasItems = true; // 是否拥有物品模块
            itemCapacity = 0; // 10 物品容量
            unloadable = false; // true 装卸器能否作用于该方块

            // = new Duct("") {{
            speed = f; // 5f 两次物品运输之间的时间间隔
            armored = ; // false 是否具有装甲
            transparentColor = Color.valueOf(""); // 管道颜色
            bridgeReplacement = Blocks.; // 交叉器
            junctionReplacement = Blocks.; // 桥
            // Block
            priority = TargetPriority.transport; // TargetPriority.base 敌人瞄准优先级
            update = true; // 该方块是否具有持续更新的方块实体
            solid = false; // 是否为实体
            underBullets = true; // 如果为true, 则该方块除非被明确指定, 否则无法被子弹击中
            group = BlockGroup.transportation; // 属于哪个组, 同组方块可以相互替换
            conveyorPlacement = true; // 是否使用传送带式放置模式
            rotate = true; // 是否可旋转
            envEnabled = Env.space | Env.terrestrial | Env.underwater; // Env.terrestrial 可运行环境
            noUpdateDisabled = true; // false 当方块被禁用时，是否停止更新
            hasItems = true; // 是否拥有物品模块
            itemCapacity = 1; // 10 物品容量
            unloadable = false; // true 装卸器能否作用于该方块
            noSideBlend = true; // false 是否接受来自侧面的输入
            isDuct = true; // false 该方块是否为管道

            // = new DuctJunction("") {{
            transparentColor = Color.valueOf(""); // 管道颜色
            speed = f; // 5f 两次物品运输之间的时间间隔
            // Block
            priority = TargetPriority.transport; // TargetPriority.base 敌人瞄准优先级
            update = true; // 该方块是否具有持续更新的方块实体
            solid = false; // 是否为实体
            underBullets = true; // 如果为true, 则该方块除非被明确指定, 否则无法被子弹击中
            floating = true; // false 是否可以放置在液体边缘
            group = BlockGroup.transportation; // 属于哪个组, 同组方块可以相互替换
            envEnabled = Env.space | Env.terrestrial | Env.underwater; // Env.terrestrial 可运行环境
            noUpdateDisabled = true; // false 当方块被禁用时，是否停止更新
            hasItems = true; // 是否拥有物品模块
            unloadable = false; // true 装卸器能否作用于该方块

            // = new DuctBridge("") {{
            speed = 5f; // 物品运输的时间间隔
            // Block-1
            underBullets = true; // 如果为true, 则该方块除非被明确指定, 否则无法被子弹击中
            hasItems = true; // 是否拥有物品模块
            itemCapacity = 4; // 10 物品容量
            isDuct = true; // false 该方块是否为管道
            // DirectionBridge
            range = ; // 4 最大连接距离
            // Block-2
            update = true; // 该方块是否具有持续更新的方块实体
            solid = true; // 是否为实体
            group = BlockGroup.transportation; // 属于哪个组, 同组方块可以相互替换
            allowDiagonal = false; // true 能否使用对角线放置模式(ctrl)
            priority = TargetPriority.transport; // TargetPriority.base 敌人瞄准优先级
            rotate = true; // 是否可旋转
            envEnabled = Env.space | Env.terrestrial | Env.underwater; // Env.terrestrial 可运行环境
            noUpdateDisabled = true; // false 当方块被禁用时，是否停止更新
            drawArrow = false; // true 是否绘制旋转箭头

            // = new DuctRouter("") {{
                // = new StackRouter("") {{
                baseEfficiency = f; // 0f 基础效率
                glowAlpha = f; // 1f 发光透明度
                glowColor = Color.valueOf(""); // Pal.redLight 发光颜色
                // Block
                itemCapacity = 10; // 10 物品容量

            speed = f; // 5f 两次物品运输之间的时间间隔
            // Block
            priority = TargetPriority.transport; // TargetPriority.base 敌人瞄准优先级
            update = true; // 该方块是否具有持续更新的方块实体
            solid = false; // 是否为实体
            underBullets = true; // 如果为true, 则该方块除非被明确指定, 否则无法被子弹击中
            group = BlockGroup.transportation; // 属于哪个组, 同组方块可以相互替换
            rotate = true; // 是否可旋转
            envEnabled = Env.space | Env.terrestrial | Env.underwater; // Env.terrestrial 可运行环境
            saveConfig = true; // false 是否保存上一次的配置并应用到新方块
            clearOnDoubleTap = true; // true 能否通过双击清除配置
            configurable = true; // 能否被点击并打开配置界面
            noUpdateDisabled = true; // false 当方块被禁用时，是否停止更新
            hasItems = true; // 是否拥有物品模块
            itemCapacity = 1; // 10 物品容量
            unloadable = false; // true 装卸器能否作用于该方块

            // = new OverflowDuct("") {{
            speed = f; // 5f 两次物品运输之间的时间间隔
            invert = ; // false 效果反向
            // Block
            priority = TargetPriority.transport; // TargetPriority.base 敌人瞄准优先级
            update = true; // 该方块是否具有持续更新的方块实体
            solid = false; // 是否为实体
            underBullets = true; // 如果为true, 则该方块除非被明确指定, 否则无法被子弹击中
            group = BlockGroup.transportation; // 属于哪个组, 同组方块可以相互替换
            conveyorPlacement = true; // 是否使用传送带式放置模式
            rotate = true; // 是否可旋转
            envEnabled = Env.space | Env.terrestrial | Env.underwater; // Env.terrestrial 可运行环境
            noUpdateDisabled = true; // false 当方块被禁用时，是否停止更新
            hasItems = true; // 是否拥有物品模块
            itemCapacity = 1; // 10 物品容量
            unloadable = false; // true 装卸器能否作用于该方块

            // = new DirectionalUnloader("") {{
            speed = f; // 1f 两次物品运输之间的时间间隔
            allowCoreUnload = ; // false 能否从核心卸载
            // Block
            priority = TargetPriority.transport; // TargetPriority.base 敌人瞄准优先级
            update = true; // 该方块是否具有持续更新的方块实体
            solid = true; // 是否为实体
            group = BlockGroup.transportation; // 属于哪个组, 同组方块可以相互替换
            rotate = true; // 是否可旋转
            envDisabled = Env.none; // 0 无法运行的环境
            clearOnDoubleTap = true; // true 能否通过双击清除配置
            saveConfig = true; // false 是否保存上一次的配置并应用到新方块
            configurable = true; // 能否被点击并打开配置界面
            noUpdateDisabled = true; // false 当方块被禁用时，是否停止更新
            hasItems = true; // 是否拥有物品模块
            itemCapacity = 0; // 10 物品容量
            unloadable = false; // true 装卸器能否作用于该方块
            isDuct = true; // false 该方块是否为管道

            // = new MassDriver("") {{
            range = f; // 最大传输距离
            rotateSpeed = f; // 5f 旋转速度
            translation = f; // 7f 后坐力位移
            minDistribute = ; // 10 最小发送数量
            knockback = f; // 4f 后坐力强度
            reload = f; // 100f 装填时间
            bullet = new MassDriverBolt(); // 发射的子弹类型
            bulletSpeed = f; // 5.5f 子弹飞行速度
            bulletLifetime = f; // 200f 子弹最长存在时间
            shootEffect = Fx.; // shootBig2 发射特效
            smokeEffect = Fx.; // shootBigSmoke2 烟雾特效
            receiveEffect = Fx.; // mineBig 接收特效
            shootSound = Sounds.; // massdriver 发射音效
            receiveSound = Sounds.; // massdriverReceive 接收音效
            shootSoundVolume = f; // 0.5f 发射音量
            shake = f; // 3f 屏幕震动强度
            // Block
            update = true; // 该方块是否具有持续更新的方块实体
            solid = true; // 是否为实体
            sync = true; // 是否需要周期性的在网络中同步
            envEnabled |= Env.space; // Env.terrestrial 可运行环境
            configurable = true; // 能否被点击并打开配置界面
            hasItems = true; // 是否拥有物品模块
            hasPower = true; // 是否拥有电力模块
            outlineIcon = true; // false 是否有图标轮廓
        }};
        */

// 其他
        /*
        block = new TreeBlock("") {{
            // = new Block("") {{
                // = new TreeBlock("") {{
                shadowOffset = f; // -4f

                solid = true; // 是否为实体
                clipSize = 90; // -1f 方块的贴图裁剪范围大小
                customShadow = true; // false 是否绘制自定义阴影(name-shadow)

            // Block
            requirements(Category.distribution, BuildVisibility.hidden, ItemStack.with(Items., ));

            // 基础属性
            insulated = ; // false 是否具有绝缘属性
            absorbLasers = ; // false 能否吸收激光
            scaledHealth = f; // -1f 每个格子所占的生命值基数, 结果为: health = size * size * scaledHealth并四舍五入至5的倍数
            health = ; // -1 生命值, 跳过scaledHealth
            armor = f; // 0f 护甲
            baseExplosiveness = ; // 0f 基础爆炸性
            explosivenessScale = ; // 1f 爆炸性系数
            flammabilityScale = ; // 1f 易燃性系数
            size = ; // 1 方块大小
            placeOverlapRange = f; // 50f 启用placeRangeCheck规则时, 检测敌方方块的范围
            attacks = ; // false 能否攻击
            suppressable = ; // false 是否与修复有关
            canOverdrive = ; // true 能否超速
            researchCostMultiplier = f; // 1f 研究成本倍数
            researchCostMultipliers.put(Items., f); // 每种物品的研究成本
            researchCost = ItemStack.with(Items., ); // 覆盖研究成本
            unitCapModifier = ; // 0 提供的单位容量, 仅当方块的标志包含unitModifier时生效
            fogRadius = ; // -1 能揭示多大范围的战争迷雾
            // 作为载荷
            updateInUnits = ; // true 当方块作为单位搬运的载荷时，是否继续更新
            alwaysUpdateInUnits = ; // false 作为载荷时, 是否无视实验性游戏规则，始终更新
            canPickup = ; // true 能否被搬起
            deconstructDropAllLiquid = ; // false 如果为false, 则在解构时仅输出可焚烧液体, 否则输出所有液体
            // 索敌
            flags = EnumSet.of(BlockFlag.); // 方块的标志集合，用于AI索引
            priority = f; // TargetPriority.base 敌人瞄准优先级
            targetable = ; // true 单位是否瞄准此方块
            // 特殊属性
            inEditor = ; // true 编辑器中是否可见
            editorConfigurable = ; // 是否可在编辑器中配置
            update = ; // 该方块是否具有持续更新的方块实体
            solid = ; // 是否为实体
            solidifes = ; // 是否为实心方块
            teamPassable = ; // 如果为true, 则被视为同阵营的非实体方块
            underBullets = ; // 如果为true, 则该方块除非被明确指定, 否则无法被子弹击中
            saveData = ; // 是否保存数据到世界存档
            timers = ; // 0 计时器的最大值
            sync = ; // 是否需要周期性的在网络中同步
            forceTeam = ; // 所有这个方块全部强制属于这个队伍

            // 放置和拆除
            breakable = ; // 是否可以用右键直接拆除这个方块
            requiresWater = ; // false 是否只能放置在水上
            placeableLiquid = ; // false 能否放置在任何液体上
            placeablePlayer = ; // true 能否通过建筑菜单直接放置
            placeableOn = ; // true 其他方块能否放置在这个方块上面
            floating = ; // false 是否可以放置在液体边缘
            alwaysReplace = ; // false 是否在所有情况下都可以被替换
            replaceable = ; // true 能否被替换
            group = BlockGroup.; // 属于哪个组, 同组方块可以相互替换
            delayLandingConfig = ; // 如果为true, 则在着陆构建动画中, 该方块的配置操作会被延迟, 未来可能会被移除
            conveyorPlacement = ; // 是否使用传送带式放置模式
            allowDiagonal = ; // true 能否使用对角线放置模式(ctrl)
            swapDiagonalPlacement = ; // 是否交换对角线放置模式
            allowRectanglePlacement = ; // false 是否为矩形放置, 而非线性放置
            schematicPriority = ; // 0 蓝图建造优先级
            buildTime = f; // -1f 建造时间
            buildCostMultiplier = f; // -1f 建造此方块的速度倍率
            ignoreBuildDarkness = ; // false 能否在黑暗区域放置, 用于编辑静态墙
            deconstructThreshold = f; // 0f 拆除完成的阈值
            instantDeconstruct = ; // false 是否立即拆除, 不返还资源
            // 旋转
            rotate = ; // 是否可旋转
            quickRotate = ; // true 放置后能否旋转
            ignoreLineRotation = ; // false 如果为true, 该方块的朝向不会朝向拖动方向
            invertFlip = ; // false 如果为true, 则放置或保存蓝图时不会旋转
            rotateDraw = ; // true 当rotate为true且该项为false时, 该方块在渲染时不会旋转
            rotateDrawEditor = ; // true 当rotate为true且该项为false时, 该方块在编辑器中渲染时不会旋转
            lockRotation = ; // true 当rotate为false且该项为true时, 该方块放置时旋转将锁定到0(默认)
            visualRotationOffset = f; // 0f 视觉旋转偏移
            // 摧毁和重建
            destructible = ; // 该方块是否具有生命值并可摧毁. update为true时, 该项为false不会有任何效果
            unitMoveBreakable = ; // 如果为true, 某些单位踩到或移动到该方块上时会破坏该方块
            crushDamageMultiplier = f; // 1f 碾压伤害倍率
            crushFragile = ; // false 如果为true, 当坦克的crushFragile同为true时, 会立刻破坏该方块
            drawCracks = ; // true 损坏时是否产生裂纹
            baseShake = ; // 3f 被摧毁时的屏幕震动
            createRubble = ; // true 被摧毁时是否产生残骸
            rebuildable = ; // true 是否可重建
            allowDerelictRepair = ; // true 该方块的废墟能否通过点击修复
            destroyBulletSameTeam = ; // false 被摧毁时产生子弹的阵营
            destroyBullet = new () {{}}; // 被摧毁时产生的子弹
            // 环境需求
            envRequired = Env. | Env.; // 0 必要环境
            envEnabled = Env. | Env.; // Env.terrestrial 可运行环境
            envDisabled = Env. | Env.; // 0 无法运行的环境

            // 配置
            saveConfig = ; // false 是否保存上一次的配置并应用到新方块
            copyConfig = ; // true 能否通过选取操作复制配置
            clearOnDoubleTap = ; // true 能否通过双击清除配置
            configurable = ; // 能否被点击并打开配置界面
            allowConfigInventory = ; // true 物品库存是否与配置界面一起显示
            selectionRows = ; // 5 选择菜单的行数
            selectionColumns = ; // 4 选择菜单的列数
            consumesTap = ; // 当方块被点击时，是否拦截touchDown事件
            ignoreResizeConfig = ; // 如果为true, 在地图大小改变时, 不会有名为transform的点配置
            commandable = ; // 在指挥模式下能否被选中
            // 逻辑
            privileged = ; // false 对于逻辑相关方块, 能否被普通逻辑处理器更改
            autoResetEnabled = ; // true 当逻辑块长时间没有交互时，是否自动重置其启用状态
            drawDisabled = ; // true 是否绘制禁用状态
            noUpdateDisabled = ; // false 当方块被禁用时，是否停止更新
            logicConfigurable = ; // false 能否被逻辑配置

            // 生产
            itemDrop = Items.; // 被钻头开采时, 能够开采出的物品
            playerUnmineable = ; // false 如果为false, 该方块无法被玩家手动开采
            attributes.set(Attribute., ); // 对某些事物的效率加成
            // 物品
            hasItems = ; // 是否拥有物品模块
            depositCooldown = f; // -1f 玩家向该方块存入物品时的冷却时间
            itemCapacity = ; // 10 物品容量
            separateItemCapacity = ; // false 物品容量是否独立计算
            unloadable = ; // true 装卸器能否作用于该方块
            // 液体
            hasLiquids = ; // 是否拥有液体模块
            liquidCapacity = f; // -1f 液体容量
            outputsLiquid = ; // false 是否输出液体
            liquidPressure = f; // 1f 液体输出速率
            displayFlow = ; // true 显示液体传输速率
            // 电力
            hasPower = ; // 是否拥有电力模块
            consumesPower = ; // true 是否被视为耗电单元
            outputsPower = ; // false 是否输出电力
            connectedPower = ; // true 能否被节点连接
            conductivePower = ; // false 能否通过接触传导电力
            // 单位
            outputsPayload = ; // false 能否输出载荷
            acceptsUnitPayloads = ; // false 能否输入载荷
            acceptsPayload = ; // false 载荷是否尝试进入该方块
            // 输入输出
            acceptsItems = ; // false 是否与附近的传送带连接
            alwaysAllowDeposit = ; // false 是否忽略onlyDepositCore规则
            outputFacing = ; // true 是否按方块朝向输出
            noSideBlend = ; // false 是否接受来自侧面的输入
            isDuct = ; // false 该方块是否为管道
            allowResupply = ; // false 单位能否从该方块拿取物品
            instantTransfer = ; // false 是否支持瞬时传输(光传)
            dumpTime = ; // 5 尝试输出的时间间隔, 填5即每秒尝试输出12次
            consumeLiquid(Liquids., f / 60f); // + .boost(); 消耗的液体 + 强化
            consumeLiquids(LiquidStack.with(Liquids., f / 60f));
            consumeCoolant(f); // + .boost(); 消耗任意冷却液 + 强化
            consumePower(f / 60f); // 消耗的电力
            consumeItem(Items., ); // 消耗的物品
            consumeItems(ItemStack.with(Items., , Items., ));

            // 渲染
            variants = ; // 0 不同的变体贴图数量
            drawArrow = ; // true 是否绘制旋转箭头
            drawTeamOverlay = ; // true 是否绘制队伍标识
            squareSprite = ; // true 贴图是否为完整方块
            enableDrawStatus = ; // true 是否绘制状态
            lightLiquid = Liquids.; // 用于光照效果的液体
            offset = f; // 0f 方块在网格中的偏移量
            clipSize = f; // -1f 方块的贴图裁剪范围大小
            lightClipSize = f; // 仅用于光照的裁剪范围
            cacheLayer = CacheLayer.; // 缓存渲染层类型
            fillsTile = ; // true 如果为 false，即使被缓存，也会在方块下方绘制地板
            forceDark = ; // false 是否强制让这个方块被黑暗/战争迷雾覆盖
            drawLiquidLight = ; // true 是否绘制液体的发光效果
            mapColor = ; // 小地图颜色
            hasColor = ; //false 是否具有小地图颜色
            outlineColor = Color.valueOf(""); // 404049 方块图标的轮廓颜色
            outlineIcon = ; // false 是否有图标轮廓
            outlineRadius = ; // 4 轮廓宽度
            outlinedIcon = ; // -1 哪个图标区域会添加轮廓
            hasShadow = ; // true 下方是否有阴影
            customShadow = ; // false 是否绘制自定义阴影(name-shadow)
            albedo = f; // 0f 反射率
            lightColor = Color.valueOf(""); // 方块自身发出的环境光颜色
            emitLight = ; // false 是否调用drawLight()
            obstructsLight = ; // true 是否遮挡其他方块发出的光线
            lightRadius = f; // 60f 光照半径
            useColor = ; // true 是否在小地图中使用这个方块的颜色
            // 音效
            configureSound = Sounds.; // click 进行配置时产生的音效
            placePitchChange = ; // true 建造时是否改变建造音效的音高
            breakPitchChange = ; // true 拆除时是否改变拆除音效的音高
            placeSound = Sounds.; // unset 建造音效
            breakSound = Sounds.; // unset 拆除音效
            destroySound = Sounds.; // unset 摧毁音效
            destroySoundVolume = f; // 1f 摧毁音效音量
            destroyPitchMin = f; // 1f 摧毁音效音调范围
            destroyPitchMax = f; // 1f
            ambientSound = Sounds.; // none 空闲时发出的声音
            ambientSoundVolume = f; // 0.05f 空闲音效音量
            // 粒子效果
            placeEffect = Fx.; // placeBlock 放置效果
            breakEffect = Fx.; // breakBlock 拆除效果
            destroyEffect = Fx.; // dynamicExplosion 摧毁效果

        }};
        */

        /*
        floor = new Floor("", variants) {{
            edge = ; // "stone" // 边缘填充纹理
            speedMultiplier = f; // 1f 移动速度倍率
            dragMultiplier = f; // 1f 阻力倍率
            damageTaken = f; // 0f 对上方单位造成的伤害
            drownTime = f; // 0f 沉没时间
            walkEffect = Fx.; // none 上方单位移动时产生的粒子效果
            walkSound = Sounds.; // none 上方单位移动时产生的音效
            walkSoundVolume = f; // 0.1f 移动音效音量
            walkSoundPitchMin = f; // 0.8f 移动音效音高范围
            walkSoundPitchMax = f; // 1.2f
            drownUpdateEffect = Fx.; // bubble 沉没时产生的粒子效果
            status = StatusEffects.; // none 对上方单位造成的状态效果
            statusDuration = f; // 60f 状态效果的时长
            liquidDrop = Liquids.; // 泵可抽取的液体
            liquidMultiplier = f; // 1f 泵送液体的倍率
            isLiquid = ; // 是否为液体
            overlayAlpha = f; // 0.65f 对于液体, 上方覆盖层的不透明度
            supportsOverlay = ; // false 是否支持覆盖层地板
            shallow = ; // false 是否为浅水
            blendGroup = ; // this 不绘制边缘的方块组
            oreDefault = ; // false 对于矿石, 是否默认在地图中生成
            oreScale = ; // 24f 矿石生成参数
            oreThreshold = ; // 0.828f
            wall = Blocks.; // 对应的墙壁
            decoration = Blocks.; // 对应的装饰块
            canShadow = ; // true 单位能否在其上绘制阴影
            forceDrawLight = ; // false 这个地板是否忽略覆盖层的阻光标志
            needsSurface = ; // true 这个覆盖层是否需要放在表面上
            allowCorePlacement = ; // false 核心能否放置在该地板上
            wallOre = ; // false 该矿石能否放置在墙上
            tilingVariants = ; // 0 大型平铺变体的数量
            autotile = ; // false 是否使用自动拼接
            autotileMidVariants = ; // 1 自动拼接中间区域的随机变体数量
            autotileVariants = ; // 1 主自动拼接精灵的变体数量
            drawEdgeIn = ; // true 是否在其他地板上绘制这个地板的边缘
            drawEdgeOut = ; // true 是否将这个地板的边缘绘制到其他地板上

            placeableLiquid = true; // 能否放置在任何液体上
            allowRectanglePlacement = true; // 是否为矩形放置, 而非线性放置
            ignoreBuildDarkness = true; // 能否在黑暗区域放置, 用于编辑静态墙
            obstructsLight = false; // 是否遮挡其他方块发出的光线
            placeEffect = Fx.rotateBlock; // 放置效果

            itemDrop = Items.; // 被钻头开采时, 能够开采出的物品
            playerUnmineable = ; // false 如果为false, 该方块无法被玩家手动开采
            attributes.set(Attribute., ); // 对某些事物的效率加成

        }};
        */
        /*
        block = new Block("") {{
            hasItems = ; // 是否拥有物品模块
            hasLiquids = ; // 是否拥有液体模块
            hasPower = ; // 是否拥有电力模块
            outputsLiquid = ; // false 是否输出液体
            consumesPower = ; // true 是否被视为耗电单元
            outputsPower = ; // false 是否输出电力
            connectedPower = ; // true 能否被节点连接
            conductivePower = ; // false 能否通过接触传导电力
            outputsPayload = ; // false 能否输出载荷
            acceptsUnitPayloads = ; // false 能否输入载荷
            acceptsPayload = ; // false 载荷是否尝试进入该方块
            acceptsItems = ; // false 是否与附近的传送带连接
            alwaysAllowDeposit = ; // false 是否忽略onlyDepositCore规则
            depositCooldown = f; // -1f 玩家向该方块存入物品时的冷却时间
            separateItemCapacity = ; // false 物品容量是否独立计算
            itemCapacity = ; // 10 物品容量
            liquidCapacity = f; // -1f 液体容量
            liquidPressure = f; // 1f 液体输出速率
            outputFacing = ; // true 是否按方块朝向输出
            noSideBlend = ; // false 是否接受来自侧面的输入
            displayFlow = ; // true 显示液体传输速率
            inEditor = ; // true 编辑器中是否可见
            editorConfigurable = ; // 是否可在编辑器中配置
            saveConfig = ; // false 是否保存上一次的配置并应用到新方块
            copyConfig = ; // true 能否通过选取操作复制配置
            clearOnDoubleTap = ; // true 能否通过双击清除配置
            update = ; // 该方块是否具有持续更新的方块实体
            destructible = ; // 该方块是否具有生命值并可摧毁. update为true时, 该项为false不会有任何效果
            unloadable = ; // true 装卸器能否作用于该方块
            isDuct = ; // false 该方块是否为管道
            allowResupply = ; // false 单位能否从该方块拿取物品
            solid = ; // 是否为实体
            solidifes = ; // 是否为实心方块
            teamPassable = ; // 如果为true, 则被视为同阵营的非实体方块
            underBullets = ; // 如果为true, 则该方块除非被明确指定, 否则无法被子弹击中
            rotate = ; // 是否可旋转
            rotateDraw = ; // true 当rotate为true且该项为false时, 该方块在渲染时不会旋转
            rotateDrawEditor = ; // true 当rotate为true且该项为false时, 该方块在编辑器中渲染时不会旋转
            visualRotationOffset = f; // 0f 视觉旋转偏移
            lockRotation = ; // true 当rotate为false且该项为true时, 该方块放置时旋转将锁定到0(默认)
            ignoreLineRotation = ; // false 如果为true, 该方块的朝向不会朝向拖动方向
            invertFlip = ; // false 如果为true, 则放置或保存蓝图时不会旋转
            variants = ; // 0 不同的变体贴图数量
            drawArrow = ; // true 是否绘制旋转箭头
            drawTeamOverlay = ; // true 是否绘制队伍标识
            saveData = ; // 是否保存数据到世界存档
            breakable = ; // 是否可以用右键直接拆除这个方块
            unitMoveBreakable = ; // 如果为true, 某些单位踩到或移动到该方块上时会破坏该方块
            rebuildable = ; // true 是否可重建
            privileged = ; // false 对于逻辑相关方块, 能否被普通逻辑处理器更改
            requiresWater = ; // false 是否只能放置在水上
            placeableLiquid = ; // false 能否放置在任何液体上
            placeablePlayer = ; // true 能否通过建筑菜单直接放置
            placeableOn = ; // true 其他方块能否放置在这个方块上面
            insulated = ; // false 是否具有绝缘属性
            squareSprite = ; // true 贴图是否为完整方块
            absorbLasers = ; // false 能否吸收激光
            enableDrawStatus = ; // true 是否绘制状态
            drawDisabled = ; // true 是否绘制禁用状态
            autoResetEnabled = ; // true 当逻辑块长时间没有交互时，是否自动重置其启用状态
            noUpdateDisabled = ; // false 当方块被禁用时，是否停止更新
            updateInUnits = ; // true 当方块作为单位搬运的载荷时，是否继续更新
            alwaysUpdateInUnits = ; // false 作为载荷时, 是否无视实验性游戏规则，始终更新
            canPickup = ; // true 能否被搬起
            deconstructDropAllLiquid = ; // false 如果为false, 则在解构时仅输出可焚烧液体, 否则输出所有液体
            mapColor = ; // 小地图颜色
            useColor = ; // true 是否在小地图中使用这个方块的颜色
            itemDrop = Items.; // 用于钻头, 能够开采的物品
            playerUnmineable = ; // false 如果为false, 该方块无法被玩家手动开采
            attributes.set(Attribute., ); // 对某些事物的效率加成
            scaledHealth = f; // -1f 每个格子所占的生命值基数, 结果为: health = size * size * scaledHealth并四舍五入至5的倍数
            health = ; // -1 生命值, 跳过scaledHealth
            armor = f; // 0f 护甲
            baseExplosiveness = ; // 0f 基础爆炸性
            explosivenessScale = ; // 1f 爆炸性系数
            flammabilityScale = ; // 1f 易燃性系数
            baseShake = ; // 3f 被摧毁时的屏幕震动
            destroyBullet = new () {{}}; // 被摧毁时产生的子弹
            destroyBulletSameTeam = ; // false 被摧毁时产生子弹的阵营
            lightLiquid = Liquids.; // 用于光照效果的液体
            drawCracks = ; // true 损坏时是否产生裂纹
            createRubble = ; // true 被摧毁时是否产生废墟
            floating = ; // false 是否可以放置在液体边缘
            size = ; // 1 方块大小
            offset = f; // 0f 方块在网格中的偏移量
            clipSize = f; // -1f 方块的贴图裁剪范围大小
            lightClipSize = f; // 仅用于光照的裁剪范围
            placeOverlapRange = f; // 50f 启用placeRangeCheck规则时, 检测敌方方块的范围
            crushDamageMultiplier = f; // 1f 碾压伤害倍率
            crushFragile = ; // false 如果为true, 当坦克的crushFragile同为true时, 会立刻破坏该方块
            timers = ; // 0 计时器的最大值
            cacheLayer = CacheLayer.; // 缓存渲染层类型
            fillsTile = ; // true 如果为 false，即使被缓存，也会在方块下方绘制地板
            forceDark = ; // false 是否强制让这个方块被黑暗/战争迷雾覆盖
            alwaysReplace = ; // false 是否在所有情况下都可以被替换
            replaceable = ; // true 能否被替换
            group = BlockGroup.; // 属于哪个组, 同组方块可以相互替换
            flags = EnumSet.of(BlockFlag.); // 方块的标志集合，用于AI索引
            priority = f; // TargetPriority.base 敌人瞄准优先级
            unitCapModifier = ; // 0 提供的单位容量, 仅当方块的标志包含unitModifier时生效
            configurable = ; // 能否被点击并打开配置界面
            configureSound = Sounds.; // click 进行配置时产生的音效
            ignoreResizeConfig = ; // 如果为true, 在地图大小改变时, 不会有名为transform的点配置
            commandable = ; // 在指挥模式下能否被选中
            allowConfigInventory = ; // true 物品库存是否与配置界面一起显示
            selectionRows = ; // 5 选择菜单的行数
            selectionColumns = ; // 4 选择菜单的列数
            logicConfigurable = ; // false 能否被逻辑配置
            delayLandingConfig = ; // 如果为true, 则在着陆构建动画中, 该方块的配置操作会被延迟, 未来可能会被移除
            consumesTap = ; // 当方块被点击时，是否拦截touchDown事件
            drawLiquidLight = ; // true 是否绘制液体的发光效果

            // 环境需求
            envRequired = Env. | Env.; // 0 必要环境
            envEnabled = Env. | Env.; // Env.terrestrial 可运行环境
            envDisabled = Env. | Env.; // 0 无法运行的环境

            sync = ; // 是否需要周期性的在网络中同步
            conveyorPlacement = ; // 是否使用传送带式放置模式
            allowDiagonal = ; // true 能否使用对角线放置模式(ctrl)
            swapDiagonalPlacement = ; // 是否交换对角线放置模式
            allowRectanglePlacement = ; // false 是否为矩形放置, 而非线性放置
            schematicPriority = ; // 0 蓝图建造优先级
            hasColor = ; //false 是否具有小地图颜色
            targetable = ; // true 单位是否瞄准此方块
            attacks = ; // false 能否攻击
            suppressable = ; // false 是否与修复有关
            canOverdrive = ; // true 能否超速
            outlineColor = Color.valueOf(""); // 404049 方块图标的轮廓颜色
            outlineIcon = ; // false 是否有图标轮廓
            outlineRadius = ; // 4 轮廓宽度
            outlinedIcon = ; // -1 哪个图标区域会添加轮廓
            hasShadow = ; // true 下方是否有阴影
            customShadow = ; // false 是否绘制自定义阴影(name-shadow)
            placePitchChange = ; // true 建造时是否改变建造音效的音高
            breakPitchChange = ; // true 拆除时是否改变拆除音效的音高
            placeSound = Sounds.; // unset 建造音效
            breakSound = Sounds.; // unset 拆除音效
            destroySound = Sounds.; // unset 摧毁音效
            destroySoundVolume = f; // 1f 摧毁音效音量
            destroyPitchMin = f; // 1f 摧毁音效音调范围
            destroyPitchMax = f; // 1f
            albedo = f; // 0f 反射率
            lightColor = Color.valueOf(""); // 方块自身发出的环境光颜色
            emitLight = ; // false 是否调用drawLight()
            obstructsLight = ; // true 是否遮挡其他方块发出的光线
            lightRadius = f; // 60f 光照半径

            fogRadius = ; // -1 能揭示多大范围的战争迷雾

            ambientSound = Sounds.; // none 空闲时发出的声音
            ambientSoundVolume = f; // 0.05f 空闲音效音量

            requirements(Category.distribution, BuildVisibility.hidden, ItemStack.with(Items., ));
            buildTime = f; // -1f 建造时间
            buildCostMultiplier = f; // -1f 建造此方块的速度倍率
            deconstructThreshold = f; // 0f
            instantDeconstruct = ; // false 是否立即拆除, 不返还资源
            ignoreBuildDarkness = ; // false 能否在黑暗区域放置, 用于编辑静态墙
            placeEffect = Fx.; // placeBlock 放置效果
            breakEffect = Fx.; // breakBlock 拆除效果
            destroyEffect = Fx.; // dynamicExplosion 摧毁效果
            researchCostMultiplier = f; // 1f 研究成本倍数
            researchCostMultipliers.put(Items., f); // 每种物品的研究成本
            researchCost = ItemStack.with(Items., ); // 覆盖研究成本
            forceTeam = ; // 所有这个方块全部强制属于这个队伍
            instantTransfer = ; // false 是否支持瞬时传输(光传)
            quickRotate = ; // true 放置后能否旋转
            allowDerelictRepair = ; // true 该方块的废墟能否通过点击修复

            consumeLiquid(Liquids., f / 60f); // + .boost(); 消耗的液体 + 强化
            consumeLiquids(LiquidStack.with(Liquids., f / 60f));
            consumePower(f / 60f); // 消耗的电力
            consumeItem(Items., ); // 消耗的物品
            consumeItems(ItemStack.with(Items., , Items., ));
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

        /*
        planet = new Planet("", , f, ) {{
            alwaysUnlocked = ; // false

            minZoom = f; // 0.5f 视角最小缩放
            maxZoom = f; // 2f 视角最大缩放
            drawOrbit = ; // true 有无公转轨道
            atmosphereRadIn = f; // 0f 大气层内径
            atmosphereRadOut = f; // 0.3f 大气层外径
            orbitRadius = f; // 公转轨道半径
            orbitTime = f; // 公转周期
            rotateTime = f; // 24f * 60f 自转周期
            tidalLock = ; // false 是否潮汐锁定
            accessible = ; // true 是否在星球选择界面显示
            defaultEnv = Env. | Env.; // 环境
            defaultAttributes.set(Attribute., ); // 属性
            updateLighting = ; // false 昼夜循环
            lightSrcFrom = f; // 0f 光源起始位置
            lightSrcTo = f; // 0.8f 光源终止位置
            lightDstFrom = f; // 0.2f 光源距离起始值
            lightDstTo = f; // 1f 光源距离最大值
            startSector = ; // 0 默认起始区块
            sectorSeed = ; // -1 区块基地生成种子
            launchCapacityMultiplier = f; // 0.25f 发射时可携带物品的最大数量与核心容量的比例
            bloom = ; // false 是否启用光晕渲染效果
            visible = ; // true 是否在星系中显示
            landCloudColor = Color.valueOf(""); // 着陆时显示的云的颜色
            lightColor = Color.valueOf(""); // 仅用于恒星, 照射到行星上的颜色
            atmosphereColor = Color.valueOf(""); // 大气颜色
            iconColor = Color.valueOf(""); // 行星列表中的图标颜色
            hasAtmosphere = ; // true 有无大气层
            allowLaunchSchematics = ; // false 能否使用发射蓝图
            allowLaunchLoadout = ; // false 指定发射时消耗的资源
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
            launchMusic = Musics.; // launch 星球界面播放的音乐
            defaultCore = Blocks.; // coreShard 默认核心类型
            solarSystem = Planets.; // 所处星系的中心天体
            children.add(Planets.); // 所有卫星, 按半径升序排列
            techTree = TechTree.all.find((t) -> t.content == ); // 在此星球打开科技树时默认的根节点
            launchCandidates.addAll(Planets.); // 能从该星球发射去往的目标星球列表
            allowSelfSectorLaunch = ; // 星际加速器能否去往该星球的任意区块
            autoAssignPlanet = ; // true 是否自动将该星球添加到科技树内容的shownPlanets列表里
            unlockedOnLand.add(); // 着陆时自动解锁

            updateGroup.add(); // 可同时进行后台运算的星球
            campaignRules. = ; // 全局难度/修改器设置
            campaignRuleDefaults. = ; // 规则的默认值
            ruleSetter = r -> {
                r. = ;
            }; // 游戏加载时为该星球上的任意区块设置规则
            showRtsAIRule = ; // false 能否自定义Rts AI

            meshLoader = () -> new MultiMesh();

            cloudMeshLoader = () -> new MultiMesh();

        }};
        */


// Sector
        /*
        Sector = new SectorPreset("", Planets., ) {{
            captureWave = ; // 0 占领波次
            difficulty = f; // 0-10 难度
            startWaveTimeMultiplier = f; // 2f 起始波次时间倍率
            addStartingItems = ; // false 是否添加起始物品
            noLighting = ; // false 是否无光照
            isLastSector = ; // 是否为最终区域
            requireUnlock = ; // true 是否需要解锁
            showHidden = ; // false 是否显示隐藏区域. 即使是一个始终解锁的隐藏区域，是否也显示其图标和名称 (后续可能会更改)
            showSectorLandInfo = ; // true 发射时是否显示详细信息
            overrideLaunchDefaults = ; // false 是否覆盖默认发射配置
            allowLaunchSchematics = ; // false 能否使用发射蓝图
            allowLaunchLoadout = ; // false 是否允许自定义携带的物品
            attackAfterWaves = ; // false 波次结束后是否转为进攻模式
            originalPosition = ; // 区块原始位置
            shieldSectors = ; // 护盾区域列表. 仅当列表内的区块全部占领之后才解锁
            fileName = ""; // 文件名
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
            databaseCategory = ""; // default 数据库类别
            databaseTag = ""; // default 数据库标签
            */


// Effect
        /*
        effect = new ParticleEffect() {{
            // = new ParticleEffect() {{
            colorFrom = Color.valueOf(""); // Color.white.cpy() 粒子起始颜色
            colorTo = Color.valueOf(""); // Color.white.cpy() 粒子结束颜色
            particles = ; // 6 粒子数量
            randLength = ; // true 是否随机粒子长度
            casingFlip = ; // 是否支持弹壳翻转效果
            cone = f; // 180f 粒子发射锥形角度
            length = f; // 20f 粒子最大长度/距离
            baseLength = f; // 0f 粒子基础长度
            interp = Interp.; // linear 粒子大小/长度变化的插值方式
            sizeInterp = ; // null 粒子大小的专用插值
            offsetX = f; // 粒子位置偏移
            offsetY = f;
            lightScl = f; // 2f 光照大小缩放
            lightOpacity = f; // 0.6f 光照透明度
            lightColor = Color.valueOf(""); // 光照颜色
            //region only
            spin = f; // 每帧旋转角度
            sizeFrom = f; // 2f 贴图起始大小
            sizeTo = f; // 0f 贴图结束大小
            sizeChangeStart = f; // 0f 贴图开始改变大小的延迟时间
            useRotation = ; // true 是否继承父级旋转
            offset = f; // 0 旋转角度偏移
            region = ; // "circle" 使用的纹理名称
            // line only
            line = ; // 是否使用线条模式
            strokeFrom = f; // 2f 线条起始粗细
            strokeTo = f; // 0f 线条结束粗细
            lenFrom = f; // 4f 线条起始长度
            lenTo = f; // 2f 线条结束长度
            cap = ; // true 是否绘制端点

            // = new ExplosionEffect() {{
            // 冲击波
            waveColor = Color.valueOf(""); // ffd2ae 冲击波颜色
            waveLife = f; // 6f 冲击波存在时间
            waveStroke = f; // 3f 冲击波线条粗细
            waveRad = f; // 15f 冲击波最大半径
            waveRadBase = f; // 2f 冲击波基础半径
            // 烟雾
            smokeColor = Color.valueOf(""); // Color.gray 烟雾颜色
            smokeSize = f; // 4f 烟雾最终大小
            smokeSizeBase = f; // 0.5f 烟雾基础大小
            smokeRad = f; // 23f 烟雾扩散半径
            smokes = ; // 5 烟雾数量
            // 火花
            sparkColor = Color.valueOf(""); // e58956 火花颜色
            sparkStroke = f; // 1f 火花线条粗细
            sparkRad = f; // 23f 火花扩散半径
            sparkLen = f; // 3f 火花长度
            sparks = ; // 4 火花数量
            // Effect
            clip = 100f; // 特效的裁剪范围
            lifetime = 22f; // 50f 特效存在时间

            // = new MultiEffect(各个粒子效果);

            // = new RadialEffect(effect, amount, spacing, lengthOffset, effectRotationOffset) {{
            effect = Fx.; // Fx.none
            rotationSpacing = f; // 90f 特效之间的旋转间隔角度
            rotationOffset = f; // 0f 整体旋转偏移角度
            effectRotationOffset = f; // 0f 特效自身的旋转偏移
            lengthOffset = f; // 0f 特效离中心的距离偏移
            amount = ; // 4 特效数量
            // Effect
            clip = 100f; // 特效的裁剪范围

            // = new SeqEffect(按顺序的各个粒子效果);

            // = new SoundEffect(sound, effect) {{
            sound = Sounds.; // none 播放的音效
            minPitch = f; // 0.8f 最小音调
            maxPitch = f; // 1.2f 最大音调
            minVolume = f; // 1f 最小音量
            maxVolume = f; // 1f 最大音量
            effect = Fx.; // 粒子效果
            // Effect
            startDelay = -1f; // 特效开始前的延迟时间

            // = new WaveEffect() {{
            colorFrom = Color.valueOf(""); // Color.white.cpy() 光环起始颜色
            colorTo = Color.valueOf(""); // Color.white.cpy() 光环结束颜色
            lightColor = Color.valueOf(""); // 光照颜色
            sizeFrom = f; // 0f 光环起始大小
            sizeTo = f; // 100f 光环结束大小
            lightScl = f; // 3f 光照大小缩放
            lightOpacity = f; // 0.8f 光照透明度
            sides = f; // -1 多边形边数
            rotation = f; // 0f 整体旋转角度
            strokeFrom = f; // 2f 起始线条粗细
            strokeTo = f; // 0f 结束线条粗细
            interp = Interp.; // linear 大小/颜色变化的插值方式
            lightInterp = Interp.; // reverse 光照的专用插值
            offsetX = f; // 光环中心偏移量
            offsetY = f;
            // Effect
            clip = Math.max(clip, Math.max(sizeFrom, sizeTo) + Math.max(strokeFrom, strokeTo)); // 特效的裁剪范围

            // = new WrapEffect(effect, color, rotation) {{
            effect = Fx.; // none
            color = ; Color.valueOf("")// Color.white.cpy()
            rotation = f; // 0f 整体旋转角度

            // = new Effect(life, clipsize, renderer) {{
            shakeFalloff = f; // 10000f 屏幕震动衰减系数
            renderer = ; // 特效的渲染逻辑
            lifetime = f; // 50f 特效存在时间
            clip = f; // 特效的裁剪范围
            startDelay = f; // 特效开始前的延迟时间
            baseRotation = f; // 基础旋转角度
            followParent = ; // true 是否跟随父级单位移动
            rotWithParent = ; // 是否跟随父级单位旋转
            layer = f; // Layer.effect 特效的渲染层
            layerDuration = f; // 特定层的持续时间
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
