package com.example.examen_multimedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textoinicial
        bUno.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }
        boton.setOnClickListener {
            val intent = Intent(this, activity_main2::class.java)
            startActivity(intent)
        }

    }


}