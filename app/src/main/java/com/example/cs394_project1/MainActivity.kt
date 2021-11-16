package com.example.cs394_project1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cs394_project1.adapter.PersonAdapter
import com.example.cs394_project1.data.Datasource
import com.example.cs394_project1.databinding.ActivityMainBinding
import com.example.cs394_project1.model.Person

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //person list
        val person_list: ArrayList<Person> = Datasource().loadPersons()

        binding.recyvlerView.layoutManager = LinearLayoutManager(this)
        val personAdapter = PersonAdapter(person_list)
        binding.recyvlerView.adapter = personAdapter





    }
}