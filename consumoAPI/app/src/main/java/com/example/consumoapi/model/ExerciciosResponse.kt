package com.example.consumoapi.model

data class ExerciciosResponse(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<Result>
)