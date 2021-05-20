package com.example.czystezbki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var dalej: Button? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dalej=findViewById(R.id.ButtonNextView)

        dalej?.setOnClickListener(object : View.OnClickListener{
                override fun onClick(v: View?){
                    akt_WprDanych()
                }
        })

    }
    private fun akt_WprDanych(){
        val intent= Intent(this,WprowadzanieDanych::class.java)
        startActivity(intent)

    }


}