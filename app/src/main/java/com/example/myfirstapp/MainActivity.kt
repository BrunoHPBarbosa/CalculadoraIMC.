package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val btnCalcular: Button = findViewById(R.id.btnCalcular)
        val edtpeso : EditText = findViewById(R.id.edittext_peso)
        val edtAltura : EditText = findViewById(R.id.edittext_altura)

        btnCalcular.setOnClickListener {

            val alturaStr= edtAltura.text.toString()
            val pesoStr= edtpeso.text.toString()

            if(alturaStr.isNotEmpty() && pesoStr.isNotEmpty()){
            val altura: Float= alturaStr.toFloat()
            val alturafinal: Float = altura * altura
            val peso:Float = pesoStr.toFloat()
            val result:Float = peso / alturafinal

            val intent = Intent(this,ResultActivity::class.java)
                .apply {
                    putExtra("EXTRA_RESULT",result)
                }
            startActivity(intent)
            }else{
                Toast.makeText(this,"Preencher todos os Campos!", Toast.LENGTH_LONG).show()
            }
        }

    }

    }
