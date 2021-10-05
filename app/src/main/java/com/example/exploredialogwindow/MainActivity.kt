package com.example.exploredialogwindow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // button for opening the dialog window
        button.setOnClickListener { v ->
            val alertBox = myDialog()

            alertBox.show(supportFragmentManager, "123")
        }
    }
}