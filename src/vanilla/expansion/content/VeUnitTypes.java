package vanilla.expansion.content;

import arc.graphics.Color;
import arc.math.Interp;
import arc.math.Mathf;
import arc.math.geom.Rect;
import arc.struct.Seq;
import mindustry.ai.UnitCommand;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.content.StatusEffects;
import mindustry.entities.abilities.ShieldArcAbility;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.ExplosionEffect;
import mindustry.entities.effect.MultiEffect;
import mindustry.entities.effect.ParticleEffect;
import mindustry.entities.effect.WaveEffect;
import mindustry.entities.part.RegionPart;
import mindustry.entities.pattern.ShootBarrel;
import mindustry.entities.pattern.ShootSpread;
import mindustry.entities.units.WeaponMount;
import mindustry.gen.PayloadUnit;
import mindustry.gen.Sounds;
import mindustry.gen.UnitEntity;
import mindustry.type.UnitType;
import mindustry.type.Weapon;
import mindustry.type.ammo.ItemAmmoType;
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
                            splashDamage = 28f;
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
                        ejectEffect = Fx.casing1;
                        top = false;
                        reload = 20f;
                        inaccuracy = 1.5f;
                        shootX = 0f;
                        shootY = 4f;
                        x = 3.75f;
                        y = -4.25f;
                        shoot.shots = 5;
                        shoot.shotDelay = 3f;
                        shootSound = Sounds.shootSalvo;
                        bullet = new BasicBulletType(7f, 17f) {{
                            width = 7f;
                            height = 16f;
                            lifetime = 45f;
                            hitSound = Sounds.shockBullet;
                            // despawnSound = Sounds.sparkBullet;
                            buildingDamageMultiplier = 0.01f;
                            homingPower = 0.12f;
                            homingDelay = 10f;
                            lightColor = Color.valueOf("ffd37f");
                            fragBullet = new LightningBulletType() {{
                                speed = 0.0001f;
                                damage = 5f;
                                buildingDamageMultiplier = 0f;
                                statusDuration = 10f;
                                collidesTiles = false;
                                hitColor = lightningColor = lightColor = Color.valueOf("ffd37f");
                                lightningLength = 5;
                            }};
                            fragBullets = 2;
                            spawnBullets.add(new BasicBulletType(3f, 99.99f) {{
                                width = 15.25f;
                                height = 10.5f;
                                spin = 45f;
                                sprite = "ve-gggg";
                                lifetime = 199.98f;
                                layer = 139f;
                                hitEffect = Fx.blastExplosion;
                                despawnEffect = Fx.none;
                                buildingDamageMultiplier = 0.01f;
                                hittable = false;
                                createChance = 0.0001f;
                                despawnHit = true;
                                trailColor = Color.valueOf("ffd37f");
                                trailLength = 10;
                                splashDamage = 99.99f;
                                splashDamageRadius = 99.99f;
                            }});
                        }};
                    }},
                    new Weapon(VanillaExpansion.name("omega-weapon")) {{
                        rotate = true;
                        top = false;
                        rotateSpeed = 7f;
                        reload = 32f;
                        shake = 3f;
                        recoil = 4f;
                        recoilTime = 25f;
                        cooldownTime = 60f;
                        shootX = 7.5f;
                        shootY = -0.25f;
                        x = 4.5f;
                        y = 0.25f;
                        shoot = new ShootBarrel() {{
                            barrels = new float[] {
                                    0, 0, 3
                            };
                        }};
                        rotationLimit = 150f;
                        minWarmup = 0.9f;
                        soundPitchMin = 1f;
                        soundPitchMax = 1.05f;
                        layerOffset = -0.002f;
                        shootSound = Sounds.shootLancer;
                        heatColor = Color.valueOf("ffd37f");
                        parts.add(new RegionPart("-weapon") {{
                            layerOffset = 0.001f;
                            moveX = 7.5f;
                            moveY = -4f;
                            moveRot = 3f;
                            color = Color.valueOf("aaaaaa");
                            colorTo = Color.valueOf("ffffff");
                        }});
                        bullet = new LaserBulletType() {{
                            colors = new Color[] {
                                    Color.valueOf("ffd37f66"),
                                    Color.valueOf("ffd37f"),
                                    Color.valueOf("ffffff")
                            };
                            length = 265f;
                            sideLength = 45f;
                            sideWidth = 0.75f;
                            sideAngle = 30f;
                            damage = 100f;
                            shootEffect = new MultiEffect(
                                    Fx.hitLaserBlast,
                                    Fx.colorSpark
                            );
                            buildingDamageMultiplier = 0.01f;
                            recoil = 0f;
                            hitColor = lightColor = Color.valueOf("ffd37f");
                        }};
                    }}
            );
        }};

        omegaObserver = new UnitType("omega-observer") {{
            constructor = PayloadUnit::create;
            speed = 3.9f;
            rotateSpeed = 9f;
            drag = 0.035f;
            accel = 0.095f;
            hitSize = 16f;
            health = 620f;
            armor = 5f;
            buildRange = 320;
            payloadCapacity = Mathf.sqr(2.5f) * tilePayload;
            buildSpeed = 2f;
            buildBeamOffset = 3.5f;
            mineBeamOffset = 5.75f;
            engineOffset = 9f;
            engineSize = 3.75f;
            fogRadius = 0f;
            isEnemy = false;
            flying = true;
            killable = true;
            createWreck = false;
            targetable = false;
            createScorch = false;
            lowAltitude = true;
            hidden = true;
            drawCell = false;
            deathSound = Sounds.none;
            immunities.add(VeStatusEffects.frozen);
            lightColor = Color.valueOf("f25555");
            deathExplosionEffect = Fx.none;
            engineColor = Color.valueOf("f25555");
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
                        ejectEffect = Fx.casing1;
                        top = false;
                        reload = 20f;
                        inaccuracy = 1.5f;
                        recoil = 0f;
                        shootX = 0f;
                        shootY = 4f;
                        x = 3.75f;
                        y = -4.25f;
                        shoot.shots = 5;
                        shoot.shotDelay = 3f;
                        shootSound = Sounds.none;
                        bullet = new BasicBulletType(7f, 17f) {{
                            width = 7f;
                            height = 16f;
                            lifetime = 45f;
                            hitEffect = despawnEffect =
                                    shootEffect = smokeEffect = Fx.none;
                            buildingDamageMultiplier = 0.01f;
                            instantDisappear = true;
                            maxRange = 315f;
                            homingPower = 0.12f;
                            homingDelay = 10f;
                            lightColor = Color.valueOf("ffd37f");
                            fragBullet = new LightningBulletType() {{
                                speed = 0.0001f;
                                damage = 5f;
                                buildingDamageMultiplier = 0f;
                                status = StatusEffects.shocked;
                                statusDuration = 10f;
                                collidesTiles = false;
                                hitColor = lightningColor = lightColor = Color.valueOf("ffd37f");
                                lightningLength = 5;
                            }};
                            fragBullets = 0;
                        }};
                    }},
                    new Weapon(VanillaExpansion.name("omega-weapon")) {{
                        rotate = true;
                        top = false;
                        rotateSpeed = 7f;
                        reload = 32f;
                        shake = 0f;
                        recoil = 0f;
                        recoilTime = 25f;
                        cooldownTime = 60f;
                        shootX = 7.5f;
                        shootY = -0.25f;
                        x = 4.5f;
                        y = 0.25f;
                        rotationLimit = 150f;
                        minWarmup = 0.97f;
                        shootWarmupSpeed = 0.2f;
                        soundPitchMin = 1f;
                        soundPitchMax = 1.05f;
                        layerOffset = -0.002f;
                        shootSound = Sounds.none;
                        heatColor = Color.valueOf("ffd37f");
                        parts.add(new RegionPart("-weapon") {{
                            layerOffset = 0.001f;
                            moveX = 7.5f;
                            moveY = -4f;
                            color = Color.valueOf("aaaaaa");
                            colorTo = Color.valueOf("ffffff");
                        }});
                        bullet = new LaserBulletType() {{
                            colors = new Color[] {
                                    Color.valueOf("ffd37f00"),
                                    Color.valueOf("ffd37f00"),
                                    Color.valueOf("ffffff00")
                            };
                            length = 0f;
                            sideLength = 45f;
                            sideWidth = 0.75f;
                            sideAngle = 30f;
                            damage = 100f;
                            hitEffect = despawnEffect = shootEffect =
                                    smokeEffect = laserEffect = Fx.none;
                            buildingDamageMultiplier = 0.01f;
                            recoil = 0f;
                            instantDisappear = true;
                            maxRange = 265f;
                            hitColor = lightColor = Color.valueOf("ffd37f");
                        }};
                    }}
            );
        }};

        // Units
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

        /*
        a = new UnitType("") {{
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
            fallSpeed = f; // 0.018f 无助推时下落速度
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

        // weapons
            /*
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
