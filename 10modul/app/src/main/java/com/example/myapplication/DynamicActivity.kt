package com.example.myapplication

import android.app.ActionBar
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_dynamic.*
import kotlinx.android.synthetic.main.item_text.view.*
import kotlin.random.Random

class DynamicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic)

        addButton.setOnClickListener {
            val textToAdd = textInput.text.toString()
            val view = layoutInflater.inflate(R.layout.item_text, container, false)
            view.apply {
                textView.text = textToAdd
                deleteButton.setOnClickListener{
                    container.removeView(this)
                }
            }

            container.addView(view)

           /* val textViewToAdd = TextView(this).apply {
                text = textToAdd
                layoutParams = LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                ).apply {
                    gravity = when (Random.nextInt(3)) {
                        0 -> Gravity.CENTER
                        1 -> Gravity.END
                        else -> Gravity.START
                    }
                }
            }

            container.addView(textViewToAdd)*/
        }
    }
}