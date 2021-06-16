package com.example.czystezbki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

private var powrot: Button?=null

class TerminWizyty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_termin_wizyty)

        val termin: TextView = findViewById(R.id.editTextDate)
        if(BazaDzieci.wybraneDziecko()!=null)
        termin.text = BazaDzieci.wybraneDziecko().termin
        else
            termin.text="Nie wybrano terminu, przejdź do konta rodzica"

        powrot=findViewById(R.id.btnBack)
        powrot?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?){
                akt_WyborOpcji()
            }
        })

    }
    private fun akt_WyborOpcji(){
        val intent= Intent(this,WyborOpcji::class.java)
        startActivity(intent)

    }
}