package com.example.aninterface

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.WindowManager

//import com.example.aninterface.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        home.setOnClickListener(){
            goToSecondPage()
        }

    }
    fun goToSecondPage(){
        val intent = Intent(applicationContext,Implementation::class.java)
        startActivity(intent)
    }
}