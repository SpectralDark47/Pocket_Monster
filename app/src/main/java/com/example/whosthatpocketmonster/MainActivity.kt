package com.example.whosthatpocketmonster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun submitOnClick(view: View){
        val button = findViewById<Button>(R.id.submit_btn)
        val image = findViewById<ImageView>(R.id.imageView)
        image.setImageResource(R.drawable.alakazam_silh)
        if (button.getText() == "Submit"){
            button.setText("Next")
        } else if (button.getText() == "Next"){
            button.setText("Submit")
        }

    }

}