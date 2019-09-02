package com.example.logica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSubmit.setOnClickListener {
            checkAnswer()
        }

    }

    private fun checkAnswer() {
        val answer1 = et1.text.toString();
        val answer2 = et2.text.toString();
        val answer3 = et3.text.toString();
        val answer4 = et4.text.toString();

        if (answer1.toLowerCase().equals("t") && answer2.toLowerCase().equals("f") && answer3.toLowerCase().equals("f") && answer4.toLowerCase().equals("f")) {
            Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()

        }else{
            Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_LONG).show()

        }
    }
}
