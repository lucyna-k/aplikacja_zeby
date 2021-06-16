package com.example.czystezbki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

private var awatar1: Button? = null
private var awatar2: Button? = null
private var awatar3: Button? = null
private var awatar4: Button? = null
private var powrót: Button? = null

class WyborAwatara : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wybor_awatara)
        val noweDziecko = savedInstanceState?.getString("noweDziecko")
        awatar1=findViewById(R.id.awatar1button)
        awatar2=findViewById(R.id.awatarbutton2)
        awatar3=findViewById(R.id.awatarbutton3)
        awatar4=findViewById(R.id.awatarbutton4)
        powrót =findViewById(R.id.buttonpowrot)

        awatar1?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?){
                BazaDzieci.noweDziecko.avatar="1"
                aktywujWyborWizyty()
            }
        })
        awatar2?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?){
                BazaDzieci.noweDziecko.avatar="2"
                aktywujWyborWizyty()
            }
        })
        awatar3?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?){
                BazaDzieci.noweDziecko.avatar="3"
                aktywujWyborWizyty()
            }
        })
        awatar4?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?){
                BazaDzieci.noweDziecko.avatar="4"
                aktywujWyborWizyty()
            }
        })
        powrót?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                aktywuj_Wroc()
            }
        })
    }
    private fun aktywujWyborWizyty(){
        val intent= Intent(this,WprowadzanieTerminu::class.java)
        startActivity(intent)

    }
    private fun aktywuj_Wroc() {
        val intent = Intent(this, WprowadzanieDanych::class.java)
        startActivity(intent)

    }


}