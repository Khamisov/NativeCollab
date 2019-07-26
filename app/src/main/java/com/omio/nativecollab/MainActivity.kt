package com.omio.nativecollab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.omio.ideathon.TicketType

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this , TicketType.MOBILE.getDisclaimerKey() , Toast.LENGTH_SHORT).show()
    }
}
