package com.example.s215718lykkehjul

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class Start : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_start,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val startGameButton: Button = view.findViewById(R.id.startGameButton)
        startGameButton.setOnClickListener(){
            Navigation.findNavController(requireView()).navigate(R.id.action_startFragment_to_playGameFragment)
        }
    }
}