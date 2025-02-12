package com.example.thenewsapp.models

import java.io.Serializable

data class Source(
    val id: String? = null,   // Bisa null
    val name: String = ""
) : Serializable