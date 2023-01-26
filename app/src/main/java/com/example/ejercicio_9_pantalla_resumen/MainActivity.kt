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
        var imagenClase=""
        binding.botonAceptar.isEnabled=false
        binding.botonMago.setOnClickListener {
            binding.foto.setImageResource(R.drawable.mago)
            binding.botonAceptar.isEnabled=true
            imagenClase="mago"
        }

        binding.botonLadron.setOnClickListener {
            binding.foto.setImageResource(R.drawable.ladron)
            binding.botonAceptar.isEnabled=true
            imagenClase="ladron"
        }
        binding.botonGuerrero.setOnClickListener {
            binding.foto.setImageResource(R.drawable.guerrero)
            binding.botonAceptar.isEnabled=true
            imagenClase="guerrero"
        }
        binding.botonMercader.setOnClickListener {
            binding.foto.setImageResource(R.drawable.mercader)
            binding.botonAceptar.isEnabled=true
            imagenClase="mercader"
        }

        binding.botonAceptar.setOnClickListener {
            val intent= Intent(this, pantallaRazas::class.java)
            intent.putExtra("ImagenClase",imagenClase)
            startActivity(intent)
        }
    }
}