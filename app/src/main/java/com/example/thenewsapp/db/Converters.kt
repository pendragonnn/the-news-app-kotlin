package com.example.thenewsapp.db

import androidx.room.TypeConverter
import com.example.thenewsapp.models.Source

class Converters {
    @TypeConverter
    fun fromSource(source: Source?): String {
        return source?.name ?: "Unknown Source"
    }

    @TypeConverter
    fun toSource(name: String?): Source {
        return Source(name ?: "unknown_id", name ?: "Unknown Source")
    }
}
