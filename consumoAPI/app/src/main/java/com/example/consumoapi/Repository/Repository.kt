package com.example.consumoapi.Repository

import RetrofitInit
import com.example.consumoapi.model.ExerciseimageResponse
import com.example.consumoapi.network.EndPoint

const val API_KEY = "bdd28eb46b13ec12174810a555a67d2b81fab9b9"

class Repository {

    private var url = "https://wger.de/api/v2/"
    private var service = EndPoint::class

    private val serviceEximg = RetrofitInit(url).create(service)

    suspend fun getExerciseImageService(): ExerciseimageResponse = serviceEximg.getResponseExerciseimage()
}