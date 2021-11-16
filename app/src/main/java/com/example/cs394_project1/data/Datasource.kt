package com.example.cs394_project1.data

import com.example.cs394_project1.R
import com.example.cs394_project1.model.Person


class Datasource {

    private lateinit var personList: ArrayList<Person>


    fun loadPersons():ArrayList<Person>
    {
        personList = ArrayList<Person>()


        val nurettin =Person("Nurettin Burak Altıntaş","Ozyegin University",R.drawable.nurettin)
        val kaan =Person("Kaan Kara","Ozyegin University",R.drawable.kaan)
        val doga =Person("Doga Yılmaz","Ozyegin University",R.drawable.doga)
        val sait =Person("Sait Can Ozcan","Ozyegin University",R.drawable.sait)
        val goksel =Person("Goksel Can Onal","Ozyegin University",R.drawable.goksel)
        val ayberk =Person("Ayberk Akbalik","Ozyegin University",R.drawable.ayberk)

        personList.add(nurettin)
        personList.add(kaan)
        personList.add(doga)
        personList.add(sait)
        personList.add(goksel)
        personList.add(ayberk)

        return personList


    }

}