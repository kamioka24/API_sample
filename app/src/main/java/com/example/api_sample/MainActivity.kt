package com.example.api_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            pushButton()
        }
    }

    private fun pushButton() {
        val view = findViewById<TextView>(R.id.view)
        val service = WeatherRepository().getRetrofit()
        val scope = CoroutineScope(Dispatchers.IO)

        scope.launch {
            try {
                val weathers = service.getApi()
                view.text = weathers.toString()
            } catch(e: Exception) {
                print("はずれ")
            }
        }
    }
}