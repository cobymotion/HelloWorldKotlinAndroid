package com.example.unidadiiej01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

        var contador:Int = 0
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // cumplir herencia
        setContentView(R.layout.activity_main)  //


        // bind
        val nameTxt = findViewById<TextView>(R.id.txtName)
        val nameBtn = findViewById<Button>(R.id.btnName)
        val countTxt = findViewById<TextView>(R.id.txtCount)

        nameTxt.setText("Luis Cobián")
        
        nameBtn.setOnClickListener{
            contador = contador.inc()
            countTxt.setText("$contador")
        }

    }
}