package com.example.consumoapi.model

data class ExerciseimageResponse(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<ResultExImg>
)