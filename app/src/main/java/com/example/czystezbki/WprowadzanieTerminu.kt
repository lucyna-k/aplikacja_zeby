package com.example.czystezbki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView

private var zapisz: Button? = null

class WprowadzanieTerminu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wprowadzanie_terminu)

        val termin: TextView = findViewById(R.id.wprowadz_termin)

        zapisz=findViewById(R.id.ButtonZapiszDziecko)

        zapisz?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?){

                BazaDzieci.noweDziecko.termin=termin.text.toString()
                BazaDzieci.wszystkieDzieci.add(BazaDzieci.noweDziecko)
                BazaDzieci.noweDziecko = Dziecko("","","","")
                aktywuj_KontoRodzica()
            }
        })

    }
    private fun aktywuj_KontoRodzica(){
        val intent= Intent(this,KontoRodzica::class.java)
        startActivity(intent)

    }




}