package com.tanya

import android.annotation.SuppressLint
import android.graphics.Color.green
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.lang.Math.random

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor", "PrivateResource")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Specify which layout file to display
        setContentView(R.layout.activity_main)


        //add functionality to allow user to change text color in button click
        //add reference to the button
        findViewById<Button> (R.id.buttonTextColor).setOnClickListener {
            Log.i("Tanya", "Tapped on button")
            findViewById<TextView>(R.id.textView).setTextColor(R.color.teal_200)
        }
        //change background color
        findViewById<Button>(R.id.buttonBackgroundColor).setOnClickListener {
            //generate random number every time button is clicked to get different color
            val randomNumber = (0..6).random()
            if (randomNumber == 0 ){
                findViewById<View>(R.id.backGroundView).setBackgroundResource(com.google.android.material.R.color.material_blue_grey_950)

            }else if (randomNumber == 1) {
                findViewById<View>(R.id.backGroundView).setBackgroundResource(R.color.purple_700)
            }else if (randomNumber == 2) {
                findViewById<View>(R.id.backGroundView).setBackgroundResource(R.color.red)
            }else if (randomNumber == 3 ){
                findViewById<View>(R.id.backGroundView).setBackgroundResource(R.color.yellow)
            }else if (randomNumber == 4 ){
                findViewById<View>(R.id.backGroundView).setBackgroundResource(R.color.teal_700)
            }else {
                findViewById<View>(R.id.backGroundView).setBackgroundResource(R.color.blue)
            }

        }
        //change textview text
        findViewById<Button>(R.id.buttonTextString).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = findViewById<EditText>(R.id.editText).text
        }
    }
}