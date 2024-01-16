package jatm.type.unit;

import mindustry.content.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.ammo.*;
import mindustry.world.meta.*;
import mindustry.entities.abilities.*;

/** Tantros unit type, only functions underwater*/
public class JATMUnitType extends UnitType{

    public JATMUnitType(String name){
        super(name);
        outlineColor = Pal.darkOutline;
        envRequired = envEnabled = Env.underwater;
        ammoType = new ItemAmmoType(Items.aluminium);
        researchCostMultiplier = 10f;
        immunities.addAll(StatusEffects.wet, StatusEffects.shocked, StatusEffects.burning, StatusEffects.sporeSlowed);
        engineSize = -1f;
    }
}