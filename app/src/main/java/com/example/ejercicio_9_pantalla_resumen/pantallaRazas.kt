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

        binding.botonElfo.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.elfo)
        }
        binding.botonGoblin.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.goblin)
        }
        binding.botonEnano.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.enano)
        }
        binding.botonHumano.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.humamo)
        }
        binding.botonAceptar.setOnClickListener {
            val intent= Intent(this, pantallaResumen::class.java)
            startActivity(intent)
        }
    }
}