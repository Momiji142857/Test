package vanilla.expansion.content;

import arc.Core;
import arc.assets.AssetDescriptor;
import arc.assets.loaders.SoundLoader;
import arc.audio.Sound;
import arc.util.Log;
import mindustry.Vars;
import mindustry.gen.Sounds;
import mindustry.type.Liquid;

import java.lang.reflect.Field;

public class VeSounds {
    public static Sound
            bangClassic, boom, cannonClassic, carrionDroneDetect, carrionDroneDetectEdited,
            carrionDroneGun, combustionClassic, drExplosionMmxTitan, drKnightSlashLine, drKnightStarExplodeClose,
            drKnightStretchEdited, drOverpowerTitan, drPunchHeavyThunderTitan, explosion, flame2,
            huh, lasershootClassic, lbp3AlertBeep, lbp3AlertBeeps, lbp3AlertCharge,
            lbp3FlyingMachine, lbp3Helicopter, lbp3LaserFire1, lbp3LaserFire2, lbp3LaserFire3,
            lbp3LaserFire4, lbp3NewtonBot1, lbp3NewtonBot2, lbp3NewtonBot3, lbp3NewtonBot4,
            lbp3NewtonBot5, lbp3NewtonBot6, lbp3NewtonBot7, lbp3NewtonBot8, lbp3NewtonBot9,
            lbp3NewtonBotExplode1, lbp3NewtonBotExplode2, lbp3NewtonBotExplode3, lbp3NewtonBotExplode4, lbp3PlasmaProjectile,
            lbp3PlasmDestroy1, lbp3PlasmDestroy2, lbp3PlasmDestroy3, lbp3PlasmEmit, lbp3PlungerSwitch1,
            lbp3PlungerSwitch2, lbp3PlungerSwitch3, lbp3PowerDown, lbp3PowerUp, lbp3ScifiBuildup,
            lbp3ScifiLaserFire1, lbp3ScifiLaserFire2, lbp3ScifiLaserFire3, lbp3Searchlight, lbp3SearchlightEdited,
            lbp3Splat1, lbp3Splat2, lbp3Splat3, lbp3SwampThingLong1, lbp3SwampThingLong2,
            lbp3SwampThingLong3, lbp3SwampThingShort1, lbp3SwampThingShort2, lbp3SwampThingShort3, lbp3SwampThingShort4,
            lbp3SwampThingShort5, lbp3TankTreads, lbp3TankTreadsSlow, lbp3TankTreadsSlower, mcBurp,
            mcEat1, mcEat2, mcEat3, mgsvExplosion, mgsvGatling,
            mgsvSpot, msLargeExplosion, omegaAnger, padLandAdvanced, padLaunchAdvanced,
            pew, pewClassic, pewClassicEdited, poop, railgunClassic,
            rlDarkSentryShoot, rlElectricBallDespawn1, rlElectricBallDespawn2, rlElectricBallHit, rlElectricBlockerBreak,
            rlElectricBlockerBreakLoud, roEggHit, roFlyingBombExplode, roHelico, roMechScuff1,
            roMechScuff2, roMechScuff3, roMechStep1, roMechStep2, roMechStep3,
            roMechStep4, roSpark, roStepMetal1, roStepMetal2, roStepMetal3,
            shootAltClassic, shootAltLongClassic, shootClassic, si2DoorClose, si2DoorOpen,
            si2EntranceClose, si2EntranceOpen, si2Explode, si2ExplodeLoud, si2Explosive1,
            si2Explosive2, si2Explosive3, si2Explosive4, si2Explosive5, si2HackingComplete,
            si2HolodecoyActive, si2Lightning1, si2Lightning2, si2Lightning3, si2Lightning4,
            si2LightswitchActive, si2OverchargedLaserLoop, si2OverchargedLaserShoot, si2Rain, si2SentinelWave,
            si2Steamvent, si2Teleport, si2Teleporter1, si2Teleporter1Echo, si2Teleporter2,
            si2Teleporter2Echo, si2Teleporter3, si2Teleporter3Echo, si2Teleporter4, si2Teleporter4Echo,
            si2TeleporterActive, si2TurretShoot, si2Wind, songForDeniseCompressed, stAstroAmbient,
            stAstroCharge, stAstroExplode, stAstroLaser, stAstroPrepareWarp, stAstroWarp1,
            stAstroWarp2, stAstroWarp3, stShield, trLaserGatling, trMartianCrash,
            trMartianHit, utPhotoshopFloweyGlock, waveSpawn, wind3, utySandstorm;
    public static void load() {
        bangClassic = new Sound();
    }


/*
    // 从饱和火力那抄过来的
    public static void load() {
        try {
            for(Field field : VeSounds.class.getFields()) {
                if (field.getType().equals(Sound.class)) {
                    field.set((Object)null, loadSound(field.getName()));
                }
            }
        } catch (IllegalAccessException e) {
            Log.err(e);
        }

    }

    private static Sound loadSound(String soundName) {
        if (Vars.headless) {
            return new Sound();
        } else {
            String path = "sounds/" + soundName;
            String filePath = Vars.tree.get(path + ".ogg").exists() ? path + ".ogg" : path + ".mp3";
            Sound sound = new Sound();
            AssetDescriptor<?> desc = Core.assets.load(filePath, Sound.class, new SoundLoader.SoundParameter(sound));
            desc.errored = Throwable::printStackTrace;
            return sound;
        }
    }*/

}
