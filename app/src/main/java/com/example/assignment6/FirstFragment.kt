package com.example.assignment6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.assignment6.databinding.FragmentFirstBinding


class FirstFragment : Fragment(R.layout.fragment_first) {

    private lateinit var binding:FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFirstBinding.inflate(inflater,container,false)

        binding.button.setOnClickListener{
            binding.button.setOnClickListener {
                findNavController().navigate(R.id.action_firstFragment_to_navigation)
            }
        }

        return binding.root
    }

}