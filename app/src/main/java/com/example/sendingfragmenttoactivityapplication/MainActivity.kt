package com.example.sendingfragmenttoactivityapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    lateinit var name:TextView
    lateinit var email:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.textViewName)
        email = findViewById(R.id.textViewEmail)

        val fg: FragmentManager = supportFragmentManager
        val ft: FragmentTransaction = fg.beginTransaction()

        val detailFragment = DetailsFragment()

        ft.add(R.id.fragmentDetails, detailFragment)
        ft.commit()
    }

    fun getUserData(username: String, useremail: String) {
        name.text = username
        email.text = useremail
    }
}