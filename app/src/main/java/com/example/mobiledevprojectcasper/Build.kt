package com.example.mobiledevprojectcasper

import android.os.Parcelable
import androidx.annotation.DrawableRes
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
@Entity(tableName = "buildOverviewTable")
data class Build (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null,

    @ColumnInfo(name = "nameBuild")
    var name: String,

    @ColumnInfo(name = "abilityslots")
    var slot: Int = 5,

    @ColumnInfo(name = "abilityRaigon")
    @DrawableRes var ABILITIES_RAIGON: Int
    ) : Parcelable {
    companion object{
        val BUILD_RAIGON = arrayOf(
            R.drawable.Binding_Light_Ability,
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
