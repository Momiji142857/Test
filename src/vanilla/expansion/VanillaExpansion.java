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

// 模板
// Item
        /*
        item = new Item("", Color.valueOf("")) {{
            explosiveness = f; // 0f
            flammability = f; // 0f
            radioactivity = f;
            charge = f; // 0f
            hardness = ; // 0
            cost = f; // 1f
            lowPriority = ;
        }};
         */

// statusEffect
        /*
        statusEffect = new StatusEffect("") {{
            damageMultiplier = f; // 1f
            healthMultiplier = f; // 1f
            speedMultiplier = f; // 1f
            reloadMultiplier = f; // 1f
            buildSpeedMultiplier = f; // 1f
            dragMultiplier = f; // 1f
            transitionDamage = f; // 0f
            disarm = ; // false
            damage = f;
            parentizeEffect = ;
            permanent = ;
            reactive = ;
            effectChance = f; // 0.15f
            show = ; // true
            color = Color.valueOf("");
            effect = new (); // Fx.none
            applyEffect = new (); // Fx.none
            applyExtend = ;
            parentizeApplyEffect = ;
            init(() -> {
                opposite(StatusEffects., StatusEffects.);

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
            gas = ; // false
            gasColor = Color.valueOf("");
            barColor = Color.valueOf("");
            lightColor = Color.valueOf("").a();
            flammability = f;
            temperature = f; // 0.5f
            heatCapacity = f; // 0.5f
            viscosity = f; // 0.5f
            explosiveness = f; //
            blockReactive = ; // true
            coolant = ; // true
            moveThroughBlocks = ; // true
            incinerable = ; // true
            effect = StatusEffects.; // none
            boilPoint = 2f; // 2f
            hidden = ;
            canStayOn.add(Liquids.);
        }};
         */

// UnitType
        /*
        coreUnits = new UnitType("") {{
            constructor = UnitEntity::create;
            controller = u -> u.team.isAI() ? new BuilderAI(true, 400f) : new CommandAI();

            speed = f; // 1.1f
            rotateSpeed = f; // 5f
            drag = f; // 0.3f
            accel = f; // 0.5f
            hitSize = f; // 6f
            health = f; // 200f
            armor = f; // 0f
            buildRange = ; // 220f
            payloadCapacity = ; // 8
            buildSpeed = f; // -1f
            buildBeamOffset = f; // 3.8f
            mineBeamOffset = f; // -1/0 f
            engineOffset = f; // 5f
            engineSize = f; // 2.5f
            fogRadius = f; // -1f
            isEnemy = ; // true
            flying = ; // false
            faceTarget = ; // true
            pickupUnits = ; // true
            lowAltitude = ; // false
            drawBuildBeam = ; // true
            immunities.add(VeStatusEffects.);
            lightColor = Color.valueOf(""); // fbd367
            targetFlags = new BlockFlag[]{BlockFlag., BlockFlag.};
            itemCapacity = ; // -1
            mineTier = ; // -1
            mineSpeed = f; // 1f
            mineWalls = ; // false
            weapons.add(new Weapon("") {{
                ejectEffect = Fx.; // none
                alternate = ; // true
                rotate = ; // false
                top = ; // true
                rotateSpeed = f; // 20f
                reload = f; // 77f
                recoil = f; // 1.5f
                recoilTime = f; // -1f
                recoilPow = f; // 1.8f
                shootX = f; // 0f
                shootY = f; // 3f
                x = f; // 5f
                y = f; // 0f
                shoot. = ;
                minWarmup = f; // 0f
                shootWarmupSpeed = f; // 0.1f
                parentizeEffects = ;
                shootSound = Sounds.;
                heatColor = Color.valueOf(""); // ab3400
                parts.add();
                bullet = new () {{

                }};
            }});
        }};
         */

// Sector
        /*
        Sector = new SectorPreset("", Planets., ) {{
            captureWave = 0; // 0
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
            splashDamage = f; // 0f
            scaledSplashDamage = ; // false
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
