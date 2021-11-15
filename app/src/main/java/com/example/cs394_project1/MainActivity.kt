package com.example.cs394_project1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cs394_project1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       /* val myDataset = Datasource().loadPersons()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = PersonAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)*/


    }
}