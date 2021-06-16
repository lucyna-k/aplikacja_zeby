package com.example.czystezbki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

private var start: Button?=null
private var powrót: Button?=null

class ZaczynamyMycie : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zaczynamy_mycie)


        start = findViewById(R.id.btnStart)
        powrót=findViewById(R.id.buttonpowrot)

        start?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                akt_Mycie1()
            }
        })
        powrót?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                aktywuj_Wroc()
            }
        })

    }

    private fun akt_Mycie1() {
        val intent = Intent(this, Mycie1::class.java)
        startActivity(intent)

    }
    private fun aktywuj_Wroc() {
        val intent = Intent(this, WyborOpcji::class.java)
        startActivity(intent)

    }
}