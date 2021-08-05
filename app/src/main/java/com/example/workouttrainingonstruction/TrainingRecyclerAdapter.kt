package com.example.workouttrainingonstruction

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TrainingRecyclerAdapter(private val names: List<Training>) :
    RecyclerView.Adapter<TrainingRecyclerAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var trainingNameTextView: TextView? = null

        init {
            trainingNameTextView = itemView.findViewById(R.id.trainingName)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.training_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.trainingNameTextView?.text = names[position].nameTraining
    }

    override fun getItemCount() = names.size
}