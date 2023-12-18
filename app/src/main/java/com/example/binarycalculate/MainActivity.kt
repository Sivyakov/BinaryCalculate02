package com.example.binarycalculate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val inputField = findViewById<EditText>(R.id.input_field)
    val resultLabel = findViewById<TextView>(R.id.result_label)
    val binaryOption = findViewById<RadioButton>(R.id.option_binary)
    val octalOption = findViewById<RadioButton>(R.id.option_octal)
    val hexadecimalOption = findViewById<RadioButton>(R.id.option_hexadecima)
    val doButton = findViewById<Button>(R.id.do_button)
    val okButton = findViewById<Button>(R.id.ok_button)
    val inputValue = inputField.text.toString()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        doButton.setOnClickListener {
            when {
                binaryOption.isChecked -> {
                    val result = Integer.toBinaryString(inputValue.toInt())
                    resultLabel.text = result
                }
                octalOption.isChecked -> {
                    val result = Integer.toOctalString(inputValue.toInt())
                    resultLabel.text = result
                }
                hexadecimalOption.isChecked -> {
                    val result = Integer.toHexString(inputValue.toInt())
                    resultLabel.text = result
                }
            }
        }
    }

}