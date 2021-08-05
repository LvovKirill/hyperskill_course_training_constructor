package com.example.workoutexerciseonstruction

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.workouttrainingonstruction.Exercise
import com.example.workouttrainingonstruction.R


class ExerciseRecyclerAdapter(private val names: List<Exercise>) :
    RecyclerView.Adapter<ExerciseRecyclerAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var exerciseNameTextView: TextView? = null

        init {
            exerciseNameTextView = itemView.findViewById(R.id.exerciseName)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.exercise_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.exerciseNameTextView?.text = names[position].nameExercise
    }

    override fun getItemCount() = names.size
}