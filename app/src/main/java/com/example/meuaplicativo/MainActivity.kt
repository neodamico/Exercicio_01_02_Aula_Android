package com.example.meuaplicativo

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.meuaplicativo.databinding.ActivityMainBinding
import com.example.meuaplicativo.ui.theme.MeuAplicativoTheme

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*
                usando findViewByID
                val meuTexto:TextView=findViewById(R.id.meuTexto)
                val meuBotao: Button = findViewById(R.id.botao)

                meuBotao.setOnClickListener {
                    meuTexto.text="O Texto mudou!!"}*/

        binding.botao.setOnClickListener {
            binding.meuTexto.text = "Conectado com ViewBinding!"
        }


    }
}