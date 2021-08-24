package com.example.consumoapi.network

import retrofit2.http.GET
import com.example.consumoapi.model.ExerciseimageResponse

interface EndPoint {

    @GET( "exerciseimage")
    suspend fun getResponseExerciseimage() : ExerciseimageResponse
}
