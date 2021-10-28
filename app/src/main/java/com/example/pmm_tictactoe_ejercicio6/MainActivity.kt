package com.example.pmm_tictactoe_ejercicio6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.pmm_tictactoe_ejercicio6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var turno = false
        if (turno) {
            binding.tvTurno.text = getString(R.string.turno_x)
        } else binding.tvTurno.text = getString(R.string.turno_o)

        binding.btn1.setOnClickListener {
            if (turno) {
                binding.btn1.text = "X"
                turno = false
            } else {
                binding.btn1.text = "O"
                turno = true
            }
            if (turno) {
                binding.tvTurno.text = getString(R.string.turno_x)
            } else binding.tvTurno.text = getString(R.string.turno_o)

            binding.btn1.isEnabled = false
            condiciones()
        }

        binding.btn2.setOnClickListener {
            if (turno) {
                binding.btn2.text = "X"
                turno = false
            } else {
                binding.btn2.text = "O"
                turno = true
            }
            if (turno) {
                binding.tvTurno.text = getString(R.string.turno_x)
            } else binding.tvTurno.text = getString(R.string.turno_o)
            binding.btn2.isEnabled = false
            condiciones()
        }

        binding.btn3.setOnClickListener {
            if (turno) {
                binding.btn3.text = "X"
                turno = false
            } else {
                binding.btn3.text = "O"
                turno = true
            }
            if (turno) {
                binding.tvTurno.text = getString(R.string.turno_x)
            } else binding.tvTurno.text = getString(R.string.turno_o)
            binding.btn3.isEnabled = false
            condiciones()
        }

        binding.btn4.setOnClickListener {
            if (turno) {
                binding.btn4.text = "X"
                turno = false
            } else {
                binding.btn4.text = "O"
                turno = true
            }
            if (turno) {
                binding.tvTurno.text = getString(R.string.turno_x)
            } else binding.tvTurno.text = getString(R.string.turno_o)
            binding.btn4.isEnabled = false
        }

        binding.btn5.setOnClickListener {
            if (turno) {
                binding.btn5.text = "X"
                turno = false
            } else {
                binding.btn5.text = "O"
                turno = true
            }
            if (turno) {
                binding.tvTurno.text = getString(R.string.turno_x)
            } else binding.tvTurno.text = getString(R.string.turno_o)
            binding.btn5.isEnabled = false
        }

        binding.btn6.setOnClickListener {
            if (turno) {
                binding.btn6.text = "X"
                turno = false
            } else {
                binding.btn6.text = "O"
                turno = true
            }
            if (turno) {
                binding.tvTurno.text = getString(R.string.turno_x)
            } else binding.tvTurno.text = getString(R.string.turno_o)
            binding.btn6.isEnabled = false
        }

        binding.btn7.setOnClickListener {
            if (turno) {
                binding.btn7.text = "X"
                turno = false
            } else {
                binding.btn7.text = "O"
                turno = true
            }
            if (turno) {
                binding.tvTurno.text = getString(R.string.turno_x)
            } else binding.tvTurno.text = getString(R.string.turno_o)
            binding.btn7.isEnabled = false
        }

        binding.btn8.setOnClickListener {
            if (turno) {
                binding.btn8.text = "X"
                turno = false
            } else {
                binding.btn8.text = "O"
                turno = true
            }
            if (turno) {
                binding.tvTurno.text = getString(R.string.turno_x)
            } else binding.tvTurno.text = getString(R.string.turno_o)
            binding.btn8.isEnabled = false
        }

        binding.btn9.setOnClickListener {
            if (turno) {
                binding.btn9.text = "X"
                turno = false
            } else {
                binding.btn9.text = "O"
                turno = true
            }
            if (turno) {
                binding.tvTurno.text = getString(R.string.turno_x)
            } else binding.tvTurno.text = getString(R.string.turno_o)
            binding.btn9.isEnabled = false
        }
    }

    fun condiciones() {

        println("Mostrar")

        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)

        val text1 = btn1.text.toString()
        val text2 = btn2.text.toString()
        val text3 = btn3.text.toString()
        val text4 = btn4.text.toString()
        val text5 = btn5.text.toString()
        val text6 = btn6.text.toString()
        val text7 = btn7.text.toString()
        val text8 = btn8.text.toString()
        val text9 = btn9.text.toString()


        when {
            //Filas
            text1 == "X" && text2 == "X" && text3 == "X" ->
                tvResultado.text = resources.getString(R.string.victoria_x)
            text4 == "X" && text5 == "X" && text6 == "X" ->
                tvResultado.text = resources.getString(R.string.victoria_x)
            text7 == "X" && text8 == "X" && text9 == "X" ->
                tvResultado.text = resources.getString(R.string.victoria_x)

            //Columnas
            text1 == "X" && text4 == "X" && text7 == "X" ->
                tvResultado.text = resources.getString(R.string.victoria_x)
            text2 == "X" && text5 == "X" && text8 == "X" ->
                tvResultado.text = resources.getString(R.string.victoria_x)
            text3 == "X" && text6 == "X" && text9 == "X" ->
                tvResultado.text = resources.getString(R.string.victoria_x)

            //Diagonales
            text1 == "X" && text5 == "X" && text9 == "X" ->
                tvResultado.text = resources.getString(R.string.victoria_x)
            text3 == "X" && text5 == "X" && text7 == "X" ->
                tvResultado.text = resources.getString(R.string.victoria_x)

            //Filas
            text1 == "O" && text2 == "O" && text3 == "O" ->
                tvResultado.text = resources.getString(R.string.victoria_o)
            text4 == "O" && text5 == "O" && text6 == "O" ->
                tvResultado.text = resources.getString(R.string.victoria_o)
            text7 == "O" && text8 == "O" && text9 == "O" ->
                tvResultado.text = resources.getString(R.string.victoria_o)

            //Columnas
            text1 == "O" && text4 == "O" && text7 == "O" ->
                tvResultado.text = resources.getString(R.string.victoria_o)
            text2 == "O" && text5 == "O" && text8 == "O" ->
                tvResultado.text = resources.getString(R.string.victoria_o)
            text3 == "O" && text6 == "O" && text9 == "O" ->
                tvResultado.text = resources.getString(R.string.victoria_o)

            //Diagonales
            text1 == "O" && text5 == "O" && text9 == "O" ->
                tvResultado.text = resources.getString(R.string.victoria_o)
            text3 == "O" && text5 == "O" && text7 == "O" ->
                tvResultado.text = resources.getString(R.string.victoria_o)
        }
    }
}
