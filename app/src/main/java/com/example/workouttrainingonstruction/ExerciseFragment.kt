package com.example.workoutExerciseonstruction

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.workoutexerciseonstruction.ExerciseRecyclerAdapter
import com.example.workouttrainingonstruction.Exercise
import com.example.workouttrainingonstruction.R
import com.example.workouttrainingonstruction.databinding.FragmentExerciseBinding


class ExerciseFragment : Fragment() {

    private var binding: FragmentExerciseBinding? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentExerciseBinding.bind(view)

        val recyclerView: RecyclerView = binding!!.recyclerView

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = ExerciseRecyclerAdapter(fillList())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return inflater.inflate(R.layout.fragment_exercise, container, false)
    }

    private fun fillList(): List<Exercise> {
        val data = mutableListOf<Exercise>()
        data.add(Exercise("Exercise 1"))
        data.add(Exercise("Exercise 2"))
        data.add(Exercise("Exercise 3"))
        data.add(Exercise("Exercise 4"))
        data.add(Exercise("Exercise 5"))
        data.add(Exercise("Exercise 6"))
        data.add(Exercise("Exercise 7"))
        data.add(Exercise("Exercise 8"))
        data.add(Exercise("Exercise 9"))
        data.add(Exercise("Exercise 10"))
        data.add(Exercise("Exercise 11"))
        data.add(Exercise("Exercise 12"))
        data.add(Exercise("Exercise 13"))
        data.add(Exercise("Exercise 14"))
        data.add(Exercise("Exercise 15"))
        return data
    }

}