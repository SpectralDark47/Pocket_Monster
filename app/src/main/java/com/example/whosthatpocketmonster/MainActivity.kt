package com.example.whosthatpocketmonster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    val Alakazam = Pkmn(R.drawable.alakazam_silh, "Alakazam")
    val Beedrill = Pkmn(R.drawable.beedrill_silh, "Beedrill")
    val Blastoise = Pkmn(R.drawable.blastoise_silh, "Blastoise")
    val Bulbasaur = Pkmn(R.drawable.bulbasaur_silh, "Bulbasaur")
    val Charmeleon = Pkmn(R.drawable.charmeleon_silh, "Charmeleon")
    val Dugtrio = Pkmn(R.drawable.dugtrio_silh, "Dugtrio")
    val Exeggutor = Pkmn(R.drawable.exeggutor_silh, "Exeggutor")
    val Geodude = Pkmn(R.drawable.geodude_silh, "Geodude")
    val Golbat = Pkmn(R.drawable.golbat_silh, "Golbat")
    val Haunter = Pkmn(R.drawable.haunter_silh, "Haunter")
    val Jigglypuff = Pkmn(R.drawable.jigglypuff_silh, "Jigglypuff")
    val Jolteon = Pkmn(R.drawable.jolteon_silh, "Jolteon")
    val Koffing = Pkmn(R.drawable.koffing_silh, "Koffing")
    val Mew = Pkmn(R.drawable.mew_silh, "Mew")
    val Mewtwo = Pkmn(R.drawable.mewtwo_silh, "Mewtwo")
    val Ninetales = Pkmn(R.drawable.ninetales_silh, "Ninetales")
    val Pikachu = Pkmn(R.drawable.pikachu_silh, "Pikachu")
    val Rhydon = Pkmn(R.drawable.rhydon_silh, "Rhydon")
    val Vileplume = Pkmn(R.drawable.vileplume_silh, "Vileplume")
    val Zapdos = Pkmn(R.drawable.zapdos_silh, "Zapdos")
    var score: Int = 0
    val currentPkmn = Alakazam
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setPokemon()
    }


    fun setPokemon(){
        val image = findViewById<ImageView>(R.id.imageView)
        image.setImageResource(currentPkmn.resourceId)
    }
    fun submitOnClick(view: View){
        val scoreTxt = findViewById<TextView>(R.id.score_txt)
        val button = findViewById<Button>(R.id.submit_btn)
        val a = findViewById<RadioButton>(R.id.radioButton1)
        val b = findViewById<RadioButton>(R.id.radioButton2)
        val c = findViewById<RadioButton>(R.id.radioButton3)
        val d = findViewById<RadioButton>(R.id.radioButton4)

        if (a.isChecked == true && a.text == currentPkmn.name){
            score++
            scoreTxt.setText("Score: " + score)
        }
        if (button.getText() == "Submit"){
            button.setText("Next")
        } else if (button.getText() == "Next"){
            button.setText("Submit")
        }

    }

}
class Pkmn(val resourceId: Int, val name: String)