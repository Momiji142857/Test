package vanilla.expansion.content;

import arc.graphics.Color;
import mindustry.content.Planets;
import mindustry.graphics.g3d.HexSkyMesh;
import mindustry.graphics.g3d.MultiMesh;
import mindustry.graphics.g3d.NoiseMesh;
import mindustry.graphics.g3d.SunMesh;
import mindustry.type.Planet;
import mindustry.world.meta.Attribute;
import mindustry.world.meta.Env;

public class VePlanets {
    public static Planet
            sol2,
            cyclant,
            phoon,
            sitrullus,
            maress;

    public static void load() {

        sol2 = new Planet("sol2", null, 2f) {{
            drawOrbit = false;
            orbitRadius = 300f;
            orbitTime = 12000f;
            rotateTime = 400f;
            accessible = false;
            bloom = true;
            iconColor = Color.valueOf("387aff");
            // children.add(cyclant, maress, sitrullus);

            meshLoader = () -> new SunMesh(
                    this, 5, 5f, 0.3f,
                    1.5f, 1.2f, 1f, 1.1f,
                    Color.valueOf("387aff"),
                    Color.valueOf("3896ff"),
                    Color.valueOf("4cc6ff"),
                    Color.valueOf("4cc6ff"),
                    Color.valueOf("71e3ff"),
                    Color.valueOf("8eeef4")
            );
        }};

        cyclant = new Planet("cyclant", sol2, 1f, 3) {{
            alwaysUnlocked = true;
            generator = new CyclantPlanetGenerator();
            minZoom = 0.001f;
            maxZoom = 10f;
            atmosphereRadIn = 0.02f;
            atmosphereRadOut = 0.4f;
            orbitRadius = 90f;
            orbitTime = 12000f;
            rotateTime = 1200f;
            defaultEnv = Env.terrestrial | Env.groundOil | Env.groundWater | Env.oxygen;
            defaultAttributes.set(Attribute.spores, -1);
            defaultAttributes.set(Attribute.steam, 1);
            lightDstFrom = 0.25f;
            lightDstTo = 0.85f;
            startSector = 170;
            sectorSeed = 0;
            launchCapacityMultiplier = 0.25f;
            landCloudColor = Color.valueOf("938c9c7f");
            lightColor = Color.valueOf("3fc2ff80");
            atmosphereColor = Color.valueOf("90dbff80");
            iconColor = Color.valueOf("90dbff");
            allowLaunchSchematics = true;
            allowLaunchLoadout = true;
            clearSectorOnLose = true;
            enemyCoreSpawnReplace = true;
            prebuildBase = false;
            allowLaunchToNumbered = true;
            allowCampaignRules = true;
            // launchMusic = ;
            defaultCore = VeBlocks.isomorphicCoreShard;
            solarSystem = sol2;
            launchCandidates.add(Planets.serpulo, maress, cyclant);
            allowSelfSectorLaunch = false;

            meshLoader = () -> new MultiMesh(
                    new NoiseMesh(this, 204, 6, 1f, 10, 0.5f, 1f, 0.5f, Color.valueOf("c59a78"), Color.valueOf("909862"), 1, 1f, 1f, 0.5f),
                    new NoiseMesh(this, 3, 6, 1f, 6, 0.5f, 0.5f, 0.5f, Color.valueOf("4d5ca420"), Color.valueOf("5867ac20"), 1, 1f, 1f, 0.5f),
                    new NoiseMesh(this, 2, 6, 0.982f, 8, 0.5f, 2f, 0.5f, Color.valueOf("3c4448"), Color.valueOf("909862"), 1, 1f, 1f, 0.5f),
                    new NoiseMesh(this, 9, 3, 0.3f, 8, 0.5f, 5f, 0.5f, Color.valueOf("00ff00"), Color.valueOf("00ff00"), 1, 1f, 1f, 0.5f),
                    //new NoiseMesh(this, 1005, 6, 0.988f, 6, 0.9f, 0.1f, 0.5f, Color.valueOf("c2c2c2"), Color.valueOf("676593"), 8, 1.0f, 1.0f, 0.5f),
                    new SunMesh(this, 2, 6f, 0.5f, 0.01f, 1.2f, 1.5f, 1.1f, Color.valueOf("ffa665"), Color.valueOf("feb380"))
                    );
            cloudMeshLoader = () -> new MultiMesh(
                    new HexSkyMesh(this, 9, 2.8f, 0.07f, 5, Color.valueOf("938c9cd0"), 2, 0.42f, 0.9f, 0.43f),
                    new HexSkyMesh(this, 19, 1f, 0.15f, 5, Color.valueOf("b8c1e050"), 2, 0.4f, 0.5f, 0.45f),
                    new HexSkyMesh(this, 29, 0.6f, 0.2f, 5, Color.valueOf("c7e5ff30"), 2, 0.38f, 0.2f, 0.47f),
                    new HexSkyMesh(this, 39, 0.8f, 0.25f, 5, Color.valueOf("b8c1e020"), 2, 0.38f, 0.3f, 0.6f),
                    new HexSkyMesh(this, 49, 1.2f, 0.3f, 5, Color.valueOf("c7e5ff10"), 2, 0.38f, 0.3f, 0.75f)
            );
        }};

        phoon = new Planet("phoon", cyclant, 0.2f, 1) {{
            generator = new PhoonPlanetGenerator();
            camRadius = 0.25f;
            minZoom = 0.05f;
            atmosphereRadIn = 0.01f;
            atmosphereRadOut = 0.02f;
            orbitRadius = 4.5f;
            orbitTime = 600f;
            rotateTime = 600f;
            tidalLock = true;
            accessible = false;
            defaultAttributes.set(Attribute.spores, -1);
            sectorSeed = 0;
            landCloudColor = Color.valueOf("989aa4f");
            atmosphereColor = Color.valueOf("989aa422");
            lightColor = Color.valueOf("b0bac0dd");
            iconColor = Color.valueOf("989aa4");
            allowLaunchSchematics = true;
            allowLaunchLoadout = true;
            clearSectorOnLose = true;
            enemyCoreSpawnReplace = true;
            allowLaunchToNumbered = false;
            // defaultCore = ;
            solarSystem = sol2;
            launchCandidates.add(cyclant);
            meshLoader = () -> new MultiMesh(
                new NoiseMesh(this, 204, 2, 0.2f, 5, 0.5f, 1f, 0.5f, Color.valueOf("b0bac0"), Color.valueOf("989aa4"), 1, 1f, 1f, 0.5f),
                new NoiseMesh(this, 3, 2, 0.2f, 3, 0.5f, 0.5f, 0.5f, Color.valueOf("989aa4"), Color.valueOf("6e7080"), 1, 1f, 1f, 0.5f)
            );
        }};

        sitrullus = new Planet("sitrullus", sol2, 0.6f, 2) {{
            generator = new SitrullusPlanetGenerator();
            alwaysUnlocked = true;
            radius = 0.6f;
            minZoom = 1.2f;
            maxZoom = 10f;
            atmosphereRadIn = 0.01f;
            atmosphereRadOut = 0.1f;
            orbitRadius = 105f;
            orbitTime = 15122f;
            rotateTime = 1800f;
            defaultAttributes.set(Attribute.spores, 0.5f);
            defaultAttributes.set(Attribute.water, 0.5f);
            lightSrcTo = 1f;
            lightDstFrom = 0f;
            startSector = 170;
            sectorSeed = 0;
            launchCapacityMultiplier = 0.5f;
            landCloudColor = Color.valueOf("daf9c87f");
            lightColor = Color.valueOf("ff555550");
            atmosphereColor = Color.valueOf("88c96180");
            iconColor = Color.valueOf("88c961");
            allowLaunchSchematics = false;
            allowLaunchLoadout = true;
            clearSectorOnLose = true;
            enemyCoreSpawnReplace = true;
            prebuildBase = false;
            allowCampaignRules = true;
            // launchMusic = ;
            // defaultCore = ;
            solarSystem = sol2;
            launchCandidates.add(sitrullus);
            allowSelfSectorLaunch = false;
            allowLaunchToNumbered = false;
            meshLoader = () -> new MultiMesh(
                    new NoiseMesh(this, 73, 5, 0.609f, 10, 0.5f, 12f, 0f, Color.valueOf("ff555520"), Color.valueOf("9e78dc80"), 1, 1f, 1f, 0.5f),
                    new NoiseMesh(this, 117, 5, 0.6f, 10, 0.5f, 2f, 0.2f, Color.valueOf("ff555520"), Color.valueOf("cc343420"), 1, 1f, 1f, 0.5f),
                    new NoiseMesh(this, 128, 5, 0.585f, 10, 0.5f, 1f, 0.4f, Color.valueOf("88c961"), Color.valueOf("5ba232"), 1, 1f, 1f, 0.5f),
                    new NoiseMesh(this, 128, 5, 0.59f, 10, 0.5f, 1f, 0.33f, Color.valueOf("ddf5b0"), Color.valueOf("edf5b0"), 1, 1f, 1f, 0.5f)
            );
            cloudMeshLoader = () -> new MultiMesh(
                    new HexSkyMesh(this, 574, 0.3f, 0.08f, 4, Color.valueOf("daf9c840"), 2, 0.42f, 0.9f, 0.43f),
                    new HexSkyMesh(this, 73, 0.2f, 0.1f, 4, Color.valueOf("edffe220"), 2, 0.42f, 0.9f, 0.43f)
            );
        }};

        maress = new Planet("maress", sol2, 0.75f, 3) {{
            generator = new MaressPlanetGenerator();
            alwaysUnlocked = true;
            minZoom = 0.001f;
            maxZoom = 10f;
            atmosphereRadIn = 0.02f;
            atmosphereRadOut = 0.15f;
            orbitRadius = 120f;
            orbitTime = 21333f;
            rotateTime = 1100f;
            defaultAttributes.set(Attribute.spores, -1f);
            defaultAttributes.set(Attribute.light, 0.2f);
            defaultAttributes.set(Attribute.sand, 1f);
            lightSrcTo = 1f;
            lightDstFrom = 0f;
            lightDstTo = 1.2f;
            startSector = 43;
            sectorSeed = 0;
            launchCapacityMultiplier = 0.5f;
            landCloudColor = Color.valueOf("b6a49911");
            lightColor = Color.valueOf("e69663dd");
            atmosphereColor = Color.valueOf("e69663");
            iconColor = Color.valueOf("de8a5b");
            allowLaunchSchematics = true;
            allowLaunchLoadout = true;
            clearSectorOnLose = true;
            enemyCoreSpawnReplace = true;
            prebuildBase = false;
            allowLaunchToNumbered = false;
            // launchMusic = ;
            // defaultCore = ;
            solarSystem = sol2;
            launchCandidates.add(cyclant, maress);
            meshLoader = () -> new MultiMesh(
                    new NoiseMesh(this, 177, 5, 0.733f, 10, 0.5f, 2f, 0.3f, Color.valueOf("ba754e"), Color.valueOf("88624c40"), 1, 1f, 1f, 0.5f),
                    new NoiseMesh(this, 995, 5, 0.708f, 6, 0.5f, 0.1f, 0.5f, Color.valueOf("c2c2c2"), Color.valueOf("b6a499"), 1, 1f, 1f, 0.5f),
                    new NoiseMesh(this, 995, 2, 0.01f, 6, 0.5f, 10f, 100f, Color.valueOf("c2c2c2"), Color.valueOf("b6a499"), 1, 1f, 1f, 0.5f),
                    new NoiseMesh(this, 995, 2, 0.5f, 6, 0.5f, 2f, 1f, Color.valueOf("c2c2c2"), Color.valueOf("b6a499"), 1, 1f, 1f, 0.5f)
            );
            cloudMeshLoader = () -> new HexSkyMesh(
                    this, 78, 1f, 0.12f, 5,
                    Color.valueOf("b6a49933"),
                    2, 0.4f, 0.5f, 0.45f
            );
        }};

    }
}