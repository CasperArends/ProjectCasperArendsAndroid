package com.example.mobiledevprojectcasper.model

import androidx.room.TypeConverter
import java.util.*

class Converters {
    @TypeConverter
    fun fromTimeStamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long?{
        return date?.time?.toLong()

    }

//    @TypeConverter
//    fun fromImage(value: Long?): Image?{
//        return value?.let {  }
//    }
//
//    @TypeConverter
//    fun imageToImageStamp(image: Image?): Long?{
//        return image?.
//    }
}