package com.example.ep7ld.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ep7ld.Model.Usuario
import com.example.ep7ld.R
import kotlinx.android.synthetic.main.usuario_recycleview_layout.view.*

class UsuarioAdapter(
    val usuarios : List<Usuario>,
    val callback: (Usuario) -> Unit)
    : RecyclerView.Adapter<UsuarioAdapter.UsuarioViewHolder>() {
    class UsuarioViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtVwNome = view.txtVwNome
        val txtVwSobrenome = view.txtVwSobrenome
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsuarioViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.usuario_recycleview_layout, parent,false)
        val usuarioViewHolder = UsuarioViewHolder(view)

        usuarioViewHolder.itemView.setOnClickListener{
            val usuario = usuarios[usuarioViewHolder.adapterPosition]
        }

        return usuarioViewHolder
    }

    override fun getItemCount(): Int = usuarios.size

    override fun onBindViewHolder(holder: UsuarioViewHolder, position: Int) {
        val usuario = usuarios[position]
        holder.txtVwNome.text = usuario.nome
        holder.txtVwSobrenome.text = usuario.sobrenome
    }
}