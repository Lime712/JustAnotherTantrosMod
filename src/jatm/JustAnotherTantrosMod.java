package jatm;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import jatm.content.*;

public class JustAnotherTantrosMod extends Mod{

    public JustAnotherTantrosMod(){
        Log.info("Loaded JustAnotherTantrosMod constructor.");

        Events.on(ClientLoadEvent.class, e -> {
            Planets.tantros.accessible = Planets.tantros.alwaysUnlocked = Planets.tantros.visible = true;
            Planets.tantros.allowLaunchToNumbered = Planets.tantros.allowLaunchLoadout = false;
        });
    }

    @Override
    public void loadContent(){
        JATMItems.load();
        for (Planet planet : Vars.content.planets()) {
            if (planet.name != "tantros")
                planet.hiddenItems.addAll(JATMItems.tantrosOnlyItems);
        }
    }
}
