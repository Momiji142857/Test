package vanilla.expansion.content;

import arc.graphics.Color;
import arc.math.Interp;
import arc.math.Mathf;
import mindustry.content.Fx;
import mindustry.content.StatusEffects;
import mindustry.entities.abilities.ShieldArcAbility;
import mindustry.entities.bullet.ArtilleryBulletType;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.bullet.LaserBoltBulletType;
import mindustry.entities.bullet.LightningBulletType;
import mindustry.entities.effect.ExplosionEffect;
import mindustry.entities.effect.MultiEffect;
import mindustry.entities.effect.ParticleEffect;
import mindustry.entities.effect.WaveEffect;
import mindustry.entities.part.RegionPart;
import mindustry.entities.pattern.ShootSpread;
import mindustry.gen.PayloadUnit;
import mindustry.gen.Sounds;
import mindustry.gen.UnitEntity;
import mindustry.type.UnitType;
import mindustry.type.Weapon;
import mindustry.type.weapons.BuildWeapon;
import mindustry.world.meta.BlockFlag;
import vanilla.expansion.VanillaExpansion;

import static mindustry.Vars.tilePayload;

public class VeUnitTypes {

    public static UnitType
            // core units
            theta, lambda, sigma, delta, omega,
                    thetaTether, lambdaTether, sigmaTether,

            iota, iotaFungikiller, iotaStg,

            zeta, eta,

            // armorcar
            conscript, arrange, charge, capture, triumph,

            // crabbot
            smarb, mider, velocite, slidoid, hovopid,

            // hovership
            dust, mist, haze, hurricane, meteorology,

            // 反制单位
            flocculate, alleviate,

            // 强化单位
            // 陆战
            blade, hammer, ballistic, firelock, ray,

            // 陆辅
            stardust, vortex, nebula, galaxy, universe,

            // 空战
            aurora, plasma, solar, magnetic, corona,

            // 空辅
            point, line, square, stereo, meta,

            // maress
            vibrate, shake, quake,
                    sparkle, plasm, surge, tide, thunder,
                    shimmer, daybreak, sunrise,
                    uprise, soar, hover, dive,

            // Boss
            thoriumEradicator, hugeDagger, hyper,

            // 改装单位
            lance, hoe,
                    astrologe,
                    prominence, stellar,
                    string, plain,

            // 特殊单位
            flyLaserDrill, wideFortress, alev, toxorpion, antumbright, eclire,
                    thoriumBlaster, thoriumBomber, thoriumRocketeer,
                    egnarra, magneticSmall, duplicator, duplicatorSmall,

            md, j, kobe, shard, coreNucleusUnit,

            // assembly drone
            assemblyDroneVe, assemblyDroneHyper,

            // missile
            pantypeMissile, pantypeMissileNitroalkoss, pantypeMissilePhase, pantypeMissileSilicide, pantypeMissileSilicon, pantypeMissileSurge, pantypeMissileThorium, pantypeMissileWarp,
                    chargeMissile, hurricaneMissile, meteorologyOrb, alleviateMissile,
                    metaOrb, metaOrbSmall,
                    hyperMissile,
                    thoriumRocketeerMissileAccel, thoriumRocketeerMissile,
                    surgeMissile,

            // test
            test1, test2, test3, test4, test5, test6, test7, test8, test9,
                    testA, testB, testC, testD, testE, testF, testGHead, testGTail,
                    testMissile, testMissileLarge, testOutline,

            // 超维
            hyperDebrisBack, hyperDebrisFrontl, hyperDebrisFrontr, hyperDebrisRing1, hyperDebrisRing2, hyperDebrisShellL, hyperDebrisShellR, hyperDebrisSidedL, hyperDebrisSidedR, hyperDebrisSideL,
                    hyperDebrisSideR, hyperOrb, hyperSpawn,

            // 菌噬体
            fungitronAbsorb, fungitronAttackLaser, fungitronAttackMissileUnit, fungitronAttackMissile, fungitronExplosion, fungitronMass1, fungitronMass2, fungitronMass3, fungitronMass4, fungitronMissile,
                    fungitronPhase1, fungitronPhase2L, fungitronPhase2R, fungitronPhase3LD, fungitronPhase3LU, fungitronPhase3RD, fungitronPhase3RU, fungitronPrebattle, fungitronRoarShort, fungitronRoar,
                    fungusFactoryDie,

            // 西击舰
            octPainted,
                    zentackArmLCannon, zentackArmL, zentackArmRCannon, zentackArmR, zentackBody, zentackCannonMid, zentackClawLCannon, zentackClawL, zentackClawRCannon, zentackClawR,
                    zentackGun, zentackHeadL, zentackHeadR, zentackLegL, zentackLegR, zentackLightning, zentackMissile,

            // 潜行小游戏
            zenithSentry,
            // 其他
            iotaStealth, turretUnitBuildTower, coronaSpawn, magneticSpawn, metaSpawn, mgsSpotIdea, mgsSpotNotice, mgsSpot, omegaAngry1, omegaAngry2,
                    omegaObserver, speaker, surgeOfficerHuh, surgeOfficer, thoriumBomberCircle, zenithAudience, zenithMelondropper, zenithPilot;

            /*
            "flying": UnitEntity::create;
            "mech": MechUnit::create;
            "legs": LegsUnit::create;
            "naval": UnitWaterMove::create;
            "payload": PayloadUnit::create;
            "missile": TimedKillUnit::create;
            "tank": TankUnit::create;
            "hover": ElevationMoveUnit::create;
            "tether": BuildingTetherPayloadUnit::create;
            "crawl": CrawlUnit::create;
            */

    public static void load() {

        theta = new UnitType("theta") {{
            constructor = UnitEntity::create;
            speed = 3.3f;
            rotateSpeed = 15f;
            drag = 0.05f;
            accel = 0.1f;
            hitSize = 10f;
            health = 180f;
            armor = 0f;
            buildRange = 220f;
            payloadCapacity = 0;
            buildSpeed = 0.5f;
            buildBeamOffset = 3f;
            mineBeamOffset = 3.25f;
            engineOffset = 6f;
            engineSize = 2.5f;
            fogRadius = 0f;
            isEnemy = false;
            flying = true;
            pickupUnits = false;
            lowAltitude = true;
            immunities.add(VeStatusEffects.frozen);
            lightColor = Color.valueOf("ffd37f");
            targetFlags = new BlockFlag[]{BlockFlag.drill, BlockFlag.factory};
            itemCapacity = 30;
            mineTier = 1;
            mineSpeed = 7f;
            mineWalls = true;
            weapons.add(new Weapon(VanillaExpansion.name("theta-weapon")) {{
                ejectEffect = Fx.none;
                rotate = false;
                top = false;
                reload = 17f;
                recoil = 1f;
                shootX = -0.75f;
                shootY = 2.75f;
                x = 3f;
                y = 2.25f;
                parentizeEffects = true;
                shootSound = Sounds.shootLaser;
                heatColor = Color.valueOf("ffffff");
                bullet = new LaserBoltBulletType(4.5f, 13) {{
                    shrinkY = 0f;
                    lifetime = 35;
                    lightColor = Color.valueOf("ffd37f");
                    width = 2f;
                    height = 9f;
                    hitEffect = despawnEffect = new WaveEffect() {{
                        colorFrom = Color.valueOf("ffd37f");
                        colorTo = Color.valueOf("ffd37f");
                        sizeFrom = 1f;
                        sizeTo = 5f;
                        sides = 12;
                        strokeFrom = 2f;
                        strokeTo = 0f;
                        lifetime = 10f;
                    }};
                    shootEffect = new WaveEffect() {{
                        colorFrom = Color.valueOf("ffd37f");
                        colorTo = Color.valueOf("ffd37f");
                        sizeFrom = 1f;
                        sizeTo = 5f;
                        sides = 12;
                        strokeFrom = 2f;
                        strokeTo = 0f;
                        lifetime = 10f;
                        followParent = true;
                        rotWithParent = true;
                    }};
                    smokeEffect = new WaveEffect() {{
                        colorFrom = Color.valueOf("ffd37f");
                        colorTo = Color.valueOf("ffd37f");
                        sizeFrom = 2f;
                        sizeTo = 0f;
                        sides = 12;
                        strokeFrom = 1f;
                        strokeTo = 1f;
                        lifetime = 10f;
                        followParent = true;
                        rotWithParent = true;
                    }};
                    buildingDamageMultiplier = 0.01f;
                    backColor = Color.valueOf("ffd37f");
                    frontColor = Color.valueOf("ffd37f");
                    collidesTeam = true;
                    healAmount = 5f;
                }};
            }});
        }};

        lambda = new UnitType("lambda") {{
            constructor = UnitEntity::create;
            speed = 3.5f;
            rotateSpeed = 10f;
            drag = 0.05f;
            accel = 0.1f;
            hitSize = 11f;
            health = 250f;
            armor = 1f;
            buildRange = 240f;
            payloadCapacity = 0;
            buildSpeed = 0.85f;
            buildBeamOffset = 5f;
            mineBeamOffset = 4.5f;
            engineOffset = 6.5f;
            engineSize = 3.25f;
            fogRadius = 0f;
            isEnemy = false;
            flying = true;
            faceTarget = false;
            pickupUnits = false;
            lowAltitude = true;
            immunities.add(VeStatusEffects.frozen);
            lightColor = Color.valueOf("ffd37f");
            targetFlags = new BlockFlag[]{BlockFlag.drill, BlockFlag.factory};
            itemCapacity = 50;
            mineTier = 2;
            mineSpeed = 8f;
            mineWalls = true;
            weapons.addAll(
                    new Weapon(VanillaExpansion.name("lambda-weapon")) {{
                        ejectEffect = Fx.none;
                        alternate = false;
                        rotate = true;
                        top = false;
                        rotateSpeed = 10f;
                        reload = 25f;
                        recoil = 2.25f;
                        recoilTime = 22f;
                        recoilPow = 2f;
                        shootX = 5.5f;
                        shootY = 1.5f;
                        x = 2f;
                        y = 0f;
                        shoot.firstShotDelay = 22f;
                        parentizeEffects = true;
                        shootSound = Sounds.shootLaser;
                        heatColor = Color.valueOf("ffffff");
                        bullet = new BasicBulletType(5f, 19f) {{
                            width = 6f;
                            height = 6f;
                            shrinkY = 0f;
                            sprite = "circle-bullet";
                            lifetime = 35f;
                            hitEffect = despawnEffect = Fx.hitLaserBlast;
                            shootEffect = new WaveEffect() {{
                                colorFrom = colorTo = Color.valueOf("ffd37f");
                                sizeFrom = 1f;
                                sizeTo = 5f;
                                sides = 12;
                                strokeFrom = 3f;
                                lifetime = 10f;
                                rotWithParent = true;
                            }};
                            chargeEffect = new ParticleEffect() {{
                                colorFrom = colorTo = Color.valueOf("ffd37f");
                                particles = 1;
                                length = 0f;
                                interp = Interp.pow3Out;
                                sizeFrom = 0f;
                                sizeTo = 2f;
                                lifetime = 22f;
                                rotWithParent = true;
                            }};
                            smokeEffect = new WaveEffect() {{
                                colorFrom = colorTo = Color.valueOf("ffd37f");
                                sizeFrom = 2f;
                                sizeTo = 0f;
                                sides = 12;
                                strokeFrom = 1f;
                                strokeTo = 1f;
                                lifetime = 10f;
                                rotWithParent = true;
                            }};
                            buildingDamageMultiplier = 0.01f;
                            collidesTeam = true;
                            healPercent = 5f;
                            hitColor = trailColor = lightColor =
                                    backColor = frontColor = Color.valueOf("ffd37f");
                            trailEffect = Fx.missileTrail;
                            trailLength = 3;
                            trailWidth = 3f;
                        }};
                    }},
                    new Weapon(VanillaExpansion.name("lambda-shell")) {{
                        display = false;
                        mirror = false;
                        rotate = false;
                        top = false;
                        reload = 60f;
                        recoil = 0f;
                        x = 0f;
                        y = 0f;
                        minWarmup = 2f;
                        shootSound = Sounds.none;
                    }});
        }};

        sigma = new UnitType("sigma") {{
            constructor = UnitEntity::create;
            speed = 3.6f;
            rotateSpeed = 10f;
            drag = 0.05f;
            accel = 0.1f;
            hitSize = 12f;
            health = 250f;
            armor = 2f;
            buildRange = 250f;
            buildSpeed = 1.2f;
            buildBeamOffset = 4.5f;
            mineBeamOffset = 4f;
            engineOffset = 8f;
            engineSize = 3.5f;
            fogRadius = 0f;
            isEnemy = false;
            flying = true;
            pickupUnits = false;
            lowAltitude = true;
            immunities.add(VeStatusEffects.frozen);
            lightColor = Color.valueOf("ffd37f");
            targetFlags = new BlockFlag[]{BlockFlag.battery, BlockFlag.storage};
            itemCapacity = 70;
            mineTier = 2;
            mineSpeed = 9f;
            mineWalls = true;
            weapons.add(new Weapon(VanillaExpansion.name("sigma-weapon")) {{
                ejectEffect = Fx.casing1;
                top = false;
                reload = 5f;
                recoil = 1f;
                recoilTime = 5f;
                shootX = 0f;
                shootY = 0f;
                x = 8.25f;
                y = 1.25f;
                minWarmup = 0.95f;
                shootWarmupSpeed = 0.3f;
                shootSound = Sounds.shootSalvo;
                parts.addAll(
                        new RegionPart("-weapon") {{
                            layerOffset = -0.0001f;
                            x = -4f;
                            y = -4.25f;
                            rotation = 90f;
                            moveRot = -90f;
                            moveX = 4f;
                            under = true;
                        }},
                        new RegionPart("-side") {{
                            x = -8.25f;
                            y = -1.25f;
                            moveX = 4f;
                            moveRot = -5f;
                            under = true;
                        }},
                        new RegionPart("-shell") {{
                            progress = PartProgress.recoil;
                            x = -8.25f;
                            y = -1.25f;
                            moveY = 1f;
                        }}
                );
                bullet = new BasicBulletType(7f, 11f) {{
                    width = 6.5f;
                    height = 15f;
                    lifetime = 35f;
                    hitSound = Sounds.shockBullet;
                    buildingDamageMultiplier = 0.01f;
                    homingPower = 0.1f;
                    homingDelay = 10f;
                    lightColor = Color.valueOf("ffd37f");
                    fragBullet = new LightningBulletType() {{
                        speed = 0.0001f;
                        damage = 5f;
                        buildingDamageMultiplier = 0f;
                        status = StatusEffects.shocked;
                        statusDuration = 10f;
                        collidesTiles = false;
                        hitColor = lightColor = lightningColor = Color.valueOf("ffd37f");
                        lightningLength = 5;
                    }};
                    fragBullets = 2;
                }};
            }});
        }};

        delta = new UnitType("delta") {{
            constructor = PayloadUnit::create;
            speed = 3.9f;
            rotateSpeed = 12f;
            drag = 0.035f;
            accel = 0.1f;
            hitSize = 15f;
            health = 460f;
            armor = 3f;
            buildRange = 280;
            payloadCapacity = Mathf.sqr(2f) * tilePayload;
            buildSpeed = 1.6f;
            mineBeamOffset = 6f;
            engineOffset = 8f;
            engineSize = 3.25f;
            fogRadius = 0f;
            isEnemy = false;
            flying = true;
            faceTarget = false;
            lowAltitude = true;
            drawBuildBeam = false;
            immunities.add(VeStatusEffects.frozen);
            lightColor = Color.valueOf("ffd37f");
            targetFlags = new BlockFlag[]{BlockFlag.repair, BlockFlag.storage};
            itemCapacity = 90;
            mineTier = 3;
            mineSpeed = 10f;
            mineWalls = true;
            weapons.addAll(
                    new BuildWeapon() {{
                        rotate = false;
                        top = false;
                        shootX = 0f;
                        shootY = 0f;
                        x = 2.5f;
                        y = 7.25f;
                    }},
                    new Weapon(VanillaExpansion.name("delta-weapon")) {{
                        ejectEffect = Fx.casing3;
                        rotate = true;
                        rotateSpeed = 5f;
                        reload = 30f;
                        shake = 2f;
                        recoil = 3f;
                        shootX = 5.5f;
                        shootY = 8.25f;
                        x = 0f;
                        y = -3f;
                        layerOffset = -0.001f;
                        bullet = new ArtilleryBulletType(1f, 15f, "missile-large") {{
                            backColor = Color.valueOf("f9c27a");
                            frontColor = Color.valueOf("ffd37f");
                            width = 8f;
                            height = 8f;
                            shrinkY = 0f;
                            lifetime = 95f;
                            hitSize = 6f;
                            drag = -0.02f;
                            hitEffect = despawnEffect = new MultiEffect(
                                    new ExplosionEffect() {{
                                        waveColor = Color.valueOf("989aa4");
                                        sparkColor = Color.valueOf("ffd37f");
                                        waveRad = 32f;
                                    }}
                            );
                            shootEffect = Fx.shootBig;
                            smokeEffect = Fx.shootBigSmoke;
                            hitSound = Sounds.explosionArtillery;
                            despawnSound = Sounds.explosionArtillery;
                            buildingDamageMultiplier = 0.01f;
                            splashDamage = 28f;
                            status = StatusEffects.blasted;
                            statusDuration = 60f;
                            collidesTiles = true;
                            collidesAir = true;
                            collides = true;
                            scaleLife = false;
                            maxRange = 280f;
                            hitShake = 2f;
                            trailColor = Color.valueOf("f9c27aaa");
                            trailInterval = 5f;
                            trailEffect = Fx.missileTrail;
                            homingPower = 0.06f;
                            homingRange = 72f;
                            homingDelay = 15f;
                            lightColor = Color.valueOf("ffd37f");
                            splashDamageRadius = 32f;
                        }};
                    }},
                    new Weapon(VanillaExpansion.name("small-mount-weapon")) {{
                        ejectEffect = Fx.casing1;
                        rotate = true;
                        top = false;
                        rotateSpeed = 15f;
                        reload = 20f;
                        inaccuracy = 3f;
                        x = 2.75f;
                        y = 1.75f;
                        shoot = new ShootSpread(3, 0f) {{
                            shotDelay = 4f;
                        }};
                        shootSound = Sounds.shootCyclone;
                        bullet = new BasicBulletType(4f, 11f) {{
                            width = 6.5f;
                            height = 11f;
                            shrinkY = 0f;
                            spin = 10f;
                            lifetime = 70f;
                            hitSize = 10f;
                            buildingDamageMultiplier = 0.01f;
                            pierceArmor = true;
                            lightColor = Color.valueOf("ffd37f");
                        }};
                    }}
            );
        }};

        omega = new UnitType("omega") {{
            constructor = PayloadUnit::create;
            speed = 4.3f;
            rotateSpeed = 9f;
            drag = 0.035f;
            accel = 0.095f;
            hitSize = 16f;
            health = 620f;
            armor = 5f;
            mineRange = 110f;
            buildRange = 320;
            payloadCapacity = Mathf.sqr(2.5f) * tilePayload;
            buildSpeed = 2.1f;
            buildBeamOffset = 3.5f;
            mineBeamOffset = 5.75f;
            engineOffset = 9f;
            engineSize = 3.75f;
            fogRadius = 0f;
            isEnemy = false;
            flying = true;
            lowAltitude = true;
            abilities.add(new ShieldArcAbility() {{
                radius = 20f;
                regen = 0.4f;
                max = 380f;
                cooldown = 60f;
                angle = 120f;
                width = 9f;
                pushUnits = false;
            }});
            immunities.add(VeStatusEffects.frozen);
            lightColor = Color.valueOf("ffd37f");
            targetFlags = new BlockFlag[]{BlockFlag.battery, BlockFlag.generator, BlockFlag.repair, BlockFlag.turret};
            itemCapacity = 110;
            mineTier = 3;
            mineSpeed = 11f;
            mineWalls = true;
            weapons.add(
                    new BuildWeapon() {{
                        rotate = false;
                        top = false;
                        shootY = 0f;
                        shootX = 0f;
                        x = 6f;
                        y = 6f;
                    }},
                    new Weapon(VanillaExpansion.name("fast-power-weapon")) {{
                        ejectEffect = Fx.casing1; // none
                        alternate = ; // true
                        rotate = false; // false
                        top = false; // true
                        rotateSpeed = f; // 20f
                        reload = 20f; // 77f
                        inaccuracy = 1.5f; // 0f
                        recoil = f; // 1.5f
                        recoilTime = f; // -1f
                        recoilPow = f; // 1.8f
                        shootX = 0f; // 0f
                        shootY = 4f; // 3f
                        x = 3.75f; // 5f
                        y = -4.25f; // 0f
                        shoot.shots = 5;
                        shoot.shotDelay = 3f;
                        minWarmup = f; // 0f
                        shootWarmupSpeed = f; // 0.1f
                        parentizeEffects = ;
                        shootSound = Sounds.shootSalvo;
                        heatColor = Color.valueOf(""); // ab3400
                        parts.add();
                        bullet = new BasicBulletType(f, f) {{
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
                    }}
            );
        }};

        // coreUnits
        /*
        a = new UnitType("") {{
            constructor = ;
            speed = f; // 1.1f
            rotateSpeed = f; // 5f
            drag = f; // 0.3f
            accel = f; // 0.5f
            mineRange = f; // 70f
            hitSize = f; // 6f
            health = f; // 200f
            armor = f; // 0f
            buildRange = ; // 220f
            researchCostMultiplier = f; // 50f
            payloadCapacity = Mathf.sqr(f) * tilePayload; // 8
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
            abilities.add();
            immunities.add(VeStatusEffects.);
            lightColor = Color.valueOf(""); // fbd367
            targetFlags = new BlockFlag[]{BlockFlag., BlockFlag.};
            itemCapacity = ; // -1
            mineTier = ; // -1
            mineSpeed = f; // 1f
            mineWalls = ; // false
            weapons.add(new Weapon(VanillaExpansion.name("")) {{
                ejectEffect = Fx.; // none
                alternate = ; // true
                rotate = ; // false
                baseRotation = f; // 0f
                top = ; // true
                rotateSpeed = f; // 20f
                reload = f; // 77f
                inaccuracy = f; // 0f
                shake = f; // 0f
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
                layerOffset = f; // 0f
                shootSound = Sounds.;
                heatColor = Color.valueOf(""); // ab3400
                parts.add();
                bullet = new () {{

                }};
            }});
        }};
         */

        // RegionPart
        /*
        regionPart = new RegionPart("") {{
            mirror = ; // false
            outline = ; // true
            drawRegion = ; // true
            heatLight = ; // false
            clampProgress = ; // true
            progress = PartProgress.; // warmup
            growProgress = PartProgress.; // warmup
            heatProgress = PartProgress.; // heat

            blending = Blending.; // normal
            layer = f; // -1f
            layerOffset = f; // 0f
            heatLayerOffset = f; // 1f
            turretHeatLayer = Layer.; // turretHeat
            outlineLayerOffset = f; // -0.001f
            x = f;
            y = f;
            xScl = f; // 1f
            yScl = f; // 1f
            rotation = f;
            originX = f;
            originY = f;
            moveX = f;
            moveY = f;
            growX = f;
            growY = f;
            moveRot = f;
            heatLightOpacity = f; // 0.3f
            color = Color.valueOf("");
            colorTo = Color.valueOf("");
            mixColor = Color.valueOf("");
            mixColorTo = Color.valueOf("");
            heatColor = Color.valueOf("");
            children = ;
            moves = ;

            under = ; // false
            weaponIndex = ; // 0
            recoilIndex = ; // -1
        }};
         */

        // ShieldArcAbility
        /*
        abilities = new ShieldArcAbility() {{
            radius = f; // 60f
            regen = f; // 0.1f
            max = f; // 200f
            cooldown = f; // 60f * 5
            angle = f; // 80f
            angleOffset = f; // 0f
            x = f; // 0f
            y = f; // 0f
            whenShooting = ; // true
            width = f; // 6f
            chanceDeflect = f; // -1f
            deflectSound = Sounds.; // none
            breakSound = Sounds.; // shieldBreakSmall
            hitSound = Sounds.; // shieldHit
            hitSoundVolume = f; // 0.12f
            missileUnitMultiplier = f; // 2f
            drawArc = ; // true
            region = ;
            color = ;
            offsetRegion = ; // false
            pushUnits = ; // true
        }};
        */

    }
}
