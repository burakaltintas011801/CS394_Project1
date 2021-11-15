package com.example.cs394_project1.data

import com.example.cs394_project1.R
import com.example.cs394_project1.model.Person


class Datasource {


    fun loadPersons():List<Person>
    {
        return listOf<Person>(
            Person(R.string.person1),
            Person(R.string.person2),
            Person(R.string.person3),
            Person(R.string.person4),
            Person(R.string.person5),
            Person(R.string.person6)
        )
    }

}