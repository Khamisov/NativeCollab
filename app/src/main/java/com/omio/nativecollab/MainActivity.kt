package com.omio.nativecollab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.omio.ideathon.SharedClass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SharedClass.greetings()
    }
}
