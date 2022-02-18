package com.example.myrecyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecyclerviewapp.data.Datasource
import com.example.myrecyclerviewapp.model.Afirmaciones

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset : List<Afirmaciones> = Datasource().loadingData()
        val recyclerView : RecyclerView = findViewById(R.id.recyclerview)
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true) // ?
    }
}