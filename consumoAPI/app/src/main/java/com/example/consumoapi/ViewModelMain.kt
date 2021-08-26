package com.example.consumoapi

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.consumoapi.Repository.Repository
import com.example.consumoapi.model.ResultExImg
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class ViewModelMain : ViewModel() {

    val listMutableExrciseImg = MutableLiveData<List<ResultExImg>>()
    private val repository = Repository()

    fun getAllExercisesImg() = CoroutineScope (Dispatchers.IO).launch {
        repository.getExerciseImageService().let { ExerciseimageResponse ->
            listMutableExrciseImg.postValue(ExerciseimageResponse.results)
        }
    }
}