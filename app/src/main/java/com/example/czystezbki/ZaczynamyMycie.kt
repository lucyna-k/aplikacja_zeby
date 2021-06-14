package com.example.czystezbki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

private var start: Button?=null

class ZaczynamyMycie : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zaczynamy_mycie)


        start = findViewById(R.id.btnStart)

        start?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                akt_Mycie1()
            }
        })

    }

    private fun akt_Mycie1() {
        val intent = Intent(this, Mycie1::class.java)
        startActivity(intent)

    }
}