package com.example.czystezbki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import java.util.concurrent.TimeUnit

class Mycie2 : AppCompatActivity() {
    private var timer: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mycie2)

        timer=findViewById(R.id.timer2)

        var duration = TimeUnit.SECONDS.toMillis(10)
        object: CountDownTimer(duration, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                var minuty = TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished)
                var sekundy = TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished)- TimeUnit.MINUTES.toSeconds(minuty)
                if(sekundy>=10){
                    timer?.setText("$minuty : $sekundy")
                }
                else timer?.setText("$minuty : 0$sekundy")


            }

            override fun onFinish() {
                aktywuj_Mycie3()
                finish()
            }
        }.start()
    }
    private fun aktywuj_Mycie3() {
        val intent= Intent(this,Mycie3::class.java)
        startActivity(intent)
    }
}