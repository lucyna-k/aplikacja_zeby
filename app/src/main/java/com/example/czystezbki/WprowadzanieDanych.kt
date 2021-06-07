package com.example.czystezbki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

private var dalej: Button? = null

class WprowadzanieDanych : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wprowadzanie_danych)


        val imie: EditText = findViewById(R.id.miejsceNaImie)
        val wiek: EditText = findViewById(R.id.miejsceNaWiek)
        dalej=findViewById(R.id.ButtonOK)

        dalej?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?){


                BazaDzieci.noweDziecko.imie=imie.text.toString()
                BazaDzieci.noweDziecko.wiek=wiek.text.toString()

                akt_WyborAwatara()
            }
        })

    }
    private fun akt_WyborAwatara(){
        val intent= Intent(this,WyborAwatara::class.java)
        startActivity(intent)

    }
}