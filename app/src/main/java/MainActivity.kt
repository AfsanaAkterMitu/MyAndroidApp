package com.example.calculator

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator)

        val num1 = findViewById<EditText>(R.id.number1)
        val num2 = findViewById<EditText>(R.id.number2)
        val result = findViewById<TextView>(R.id.result)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSubtract = findViewById<Button>(R.id.btnSubtract)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnDivide = findViewById<Button>(R.id.btnDivide)

        btnAdd.setOnClickListener {
            val n1 = num1.text.toString().toDoubleOrNull()
            val n2 = num2.text.toString().toDoubleOrNull()
            if (n1 != null && n2 != null) {
                result.text = "Result: ${n1 + n2}"
            } else {
                Toast.makeText(this, "Enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        btnSubtract.setOnClickListener {
            val n1 = num1.text.toString().toDoubleOrNull()
            val n2 = num2.text.toString().toDoubleOrNull()
            if (n1 != null && n2 != null) {
                result.text = "Result: ${n1 - n2}"
            } else {
                Toast.makeText(this, "Enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        btnMultiply.setOnClickListener {
            val n1 = num1.text.toString().toDoubleOrNull()
            val n2 = num2.text.toString().toDoubleOrNull()
            if (n1 != null && n2 != null) {
                result.text = "Result: ${n1 * n2}"
            } else {
                Toast.makeText(this, "Enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        btnDivide.setOnClickListener {
            val n1 = num1.text.toString().toDoubleOrNull()
            val n2 = num2.text.toString().toDoubleOrNull()
            if (n1 != null && n2 != null) {
                if (n2 != 0.0) {
                    result.text = "Result: ${n1 / n2}"
                } else {
                    Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
