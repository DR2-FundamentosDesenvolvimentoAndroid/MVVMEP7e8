package com.example.ep7ld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.ep7ld.ViewModel.UsuarioViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var usuarioViewModel = ViewModelProviders.of(this)
                                    .get(UsuarioViewModel::class.java)

    }
}
