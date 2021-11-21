package com.example.cs394_project1.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cs394_project1.R
import com.example.cs394_project1.activity.MainActivity
import com.example.cs394_project1.adapter.PersonAdapter
import com.example.cs394_project1.data.Datasource
import com.example.cs394_project1.databinding.FragmentMatchBinding
import com.example.cs394_project1.databinding.FragmentProfileBinding
import com.example.cs394_project1.model.Person

class MatchFragment : Fragment() {
    private lateinit var binding: FragmentMatchBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?



    ): View? {
        binding = FragmentMatchBinding.inflate(inflater, container, false)
        val person_list: ArrayList<Person> = Datasource().loadPersons()
        binding.recyvlerView.layoutManager = LinearLayoutManager(context)
        val personAdapter = PersonAdapter(person_list)
        binding.recyvlerView.adapter = personAdapter
        return binding.root
    }


}