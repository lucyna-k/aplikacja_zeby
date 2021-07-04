package com.example.czystezbki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class WyborKonta : AppCompatActivity() {

    private var kontoRodzica: Button? = null
    private var kontoDziecka: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.wybor_konta)

        kontoRodzica=findViewById(R.id.ButtonRodzic)

        kontoRodzica?.setOnClickListener(object : View.OnClickListener{
                override fun onClick(v: View?){
                    aktywuj_KontoRodzica()
                }
        })

        kontoDziecka=findViewById(R.id.ButtonDziecko)

        kontoDziecka?.setOnClickListener { aktywuj_WyborDziecka() }


    }
    private fun aktywuj_KontoRodzica(){
        val intent= Intent(this,KontoRodzica::class.java)
        startActivity(intent)
    }

    private fun aktywuj_WyborDziecka() {
        val intent= Intent(this,WyborDziecka::class.java)
        startActivity(intent)
    }
}