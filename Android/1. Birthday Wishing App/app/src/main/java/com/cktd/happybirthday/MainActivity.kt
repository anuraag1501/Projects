package com.cktd.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthDayCard(view: View) {

        val name = nameInput.editableText.toString()
            Toast.makeText(this,"The name is $name", Toast.LENGTH_LONG).show()
    }
}