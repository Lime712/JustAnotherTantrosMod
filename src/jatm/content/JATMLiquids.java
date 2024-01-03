package jatm.content;

import arc.graphics.*;
import mindustry.type.*;
import mindustry.content.*;

public class JATMLiquids{
    public static Liquid acid, brine; //methane

    public static void load(){
        acid = new Liquid("acid", Color.valueOf("dce86e")){{
            heatCapacity = 0.3f;
            effect = StatusEffects.corroded;
            canStayOn.add(brine);
            boilPoint = 0.6f;
            gasColor = Color.valueOf("b8d16e");
        }};

        brine = new Liquid("brine", Color.valueOf("ffcade")){{
            heatCapacity = 0.5f;
            effect = StatusEffects.wet;
            boilPoint = 0.4f;
            gasColor = Color.valueOf("cfa2a5");
        }};
    }
}