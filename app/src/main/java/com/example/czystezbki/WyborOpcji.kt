package com.example.czystezbki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

private var termin: Button?=null
private var mycie: Button?=null
private var powrót: Button?=null


class WyborOpcji : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wybor_opcji)

        termin=findViewById(R.id.btntermin)
        mycie=findViewById(R.id.btnMycie)
        powrót = findViewById(R.id.buttonpowrot)

        termin?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?){
                akt_SprTermin()
            }
        })

        mycie?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?){
                akt_Mycie()
            }
        })
        powrót?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                aktywuj_Powrot()
            }
        })

    }
    private fun akt_SprTermin(){
        val intent= Intent(this,TerminWizyty::class.java)
        startActivity(intent)

    }
    private fun akt_Mycie(){
        val intent= Intent(this,ZaczynamyMycie::class.java)
        startActivity(intent)

    }
    private fun aktywuj_Powrot(){
        val intent= Intent(this,WyborKonta::class.java)
        startActivity(intent)
    }


    }
