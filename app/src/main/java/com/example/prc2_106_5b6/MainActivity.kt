package com.example.prc2_106_5b6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        displayMsg("Onstart Method call ")
    }

    override fun onResume() {
        super.onResume()
        displayMsg("OnResume method is call")
    }

    override fun onPause() {
        super.onPause()
        displayMsg("OnPause method is call")
    }

    override fun onStop() {
        super.onStop()
        displayMsg("OnStop method is call")
    }

    override fun onDestroy() {
        super.onDestroy()
        displayMsg("OnDestroy method is call")
    }
    fun displayMsg(msg:String){
        Toast.makeText(this, "$msg", Toast.LENGTH_SHORT).show()
    }
}