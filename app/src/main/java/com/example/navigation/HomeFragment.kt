package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.Navigation


class HomeFragment : Fragment() {



private lateinit var navigatetoprofile : Button
    private lateinit var sendData : EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view =  inflater.inflate(R.layout.fragment_home, container, false)

        navigatetoprofile = view.findViewById(R.id.submit)
        sendData = view.findViewById(R.id.input)


        navigatetoprofile.setOnClickListener{
val data   = sendData.text.toString()


val send = HomeFragmentDirections.actionHomeFragmentToProfileFragment(data)
            Navigation.findNavController(view).navigate(send)

        }

        return view
    }

}