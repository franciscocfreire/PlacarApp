package br.com.fiap.placarapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.AbsSavedState
import android.view.View
import kotlinx.android.synthetic.main.activity_placar.*

class PlacarActitity : AppCompatActivity(){

    private var golCasa = 0
    private var golVisitante = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar)

        tvTimeCasa.text = intent.getStringExtra("TIME_CASA")
        tvTimeVisitante.text = intent.getStringExtra("TIME_VISITANTE")

        tvPlacarCasa.text = golCasa.toString()
        tvPlacarVisitante.text = golVisitante.toString()

        btGolCasa.setOnClickListener{
            golCasa++
            tvPlacarCasa.text = golCasa.toString()
        }

        btGolVisitante.setOnClickListener {
            golVisitante++
            tvPlacarVisitante.text = golVisitante.toString()
        }
    }


}
