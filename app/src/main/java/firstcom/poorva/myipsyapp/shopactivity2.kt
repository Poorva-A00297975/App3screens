package firstcom.poorva.myipsyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class shopactivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopactivity2)

        val items = arrayOf("1", "2", "3", "4")
        val spinner: Spinner = findViewById(R.id.dropdown_spinner)

// Create an ArrayAdapter using a simple layout and the array of items
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, items)

// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

// Apply the adapter to the spinner
        spinner.adapter = adapter







    }
}