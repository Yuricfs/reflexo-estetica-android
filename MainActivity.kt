package com.example.reflexoestetica

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configuração dos botões de serviços
        val btnLavagem = findViewById<Button>(R.id.btnLavagem)
        val btnPolimento = findViewById<Button>(R.id.btnPolimento)
        val btnVitrificacao = findViewById<Button>(R.id.btnVitrificacao)
        val btnHigienizacao = findViewById<Button>(R.id.btnHigienizacao)
        val btnContato = findViewById<Button>(R.id.btnContato)

        // Lógica de clique para cada serviço
        btnLavagem?.setOnClickListener {
            Toast.makeText(this, "Serviço: Lavagem Técnica selecionada!", Toast.LENGTH_SHORT).show()
        }

        btnPolimento?.setOnClickListener {
            Toast.makeText(this, "Serviço: Polimento selecionado!", Toast.LENGTH_SHORT).show()
        }

        btnVitrificacao?.setOnClickListener {
            Toast.makeText(this, "Serviço: Vitrificação selecionada!", Toast.LENGTH_SHORT).show()
        }

        btnHigienizacao?.setOnClickListener {
            Toast.makeText(this, "Serviço: Higienização selecionada!", Toast.LENGTH_SHORT).show()
        }

        // Lógica para o botão de contato (WhatsApp)
        btnContato?.setOnClickListener {
            Toast.makeText(this, "A abrir o WhatsApp da Reflexo Estética...", Toast.LENGTH_LONG).show()
        }
    }
}