package com.example.museum

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.*

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        // store user input
        val btn_l = findViewById<Button>(R.id.btn_l)
        val un = findViewById<EditText>(R.id.un)
        val pw = findViewById<EditText>(R.id.pw)

            // logic for input validation
            btn_l.setOnClickListener {

                val cf_un = un.text.toString()
                val cf_pw = pw.text.toString()

                if (cf_un == "" || cf_pw == "") {
                    Toast.makeText(this, "Please fill the fields!", Toast.LENGTH_SHORT) .show()
                } else {
                    Toast.makeText(this, "Logging in!", Toast.LENGTH_SHORT) .show()
                    // to use username for main page
                    val store_un = activity?.getSharedPreferences(
                        getString(un), Context.MODE_PRIVATE)
                    // redirect to main page
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
            }
    }
}