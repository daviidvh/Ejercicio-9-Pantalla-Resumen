package com.example.ejercicio_9_pantalla_resumen

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio_9_pantalla_resumen.databinding.ActivityMainBinding
import com.example.ejercicio_9_pantalla_resumen.databinding.ActivityPantallaRazasBinding

class pantallaRazas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPantallaRazasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var imagenRaza=""

        binding.botonAceptar.isEnabled=false
        binding.botonElfo.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.elfo)
            binding.botonAceptar.isEnabled=true
            imagenRaza="elfo"
        }

        binding.botonGoblin.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.goblin)
            binding.botonAceptar.isEnabled=true
            imagenRaza="goblin"
        }
        binding.botonEnano.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.enano)
            binding.botonAceptar.isEnabled=true
            imagenRaza="enano"
        }
        binding.botonHumano.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.humamo)
            binding.botonAceptar.isEnabled=true
            imagenRaza="humano"
        }
        binding.botonAceptar.setOnClickListener {
            val intent= Intent(this, pantallaResumen::class.java)
            intent.putExtra("ImagenRaza",imagenRaza)
            startActivity(intent)
        }
    }
}