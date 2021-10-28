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

        val listaBotones = ArrayList<Button>()

        listaBotones.add(binding.btn1)
        listaBotones.add(binding.btn2)
        listaBotones.add(binding.btn3)
        listaBotones.add(binding.btn4)
        listaBotones.add(binding.btn5)
        listaBotones.add(binding.btn6)
        listaBotones.add(binding.btn7)
        listaBotones.add(binding.btn8)
        listaBotones.add(binding.btn9)

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
            condiciones(listaBotones)
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
            condiciones(listaBotones)
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
            condiciones(listaBotones)
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
            condiciones(listaBotones)
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
            condiciones(listaBotones)
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
            condiciones(listaBotones)
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
            condiciones(listaBotones)
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
            condiciones(listaBotones)
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
            condiciones(listaBotones)
        }
    }

    fun condiciones(listaBotones : ArrayList<Button>) {

        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        val text1 = listaBotones[0].text.toString()
        val text2 = listaBotones[1].text.toString()
        val text3 = listaBotones[2].text.toString()
        val text4 = listaBotones[3].text.toString()
        val text5 = listaBotones[4].text.toString()
        val text6 = listaBotones[5].text.toString()
        val text7 = listaBotones[6].text.toString()
        val text8 = listaBotones[7].text.toString()
        val text9 = listaBotones[8].text.toString()

        when {
            //Filas
            text1 == "X" && text2 == "X" && text3 == "X" -> {
                tvResultado.text = resources.getString(R.string.victoria_x)
                for(boton in listaBotones)
                    boton.isEnabled = false
            }
            text4 == "X" && text5 == "X" && text6 == "X" -> {
                tvResultado.text = resources.getString(R.string.victoria_x)
                for(boton in listaBotones)
                    boton.isEnabled = false
            }
            text7 == "X" && text8 == "X" && text9 == "X" -> {
                tvResultado.text = resources.getString(R.string.victoria_x)
                for(boton in listaBotones)
                    boton.isEnabled = false
            }

            //Columnas
            text1 == "X" && text4 == "X" && text7 == "X" -> {
                tvResultado.text = resources.getString(R.string.victoria_x)
                for(boton in listaBotones)
                    boton.isEnabled = false
            }
            text2 == "X" && text5 == "X" && text8 == "X" -> {
                tvResultado.text = resources.getString(R.string.victoria_x)
                for(boton in listaBotones)
                    boton.isEnabled = false
            }
            text3 == "X" && text6 == "X" && text9 == "X" -> {
                tvResultado.text = resources.getString(R.string.victoria_x)
                for(boton in listaBotones)
                    boton.isEnabled = false
            }

            //Diagonales
            text1 == "X" && text5 == "X" && text9 == "X" -> {
                tvResultado.text = resources.getString(R.string.victoria_x)
                for(boton in listaBotones)
                    boton.isEnabled = false
            }
            text3 == "X" && text5 == "X" && text7 == "X" -> {
                tvResultado.text = resources.getString(R.string.victoria_x)
                for(boton in listaBotones)
                    boton.isEnabled = false
            }

            //Filas
            text1 == "O" && text2 == "O" && text3 == "O" -> {
                tvResultado.text = resources.getString(R.string.victoria_o)
                for(boton in listaBotones)
                    boton.isEnabled = false
            }
            text4 == "O" && text5 == "O" && text6 == "O" -> {
                tvResultado.text = resources.getString(R.string.victoria_o)
                for(boton in listaBotones)
                    boton.isEnabled = false
            }
            text7 == "O" && text8 == "O" && text9 == "O" -> {
                tvResultado.text = resources.getString(R.string.victoria_o)
                for(boton in listaBotones)
                    boton.isEnabled = false
            }

            //Columnas
            text1 == "O" && text4 == "O" && text7 == "O" -> {
                tvResultado.text = resources.getString(R.string.victoria_o)
                for(boton in listaBotones)
                    boton.isEnabled = false
            }
            text2 == "O" && text5 == "O" && text8 == "O" -> {
                tvResultado.text = resources.getString(R.string.victoria_o)
                for(boton in listaBotones)
                    boton.isEnabled = false
            }
            text3 == "O" && text6 == "O" && text9 == "O" -> {
                tvResultado.text = resources.getString(R.string.victoria_o)
                for(boton in listaBotones)
                    boton.isEnabled = false
            }

            //Diagonales
            text1 == "O" && text5 == "O" && text9 == "O" -> {
                tvResultado.text = resources.getString(R.string.victoria_o)
                for(boton in listaBotones)
                    boton.isEnabled = false
            }
            text3 == "O" && text5 == "O" && text7 == "O" -> {
                tvResultado.text = resources.getString(R.string.victoria_o)
                for(boton in listaBotones)
                    boton.isEnabled = false
            }
        }
    }
}
