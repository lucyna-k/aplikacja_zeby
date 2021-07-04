package com.example.czystezbki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

private var sprsaldo: Button?=null

class KoniecMycia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_koniec_mycia)

        sprsaldo=findViewById(R.id.btnSaldo)

        sprsaldo?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?){
                akt_SprawdzSaldo()
            }
        })

        val wroc : Button =findViewById(R.id.btnPodsumowanie)
        wroc.setOnClickListener {aktywuj_WyborOpcji()}

    }
    private fun akt_SprawdzSaldo(){
        val intent= Intent(this,SaldoPunktow::class.java)
        startActivity(intent)

    }

    private fun aktywuj_WyborOpcji(){
        val intent= Intent(this,WyborOpcji::class.java)
        startActivity(intent)
    }



    }
