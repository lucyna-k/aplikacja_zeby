package com.example.czystezbki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

private var dalej: Button? = null

class WprowadzanieDanych : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wprowadzanie_danych)

        dalej=findViewById(R.id.ButtonOK)

        dalej?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?){
                akt_WyborAwatara()
            }
        })

    }
    private fun akt_WyborAwatara(){
        val intent= Intent(this,WyborAwatara::class.java)
        startActivity(intent)

    }




}