package com.example.consumoapi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.consumoapi.model.ResultExImg

class  MainActivity : AppCompatActivity() {

    private var results = mutableListOf<ResultExImg>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.exercisesRV)

        val viewModelExerciseImg = androidx.lifecycle.ViewModelProvider(this).get(ViewModelMain::class.java)

        val adapterExerciseImg = RecyclerAdapter(results,this)
        recycler.adapter = adapterExerciseImg

        val layoutManager = GridLayoutManager(this, 2)
        recycler.layoutManager = layoutManager

        viewModelExerciseImg.getAllExercisesImg()
        viewModelExerciseImg.listMutableExrciseImg.observe(this, Observer {
            it?.let { itChar -> results.addAll(itChar) }
            adapterExerciseImg.notifyDataSetChanged()
        })

    }
}

/* bdd28eb46b13ec12174810a555a67d2b81fab9b9 */