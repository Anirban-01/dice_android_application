package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // creating variable for button
        val roll_button = findViewById<Button>(R.id.button)
        roll_button.setOnClickListener {
            Toast.makeText(this, "DICE ROLLED", Toast.LENGTH_SHORT).show()
            dice_roll()
        }
    }
//----------------------------------------------------------------
    // dice_roll method created
    fun dice_roll() {
        //creating object for class my_dice
        val dice = my_dice(6)
        //creating object for calling the roll method
        val rolldice = dice.roll()
        val myimageview = findViewById<ImageView>(R.id.imageView)
        val mytextview = findViewById<TextView>(R.id.textView)

    if (rolldice == 1){
        myimageview.setImageResource(R.drawable.dice_1)
        mytextview.text = "YOU ROLLED A UNLUCKY NUMBER !!!"
    }
    else if (rolldice == 2){
        myimageview.setImageResource(R.drawable.dice_2)
        mytextview.text = " YOU ROLLED A LUCKY NUMBER !!!"
    }
    else if (rolldice == 3){
        myimageview.setImageResource(R.drawable.dice_3)
        mytextview.text = "YOU ROLLED A UNLUCKY NUMBER !!!"
    }
    else if (rolldice == 4){
        myimageview.setImageResource(R.drawable.dice_4)
        mytextview.text = " YOU ROLLED A LUCKY NUMBER !!!"
    }
    else if (rolldice == 5){
        myimageview.setImageResource(R.drawable.dice_5)
        mytextview.text = "YOU ROLLED A UNLUCKY NUMBER !!!"
    }
    else if (rolldice == 6){
        myimageview.setImageResource(R.drawable.dice_6)
        mytextview.text = " YOU ROLLED A LUCKY NUMBER !!!"
    }
    }
//-----------------------------------------------------------------
        // creating class for Dice
        class my_dice(val dice_side: Int) {
            // creating function for rolling the dice
            fun roll(): Int {
                //assigning variable for dice range
                val dice_range = 1..6
                //return the dice range
                return (dice_range.random())
            }
        }
    }