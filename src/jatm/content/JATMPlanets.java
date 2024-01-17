package jatm.content;

import arc.func.*;
import arc.graphics.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import mindustry.game.*;
import mindustry.graphics.*;
import mindustry.graphics.g3d.*;
import mindustry.graphics.g3d.PlanetGrid.*;
import mindustry.maps.planet.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.meta.*;
import mindustry.content.*;

public class JATMPlanets{
    public static Planet fakeTantros;

    public static void load(){

    fakeTantros = new Planet("fakeTantros", Planets.sun, 1f, 2){{
        alwaysUnlocked = true;
        //temp generator
        generator = new TantrosPlanetGenerator();
        meshLoader = () -> new HexMesh(this, 4);
        cloudMeshLoader = () -> new MultiMesh(
            new HexSkyMesh(this, 11, 0.15f, 0.13f, 5, new Color.valueOf("915c9b").mul(0.9f).a(0.75f), 2, 0.45f, 0.9f, 0.38f),
            new HexSkyMesh(this, 1, 0.6f, 0.16f, 5, new Color.valueOf("a471ae").a(0.75f), 2, 0.45f, 1f, 0.41f)
        );
        accessible = true;
        visible = true;
        orbitSpacing = 2f;
        atmosphereColor = Color.valueOf("3db899");
        iconColor = Color.valueOf("597be3");
        startSector = 10;
        atmosphereRadIn = -0.01f;
        atmosphereRadOut = 0.3f;
        defaultEnv = Env.underwater | Env.terrestrial;
        landCloudColor = Color.valueOf("915c9b").a(0.5f);
        ruleSetter = r -> {
            r.waveTeam = Team.green;
            r.placeRangeCheck = false;
            r.showSpawns = true;
            r.fog = true;
            r.staticFog = true;
            r.lighting = false;
            r.coreDestroyClear = true;
            r.onlyDepositCore = true;
            };
        }};
    };
}
