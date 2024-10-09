package com.example.integrasiactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.integrasiactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submitButton = findViewById<Button>(R.id.submitButton)
        val nameInput = findViewById<EditText>(R.id.nameInput)

        submitButton.setOnClickListener {
            val name = nameInput.text.toString()

            if (name.isEmpty()) {
                Toast.makeText(this, "Enter your name first", Toast.LENGTH_SHORT).show()
            } else {
                // Move to the second activity and pass the user's name
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("USER_NAME", name)
                startActivity(intent)
            }
        }
    }
}