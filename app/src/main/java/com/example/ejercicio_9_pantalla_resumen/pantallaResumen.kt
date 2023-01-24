package com.example.ejercicio_9_pantalla_resumen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio_9_pantalla_resumen.databinding.ActivityPantallaResumenBinding

class pantallaResumen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPantallaResumenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var randomFuerza=(10..15).random()
        var randomDefensa=(1..5).random()
        var tamMochila=100
        var vida=200
        var monedero=0



        binding.fuerza.setText(randomFuerza.toString())
        binding.defensa.setText(randomDefensa.toString())
        binding.mochila.setText(tamMochila.toString())
        binding.vida.setText(vida.toString())
        binding.monedero.setText(monedero.toString())


        binding.botonComenzar.setOnClickListener {
            val intent= Intent(this, comienzaAventura::class.java)
            startActivity(intent)
        }
        binding.botonInicio.setOnClickListener{
            val intent2= Intent(this, MainActivity::class.java)
            startActivity(intent2)
        }
    }
}