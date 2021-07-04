package com.example.czystezbki

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class KontoRodzica : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.konto_rodzica)

        val dodajDziecko: Button = findViewById(R.id.ButtonDodajDziecko)
        val ranking: Button = findViewById(R.id.ButtonPokazRanking)
        val wroc: Button = findViewById(R.id.Wroc)

        wroc.setOnClickListener { aktywuj_Wroc()}

        dodajDziecko.setOnClickListener { aktywuj_WprowadzanieDanych() }

        ranking.setOnClickListener { aktywuj_Ranking() }

        val listaDzieckow = findViewById<ListView>(R.id.ListaDzieci)

        val adapter =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, BazaDzieci.wszystkieDzieci)
        listaDzieckow.adapter = adapter
    }


    private fun aktywuj_WprowadzanieDanych() {
        val intent = Intent(this, WprowadzanieDanych::class.java)
        startActivity(intent)

    }

    private fun aktywuj_Wroc() {
        val intent = Intent(this, WyborKonta::class.java)
        startActivity(intent)
    }

    private fun aktywuj_Ranking() {
        val intent = Intent(this, Ranking::class.java)
        startActivity(intent)
    }

}