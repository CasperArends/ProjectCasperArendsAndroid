package com.example.mobiledevprojectcasper.Database

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

    @ColumnInfo(name = "abilityRaigon")
    @DrawableRes var ABILITIES_RAIGON: Int,

    @ColumnInfo(name = "abilitychoice1")
    var ability1: Int?,

    @ColumnInfo(name = "abilitychoice2")
    var ability2: Int?,

    @ColumnInfo(name = "abilitychoice3")
    var ability3: Int?,

    @ColumnInfo(name = "abilitychoice4")
    var ability4: Int?,

    @ColumnInfo(name = "abilitychoice5")
    var ability5: Int?,

    @ColumnInfo(name = "nameBuild")
    var name: String,

    @ColumnInfo(name = "abilityslots")
    var slot: Int = 5,

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null

    ) : Parcelable {
    companion object{
        val BUILD_RAIGON = arrayOf(
            R.drawable.Binding_Light,
            R.drawable.Headlong_Rush,
            R.drawable.Acrobatics,
            R.drawable.Hawk_Dive,
            R.drawable.Overflowing_Power,
            R.drawable.Royal_Descent,
            R.drawable.Duelist,
            R.drawable.Invigorate,
            R.drawable.Riposte,
            R.drawable.Aerial_Strike,
            R.drawable.Perilous_Height,
            R.drawable.Seismic_Retribution,
            R.drawable.Royal_Descent,
            R.drawable.The_Tiger_And_The_Dragon
        )
    }
}
