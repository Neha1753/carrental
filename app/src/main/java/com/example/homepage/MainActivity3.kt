package com.example.homepage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val intent = intent
        val name = intent.getStringExtra("name")
        val price = intent.getStringExtra("price")

        val img = findViewById<ImageView>(R.id.image)
        if(name.equals("Maruthi Wagon-R")) {
            img.setImageResource(R.drawable.ca1)
        }
        if(name.equals("Maruthi Swift(LXI)")) {
            img.setImageResource(R.drawable.ca2)
        }
        if(name.equals("Maruthi Swift(VXI)")) {
            img.setImageResource(R.drawable.ca3)
        }
        if(name.equals("Maruthi Brezza")) {
            img.setImageResource(R.drawable.ca4)
        }
        if(name.equals("Kia Carnival(SUV)")) {
            img.setImageResource(R.drawable.ca5)
        }
        if(name.equals("Toyota Fortuner(SUV)")) {
            img.setImageResource(R.drawable.ca6)
        }
        if(name.equals("Kia Seltos")) {
            img.setImageResource(R.drawable.ca7)
        }

        val text2=findViewById<TextView>(R.id.text2)
        val text3=findViewById<TextView>(R.id.text3)
        val text4=findViewById<TextView>(R.id.text4)
        val text5=findViewById<TextView>(R.id.text5)




        val button=findViewById<Button>(R.id.button2)
        button.setOnClickListener{
            val intent= Intent(this,
                MainActivity4::class.java)

            startActivity(intent)
        }
    }
}
