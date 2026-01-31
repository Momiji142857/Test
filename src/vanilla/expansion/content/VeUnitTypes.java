package vanilla.expansion.content;

import arc.graphics.Blending;
import arc.graphics.Color;
import arc.math.Interp;
import mindustry.ai.types.BuilderAI;
import mindustry.ai.types.CommandAI;
import mindustry.content.Fx;
import mindustry.content.StatusEffects;
import mindustry.content.UnitTypes;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.bullet.LaserBoltBulletType;
import mindustry.entities.bullet.LightningBulletType;
import mindustry.entities.effect.ParticleEffect;
import mindustry.entities.effect.WaveEffect;
import mindustry.entities.part.RegionPart;
import mindustry.gen.Sounds;
import mindustry.gen.UnitEntity;
import mindustry.graphics.Layer;
import mindustry.type.UnitType;
import mindustry.type.Weapon;
import mindustry.world.meta.BlockFlag;

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

    public static void load(){

        theta = new UnitType("theta") {{
            constructor = UnitEntity::create;
            controller = u -> u.team.isAI() ? new BuilderAI(true, 400f) : new CommandAI();

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
            weapons.add(new Weapon("large2-weapon") {{
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
            controller = u -> u.team.isAI() ? new BuilderAI(true, 400f) : new CommandAI();

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
                    new Weapon("lambda-weapon") {{
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
                            height = 4f;
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
                    new Weapon("lambda-shell") {{
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
            controller = u -> u.team.isAI() ? new BuilderAI(true, 400f) : new CommandAI();

            speed = 3.6f;
            rotateSpeed = 10f;
            drag = 0.05f;
            accel = 0.1f;
            hitSize = 12f;
            health = 250f;
            armor = 2f;
            buildRange = 250;
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
            weapons.add(new Weapon("sigma-weapon") {{
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

        /*
        delta = new UnitType("delta") {{
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

        /*
        omega = new UnitType("omega") {{
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

        // coreUnits
        /*
        a = new UnitType("") {{
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

    }
}
