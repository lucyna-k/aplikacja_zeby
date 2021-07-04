package com.example.czystezbki

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class WyborDziecka : AppCompatActivity()  {


    override fun onCreate(savedInstanceState: Bundle?) {


        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wybor_dziecka)

        val dzieci = findViewById<ListView>(R.id.Dzieci)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, BazaDzieci.imiona())

        dzieci.adapter = adapter
        dzieci.setOnItemClickListener() { parent, view, position, id ->
//            val element = dzieci.getItemAtPosition(position) // The item that was clicked
            BazaDzieci.wybierzDziecko(position)
            aktywuj_WyborOpcji()
        }


    }

    private fun aktywuj_WyborOpcji(){
        val intent= Intent(this,WyborOpcji::class.java)
        startActivity(intent)
    }



}