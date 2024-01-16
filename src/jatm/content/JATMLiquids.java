package jatm.content;

import arc.graphics.*;
import mindustry.type.*;
import mindustry.content.*;

public class JATMLiquids{
    public static Liquid acid, brine; //methane

    public static void load(){
        chlorine = new Liquid("chlorine", Color.valueOf("dce86e")){{
            heatCapacity = 0.3f;
            effect = StatusEffects.corroded;
            gas = true;
        }};

        brine = new Liquid("brine", Color.valueOf("ffcade")){{
            heatCapacity = 0.5f;
            effect = StatusEffects.wet;
            boilPoint = 0.4f;
            gasColor = Color.valueOf("cfa2a5");
        }};
    }
}