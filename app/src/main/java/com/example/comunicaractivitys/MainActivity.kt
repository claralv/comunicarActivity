package com.example.comunicaractivitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import com.example.comunicaractivitys.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var nombre:EditText?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var botonacceder = binding.acceder
        botonacceder.setOnClickListener {
            val nombre1 = binding.nombre.text.toString()
            var intent = Intent(this,Activity2::class.java)
            intent.putExtra("dato",nombre1)
            startActivity(intent)

        }

        val extras = intent.extras
        val s = extras?.getString("dato")?:"sin resultado"
        binding.resultado.text = "$s"
    }

}
