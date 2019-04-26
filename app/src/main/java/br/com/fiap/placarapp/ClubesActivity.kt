package br.com.fiap.placarapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.placarapp.extension.value
import kotlinx.android.synthetic.main.activity_clubes.*

class ClubesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clubes)
        btIniciar.setOnClickListener {
            irParaOutraTela()

        }
    }

    fun irParaOutraTela() {
        val proximaTela = Intent(this,PlacarActitity::class.java)
        proximaTela.putExtra("TIME_CASA", inputClubCasa.value())
        proximaTela.putExtra("TIME_VISITANTE", inputClubVisitante.value())
        startActivity(proximaTela)
    }

}
