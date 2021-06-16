package com.example.czystezbki

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import android.widget.Toast
import java.util.concurrent.TimeUnit

class Mycie6 : AppCompatActivity() {
    var player: MediaPlayer? = null
    private var timer: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mycie6)
        timer=findViewById(R.id.timer6)

        play()

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
                aktywuj_koniec_mycia()
            }
        }.start()
    }
    private fun aktywuj_koniec_mycia() {
        val intent= Intent(this,KoniecMycia::class.java)
        startActivity(intent)
    }
    fun play() {
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.mycie6)
            player?.setOnCompletionListener(MediaPlayer.OnCompletionListener { stopPlayer() })
        }
        player?.start()
    }
    private fun stopPlayer() {
        if (player != null) {
            player!!.release()
            player = null
           // Toast.makeText(this, "MediaPlayer released", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onStop() {
        super.onStop()
        stopPlayer()
    }
}