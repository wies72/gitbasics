package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        clearButton.setOnClickListener {
            nameInput.setText("")
            Toast.makeText(this, R.string.cleared_field, Toast.LENGTH_SHORT).show()
        }

        nameInput.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                textView.text = s?.takeIf { it.isNotBlank() }
                        ?.let { name -> resources.getString(R.string.hello_string, name) }

                clearButton.isEnabled = s?.let { it.isNotEmpty() } ?: false
            }

        })

        makeLongOperationButton.setOnClickListener {
            makeLongOperation()
        }
        /*textView.text = "new text"
        textView.setText(R.string.app_name)
        val text = resources.getString(R.string.text_view)*/

    }

    private fun makeLongOperation () {


        longOperationProgress.visibility = View.VISIBLE
        makeLongOperationButton.isEnabled = false

        Handler().postDelayed({
            longOperationProgress.visibility = View.GONE
            makeLongOperationButton.isEnabled = true
            Toast.makeText(this, R.string.long_operation_completed, Toast.LENGTH_SHORT).show()
        }, 2000)
    }
}