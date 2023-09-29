package com.example.kotlin_trabalho

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TelaInicialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicialmain)
    }

    fun onClickProximaPagina(view: View) {
        val intent = Intent(this, TelaSecundariaActivity::class.java)
        startActivity(intent)
    }

}
