package com.example.czystezbki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

private var wroc: Button?=null

class SaldoPunktow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saldo_punktow)

        wroc=findViewById(R.id.btnWstecz)

        val punkty: TextView = findViewById(R.id.txtIloscPunktow)
        punkty.text = BazaDzieci.wybraneDziecko().punkty.toString()

        wroc?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?){
                akt_KoniecMycia()
            }
        })

    }
    private fun akt_KoniecMycia(){
        val intent= Intent(this,KoniecMycia::class.java)
        startActivity(intent)

    }


}

