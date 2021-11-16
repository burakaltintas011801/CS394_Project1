package com.example.cs394_project1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cs394_project1.databinding.ActivityDetailsBinding
import com.example.cs394_project1.model.Person

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding :ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        //casting
        val selectedPerson = intent.getSerializableExtra("Person") as Person
        binding.nameText.text = selectedPerson.name
        binding.universityText.text = selectedPerson.university
        binding.imageView.setImageResource(selectedPerson.image)

    }
}