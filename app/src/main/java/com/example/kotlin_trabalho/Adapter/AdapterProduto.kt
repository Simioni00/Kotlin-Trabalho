package com.example.kotlin_trabalho.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_trabalho.R
import com.example.kotlin_trabalho.model.Produto

class AdapterProduto(private val context: Context, private val produtos: MutableList<Produto>) : RecyclerView.Adapter<AdapterProduto.ProdutoViweHolder> (){

    inner class ProdutoViweHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto = itemView.findViewById<ImageView>(R.id.fotoProduto)
        val nome = itemView.findViewById<TextView>(R.id.nomeProduto)
        val preco = itemView.findViewById<TextView>(R.id.precoProduto)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViweHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.produtos, parent, false)
        val holder = ProdutoViweHolder(itemLista)
        return holder
    }

    override fun getItemCount(): Int  = produtos.size

    override fun onBindViewHolder(holder: ProdutoViweHolder, position: Int) {
        holder.foto.setImageResource(produtos[position].foto)
        holder.nome.text = produtos[position].nome
        holder.preco.text = produtos[position].preco
    }

}