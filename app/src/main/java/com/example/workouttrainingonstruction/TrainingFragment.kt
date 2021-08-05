package com.example.workouttrainingonstruction

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.workouttrainingonstruction.databinding.FragmentTrainingBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

//private lateinit var binding: FragmentTraining

class TrainingFragment : Fragment() {

    private var binding: FragmentTrainingBinding? = null
    private var tr1: Training = Training("тренеровка")


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTrainingBinding.bind(view)

        val recyclerView: RecyclerView = binding!!.recyclerView

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = TrainingRecyclerAdapter(fillList())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return inflater.inflate(R.layout.fragment_training, container, false)
    }

    private fun fillList(): List<Training> {
        val data = mutableListOf<Training>()
        data.add(Training("Training 1"))
        data.add(Training("Training 2"))
        data.add(Training("Training 3"))
        data.add(Training("Training 4"))
        data.add(Training("Training 5"))
        data.add(Training("Training 6"))
        data.add(Training("Training 7"))
        data.add(Training("Training 8"))
        data.add(Training("Training 9"))
        data.add(Training("Training 10"))
        data.add(Training("Training 11"))
        data.add(Training("Training 12"))
        data.add(Training("Training 13"))
        data.add(Training("Training 14"))
        data.add(Training("Training 15"))
        return data
    }

}