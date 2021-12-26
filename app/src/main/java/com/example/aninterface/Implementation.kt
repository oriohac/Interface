package com.example.aninterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Implementation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implementation)
    }
}