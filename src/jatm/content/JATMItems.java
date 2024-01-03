package jatm.content;

import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;
import mindustry.content.items.*;

public class JATMItems{
    public static Item
    aluminium, corundum, lye, quicklime;

    public static final Seq<Item> tantrosItems = new Seq<>(), tantrosOnlyItems = new Seq<>();

    public static void load(){
        aluminium = new Item("aluminium", Color.valueOf("a89fc9")){{
            hardness = 4;
            cost = 0.6f;
            healthScaling = 0.1f;
        }};

        corundum = new Item("corundum", Color.valueOf("ba11a1")){{
            cost = 1.1f;
            healthScaling = 1f;
        }};

        lye = new Item("lye", Color.valueOf("8c9b82")){{
            buildable = false;
        }}

        quicklime = new Item("quicklime", Color.valueOf("ff9d59")){{
            cost = 0.7f;            
        }}

        tantrosItems.addAll(lead, metaglass, aluminium, corundum, lye, quicklime);
        tantrosOnlyItems.addAll(tantrosItems).removeAll(serpuloItems)
    }
}