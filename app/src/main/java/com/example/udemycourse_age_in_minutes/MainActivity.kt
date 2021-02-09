package com.example.udemycourse_age_in_minutes

import android.app.DatePickerDialog
import android.icu.text.SimpleDateFormat
import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDatePicker.setOnClickListener { view ->
            clickDatePicker(view)
        }
    }

    private fun clickDatePicker(view: View) {
        val myCalendar = Calendar.getInstance()

        // these instances are going to be arguments, not in curly braise's ones.
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)

        DatePickerDialog(this,
                DatePickerDialog.OnDateSetListener { view, selectedYear, selectedMonth, selectedDayOfMonth ->
                    //after this arrow, code will be executed if all arguments set.
                    //view, year, month, dayOfMonth in here are results which are selected already in app.
                    //Be careful, month starts from 0 by some reason.
                    Toast.makeText(this, "Chosen date is $selectedYear - ${selectedMonth + 1} - $selectedDayOfMonth",
                            Toast.LENGTH_LONG).show()

                    val selectedDate = "$selectedYear-${selectedMonth + 1}-$selectedDayOfMonth"
                    tvSelectedDate.setText(selectedDate)

                    val sdf = SimpleDateFormat("yyyy-MM-dd", Locale.JAPAN)
                    val theDate = sdf.parse(selectedDate)
                },
                year,
                month,
                day).show()
    }
}