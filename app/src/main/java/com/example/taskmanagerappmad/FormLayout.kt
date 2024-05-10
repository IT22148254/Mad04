package com.example.taskmanagerappmad
import android.app.TimePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*

class FormLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_layout)

        val titleInput = findViewById<EditText>(R.id.titleInput)
        val descriptionInput = findViewById<EditText>(R.id.descriptionInput)
        val dateInput = findViewById<DatePicker>(R.id.dateInp)
        val timeInput = findViewById<EditText>(R.id.timeInput)
        val saveButton = findViewById<Button>(R.id.saveButton)

        timeInput.setOnClickListener {
            // Show time picker when the time input field is clicked
            val calendar = Calendar.getInstance()
            val hour = calendar.get(Calendar.HOUR_OF_DAY)
            val minute = calendar.get(Calendar.MINUTE)

            val timePickerDialog = TimePickerDialog(
                this,
                { _, selectedHour, selectedMinute ->
                    // Handle time selection
                    val time = String.format("%02d:%02d", selectedHour, selectedMinute)
                    timeInput.setText(time)
                },
                hour,
                minute,
                true
            )

            timePickerDialog.show()
        }

        saveButton.setOnClickListener {

            }

        }

}