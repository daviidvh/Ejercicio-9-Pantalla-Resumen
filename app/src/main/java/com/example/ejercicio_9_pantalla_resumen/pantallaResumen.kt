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
        var imagenClase= intent.getStringExtra("ImagenClase")
        var imagenRaza= intent.getStringExtra("ImagenRaza")

        if(imagenClase=="mago"){
            binding.imagenClase.setImageResource(R.drawable.mago)
        }else if (imagenClase=="ladron"){
            binding.imagenClase.setImageResource(R.drawable.ladron)
        }else if (imagenClase=="guerrero"){
            binding.imagenClase.setImageResource(R.drawable.guerrero)
        }else if (imagenClase=="mercader"){
            binding.imagenClase.setImageResource(R.drawable.mercader)
        }

        if (imagenRaza=="elfo"){
            binding.imagenRaza.setImageResource(R.drawable.elfo)
        }else if (imagenRaza=="goblin"){
            binding.imagenRaza.setImageResource(R.drawable.goblin)
        }else  if (imagenRaza=="enano") {
            binding.imagenRaza.setImageResource(R.drawable.enano)
        }else  if (imagenRaza=="humano") {
            binding.imagenRaza.setImageResource(R.drawable.humano)
        }

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