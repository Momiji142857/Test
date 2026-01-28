package vanilla.expansion.content;

import arc.graphics.Color;
import mindustry.ai.types.BuilderAI;
import mindustry.ai.types.CommandAI;
import mindustry.entities.bullet.LaserBoltBulletType;
import mindustry.entities.effect.WaveEffect;
import mindustry.gen.Sounds;
import mindustry.gen.UnitEntity;
import mindustry.type.UnitType;
import mindustry.type.Weapon;
import mindustry.world.meta.BlockFlag;

public class VeUnitTypes {

    public static UnitType
            // core units
            theta;

            // armorcar

            // crabbot

            // hovership

            //

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
            buildRange = 220;
            payloadCapacity = 0f;
            buildSpeed = 0.5f;
            buildBeamOffset = 3f;
            mineBeamOffset = 3.25f;
            engineOffset = 6f;
            engineSize = 2.5f;
            isEnemy = false;
            flying = true;
            faceTarget = true;
            pickupUnits = false;
            lowAltitude = true;
            drawBuildBeam = true;
            immunities.add(VeStatusEffects.frozen);
            lightColor = Color.valueOf("ffd37f");
            targetFlags = new BlockFlag[]{BlockFlag.drill, BlockFlag.factory};
            itemCapacity = 30;
            mineTier = 1;
            mineSpeed = 7f;
            mineWalls = true;
            weapons.add(new Weapon("theta-weapon") {{
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
    }
}
