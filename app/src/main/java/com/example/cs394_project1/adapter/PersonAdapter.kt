package com.example.cs394_project1.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cs394_project1.activity.DetailsActivity
import com.example.cs394_project1.databinding.RecyclerRowBinding
import com.example.cs394_project1.model.Person

class PersonAdapter(val personList: ArrayList<Person>): RecyclerView.Adapter<PersonAdapter.PersonHolder>() {

    class PersonHolder(val binding:RecyclerRowBinding):RecyclerView.ViewHolder(binding.root)
    {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PersonHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonHolder, position: Int) {
        holder.binding.recyclerViewTextView.text =personList.get(position).name
        holder.binding.crushPicture.setImageResource(personList.get(position).image)


        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailsActivity::class.java)
            intent.putExtra("Person",personList.get(position))
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return personList.size
    }


}