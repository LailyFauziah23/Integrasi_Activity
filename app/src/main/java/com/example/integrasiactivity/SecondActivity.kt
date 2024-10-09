package com.example.integrasiactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.integrasiactivity.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val nameTextView = findViewById<TextView>(R.id.nameInput)
        val keluarButton = findViewById<Button>(R.id.keluar)

        // Get the name from the previous activity
        val name = intent.getStringExtra("USER_NAME")
        nameTextView.text = name

        keluarButton.setOnClickListener {
            // Move to the login activity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "You have successfully logged out", Toast.LENGTH_SHORT).show()
            finish() // Optional, to close this activity
        }
    }
}
