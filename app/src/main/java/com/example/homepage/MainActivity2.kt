package com.example.homepage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
     val car1=findViewById<ImageButton>(R.id.car1)
        val car2=findViewById<ImageButton>(R.id.car2)
        val car3=findViewById<ImageButton>(R.id.car3)
        val car4=findViewById<ImageButton>(R.id.car4)
        val car5=findViewById<ImageButton>(R.id.car5)
        val car6=findViewById<ImageButton>(R.id.car6)
        val car7=findViewById<ImageButton>(R.id.car7)

        car1.setOnClickListener{
            val intent1= Intent(this,
                MainActivity3::class.java)
            intent1.putExtra("name","Maruthi Wagon-R")
            intent1.putExtra("price","1990")
            intent1.putExtra("info","5-seater,automatic,petrol")
            startActivity(intent1)
        }
        car2.setOnClickListener{
            val intent2= Intent(this,
                MainActivity3::class.java)
            intent2.putExtra("name","Maruthi Swift(LXI)")
            intent2.putExtra("price","1300")
            startActivity(intent2)
        }
        car3.setOnClickListener{
            val intent3= Intent(this,
                MainActivity3::class.java)
            intent3.putExtra("name","Maruthi Swift(VXI)")
            intent3.putExtra("price","1350")
            startActivity(intent3)
        }
        car4.setOnClickListener{
            val intent4= Intent(this,
                MainActivity3::class.java)
            intent4.putExtra("name","Maruthi Brezza")
            intent4.putExtra("price","1950")
            startActivity(intent4)
        }
        car5.setOnClickListener{
            val intent5= Intent(this,
                MainActivity3::class.java)
            intent5.putExtra("name","Kia carnival(SUV)")
            intent5.putExtra("price","2700")
            startActivity(intent5)
        }
        car6.setOnClickListener{
            val intent6= Intent(this,
                MainActivity3::class.java)
            intent6.putExtra("name","Toyota Fortuner(SUV)")
            intent6.putExtra("price","2750")
            startActivity(intent6)
        }
        car7.setOnClickListener{
            val intent7= Intent(this,
                MainActivity3::class.java)
            intent7.putExtra("name","Kia Seltos")
            intent7.putExtra("price","2350")
            startActivity(intent7)
        }



    }
}