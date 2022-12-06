package com.sna.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.sna.fragment.databinding.FirstfragmentBinding
import com.sna.fragment.databinding.SecondfragmentBinding

class Secondfragment : Fragment() {

    lateinit var binding: SecondfragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        binding = SecondfragmentBinding.inflate(inflater)
        return binding.root
    }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button2.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.action_secondfragment_to_firstfragment)
        }

    }




}