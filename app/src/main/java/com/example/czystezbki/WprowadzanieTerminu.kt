package com.example.czystezbki

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.text.SimpleDateFormat
import java.util.*

private var zapisz: Button? = null
private var powrót: Button? = null


class WprowadzanieTerminu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wprowadzanie_terminu)


        val data: TextView = findViewById(R.id.wybranadata)
        val kalendarz=Calendar.getInstance()
        val wybierz:Button = findViewById(R.id.ButtonWybierzDate)

        wybierz.setOnClickListener{
            val dpd=DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                kalendarz.set(Calendar.YEAR,year)
                kalendarz.set(Calendar.MONTH,month)
                kalendarz.set(Calendar.DAY_OF_MONTH,dayOfMonth)
                data.text = SimpleDateFormat("dd-MM-yyy").format(kalendarz.time)
            }
            DatePickerDialog(this, dpd, kalendarz.get(Calendar.YEAR), kalendarz.get(Calendar.MONTH), kalendarz.get(Calendar.DAY_OF_MONTH)).show()
        }


        zapisz=findViewById(R.id.ButtonZapiszDziecko)
        powrót=findViewById(R.id.buttonpowrot)

        zapisz?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?){

                BazaDzieci.noweDziecko.termin=data.text.toString()
                BazaDzieci.wszystkieDzieci.add(BazaDzieci.noweDziecko)
                BazaDzieci.noweDziecko = Dziecko("","","","")
                aktywuj_KontoRodzica()
            }
        })
        powrót?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                aktywuj_Powrot()
            }
        })

    }
    private fun aktywuj_KontoRodzica(){
        val intent= Intent(this,KontoRodzica::class.java)
        startActivity(intent)
    }
    private fun aktywuj_Powrot(){
        val intent= Intent(this,WyborAwatara::class.java)
        startActivity(intent)
    }





}