package com.aniruddha.beer_adviser_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val beer_button = findViewById<Button>(R.id.button3)
        beer_button.setOnClickListener()
        {
            val beer_items = findViewById<Spinner>(R.id.spinner2)
            val color = beer_items.selectedItem.toString()
            //println("Beer color is $color")
            val beerlist = getbeers(color.toString())
            val beers = beerlist.reduce { str, item -> str + '\n' + item }
            val brands = findViewById<TextView>(R.id.textView)
            brands.text = beers

        }
    }

    fun getbeers(color: String): List<String> {
        return when (color) {
            "Red" -> listOf("1", "2", "3")
            "Green" -> listOf("4", "6", "5")
            "Brown" -> listOf("9", "8", "7")
            "Purple" -> listOf("11", "12", "13")
            else -> listOf("21", "22", "23")
        }
    }
}
