package com.example.ejercicio_9_pantalla_resumen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio_9_pantalla_resumen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonMago.setOnClickListener {
            binding.foto.setImageResource(R.drawable.mago)
        }
        binding.botonLadron.setOnClickListener {
            binding.foto.setImageResource(R.drawable.ladron)
        }
        binding.botonGuerrero.setOnClickListener {
            binding.foto.setImageResource(R.drawable.guerrero)
        }
        binding.botonMercader.setOnClickListener {
            binding.foto.setImageResource(R.drawable.mercader)
        }

        binding.botonAceptar.setOnClickListener {
            val intent= Intent(this, pantallaRazas::class.java)
            startActivity(intent)
        }
    }
}