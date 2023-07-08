package com.example.sendingfragmenttoactivityapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class DetailsFragment : Fragment() {

    lateinit var editEmail: EditText
    lateinit var editName: EditText
    lateinit var send: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_details, container, false)

        editEmail = view.findViewById(R.id.editTextEmail)
        editName = view.findViewById(R.id.editTextName)
        send = view.findViewById(R.id.buttonSend)

        send.setOnClickListener {
            val username = editName.text.toString()
            val mail = editEmail.text.toString()

            val mainActivity: MainActivity = activity as MainActivity
            mainActivity.getUserData(username, mail)
        }

        return view
    }

}