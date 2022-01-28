package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adaptor.AdaptorList
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = Datasource().loadListString()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler)
        val adapter = AdaptorList(data, this)
        recyclerView.adapter = adapter
        print(data)
    }
}