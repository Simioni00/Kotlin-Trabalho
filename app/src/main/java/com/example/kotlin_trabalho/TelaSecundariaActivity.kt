package com.example.kotlin_trabalho

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_trabalho.Adapter.AdapterProduto
import com.example.kotlin_trabalho.model.Produto

class TelaSecundariaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_secundaria)
    }
    /*
       val recyclerView_produtos = findViewById<RecyclerView>(R.id.recyclerView_produtos)
       val listaProdutos: MutableList<Produto> = mutableListOf()
       val adapterProduto = AdapterProduto(this, listaProdutos)

          Essa parte do código que está dando problema. No notion tem a marcação do vídeo usado como base e o tempo onde deu o problema.
          */

    fun onClickPaginaPagamento(view: View) {
        val intent = Intent(this, PagamentoActivity::class.java)
        startActivity(intent)
    }
}