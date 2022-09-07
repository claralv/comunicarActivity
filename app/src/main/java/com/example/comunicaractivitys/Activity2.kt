package com.example.comunicaractivitys

import android.annotation.SuppressLint
import android.app.Activity.RESULT_OK
import android.app.appsearch.AppSearchResult.RESULT_OK
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.comunicaractivitys.databinding.Activity2Binding
import com.example.comunicaractivitys.databinding.ActivityMainBinding

class Activity2 : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val extras = intent.extras
        val s = extras?.getString("dato")?:"sin nombre"
        binding.saludo.text  ="Bienvenid@, $s, ¿acepta los términos?"


        binding.button2.setOnClickListener {
            var intent= Intent(this,MainActivity::class.java)
            intent.putExtra("dato","Ha aceptado los términos")
            startActivity(intent)
            finish()
        }
    }

}