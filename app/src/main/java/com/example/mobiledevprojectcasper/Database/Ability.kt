package com.example.mobiledevprojectcasper.Database

import androidx.annotation.DrawableRes
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

data class Ability(
    var name: String,
    @DrawableRes var ability_image: Int,
    @DrawableRes var ability_image_logo: Int

)




