package com.example.consumoapi.model

data class ExercisesResultItem(
    val exercise_base: Int,
    val id: Int,
    val image: String,
    val is_main: Boolean,
    val status: String,
    val uuid: String
)