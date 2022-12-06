package com.sna.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.sna.fragment.databinding.FirstfragmentBinding

class Firstfragment : Fragment() {

    lateinit var binding: FirstfragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FirstfragmentBinding.inflate(inflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

         binding.button.setOnClickListener {
             Navigation.findNavController(binding.root).navigate(R.id.action_firstfragment_to_secondfragment)
         }

    }




    }