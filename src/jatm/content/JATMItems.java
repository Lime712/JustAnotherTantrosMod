package jatm.content;

import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;
import mindustry.content.*;

public class JATMItems{
    public static Item
    aluminium, corundum, lye, quicklime;//magnetite, cement, vinyl, steel

    public static final Seq<Item> tantrosItems = new Seq<>(), tantrosOnlyItems = new Seq<>();

    public static void load(){
        aluminium = new Item("aluminium", Color.valueOf("a89fc9")){{
            hardness = 3;
            cost = 0.6f;
            healthScaling = 0.1f;
        }};

        corundum = new Item("corundum", Color.valueOf("ba11a1")){{
            cost = 1f;
            healthScaling = 1f;
        }};

        quicklime = new Item("quicklime", Color.valueOf("ff9d59")){{
            cost = 0.7f;            
        }};

        /*magnetite = new Item("magnetite", Color,valueOf("000000")){{
            hardness = 5;
            cost = 0.8f;
            healthScaling = 0.2f;
        }};
        
        cement = new Item("cement", color.valueOf("000000")){{
            cost = 1f;
            healthScaling = 1.1f;
        }};
        
        vinyl = new Item("vinyl", color.valueOf("000000")){{
            cost = 0.6f;
            explosiveness = 0.1f;
        }};
        
        steel = new Item("steel", color.valueOf("8c9b82")){{
            cost = 0.9f;
            healthScaling = 1.1f;
        }}*/

        tantrosItems.addAll(Items.lead, Items.metaglass, Items.silicon, Items.surgeAlloy, aluminium, corundum, quicklime);
        tantrosOnlyItems.addAll(tantrosItems).removeAll(Items.serpuloItems);
        for (Planet planet : Vars.content.planets()) {
            if (planet.name != "tantros")
                planet.hiddenItems.addAll(JATMItems.tantrosOnlyItems);
        }
    }
}