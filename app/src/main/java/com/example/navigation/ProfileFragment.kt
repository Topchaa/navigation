package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs


class ProfileFragment : Fragment() {

private lateinit var user: TextView
val args : ProfileFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {




      val view =  inflater.inflate(R.layout.fragment_profile, container, false)

val username  = args.username
        user = view.findViewById(R.id.usertext)
        user.text =username


        return view



    }


}