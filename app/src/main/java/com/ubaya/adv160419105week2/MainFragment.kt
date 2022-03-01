package com.ubaya.adv160419105week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_game.*
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonStart.setOnClickListener{
            var playerName = inputName.editText?.text.toString()
            val action = MainFragmentDirections.actionMainFragmentToGameFragment(playerName)
            Navigation.findNavController(it).navigate(action)
        }
        buttonOptions.setOnClickListener {
            val action = MainFragmentDirections.actionItemHomeToOptionsFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }
}