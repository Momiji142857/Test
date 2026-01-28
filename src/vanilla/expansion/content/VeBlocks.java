package vanilla.expansion.content;

import arc.graphics.Color;
import arc.math.Interp;
import mindustry.content.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.ExplosionEffect;
import mindustry.entities.effect.MultiEffect;
import mindustry.entities.effect.ParticleEffect;
import mindustry.entities.effect.WaveEffect;
import mindustry.entities.part.DrawPart;
import mindustry.entities.part.RegionPart;
import mindustry.entities.pattern.ShootBarrel;
import mindustry.entities.pattern.ShootMulti;
import mindustry.entities.pattern.ShootPattern;
import mindustry.gen.Sounds;
import mindustry.graphics.CacheLayer;
import mindustry.graphics.Layer;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.blocks.defense.turrets.LiquidTurret;
import mindustry.world.blocks.defense.turrets.PowerTurret;
import mindustry.world.blocks.distribution.Conveyor;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.storage.CoreBlock;
import mindustry.world.draw.DrawTurret;
import mindustry.world.meta.Attribute;
import mindustry.world.meta.BuildVisibility;

import static mindustry.type.ItemStack.with;

public class VeBlocks {
    public static Block
            //environment
            accessibleDeepWater, deepWaterOil, flowingLava, antigrass, semigrass, gravel, carbonShale, hillStone, saltyIce, coreZoneCyclant, deepslate, deepslateBrick,
                    antigrassWall, semigrassWall, carbonShaleWall, hillStoneWall, darkMetalRepaired, deepslateWall, deepslateBrickWall,
                    carbonShaleBoulder, hillStoneBoulder,
                    oreAluminium, orePyratite, oreChromium, oreCobalt, oreWallAluminium, oreWallQuartz, oreSilverPure, oreSilver,
                    oreCatalyzon,

            melondirt, melondirtWater, melonwater, melonwaterDeep, sporeMelondirt, sporeMelondirtMoss, sporeMelonwater, sporeMelonwaterDeep,
                    melondirtWall, sporeMelondirtWall,

            redSoilFinely, redSoilFloor, redSoilPebble, redSoilWet, ferricShale,
                    redSoilWall, redSoilWetWall, ferricShaleWall,
                    mirmat, silvelade, silveladeLarge, ferricShaleBoulder,

            redGround, greenGround, blueGround, whiteGround, darkGround, pureDark,

            //turrets
            click, frag, pulse, rise, bake, waterer,
            beat, crack, shock,
            buffet, dot, spurt, burn,
            snipe, halberd, shell,
            sweep, stab, buster, parasite,

            burst, chain, pantype,

            sans,

            //production
            mechanicalDrillMicro, mechanicalDrillHuge,

            //production - cyclant
            isomorphicDrill, isomorphicDrillHuge, laserBore, powerDrill, beamDrill, silicideDrill,
                    hydraulicDrill, powderDigger, floorCrusher, spaceDigger,

            powerWell, pressureWell,
                    extractionPlatform, lavaWell,

            isomorphicCultivator, cultivatorTank, tissueCultivator,
                    nitroalkossCultivator, nitroalkossCultivatorSilicide,

            //production - sitrullus, maress
            mechaniclWell, rotChamber,
                    reflectorCultivator,

            //transport
            armoredBridgeConveyor, armoredRouter, armoredOverflowGate, armoredUnderflowGate, armoredUnloader,
                    silicideArmoredDuct,
                    silicideJunction, silicideBridgeConveyor, silicideSorter, silicideInvertedSorter, silicideRouter, silicideDistributor, silicideOverflowGate, silicideUnderflowGate, silicideUnloader,

            //transport - cyclant
            chromiumConveyor, chromiumSorter, cobaltRail, cobaltRailBridge, cobaltRailUnderflowGate, cobaltRailUnloader,
                    rail, railJunction, railBridge, railRouter, railOverflowGate, railUnderflowGate, railUnloader,
                    silicideRail, silicideRailJunction, silicideRailBridge, silicideRailRouter, silicideRailOverflowGate, silicideRailUnderflowGate, silicideRailUnloader,

            stackRail, silicideStackRail, phaseUnloader, multiUnloader, massLauncher, massRialGun, warpDriver,

            //transport - sitrullus, maress
            ferricConveyor, ferricConveyorArmored, ferricRail, magneticDuct, valveCross, ferricBridge, valveSort, valveInvertedSort, valveDistribute, valveOverflow, valveUnderflow, valveUnload,

            //liquid
            silicidePlatedConduit,

            isomorphicPump, platformPump, pressurePump,
                    isomorphicConduit, fluidJunction, isomorphicBridgeConduit,fluidRouter, can, tank,
                    pressureConduit, platformBridgeConduit,
                    silicideConduit, silicideFluidJunction, silicideBridgeConduit,silicideFluidRouter, canSilicide, tankSilicide,

            //liquid - sitrullus, maress
            silverConduit, silicideSilverConduit, valveFluidCross, silverBridge, valveFluidJunction,

            //power
            advancedNode, advancedNodeLarge, isomorphicNode, isomorphicNodeLarge, insulatedNode, sectorPowerTower,
                    nodeBlocker, powerBattery, silicideBattery, sodiumSulphurBattery, charger, discharger,
                    largeCombustionGenerator, largeTurbineGenerator, geothermalGenerator, solarPad, lavaThermalGenerator, internalCombustionGenerator, sodiumReactor, solidFuelCell, fluidFuelCell, microReactor, isomorphicReactor, radioactiveThermalGenerator, fusionReactor,

            //power - sitrullus, maress
            cable, batteryNode, melonCell, fermentor,
                    spotSolarPad,

            winTower,

            //defense
            copperWallHuge, titaniumWallHuge, thoriumWallHuge,
                    defensiveWall, defensiveWallLarge, defensiveWallHuge,
                    effectiveWall, effectiveWallLarge,

            //defense - cyclant
            aluminiumWall, aluminiumWallLarge, aluminiumWallHuge,
                    aluminiumLeadWall, aluminiumLeadWallLarge, aluminiumLeadWallHuge,
                    silicideWall, silicideWallLarge,
                    silicideAluminiumWall, silicideAluminiumWallLarge, silicideAluminiumWallHuge,
                    chromiumWall, chromiumWallLarge, chromiumWallHuge,
                    silicideChromiumWall, silicideChromiumWallLarge, silicideChromiumWallHuge,
                    mechanicalGateSmall, mechanicalGate, mechanicalGateSilicide,
                    automaticGate, automaticGateSilicide,
                    advancedPlastaniumWall, advancedPlastaniumWallLarge, fibraltWall, fibraltWallLarge, surgeShieldWall,
                    blockingWall, blockingWallSilicide,

            titanicPlastaniumWall, bush, tree,

            //defense - sitrullus, maress
            ferrumWall, ferrumWallLarge, ferrumWallHuge,

            //crafting
            quartzExtractor,

            //crafting - cyclant
            isomorphicPress, hydraulicPress, isomorphicSmelter, substitutionChamber, quartzSeparator, quartzSeparatorLarge, isomorphicKiln, silicideCrucible, silicideMixer, pyratiter, blaster, lavaCooler, plantPress, cellLaboratory,
                    gasificationChamber, sporeBlender, meltingElectrolyzer, sodiumCarbonFixator, saltElectrolyzer, surgeElectrolyzer,
                    crackingCompressor, fibraltExtender, chainTransferer, carbonizationChamber,
                    surgeCoagulator, catalyzonCrafter, fusionRefueller, fusionDisfueller, phaseLoom, warper, titaniumExtractor, carbonShaleSmelter, coalSynthezer, isomorphicPulverizer, largePulverizer, decomposer, eddyMelter, Extractor,

            //crafting - sitrullus, maress
            concentrator, blastFurnace,
                    blender, magneticSeparator, multiFurnace, reductionChember, reflectorThermolyzer, boiler, reactorCore,

            //units
            giganticPayloadConveyor,

            //units - cyclant
            groundFabricator, airFabricator, navalFabricator, specialFabricator, integratedConstructor,
                    isomorphicAdditiveReconstructor, isomorphicMultiplicativeReconstructor,
                    juniorArmorcarReconstructor, juniorCrabbotReconstructor, juniorHovershipReconstructor,
                    seniorArmorcarReconstructor, seniorCrabbotReconstructor, seniorHovershipReconstructor,
                    superReconstructor, ultraReconstructor,
                    juniorRefabricator, seniorRefabricator,
                    specialAssembler, superAssembler, ultraAssembler, bossAssembler,
                    assemblePacker, assembleSelector1, assembleSelector2, assembleSelector3, superAssemblePack, ultraAssemblePack, hyperAssemblePack,
                    isomorphicRepairPoint, platformTheta, platformLambda, platformSigma,

            payloadRail, payloadRailRouter, cobaltPayloadRail, cobaltPayloadRailRouter,
                    payloadRailLarge, payloadRailRouterLarge, cobaltPayloadRailLarge, cobaltPayloadRailRouterLarge,

            //effect
            overdriver, mendDome,

            //effect - cyclant
            mendPoint, menderator, mendGlobe, overdriverPoint, overdrivator, overdriverGlobe, forcerator,
                    teamProjectorSharded, plastaniumStool, warpDefender,
                    isomorphicCoreShard, isomorphicCoreFoundation, isomorphicCoreUncleus, coreQuark, coreSingularity,
                    shelf, shelfSilicide, containerSilicide, warpDisc, bank, bankSilicide, warpBase,
                    advancedLaunchPad, advancedLandingPad, isomorphicAcceleratorSmall, isomorphicAccelerator,

            //effect - sitrullus, maress
            coreGeneral, tradePortal, sporeBomb, nuke,

            //effect - Special
            coreHolder, gammaBlock, coreThurium,

            //logic
            isomorphicMessage, isomorphicSwitch, isomorphicProcessor, isomorphicMemory,
                    quantumProcessor, quantumMemoryCell,

            //sandbox
            silicideItemSource, silicideItemVoid,
                    silicideFluidSource, silicideFluidVoid,
                    mapPowerSource,
                    sweeper, sandboxBlast, pogMender, pogOverdriver, forceSource,

            //test
            testTurret, testTurret2, testTurret3,
                    testChainBurst, testChainDrill,
                    bridge3,testInstantConvey, testUnloader,
                    spepipe, testChainPump,
                    testBeam,
                    testBoulder, testWall, testShieldWall, twoBillionWall,
                    testOmegaSpawn, testRequireChange, testSectordestroyer, test4spawn, testrec,
                    testDirectionalShield, testDisplayStorage, testAccelerator,
                    coreNuleusRoot, coreNuleusRootSitrullus, coreSingularityRoot, teamProjectorCrux, isomorphicAcceleratorCrux, coreSingularityCrux, coreBoss, coreGeneralStg, coreGeneralFungikiller;

    public static void load() {

        accessibleDeepWater = new Floor("accessible-deep-water") {{
            speedMultiplier = 0.2f;
            status = StatusEffects.wet;
            statusDuration = 120;
            liquidDrop = Liquids.water;
            liquidMultiplier = 1.5f;
            isLiquid = true;
            supportsOverlay = true;
            variants = 0;
            useColor = false;
            hasColor = true;
            cacheLayer = CacheLayer.water;
            mapColor = Color.valueOf("3d4980");
            albedo = 0.9f;
        }};

        deepWaterOil = new Floor("deep-water-oil") {{
            speedMultiplier = 0.2f;
            drownTime = 200f;
            status = StatusEffects.wet;
            statusDuration = 120;
            liquidDrop = Liquids.water;
            isLiquid = true;
            supportsOverlay = true;
            variants = 0;
            attributes.set(Attribute.oil, 2f);
            cacheLayer = CacheLayer.water;
            albedo = 0.9f;
        }};

        flowingLava = new Floor("flowing-lava") {{
            speedMultiplier = 0.3f;
            drownTime = 600f;
            // status = fusing;
            liquidDrop = VeLiquids.lava;
            liquidMultiplier = 0.5f;
            isLiquid = true;
            blendGroup = Blocks.basalt;
            attributes.set(Attribute.heat, 0.9f);
            cacheLayer = CacheLayer.water;
            lightColor = Color.valueOf("df171744");
            emitLight = true;
            lightRadius = 35f;
        }};

        antigrass = new Floor("antigrass") {{
            attributes.set(Attribute.water, -0.1f);
        }};

        semigrass = new Floor("semigrass") {{
            variants = 3;
            // attributes.set(Attribute.plant, 0.5f);
        }};

        gravel = new Floor("gravel") {{
            variants = 5;
            itemDrop = Items.sand;
            playerUnmineable = true;
            attributes.set(Attribute.water, -0.1f);
        }};

        carbonShale = new Floor("carbon-shale") {{
            itemDrop = VeItems.carbonShaleCobble;
            playerUnmineable = true;
            attributes.set(Attribute.oil, 2f);
            // attributes.set(Attribute.plant, 1f);
        }};

        hillStone = new Floor("hill-stone") {{
            variants = 4;
            attributes.set(Attribute.water, 0.1f);
        }};

        saltyIce = new Floor("salty-ice") {{
            speedMultiplier = 0.9f;
            dragMultiplier = 0.35f;
            itemDrop = VeItems.salt;
            playerUnmineable = true;
            attributes.set(Attribute.water, 0.3f);
            albedo = 0.5f;
        }};

        coreZoneCyclant = new Floor("core-zone-cyclant") {{
            allowCorePlacement = true;
            variants = 0;
            attributes.set(Attribute.water, -1f);
        }};

        deepslate = new Floor("deepslate", 8);

        deepslateBrick = new Floor("deepslate-brick", 8);

        antigrassWall = new StaticWall("antigrass-wall") {{
            antigrass.asFloor().wall = this;
        }};

        semigrassWall = new StaticWall("semigrass-wall") {{
            semigrass.asFloor().wall = this;
        }};

        carbonShaleWall = new StaticWall("carbon-shale-wall") {{
            carbonShale.asFloor().wall = this;
        }};

        hillStoneWall = new StaticWall("hill-stone-wall") {{
            hillStone.asFloor().wall = this;
        }};

        darkMetalRepaired = new StaticWall("dark-metal-repaired") {{
            variants = 4;
            /*"drawer": {
                "type": "DrawGlowRegion",
                "suffix": "-glow",
                "color": "f25555",
                "layer": 80.1
             }*/
        }};

        deepslateWall = new StaticWall("deepslate-wall") {{
            variants = 4;
        }};

        deepslateBrickWall = new StaticWall("deepslate-brick-wall") {{
            variants = 5;
        }};

        carbonShaleBoulder = new Prop("carbon-shale-boulder") {{
            variants = 2;
            carbonShale.asFloor().decoration = this;
        }};

        hillStoneBoulder = new Prop("hill-stone-boulder") {{
            variants = 2;
            hillStone.asFloor().decoration = this;
        }};

        oreAluminium = new OreBlock("ore-aluminium", VeItems.aluminium);

        orePyratite = new OreBlock("ore-pyratite", Items.pyratite);

        oreChromium = new OreBlock("ore-chromium", VeItems.chromium);

        oreCobalt = new OreBlock("ore-cobalt", VeItems.cobalt);

        oreWallAluminium = new OreBlock("ore-wall-aluminium", VeItems.aluminium) {{
            wallOre = true;
        }};

        oreWallQuartz = new OreBlock("ore-wall-quartz", VeItems.quartz) {{
            wallOre = true;
        }};

        oreCatalyzon = new OreBlock("ore-catalyzon", VeItems.catalyzon) {{
            variants = 0;
        }};

        oreSilverPure = new OreBlock("ore-silver-pure", VeItems.silver) {{
            variants = 5;
        }};

        oreSilver = new OreBlock("ore-silver", VeItems.silver) {{
            variants = 6;
        }};

        melondirt = new Floor("melondirt") {{
            variants = 6;
            useColor = false;
            itemDrop = Items.sand;
            playerUnmineable = true;
            attributes.set(Attribute.water, 3);
            attributes.set(Attribute.spores, 2);
            attributes.set(Attribute.steam, 1);
            mapColor = Color.valueOf("e44646");
            hasColor = true;
        }};

        /*
        melondirtWater = new ShallowLiquid("melondirt-water") {{
            speedMultiplier = 0.8f;
            status = StatusEffects.wet;
            statusDuration = 120;
            supportsOverlay = true;
            variants = 6;
            useColor = false;
            itemDrop = Items.sand;
            playerUnmineable = true;
            attributes.set(Attribute.spores, 2.5f);
            cacheLayer = CacheLayer.water;
            mapColor = Color.valueOf("da3939");
            hasColor = true;
            albedo = 0.9f;
        }};
        */

        melondirtWater = new Floor("melondirt-water") {{
            speedMultiplier = 0.8f;
            status = StatusEffects.wet;
            statusDuration = 120;
            supportsOverlay = true;
            variants = 6;
            useColor = false;
            itemDrop = Items.sand;
            playerUnmineable = true;
            attributes.set(Attribute.spores, 2.5f);
            cacheLayer = CacheLayer.water;
            mapColor = Color.valueOf("da3939");
            hasColor = true;
            albedo = 0.9f;
        }};

        melonwater = new Floor("melonwater") {{
            speedMultiplier = 0.6f;
            status = StatusEffects.wet;
            statusDuration = 120;
            liquidDrop = VeLiquids.melonWater;
            isLiquid = true;
            supportsOverlay = true;
            variants = 0;
            useColor = false;
            attributes.set(Attribute.spores, 3f);
            cacheLayer = CacheLayer.water;
            mapColor = Color.valueOf("cc3434");
            hasColor = true;
            albedo = 0.9f;
        }};

        melonwaterDeep = new Floor("melonwater-deep") {{
            speedMultiplier = 0.2f;
            drownTime = 600f;
            status = StatusEffects.wet;
            statusDuration = 120;
            liquidDrop = VeLiquids.melonWater;
            liquidMultiplier = 1.5f;
            isLiquid = true;
            supportsOverlay = true;
            variants = 0;
            useColor = false;
            attributes.set(Attribute.spores, 3f);
            cacheLayer = CacheLayer.water;
            mapColor = Color.valueOf("bb2626");
            hasColor = true;
            albedo = 0.9f;
        }};

        sporeMelondirt = new Floor("spore-melondirt") {{
            variants = 8;
            attributes.set(Attribute.spores, 1.5f);
            attributes.set(Attribute.steam, -9.99f);
        }};

        sporeMelondirtMoss = new Floor("spore-melondirt-moss") {{
            variants = 8;
            itemDrop = Items.sporePod;
            attributes.set(Attribute.spores, 2.5f);
            attributes.set(Attribute.steam, -9.99f);
        }};

        sporeMelonwater = new Floor("spore-melonwater") {{
            speedMultiplier = 0.4f;
            status = StatusEffects.wet;
            statusDuration = 120;
            liquidDrop = Liquids.water;
            isLiquid = true;
            supportsOverlay = true;
            attributes.set(Attribute.spores, 2f);
            attributes.set(Attribute.steam, -9.99f);
            cacheLayer = CacheLayer.water;
        }};

        sporeMelonwaterDeep = new Floor("spore-melonwater-deep") {{
            speedMultiplier = 0.1f;
            drownTime = 600f;
            status = StatusEffects.wet;
            statusDuration = 120;
            liquidDrop = Liquids.water;
            liquidMultiplier = 1.5f;
            isLiquid = true;
            supportsOverlay = true;
            attributes.set(Attribute.spores, 2f);
            cacheLayer = CacheLayer.water;
        }};

        // ((ShallowLiquid)melondirtWater).set(VeBlocks.melonwater, VeBlocks.melondirt);

        melondirtWall = new StaticWall("melondirt-wall") {{
            variants = 3;
            useColor = false;
            mapColor = Color.valueOf("ff5555");
            hasColor = true;
            melondirt.asFloor().wall = this;
        }};

        sporeMelondirtWall = new StaticWall("spore-melondirt-wall") {{
            variants = 3;
            // sporeMelondirt.asFloor().wall = sporeMelondirtMoss.asFloor().wall = this;
        }};

        redSoilFinely = new Floor("red-soil-finely") {{
            speedMultiplier = 0.9f;
            // status = dusty;
            statusDuration = 600f;
            variants = 5;
            itemDrop = VeItems.redSoil;
            playerUnmineable = true;
            attributes.set(Attribute.water, -0.25f);
            //"decoration": "red-soil-boulder",
        }};

        redSoilFloor = new Floor("red-soil-floor") {{
            variants = 4;
            itemDrop = VeItems.redSoil;
            playerUnmineable = true;
            //"decoration": "red-soil-boulder",
        }};

        redSoilPebble = new Floor("red-soil-pebble") {{
            speedMultiplier = 0.7f;
            // status = dusty;
            statusDuration = 600f;
            variants = 5;
            attributes.set(Attribute.water, -0.25f);
            //"decoration": "red-soil-boulder",
        }};

        redSoilWet = new Floor("red-soil-wet") {{
            // status = muddy;
            statusDuration = 30f;
            variants = 4;
            itemDrop = VeItems.redSoil;
            playerUnmineable = true;
            attributes.set(Attribute.water, 0.5f);
            //"decoration": "red-soil-boulder",
        }};

        ferricShale = new Floor("ferric-shale") {{
            itemDrop = VeItems.ferricShaleCobble;
            playerUnmineable = true;
            attributes.set(Attribute.water, -0.5f);
        }};

        redSoilWall = new StaticWall("red-soil-wall") {{
            redSoilFinely.asFloor().wall = redSoilFloor.asFloor().wall = redSoilPebble.asFloor().wall = this;
        }};

        redSoilWetWall = new StaticWall("red-soil-wet-wall") {{
            redSoilWet.asFloor().wall = this;
        }};

        ferricShaleWall = new StaticWall("ferric-shale-wall") {{
            ferricShale.asFloor().wall = this;
        }};

        mirmat = new WobbleProp("mirmat") {{
            requirements(Category.distribution, BuildVisibility.sandboxOnly, with(VeItems.reflectorMatter, 10));
            alwaysUnlocked = true;
            wscl = 30f;
            wmag = 0.2f;
            variants = 5;
            customShadow = true;
            albedo = 1f;
        }};

        silvelade = new TreeBlock("silvelade") {{
            variants = 3;
            albedo = 1f;
            shadowOffset = -5.5f;
        }};

        silveladeLarge = new TreeBlock("silvelade-large") {{
            albedo = 1f;
            shadowOffset = -8.5f;
        }};

        ferricShaleBoulder = new Prop("ferric-shale-boulder") {{
            variants = 2;
            ferricShale.asFloor().decoration = this;
        }};

        redGround = new Floor("red-ground", 1);

        greenGround = new Floor("green-ground", 1);

        blueGround = new Floor("blue-ground", 1);

        whiteGround = new Floor("white-ground", 1);

        darkGround = new Floor("dark-ground", 1);

        pureDark = new StaticWall("pure-dark") {{
            variants = 0;
        }};

        click = new ItemTurret("click") {{
            requirements(Category.turret, with(VeItems.aluminium, 40));
            ammo(
                    Items.graphite, new BasicBulletType(4f, 19f) {{
                        width = 11f;
                        height = 13f;
                        lifetime = 50f;
                        hitEffect = despawnEffect = Fx.hitBulletColor;
                        ammoMultiplier = 4f;
                        hitColor = frontColor = Color.valueOf("dae1ee");
                        backColor = Color.valueOf("7d89d8");
                    }},
                    Items.silicon, new BasicBulletType(4f, 15f) {{
                        width = 9f;
                        height = 11f;
                        lifetime = 60f;
                        hitEffect = despawnEffect = Fx.hitBulletColor;
                        ammoMultiplier = 5f;
                        reloadMultiplier = 1.5f;
                        rangeChange = 40f;
                        hitColor = frontColor = Color.valueOf("999ba0");
                        backColor = trailColor = Color.valueOf("707594");
                        trailLength = 3;
                        homingPower = 0.15f;
                    }},
                    VeItems.aluminium, new BasicBulletType(4f, 9f) {{
                        width = 9f;
                        height = 11f;
                        lifetime = 50f;
                    }},
                    VeItems.quartz, new BasicBulletType(5f, 13f) {{
                        width = 8f;
                        height = 13f;
                        pierce = true;
                        pierceBuilding = false;
                        pierceCap = 4;
                        hitEffect = despawnEffect = Fx.hitSquaresColor;
                        hitColor = backColor = Color.valueOf("f68021");
                    }},
                    VeItems.ferrum, new BasicBulletType(3.5f, 20f) {{
                        width = 10f;
                        height = 12f;
                        shrinkY = 0f;
                        lifetime = 57f;
                        hitEffect = Fx.flakExplosion;
                        despawnEffect = Fx.hitBulletColor;
                        ammoMultiplier = 3f;
                        setDefaults = false;
                        hitColor = frontColor = Color.valueOf("9f8c88");
                        backColor = Color.valueOf("7e6863");
                        despawnHit = true;
                        splashDamage = 8f;
                        splashDamageRadius = 12f;
                        fragRandomSpread = 30f;
                        fragBullets = 2;
                        fragVelocityMin = 0.5f;
                        fragLifeMin = 0f;
                        fragOffsetMax = 1f;
                        fragBullet = new BasicBulletType(3.5f, 4f) {{
                            width = 7f;
                            height = 9f;
                            shrinkY = 0f;
                            spin = 10f;
                            lifetime = 30f;
                            pierce = true;
                            pierceBuilding = false;
                            pierceCap = 3;
                            hitEffect = despawnEffect = Fx.hitBulletColor;
                            pierceArmor = true;
                            hitColor = frontColor = Color.valueOf("9f8c88");
                            backColor = Color.valueOf("7e6863");
                        }};
                    }}
            );
            inaccuracy = 2f;
            shootX = 0f;
            shootY = 3f;
            ammoUseEffect = Fx.casing1;
            recoil = 0.7f;
            reload = 18f;
            range = 200f;
            rotateSpeed = 15f;
            coolant = consumeCoolant(0.1f);
            health = 220;
            // shownPlanets.addAll(VePlanets.cyclant, VePlanets.maress);
        }};

        frag = new ItemTurret("frag") {{
            requirements(Category.turret, with(Items.lead, 45, VeItems.aluminium, 30));
            ammo(
                    Items.lead, new BasicBulletType(0f, 0f) {{
                        lifetime = 1f;
                        despawnEffect = Fx.none;
                        shootEffect = Fx.colorSpark;
                        reloadMultiplier = 1.1f;
                        collides = false;
                        hitColor = Color.valueOf("f8ad42");
                        fragRandomSpread = 20f;
                        fragBullets = 4;
                        fragVelocityMin = 0.8f;
                        fragLifeMin = 0.7f;
                        fragBullet = new FlakBulletType(4.2f, 3f) {{
                            height = 8f;
                            lifetime = 50f;
                            hitEffect = Fx.flakExplosion;
                            splashDamage = 37;
                            splashDamageRadius = 15f;
                        }};
                    }},
                    Items.metaglass, new BasicBulletType(0f, 0f) {{
                        lifetime = 1f;
                        despawnEffect = Fx.none;
                        shootEffect = Fx.colorSpark;
                        ammoMultiplier = 5f;
                        reloadMultiplier = 0.8f;
                        collides = false;
                        hitColor = Color.valueOf("f8ad42");
                        fragRandomSpread = 20f;
                        fragBullets = 4;
                        fragVelocityMin = 0.8f;
                        fragLifeMin = 0.7f;
                        fragBullet = new FlakBulletType(4.2f, 3f) {{
                            height = 8f;
                            lifetime = 50f;
                            hitEffect = Fx.flakExplosion;
                            splashDamage = 42;
                            splashDamageRadius = 20f;
                            fragBullets = 6;
                            fragBullet = new BasicBulletType(3f, 5f) {{
                                shrinkY = 1f;
                                lifetime = 20f;
                                despawnEffect = Fx.none;
                                collidesTiles = false;
                                collidesGround = false;
                                backColor = Color.valueOf("b9c9df");
                                frontColor = Color.valueOf("ffffff");
                            }};
                        }};
                    }},
                    Items.scrap, new BasicBulletType(0f, 0f) { {
                        lifetime = 1f;
                        despawnEffect = Fx.none;
                        shootEffect = Fx.colorSpark;
                        ammoMultiplier = 5f;
                        reloadMultiplier = 0.8f;
                        collides = false;
                        hitColor = Color.valueOf("f8ad42");
                        fragRandomSpread = 20f;
                        fragBullets = 4;
                        fragVelocityMin = 0.8f;
                        fragLifeMin = 0.7f;
                        fragBullet = new FlakBulletType(4f, 3f) {{
                            height = 8f;
                            lifetime = 50f;
                            hitEffect = Fx.flakExplosion;
                            backColor = Color.valueOf("d8887e");
                            frontColor = Color.valueOf("f5e0cc");
                            splashDamage = 33;
                            splashDamageRadius = 24f;
                        }};
                    }},
                    VeItems.ferrum, new BasicBulletType(0f, 0f) {{
                        lifetime = 1f;
                        despawnEffect = Fx.none;
                        shootEffect = Fx.colorSpark;
                        ammoMultiplier = 3f;
                        reloadMultiplier = 1.7f;
                        collides = false;
                        hitColor = Color.valueOf("9f8c88");
                        fragRandomSpread = 20f;
                        fragBullets = 4;
                        fragVelocityMin = 0.8f;
                        fragLifeMin = 0.7f;
                        fragBullet = new FlakBulletType(4.2f, 5f) {{
                            width = 10f;
                            height = 10f;
                            shrinkY = 0f;
                            lifetime = 50f;
                            hitEffect = Fx.flakExplosion;
                            despawnEffect = Fx.hitBulletColor;
                            collidesTiles = false;
                            setDefaults = false;
                            hitColor = frontColor = Color.valueOf("9f8c88");
                            backColor = Color.valueOf("7e6863");
                            despawnHit = true;
                            splashDamage = 32f;
                            splashDamageRadius = 16f;
                            fragRandomSpread = 30f;
                            fragBullets = 2;
                            fragVelocityMin = 0.5f;
                            fragLifeMin = 0f;
                            fragOffsetMax = 1f;
                            fragBullet = new BasicBulletType(4.2f, 8f) {{
                                width = 6f;
                                height = 9f;
                                shrinkY = 0f;
                                spin = 10f;
                                lifetime = 30f;
                                pierce = true;
                                pierceBuilding = false;
                                pierceCap = 3;
                                hitEffect = despawnEffect = Fx.hitBulletColor;
                                collidesTiles = false;
                                collidesGround = false;
                                pierceArmor = true;
                                hitColor = frontColor = Color.valueOf("9f8c88");
                                backColor = Color.valueOf("7e6863");
                            }};
                        }};
                    }}
            );
            inaccuracy = 3f;
            shootX = 0f;
            shootY = 1.25f;
            targetGround = false;
            ammoUseEffect = Fx.casing3;
            // shootSound = Sounds.shootAltClassic;
            recoil = 2f;
            reload = 65f;
            range = 210f;
            rotateSpeed = 22f;
            coolant = consumeCoolant(0.1f);
            health = 320;
        }};

        pulse = new PowerTurret("pulse") {{
            requirements(Category.turret, with(Items.lead, 50, Items.silicon, 25, VeItems.aluminium, 55));
            consumePower(3.2f);
            shootType = new BasicBulletType(1.8f, 25f) {{
                width = 7f;
                shrinkX = -0.2f;
                shrinkY = -0.2f;
                sprite = "circle-bullet";
                lifetime = 49f;
                drag = -0.02f;
                hitEffect = new MultiEffect(
                        new ExplosionEffect() {{
                            waveColor = sparkColor = Color.valueOf("8aa3f4");
                            waveRad = 18f;
                        }},
                        new ParticleEffect() {{
                            particles = 9;
                            sizeFrom = 3f;
                            colorFrom = Color.valueOf("ffffff");
                            colorTo = Color.valueOf("8aa3f4");
                            lifetime = 15f;
                        }}
                );
                shootEffect = Fx.shootBigColor;
                smokeEffect = Fx.none;
                // despawnSound = Sounds.spark;
                status = StatusEffects.shocked;
                statusDuration = 10f;
                hittable = false;
                despawnShake = 1f;
                hitColor = Color.valueOf("8aa3f4");
                trailColor = backColor = Color.valueOf("8aa3f4");
                frontColor = Color.valueOf("ffffff");
                trailInterval = 5f;
                fragBullets = 4;
                fragBullet = new LightningBulletType() {{
                    speed = 5f;
                    damage = 9f;
                    drag = 0.1f;
                    statusDuration = 10f;
                    lightningColor = Color.valueOf("8aa3f4");
                    lightningLength = 5;
                    lightningLengthRand = 4;
                }};
                bulletInterval = 4f;
                intervalBullet = new LightningBulletType() {{
                    damage = 9f;
                    statusDuration = 10f;
                    collidesAir = false;
                    lightningColor = Color.valueOf("8aa3f4");
                    lightningLength = 3;
                    lightningLengthRand = 2;
                }};
            }};
            shootY = 3f;
            shootSound = Sounds.shootLocus;
            reload = 58f;
            range = 144f;
            rotateSpeed = 20f;
            coolant = consumeCoolant(0.1f);
            coolantMultiplier = 8f;
            health = 280;
            researchCostMultiplier = 0.04f;
        }};

        rise = new ItemTurret("rise") {{
            requirements(Category.turret, with(Items.graphite, 30, VeItems.aluminium, 45));
            ammo(
                    Items.graphite, new BasicBulletType(1.5f, 25f) {{
                        width = 9f;
                        height = 9f;
                        shrinkY = 0f;
                        sprite = "missile";
                        lifetime = 65f;
                        drag = -0.025f;
                        hitEffect = despawnEffect = Fx.flakExplosion;
                        hitSound = despawnSound = Sounds.explosion;
                        collidesAir = false;
                        frontColor = Color.valueOf("dae1ee");
                        backColor = Color.valueOf("7d89d8");
                        splashDamage = 40f;
                        splashDamageRadius = 20f;
                        trailInterval = 6f;
                        homingPower = 0.15f;
                    }},
                    Items.silicon, new BasicBulletType(1.5f, 25f) {{
                        width = 9f;
                        height = 9f;
                        shrinkY = 0f;
                        sprite = "missile";
                        lifetime = 65f;
                        drag = -0.025f;
                        hitEffect = despawnEffect = Fx.flakExplosion;
                        hitSound = despawnSound = Sounds.explosion;
                        ammoMultiplier = 3f;
                        reloadMultiplier = 1.2f;
                        collidesAir = false;
                        backColor = Color.valueOf("b2c6d2");
                        splashDamage = 40f;
                        splashDamageRadius = 20f;
                        trailInterval = 6f;
                        homingPower = 0.3f;
                        homingRange = 80f;
                    }},
                    Items.pyratite, new BasicBulletType(1.5f, 32f) {{
                        width = 9f;
                        height = 9f;
                        shrinkY = 0f;
                        sprite = "missile";
                        lifetime = 65f;
                        drag = -0.025f;
                        hitEffect = despawnEffect = Fx.blastExplosion;
                        hitSound = despawnSound = Sounds.explosion;
                        ammoMultiplier = 4f;
                        status = StatusEffects.burning;
                        statusDuration = 240f;
                        collidesAir = false;
                        makeFire = true;
                        backColor = Color.valueOf("f8ad42");
                        trailColor = frontColor = Color.valueOf("f8e096");
                        splashDamage = 55f;
                        splashDamageRadius = 20f;
                        trailInterval = 4f;
                        homingPower = 0.15f;
                    }},
                    VeItems.ferrum, new BasicBulletType(1.5f, 20f) {{
                        width = 10f;
                        height = 10f;
                        shrinkY = 0f;
                        sprite = "missile";
                        lifetime = 65f;
                        drag = -0.025f;
                        hitEffect = Fx.flakExplosion;
                        despawnEffect = Fx.hitBulletColor;
                        hitSound = despawnSound = Sounds.explosion;
                        collidesAir = false;
                        setDefaults = false;
                        hitColor = frontColor = Color.valueOf("9f8c88");
                        trailColor = backColor = Color.valueOf("7e6863");
                        trailInterval = 6f;
                        homingPower = 0.15f;
                        despawnHit = true;
                        splashDamage = 35f;
                        splashDamageRadius = 24f;
                        fragRandomSpread = 40f;
                        fragBullets = 4;
                        fragVelocityMin = 0.5f;
                        fragLifeMin = 0f;
                        fragOffsetMax = 1f;
                        fragBullet = new BasicBulletType(4f, 6f) {{
                            width = 7f;
                            height = 9f;
                            shrinkY = 0f;
                            spin = 10f;
                            lifetime = 30f;
                            pierce = true;
                            pierceBuilding = false;
                            pierceCap = 3;
                            hitEffect = despawnEffect = Fx.hitBulletColor;
                            collidesAir = false;
                            pierceArmor = true;
                            hitColor = frontColor = Color.valueOf("9f8c88");
                            backColor = Color.valueOf("7e6863");
                        }};
                    }}
            );
            shootY = 3.25f;
            targetAir = false;
            predictTarget = false;
            ammoUseEffect = Fx.casing3;
            shootSound = Sounds.shootMissile;
            recoil = 1.2f;
            reload = 50f;
            range = 240f;
            rotateSpeed = 7.5f;
            coolant = consumeCoolant(0.1f);
            health = 350;
            researchCostMultiplier = 0.35f;
        }};

        bake = new ItemTurret("bake") {{
            requirements(Category.turret, with(Items.graphite, 25, VeItems.aluminium, 35));
            ammo(
                    Items.coal, new BasicBulletType(3.25f, 17f) {{
                        lifetime = 18f;
                        hitSize = 7f;
                        pierce = true;
                        hitEffect = Fx.hitFlameSmall;
                        shootEffect = Fx.shootSmallFlame;
                        despawnEffect = smokeEffect = Fx.none;
                        ammoMultiplier = 3f;
                        status = StatusEffects.burning;
                        statusDuration = 240f;
                        collidesAir = false;
                        keepVelocity = false;
                        hittable = false;
                        backColor = frontColor = Color.valueOf("ffffff00");
                    }},
                    Items.pyratite, new BasicBulletType(4f, 60f) {{
                        lifetime = 18f;
                        hitSize = 7f;
                        pierce = true;
                        hitEffect = Fx.hitFlameSmall;
                        shootEffect = Fx.shootPyraFlame;
                        despawnEffect = smokeEffect = Fx.none;
                        ammoMultiplier = 6f;
                        status = StatusEffects.burning;
                        statusDuration = 600f;
                        collidesAir = false;
                        keepVelocity = false;
                        hittable = false;
                        backColor = frontColor = Color.valueOf("ffffff00");
                    }},
                    VeItems.nitroalkoss, new BasicBulletType(4f, 107f) {{
                        lifetime = 24f;
                        hitSize = 12f;
                        pierce = true;
                        hitEffect = Fx.hitFlameSmall;
                        despawnEffect = smokeEffect = Fx.none;
                        shootEffect = new MultiEffect(
                                Fx.shootSmallFlame,
                                Fx.shootPyraFlame
                        );
                        ammoMultiplier = 12f;
                        // status = StatusEffects.combusting;
                        statusDuration = 900f;
                        collidesAir = false;
                        keepVelocity = false;
                        hittable = false;
                        pierceArmor = true;
                        backColor = frontColor = Color.valueOf("ffffff00");
                    }}
            );
            shootY = 2f;
            targetAir = false;
            ammoUseEffect = Fx.none;
            shootSound = Sounds.shootFlame;
            recoil = 0f;
            reload = 5f;
            range = 60f;
            rotateSpeed = 10f;
            coolantMultiplier = 1.5f;
            coolant = consumeCoolant(0.1f);
            health = 400;
            researchCostMultiplier = 0.35f;
        }};

        waterer = new LiquidTurret("waterer") {{
            requirements(Category.turret, with(Items.metaglass, 25, VeItems.aluminium, 25));
            ammo(
                    Liquids.water, new LiquidBulletType(Liquids.water) {{
                        puddleSize = 4f;
                        orbSize = 2f;
                        drag = 0.01f;
                        layer = Layer.bullet - 2f;
                        knockback = 0.4f;
                        // status = StatusEffects.wet;
                        statusDuration = 90f;
                    }},
                    Liquids.oil, new LiquidBulletType(Liquids.oil) {{
                        puddleSize = 4f;
                        orbSize = 2f;
                        drag = 0.01f;
                        layer = Layer.bullet - 2f;
                        ammoMultiplier = 3f;
                        knockback = 0.4f;
                        // status = StatusEffects.tarred;
                        statusDuration = 90f;
                    }},
                    Liquids.cryofluid, new LiquidBulletType(Liquids.cryofluid) {{
                        puddleSize = 4f;
                        orbSize = 2f;
                        drag = 0.01f;
                        ammoMultiplier = 3f;
                        knockback = 0.4f;
                        // status = StatusEffects.freezing;
                        statusDuration = 90f;
                    }}
            );
            inaccuracy = 5f;
            shootCone = 50f;
            shootY = 3.25f;
            liquidCapacity = 15f;
            shoot.shots = 3;
            shoot.shotDelay = 2f;
            shootSound = Sounds.none;
            recoil = 0f;
            reload = 6f;
            range = 110f;
            rotateSpeed = 20f;
            health = 300;
            researchCostMultiplier = 0.1f;
        }};

        beat = new ItemTurret("beat") {{
            requirements(Category.turret, with(Items.silicon, 50, VeItems.aluminium, 75, VeItems.silicide, 30));
            ammo(
                    Items.graphite, new BasicBulletType(4f, 22f) {{
                        width = 11f;
                        height = 13f;
                        lifetime = 50f;
                        hitEffect = despawnEffect = Fx.hitBulletColor;
                        ammoMultiplier = 5f;
                        hitColor = frontColor = Color.valueOf("dae1ee");
                        backColor = Color.valueOf("7d89d8");
                    }},
                    Items.silicon, new BasicBulletType(4f, 17f) {{
                        width = 9f;
                        height = 11f;
                        lifetime = 60f;
                        hitEffect = despawnEffect = Fx.hitBulletColor;
                        ammoMultiplier = 6f;
                        reloadMultiplier = 1.4f;
                        rangeChange = 40f;
                        hitColor = frontColor = Color.valueOf("999ba0");
                        trailColor = backColor = Color.valueOf("707594");
                        trailLength = 4;
                        homingPower = 0.15f;
                    }},
                    Items.pyratite, new BasicBulletType(4f, 20f) {{
                        width = 10f;
                        height = 12f;
                        lifetime = 50f;
                        hitEffect = new MultiEffect(
                                Fx.hitBulletSmall,
                                Fx.fireHit
                        );
                        ammoMultiplier = 6f;
                        status = StatusEffects.burning;
                        makeFire = true;
                        frontColor = Color.valueOf("f8e096");
                        backColor = Color.valueOf("f8ad42");
                        splashDamage = 12f;
                        splashDamageRadius = 22f;
                    }},
                    VeItems.aluminium, new BasicBulletType(4f, 11f) {{
                        width = 9f;
                        height = 11f;
                        lifetime = 50f;
                        ammoMultiplier = 3f;
                    }},
                    VeItems.quartz, new BasicBulletType(5f, 16f) {{
                        width = 8f;
                        height = 13f;
                        pierce = true;
                        pierceBuilding = false;
                        pierceCap = 4;
                        pierceDamageFactor = 0.75f;
                        ammoMultiplier = 4f;
                        hitEffect = despawnEffect = Fx.hitSquaresColor;
                        hitColor = backColor = Color.valueOf("f68021");
                    }},
                    VeItems.silicide, new BasicBulletType(5f, 28f) {{
                        width = 10f;
                        height = 12f;
                        lifetime = 50f;
                        hitEffect = new MultiEffect(
                                new WaveEffect() {{
                                    colorFrom = colorTo = lightColor = Color.valueOf("565666ff");
                                    sizeTo = 12f;
                                    strokeFrom = 6f;
                                    strokeTo = 4f;
                                    lifetime = 7f;
                                }},
                                new WaveEffect() {{
                                    colorFrom = colorTo = lightColor = Color.valueOf("565666ff");
                                    sizeTo = 16f;
                                    strokeFrom = 5f;
                                    strokeTo = 3f;
                                    lifetime = 5f;
                                }}
                        );
                        ammoMultiplier = 7f;
                        reloadMultiplier = 1.1f;
                        knockback = 2.1f;
                        hittable = false;
                        rangeChange = 50f;
                        despawnHit = true;
                        splashDamage = 10f;
                        splashDamageRadius = 14f;
                    }},
                    VeItems.chromium, new BasicBulletType(4f, 26f) {{
                        width = 9f;
                        height = 15f;
                        shrinkY = 0f;
                        spin = 10f;
                        lifetime = 50f;
                        hitEffect = despawnEffect = Fx.hitBulletColor;
                        ammoMultiplier = 4f;
                        shieldDamageMultiplier = 4f;
                        pierceArmor = true;
                        hitColor = backColor = Color.valueOf("ff6b41");
                    }},
                    VeItems.ferrum, new BasicBulletType(3.5f, 24f) {{
                        width = 10f;
                        height = 12f;
                        shrinkY = 0f;
                        lifetime = 57f;
                        hitEffect = Fx.flakExplosion;
                        despawnEffect = Fx.hitBulletColor;
                        ammoMultiplier = 4f;
                        setDefaults = false;
                        hitColor = frontColor = Color.valueOf("9f8c88");
                        backColor = Color.valueOf("7e6863");
                        despawnHit = true;
                        splashDamage = 9f;
                        splashDamageRadius = 14f;
                        fragRandomSpread = 30f;
                        fragBullets = 3;
                        fragVelocityMin = 0.5f;
                        fragLifeMin = 0f;
                        fragOffsetMax = 1f;
                        fragBullet = new BasicBulletType(3.5f, 5f) {{
                            width = 7f;
                            height = 9f;
                            shrinkY = 0f;
                            spin = 10f;
                            lifetime = 30f;
                            pierce = true;
                            pierceBuilding = false;
                            pierceCap = 3;
                            hitEffect = despawnEffect = Fx.hitBulletColor;
                            pierceArmor = true;
                            hitColor = frontColor = Color.valueOf("9f8c88");
                            backColor = Color.valueOf("7e6863");
                        }};
                    }}
            );
            inaccuracy = 1f;
            shootY = 0f;
            warmupMaintainTime = 30f;
            shoot = new ShootBarrel() {{
                barrels = new float[]{
                        1.75f, 5.5f, 0,
                        -1.75f, 5.5f, 0
                };
                firstShotDelay = 4f;
            }};
            ammoUseEffect = Fx.casing2;
            shootSound = Sounds.shootSalvo;
            shootWarmupSpeed = 0.25f;
            recoil = 1f;
            drawer = new DrawTurret() {{
                basePrefix = "dark-";
                parts.add(new RegionPart("-blade") {{
                    mirror = true;
                    moveX = 0f;
                    moveY = -2f;
                    moveRot = -10f;
                }});
            }};
            reload = 8f;
            range = 200f;
            rotateSpeed = 14f;
            coolant = consumeCoolant(0.2f);
            health = 1100;
            armor = 4f;
            size = 2;
            crushDamageMultiplier = 0.05f;
            outlineColor = Color.valueOf("2d2f39");
            researchCostMultiplier = 0.05f;
        }};

        crack = new ItemTurret("crack") {{
            requirements(Category.turret, with(Items.lead, 60, Items.graphite, 30, VeItems.silicide, 40));
            ammo(
                    Items.lead, new BasicBulletType(8f, 20f) {{
                        width = 8f;
                        height = 14f;
                        lifetime = 30f;
                        hitEffect = despawnEffect = Fx.flakExplosion;
                        ammoMultiplier = 3f;
                        knockback = 2.4f;
                        impact = true;
                        collidesTiles = false;
                        collidesGround = false;
                        splashDamage = 16f;
                        splashDamageRadius = 16f;
                    }},
                    Items.metaglass, new BasicBulletType(8f, 25f) {{
                        width = 10f;
                        height = 14f;
                        lifetime = 25f;
                        hitEffect = despawnEffect = Fx.flakExplosion;
                        ammoMultiplier = 5f;
                        knockback = 3f;
                        impact = true;
                        collidesTiles = false;
                        collidesGround = false;
                        splashDamage = 22f;
                        splashDamageRadius = 20f;
                        fragRandomSpread = 30f;
                        fragBullets = 2;
                        fragVelocityMin = 0.5f;
                        fragLifeMin = 0f;
                        fragBullet = new BasicBulletType(5f, 1f) {{
                            width = 8f;
                            height = 10f;
                            lifetime = 20f;
                            pierce = true;
                            pierceCap = 2;
                            hitEffect = despawnEffect = Fx.flakExplosion;
                            collidesTiles = false;
                            collidesGround = false;
                            splashDamage = 12f;
                            splashDamageRadius = 16f;
                        }};
                    }},
                    Items.scrap, new BasicBulletType(8f, 12f) {{
                        width = 8f;
                        height = 14f;
                        lifetime = 30f;
                        hitEffect = despawnEffect = Fx.flakExplosion;
                        ammoMultiplier = 3f;
                        knockback = 1.2f;
                        impact = true;
                        collidesTiles = false;
                        collidesGround = false;
                        backColor = Color.valueOf("d8887e");
                        frontColor = Color.valueOf("f5e0cc");
                        splashDamage = 14f;
                        splashDamageRadius = 24f;
                    }},
                    Items.plastanium, new BasicBulletType(8f, 30f) {{
                        width = 11f;
                        height = 15f;
                        lifetime = 25f;
                        hitEffect = despawnEffect = Fx.flakExplosion;
                        ammoMultiplier = 6f;
                        inaccuracy = 1f;
                        knockback = 3f;
                        impact = true;
                        status = StatusEffects.blasted;
                        statusDuration = 60f;
                        collidesTiles = false;
                        collidesGround = false;
                        hitShake = 1f;
                        backColor = Color.valueOf("d8d97f");
                        frontColor = Color.valueOf("fffac6");
                        splashDamage = 25f;
                        splashDamageRadius = 32f;
                        fragRandomSpread = 30f;
                        fragBullets = 4;
                        fragVelocityMin = 0.5f;
                        fragLifeMin = 0f;
                        fragBullet = new BasicBulletType(6f, 1f) {{
                            width = 8f;
                            height = 10f;
                            lifetime = 20f;
                            pierce = true;
                            pierceCap = 3;
                            hitEffect = despawnEffect = Fx.flakExplosion;
                            collidesTiles = false;
                            collidesGround = false;
                            backColor = Color.valueOf("d8d97f");
                            frontColor = Color.valueOf("fffac6");
                            splashDamage = 12f;
                            splashDamageRadius = 16f;
                        }};
                    }},
                    Items.surgeAlloy, new BasicBulletType(8f, 38f) {{
                        width = 12f;
                        height = 16f;
                        lifetime = 30f;
                        hitEffect = despawnEffect = Fx.blastExplosion;
                        ammoMultiplier = 6f;
                        knockback = 3.2f;
                        impact = true;
                        collidesTiles = false;
                        collidesGround = false;
                        hitShake = 1f;
                        trailColor = backColor = Color.valueOf("f3e979");
                        frontColor = Color.valueOf("ffffff");
                        trailInterval = 1f;
                        trailEffect = Fx.missileTrailShort;
                        trailWidth = 0.75f;
                        lightning = 2;
                        lightningLength = 9;
                        lightningDamage = 20f;
                        splashDamage = 14f;
                        splashDamageRadius = 24f;
                    }},
                    Items.blastCompound, new BasicBulletType(8f, 32f) {{
                        width = 11f;
                        height = 15f;
                        lifetime = 30f;
                        hitEffect = despawnEffect = Fx.blastExplosion;
                        ammoMultiplier = 6f;
                        knockback = 3.5f;
                        impact = true;
                        status = StatusEffects.blasted;
                        statusDuration = 60f;
                        collidesTiles = false;
                        collidesGround = false;
                        hitShake = 1;
                        despawnShake = 1;
                        backColor = Color.valueOf("e9665b");
                        frontColor = Color.valueOf("eeab89");
                        splashDamage = 28f;
                        splashDamageRadius = 36f;
                    }},
                    VeItems.silicide, new BasicBulletType(9f, 40f) {{
                        width = 12f;
                        height = 16f;
                        lifetime = 36f;
                        hitEffect = new MultiEffect(
                                Fx.flakExplosion,
                                new WaveEffect() {{
                                    colorFrom = colorTo = lightColor = Color.valueOf("565666ff");
                                    sizeTo = 12f;
                                    strokeFrom = 6f;
                                    strokeTo = 4f;
                                    lifetime = 7f;
                                }},
                                new WaveEffect() {{
                                    colorFrom = colorTo = lightColor = Color.valueOf("565666ff");
                                    sizeTo = 16f;
                                    strokeFrom = 5f;
                                    strokeTo = 3f;
                                    lifetime = 5f;
                                }}
                        );
                        despawnEffect = Fx.none;
                        ammoMultiplier = 6f;
                        reloadMultiplier = 1.3f;
                        knockback = 4.6f;
                        impact = true;
                        collidesTiles = false;
                        collidesGround = false;
                        rangeChange = 84f;
                        despawnHit = true;
                        splashDamage = 18f;
                        splashDamageRadius = 16f;
                        hittable = false;
                    }},
                    VeItems.ferrum, new BasicBulletType(8f, 30f) {{
                        width = 11f;
                        height = 15f;
                        shrinkY = 0f;
                        lifetime = 30f;
                        hitEffect = Fx.flakExplosion;
                        despawnEffect = Fx.hitBulletColor;
                        ammoMultiplier = 4f;
                        collidesTiles = false;
                        collidesGround = false;
                        setDefaults = false;
                        hitColor = frontColor = Color.valueOf("9f8c88");
                        backColor = Color.valueOf("7e6863");
                        despawnHit = true;
                        splashDamage = 10f;
                        splashDamageRadius = 16f;
                        fragRandomSpread = 30f;
                        fragBullets = 4;
                        fragVelocityMin = 0.5f;
                        fragLifeMin = 0f;
                        fragOffsetMax = 1f;
                        fragBullet = new BasicBulletType(6f, 6f) {{
                            width = 7f;
                            height = 11f;
                            shrinkY = 0f;
                            spin = 10f;
                            lifetime = 20f;
                            pierce = true;
                            pierceBuilding = false;
                            pierceCap = 4;
                            hitEffect = despawnEffect = Fx.hitBulletColor;
                            collidesTiles = false;
                            collidesGround = false;
                            pierceArmor = true;
                            hitColor = frontColor = Color.valueOf("9f8c88");
                            backColor = Color.valueOf("7e6863");
                        }};
                    }}
            );
            maxAmmo = 40;
            inaccuracy = 1f;
            shootY = 0f;
            trackingRange = 296f;
            warmupMaintainTime = 30f;
            shoot = new ShootBarrel() {{
                barrels = new float[]{
                        1.75f, 6, 0,
                        -1.75f, 6, 0
                };
            }};
            targetGround = false;
            ammoUseEffect = Fx.casing2;
            shootSound = Sounds.shootSalvo;
            shootWarmupSpeed = 0.25f;
            recoil = 2f;
            recoilTime = 20f;
            shake = 1f;
            drawer = new DrawTurret() {{
                basePrefix = "dark-";
                parts.add(
                        new RegionPart("-side") {{
                            mirror = true;
                            moveX = 2f;
                            moveY = -2f;
                            moveRot = 0f;
                            under = true;
                        }},
                        new RegionPart("-shell") {{
                            progress = DrawPart.PartProgress.recoil;
                            moveX = 0f;
                            moveY = 0.75f;
                            moveRot = 0f;
                        }},
                        new RegionPart("-tubes") {{
                            progress = DrawPart.PartProgress.recoil;
                            moveX = 0f;
                            moveY = -1f;
                            moveRot = 0f;
                            under = true;
                        }}
                );
            }};
            reload = 6f;
            range = 240f;
            rotateSpeed = 14f;
            coolant = consumeCoolant(0.3f);
            health = 1400;
            armor = 4f;
            size = 2;
            crushDamageMultiplier = 0.05f;
            outlineColor = Color.valueOf("2d2f39");
            researchCostMultiplier = 0.1f;
        }};

        shock = new PowerTurret("shock") {{
            requirements(Category.turret, with(Items.silicon, 30, VeItems.aluminium, 65, VeItems.silicide, 20));
            consumePower(3.8f);
            shootType = new MultiBulletType(
                    new RailBulletType() {{
                        pierceEffect = Fx.none;
                        pointEffect = new ParticleEffect() {{
                            particles = 1;
                            colorFrom = colorTo = Color.valueOf("8aa3f4");
                            length = 0f;
                            baseLength = 0f;
                            sizeInterp = Interp.circleIn;
                            sizeFrom = 1.5f;
                            sizeTo = 0f;
                            lifetime = 3f;
                        }};
                        length = 144f;
                        pointEffectSpace = 1f;
                        damage = 8f;
                        pierce = true;
                        pierceBuilding = false;
                        pierceCap = 2;
                        hitEffect = new MultiEffect(
                                Fx.hitLancer,
                                new ParticleEffect() {{
                                    particles = 1;
                                    colorFrom = colorTo = Color.valueOf("8aa3f4");
                                    length = 0f;
                                    baseLength = 0f;
                                    sizeInterp = Interp.circleIn;
                                    sizeFrom = 2f;
                                    sizeTo = 0f;
                                    lifetime = 4f;
                                }});
                        despawnEffect = smokeEffect = Fx.shootSmallSmoke;
                        shootEffect = new MultiEffect(
                                new ParticleEffect() {{
                                    colorFrom = colorTo = Color.valueOf("8aa3f4");
                                    particles = 1;
                                    length = 0f;
                                    baseLength = 0f;
                                    sizeFrom = 3f;
                                    sizeTo = 0;
                                    sizeInterp = Interp.circleIn;
                                    lifetime = 4f;
                                }});
                        pierceArmor = true;
                        hitShake = 0f;
                    }}) {{
                damage = 144f;
                pierce = true;
                pierceCap = 2;
                pierceArmor = true;
            }};
            shootY = 0f;
            minWarmup = 0.95f;
            warmupMaintainTime = 40f;
            shoot = new ShootMulti(
                    new ShootPattern() {{
                        shots = 9;
                        shotDelay = 2f;
                    }},
                    new ShootBarrel() {{
                        barrels = new float[]{
                                3, 0, 0,
                                -3, 0, 0
                        };
                        shots = 2;
                    }}
            );
            // shootSound = Sounds.lasershootClassic;
            soundPitchMin = 1.5f;
            soundPitchMax = 1.5f;
            shootWarmupSpeed = 0.25f;
            recoil = 1.5f;
            recoilTime = 120f;
            drawer = new DrawTurret() {{
                basePrefix = "dark-";
                parts.add(
                        new RegionPart("-blade") {{
                            mirror = true;
                            moveX = 1f;
                            moveY = 0.75f;
                            moveRot = 0f;
                            heatLight = true;
                            heatProgress = PartProgress.recoil;
                            under = true;
                        }}
                );
            }};
            reload = 60f;
            range = 144f;
            rotateSpeed = 10f;
            coolantMultiplier = 12f;
            coolant = consumeCoolant(0.2f);
            health = 1200;
            size = 2;
            crushDamageMultiplier = 0.05f;
            researchCostMultiplier = 0.01f;
        }};

        isomorphicCoreShard = new CoreBlock("isomorphic-core-shard") {{
            requirements(Category.effect, BuildVisibility.coreZoneOnly, with(Items.lead, 1600, VeItems.aluminium, 1000));
            alwaysUnlocked = true;
            health = 2500;
            size = 3;
            unitType = VeUnitTypes.theta;
            itemCapacity = 4000;
            unitCapModifier = 8;
            isFirstTier = true;
            requiresCoreZone = false;
            rebuildable = false;
            drawTeamOverlay = false;
            // shownPlanets.addAll(VePlanets.cyclant, VePlanets.maress);
        }};

        rail = new Conveyor("rail") {{
            requirements(Category.distribution, with(VeItems.aluminium, 1));
            health = 25;
            speed = 0.09f;
            hasShadow = false;
            displayedSpeed = 12f;
            drawTeamOverlay = false;
            pushUnits = false;
            drawCracks = false;
            // shownPlanets.addAll(VePlanets.cyclant, VePlanets.maress);
        }};

    }

}
