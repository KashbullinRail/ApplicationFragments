package com.example.applicationfragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("TAG1", "onViewCreated")

        val tvHelloSpace = requireActivity().findViewById<TextView>(R.id.tvHelloSpace)
        tvHelloSpace.setOnClickListener {
            parentFragmentManager
                .beginTransaction()
                .add(android.R.id.content, SecondFragment())
                .commit()
        }


    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("TAG1", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("TAG1", "onCreate")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("TAG1", "onDestroyView")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("TAG1", "onDetach")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG1", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG1", "onStop")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG1", "onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG1", "onStart")
    }
}