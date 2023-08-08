package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class ResultActivity  : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val tvResult = findViewById<TextView>(R.id.textview_result)
        val tvClassificacao = findViewById<TextView>(R.id.textview_classificacao)

        val result = intent.getFloatExtra("EXTRA_RESULT", 0.1f)

        tvResult.text = result.toString()

        val classificacao = if (result < 18.5f) {
             "TÁ MAGRO FILHO!!"
        } else if (result in 18.5f..24.9f) {
            "TÁ TOP,PARABÉNS!!"
        } else if (result in 25f..29.9f) {
            "TÁ GORDINHO EM MEU AMIGO!!"
        } else if (result in 30f..39.9f) {
            "CUIDADO,JÁ ESTA VIRANDO UMA BOLINHA!!"
        } else {
            "PROCURE UM MÉDICO,LASANHÃO!!"

        }
            tvClassificacao.text = classificacao

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
    }




