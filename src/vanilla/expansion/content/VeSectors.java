package vanilla.expansion.content;

import mindustry.type.SectorPreset;

public class VeSectors {
    public static SectorPreset
            // cyclant
            barrierHill, carbonRelics, wetlandMiningfield, intervalley,
                    volcanicTop, fortPort, gobi, fungusFactory, shaleQuarry, unitLaboratory,
                    ruins, thoriumHacienda, nuclearPowerplant, crossForest,
                    primeRoute, planetaryCargoCenter, retreatZone,

            isolateIsland, siliconFacility, blastTest;

    public static void load() {

        barrierHill = new SectorPreset("barrier-hill", VePlanets.cyclant, 170) {{
            alwaysUnlocked = true;
            captureWave = 10;
            difficulty = 1;
            addStartingItems = true;
            isLastSector = false;
        }};

        carbonRelics = new SectorPreset("carbon-relics", VePlanets.cyclant, 35) {{
            captureWave = 20;
            difficulty = 3f;
            isLastSector = false;
            allowLaunchSchematics = true;
            allowLaunchLoadout = true;
        }};

        wetlandMiningfield = new SectorPreset("wetland-miningfield", VePlanets.cyclant, 20) {{
            captureWave = 0;
            difficulty = 3f;
            isLastSector = false;
            allowLaunchSchematics = true;
            allowLaunchLoadout = true;
        }};

        intervalley = new SectorPreset("intervalley", VePlanets.cyclant, 19) {{
            captureWave = 30;
            difficulty = 5f;
            isLastSector = false;
            allowLaunchSchematics = true;
            allowLaunchLoadout = true;
        }};

        volcanicTop = new SectorPreset("volcanic-top", VePlanets.cyclant, 95) {{
            captureWave = 0;
            difficulty = 4f;
            isLastSector = false;
            allowLaunchSchematics = true;
            allowLaunchLoadout = true;
        }};

        fortPort = new SectorPreset("fort-port", VePlanets.cyclant, 137) {{
            captureWave = 40;
            difficulty = 5f;
            isLastSector = false;
            allowLaunchSchematics = true;
            allowLaunchLoadout = true;
        }};

        gobi = new SectorPreset("gobi", VePlanets.cyclant, 222) {{
            captureWave = 0;
            difficulty = 4f;
            isLastSector = false;
            allowLaunchSchematics = true;
            allowLaunchLoadout = true;
        }};

        fungusFactory = new SectorPreset("fungus-factory", VePlanets.cyclant, 230) {{
            captureWave = 0;
            difficulty = 4f;
            isLastSector = false;
            allowLaunchSchematics = true;
            allowLaunchLoadout = true;
        }};

        shaleQuarry = new SectorPreset("shale-quarry", VePlanets.cyclant, 261) {{
            captureWave = 50;
            difficulty = 7f;
            isLastSector = false;
            allowLaunchSchematics = true;
            allowLaunchLoadout = true;
        }};

        unitLaboratory = new SectorPreset("unit-laboratory", VePlanets.cyclant, 143) {{
            captureWave = 0;
            difficulty = 8f;
            isLastSector = false;
            allowLaunchSchematics = true;
            allowLaunchLoadout = true;
        }};

        ruins = new SectorPreset("ruins", VePlanets.cyclant, 98) {{
            captureWave = 0;
            difficulty = 7f;
            isLastSector = false;
            allowLaunchSchematics = true;
            allowLaunchLoadout = true;
        }};

        thoriumHacienda = new SectorPreset("thorium-hacienda", VePlanets.cyclant, 227) {{
            captureWave = 60;
            difficulty = 6f;
            isLastSector = false;
            allowLaunchSchematics = true;
            allowLaunchLoadout = true;
        }};

        nuclearPowerplant = new SectorPreset("nuclear-powerplant", VePlanets.cyclant, 228) {{
            captureWave = 0;
            difficulty = 8f;
            isLastSector = false;
            allowLaunchSchematics = true;
            allowLaunchLoadout = true;
        }};

        crossForest = new SectorPreset("cross-forest", VePlanets.cyclant, 39) {{
            captureWave = 30;
            difficulty = 9f;
            isLastSector = false;
            allowLaunchSchematics = true;
            allowLaunchLoadout = true;
        }};

        primeRoute = new SectorPreset("prime-route", VePlanets.cyclant, 144) {{
            captureWave = 40;
            difficulty = 9f;
            isLastSector = false;
            allowLaunchSchematics = true;
            allowLaunchLoadout = true;
        }};

        planetaryCargoCenter = new SectorPreset("planetary-cargo-center", VePlanets.cyclant, 245) {{
            captureWave = 0;
            difficulty = 10f;
            isLastSector = false;
            allowLaunchSchematics = true;
            allowLaunchLoadout = true;
        }};

        retreatZone = new SectorPreset("retreat-zone", VePlanets.cyclant, 224) {{
            captureWave = 0;
            difficulty = 10f;
            isLastSector = true;
            allowLaunchSchematics = true;
            allowLaunchLoadout = true;
        }};

        isolateIsland = new SectorPreset("isolate-island", VePlanets.cyclant, 91) {{
            captureWave = 50;
            difficulty = 6f;
            isLastSector = true;
            allowLaunchSchematics = true;
            allowLaunchLoadout = true;
        }};

        siliconFacility = new SectorPreset("silicon-facility", VePlanets.cyclant, 53) {{
            captureWave = 0;
            difficulty = 4f;
            isLastSector = true;
            allowLaunchSchematics = true;
            allowLaunchLoadout = true;
        }};

        blastTest = new SectorPreset("blast-test", VePlanets.cyclant, 24) {{
            captureWave = 0;
            difficulty = 9f;
            isLastSector = true;
            allowLaunchSchematics = true;
            allowLaunchLoadout = true;
        }};

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

    };
}
