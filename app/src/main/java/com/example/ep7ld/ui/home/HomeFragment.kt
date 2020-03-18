package com.example.ep7ld.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ep7ld.Adapter.UsuarioAdapter
import com.example.ep7ld.Model.Usuario
import com.example.ep7ld.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
//        val textView: TextView = root.findViewById(R.id.text_home)
////        homeViewModel.text.observe(this, Observer {
////            textView.text = it
////        })
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var usuarios = mutableListOf(
            Usuario("will@email.com", "11111111", "Willian", "Nascimento"),
            Usuario("rod@email.com", "22222", "Rodrigo", "Silva"),
            Usuario("mar@email.com", "33333", "Marcela", "Oliveira"),
            Usuario("thi@email.com", "44444", "Thiago", "Maia"),
            Usuario("ger@email.com", "555555", "Geraldo", "Esteves"),
            Usuario("helt@email.com", "666666", "Helton", "Tuh")
            )

        var usuarioAdapter = UsuarioAdapter(usuarios, this::callbackItem)
        recycleVwHome.adapter = usuarioAdapter
        recycleVwHome.layoutManager = LinearLayoutManager(context)
    }

    fun callbackItem(usuario: Usuario){
        Toast.makeText(context, usuario.email, Toast.LENGTH_LONG).show()

    }

}