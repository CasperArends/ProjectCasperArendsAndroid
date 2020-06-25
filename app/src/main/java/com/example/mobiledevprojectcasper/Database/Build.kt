package com.example.mobiledevprojectcasper.Database

import android.graphics.drawable.Drawable
import android.os.Parcelable
import androidx.annotation.DrawableRes
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mobiledevprojectcasper.R
import kotlinx.android.parcel.Parcelize


@Parcelize
@Entity(tableName = "buildOverviewTable")
data class Build (
    var abilityCharacter: Int? = null,

    @ColumnInfo
    var characterSelected: Int?,

    @ColumnInfo
    var ability1: String?,

    @ColumnInfo
    var ability2: String?,

    @ColumnInfo
    var ability3: String?,

    @ColumnInfo
    var ability4: String?,

    @ColumnInfo
    var ability5: String?,

    @ColumnInfo
    var name: String?,

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null

    ) : Parcelable {
    companion object{
        val ABILITY_RAIGON_NAME = arrayOf(
            "binding_light",
            "headlong_rush",
            "acrobatics",
            "hawk_dive",
            "overflowing_power",
            "royal_descent",
            "duelist",
            "invigorate",
            "riposte",
            "aerial_strike",
            "perilous_height",
            "seismic_retribution",
            "royal_descent",
            "the_tiger_and_the_dragon"
        )

        val ABILITY_RAIGON = arrayOf(
            R.drawable.binding_light,
            R.drawable.headlong_rush,
            R.drawable.acrobatics,
            R.drawable.hawk_dive,
            R.drawable.overflowing_power,
            R.drawable.royal_descent,
            R.drawable.duelist,
            R.drawable.invigorate,
            R.drawable.riposte,
            R.drawable.aerial_strike,
            R.drawable.perilous_height,
            R.drawable.seismic_retribution,
            R.drawable.royal_descent,
            R.drawable.the_tiger_and_the_dragon
        )

        val ABILITY_RAIGON_LOGO = arrayOf(
            R.drawable.binding_light_logo,
            R.drawable.headlong_rush_logo,
            R.drawable.acrobatics_logo,
            R.drawable.hawk_dive_logo,
            R.drawable.overflowing_power_logo,
            R.drawable.royal_descent_logo,
            R.drawable.duelist_logo,
            R.drawable.invigorate_logo,
            R.drawable.riposte_logo,
            R.drawable.aerial_strike_logo,
            R.drawable.perilous_height_logo,
            R.drawable.seismic_retribution_logo,
            R.drawable.royal_descent_logo,
            R.drawable.the_tiger_and_the_dragon_logo
        )

        val ABILITY_JADE_NAME = arrayOf(
            "gunslinger",
            "hit_and_run",
            "deadly_focus",
            "shadow_shot",
            "surprise_shot",
            "blasting_pistols",
            "evasive_measures",
            "explosive_jump",
            "ambush",
            "farewell_present",
            "through_the_shadows",
            "delight",
            "desperado",
            "magic_bullet",
            "black_powder",
            "shrapnel"
        )

        val ABILITY_JADE = arrayOf(
            R.drawable.gunslinger,
            R.drawable.hit_and_run,
            R.drawable.deadly_focus,
            R.drawable.shadow_shot,
            R.drawable.surprise_shot,
            R.drawable.blasting_pistols,
            R.drawable.evasive_measures,
            R.drawable.explosive_jump,
            R.drawable.ambush,
            R.drawable.farewell_present,
            R.drawable.through_the_shadows,
            R.drawable.delight,
            R.drawable.desperado,
            R.drawable.magic_bullet,
            R.drawable.black_powder,
            R.drawable.shrapnel


        )

        val ABILITY_JADE_LOGO = arrayOf(
            R.drawable.gunslinger_logo,
            R.drawable.hit_and_run_logo,
            R.drawable.deadly_focus_logo,
            R.drawable.shadow_shot_logo,
            R.drawable.surprise_shot_logo,
            R.drawable.blasting_pistols_logo,
            R.drawable.evasive_measures_logo,
            R.drawable.explosive_jump_logo,
            R.drawable.ambush_logo,
            R.drawable.farewell_present_logo,
            R.drawable.through_the_shadows_logo,
            R.drawable.delight_logo,
            R.drawable.desperado_logo,
            R.drawable.magic_bullet_logo,
            R.drawable.black_powder_logo,
            R.drawable.shrapnel_logo
        )

        val ABILITY_ASHKA_NAME = arrayOf(
            "combustion",
            "heat",
            "wildfire",
            "blaze",
            "burning_feet",
            "fire_ward",
            "ember_fire",
            "eruption",
            "inferno",
            "knockout",
            "mach_punch",
            "molten_core",
            "conflagration",
            "raging_fire",
            "magma"
        )

        val ABILITY_ASHKA = arrayOf(
            R.drawable.combustion,
            R.drawable.heat,
            R.drawable.wildfire,
            R.drawable.blaze,
            R.drawable.burning_feet,
            R.drawable.fire_ward,
            R.drawable.ember_fire,
            R.drawable.eruption,
            R.drawable.inferno,
            R.drawable.knockout,
            R.drawable.mach_punch,
            R.drawable.molten_core,
            R.drawable.conflagration,
            R.drawable.raging_fire,
            R.drawable.magma
        )

        val ABILITY_ASHKA_LOGO = arrayOf(
            R.drawable.combustion_logo,
            R.drawable.heat_logo,
            R.drawable.wildfire_logo,
            R.drawable.blaze_logo,
            R.drawable.burning_feet_logo,
            R.drawable.fire_ward_logo,
            R.drawable.ember_fire_logo,
            R.drawable.eruption_logo,
            R.drawable.inferno_logo,
            R.drawable.knockout_logo,
            R.drawable.mach_punch_logo,
            R.drawable.molten_core_logo,
            R.drawable.conflagration_logo,
            R.drawable.raging_fire_logo,
            R.drawable.magma_logo
        )
    }
}
