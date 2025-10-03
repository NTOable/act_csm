package com.example.museum

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.*
// import android.net.Uri // for parsing URLs to String >> Uri.parse("")
import androidx.core.net.toUri // alternative to Uri.parse >> "".toUri()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // store user input
        val btn_1 = findViewById<ImageButton>(R.id.btn_1) // home
        val btn_2 = findViewById<ImageButton>(R.id.btn_2) // courses
        val btn_3 = findViewById<ImageButton>(R.id.btn_3) // blog
        val btn_4 = findViewById<ImageButton>(R.id.btn_4) // enroll
        val btn_5 = findViewById<ImageButton>(R.id.btn_5) // about
            // store url
            val h_pg = "https://www.ciit.edu.ph/".toUri()
            val c_pg = "https://www.ciit.edu.ph/programs-and-courses/".toUri()
            val b_pg = "https://www.ciit.edu.ph/student-life/".toUri()
            val e_pg = "https://www.ciit.edu.ph/online-enrollment/".toUri()
            val a_pg = "https://www.ciit.edu.ph/about/".toUri()
            // listeners for when image button is pressed
            btn_1.setOnClickListener {
                val go_h_pg = Intent(Intent.ACTION_VIEW, h_pg)
                startActivity(go_h_pg)
            }
            btn_2.setOnClickListener {
                val go_c_pg = Intent(Intent.ACTION_VIEW, c_pg)
                startActivity(go_c_pg)
            }
            btn_3.setOnClickListener {
                val go_b_pg = Intent(Intent.ACTION_VIEW, b_pg)
                startActivity(go_b_pg)
            }
            btn_4.setOnClickListener {
                val go_e_pg = Intent(Intent.ACTION_VIEW, e_pg)
                startActivity(go_e_pg)
            }
            btn_5.setOnClickListener {
                val go_a_pg = Intent(Intent.ACTION_VIEW, a_pg)
                startActivity(go_a_pg)
            }
            // code to display username (optional)
//            fun display_un() {
//                val un =
//                    println("Welcome $un .")
//            }
    }
}