package com.example.czystezbki

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class Ranking : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ranking)

        val rankingDzieci = findViewById<ListView>(R.id.RankingDzieci)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, BazaDzieci.ranking())

        rankingDzieci.adapter = adapter


        val back = findViewById<Button>(R.id.buttonpowrot)

        back.setOnClickListener { aktywuj_Wroc()}


    }

    private fun aktywuj_Wroc() {

        val intent = Intent(this, KontoRodzica::class.java)
        startActivity(intent)
    }
}