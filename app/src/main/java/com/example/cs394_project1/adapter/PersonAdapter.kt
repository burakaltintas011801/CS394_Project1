package com.example.cs394_project1.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cs394_project1.R
import com.example.cs394_project1.model.Person

class PersonAdapter(private val context: Context, private val dataset: List<Person>):RecyclerView.Adapter<PersonAdapter.ItemViewHolder>() {



    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.person_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_person, parent, false)
        return ItemViewHolder(adapterLayout)

    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item = dataset[position]
        holder.textView.text =  context.resources.getString(item.stringResourceId)

    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}