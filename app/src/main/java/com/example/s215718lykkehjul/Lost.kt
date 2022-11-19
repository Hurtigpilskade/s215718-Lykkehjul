package com.example.s215718lykkehjul

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class Lost : Fragment(){
    lateinit var goBackLoss: Button

    override fun onCreateView(
        inflater: LayoutInflater,container:ViewGroup?,savedInstanceState: Bundle?
    ): View?{
        return inflater.inflate(R.layout.fragment_lost, container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        goBackLoss=view.findViewById(R.id.goBackbutton_loss)
        goBackLoss.setOnClickListener{
            Navigation.findNavController(requireView()).navigate(R.id.action_lostFragment_to_frontFragment)
        }
    }
}