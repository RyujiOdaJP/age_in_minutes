package com.example.udemycourse_age_in_minutes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDatePicker.setOnClickListener {view ->
            clickDatePicker(view)
            Toast.makeText(this, "Button works", Toast.LENGTH_LONG).show()
        }
    }

    fun clickDatePicker(view: View) {

    }
}