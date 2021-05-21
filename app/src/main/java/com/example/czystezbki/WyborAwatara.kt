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

class WyborAwatara : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wybor_awatara)

        awatar1=findViewById(R.id.awatar1button)
        awatar2=findViewById(R.id.awatarbutton2)
        awatar3=findViewById(R.id.awatarbutton3)
        awatar4=findViewById(R.id.awatarbutton4)

        awatar1?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?){
                akt_WyborOpcji()
            }
        })
        awatar2?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?){
                akt_WyborOpcji()
            }
        })
        awatar3?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?){
                akt_WyborOpcji()
            }
        })
        awatar4?.setOnClickListener(object : View.OnClickListener{
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