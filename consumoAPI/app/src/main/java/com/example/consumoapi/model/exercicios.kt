package com.example.consumoapi.model

data class exercicios(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<Result>
)