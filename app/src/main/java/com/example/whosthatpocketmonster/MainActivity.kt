package com.example.whosthatpocketmonster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.TextView

    data class PkmnImages(val silhId: Int, val clearId: Int, val pkmnName: String);

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

    private var pkmnImages = mutableListOf<PkmnImages>();
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pkmnImages.add(
            PkmnImages(
                R.drawable.alakazam_silh,
                R.drawable.alakazam_clear,
                "Alakazam")
        );
        pkmnImages.add(
            PkmnImages(
                R.drawable.beedrill_silh,
                R.drawable.beedrill_clear,
                "Beedrill")
        );
        pkmnImages.add(
            PkmnImages(
                R.drawable.blastoise_silh,
                R.drawable.blastoise_clear,
                "Blastoise")
        );
        pkmnImages.add(
            PkmnImages(
                R.drawable.bulbasaur_silh,
                R.drawable.bulbasaur_clear,
                "Bulbasaur")
        );
        pkmnImages.add(
            PkmnImages(
                R.drawable.charmeleon_silh,
                R.drawable.charmeleon_clear,
                "Charmeleon")
        );
        pkmnImages.add(
            PkmnImages(
                R.drawable.dugtrio_silh,
                R.drawable.dugtrio_clear,
                "Dugtrio")
        );
        pkmnImages.add(
            PkmnImages(
                R.drawable.exeggutor_silh,
                R.drawable.exeggutor_clear,
                "Exeggutor")
        );
        pkmnImages.add(
            PkmnImages(
                R.drawable.geodude_silh,
                R.drawable.geodude_clear,
                "Geodude")
        );
        pkmnImages.add(
            PkmnImages(
                R.drawable.golbat_silh,
                R.drawable.golbat_clear,
                "Golbat")
        );
        pkmnImages.add(
            PkmnImages(
                R.drawable.haunter_silh,
                R.drawable.haunter_clear,
                "Haunter")
        );
        pkmnImages.add(
            PkmnImages(
                R.drawable.jigglypuff_silh,
                R.drawable.jigglypuff_clear,
                "Jigglypuff")
        );
        pkmnImages.add(
            PkmnImages(
                R.drawable.jolteon_silh,
                R.drawable.jolteon_clear,
                "Jolteon")
        );
        pkmnImages.add(
            PkmnImages(
                R.drawable.koffing_silh,
                R.drawable.koffing_clear,
                "Koffing")
        );
        pkmnImages.add(
            PkmnImages(
                R.drawable.mew_silh,
                R.drawable.mew_clear,
                "Mew")
        );
        pkmnImages.add(
            PkmnImages(
                R.drawable.mewtwo_silh,
                R.drawable.mewtwo_clear,
                "Mewtwo")
        );
        pkmnImages.add(
            PkmnImages(
                R.drawable.ninetales_silh,
                R.drawable.ninetales_clear,
                "Ninetales")
        );
        pkmnImages.add(
            PkmnImages(
                R.drawable.pikachu_silh,
                R.drawable.pikachu_clear,
                "Pikachu")
        );
        pkmnImages.add(
            PkmnImages(
                R.drawable.rhydon_silh,
                R.drawable.rhydon_clear,
                "Rhydon")
        );
        pkmnImages.add(
            PkmnImages(
                R.drawable.vileplume_silh,
                R.drawable.vileplume_clear,
                "Vileplume")
        );
        pkmnImages.add(
            PkmnImages(
                R.drawable.zapdos_silh,
                R.drawable.zapdos_clear,
                "Zapdos")
        );

        setPokemon()
    }



    fun setPokemon(){
        pkmnImages.shuffle();

        //val currentPkmn = pkmnImages[0].silhId;
        //Setting the image as the first image in the scrambled list
        val image = findViewById<ImageView>(R.id.imageView)
        image.setImageResource(pkmnImages[0].silhId)
        //Setting the buttons as the first 4 names of the scrambled list
        val a = findViewById<RadioButton>(R.id.radioButton1)
        a.text = (pkmnImages[0].pkmnName);
        val b = findViewById<RadioButton>(R.id.radioButton2)
        b.text = (pkmnImages[1].pkmnName);
        val c = findViewById<RadioButton>(R.id.radioButton3)
        c.text = (pkmnImages[2].pkmnName);
        val d = findViewById<RadioButton>(R.id.radioButton4)
        d.text = (pkmnImages[3].pkmnName);
    }
    fun submitOnClick(view: View){
        val scoreTxt = findViewById<TextView>(R.id.score_txt)
        val button = findViewById<Button>(R.id.submit_btn)
        val a = findViewById<RadioButton>(R.id.radioButton1)
        val b = findViewById<RadioButton>(R.id.radioButton2)
        val c = findViewById<RadioButton>(R.id.radioButton3)
        val d = findViewById<RadioButton>(R.id.radioButton4)

        if (button.getText() == "Submit"){
            if (a.isChecked == true && a.text == pkmnImages[0].pkmnName){
                score++
                scoreTxt.setText("Score: " + score)
            }
            button.setText("Next")
            val image = findViewById<ImageView>(R.id.imageView)
            image.setImageResource(pkmnImages[0].clearId)

        } else if (button.getText() == "Next"){
            button.setText("Submit")
            a.isChecked = false;
            b.isChecked = false;
            c.isChecked = false;
            d.isChecked = false;
            setPokemon()
        }

    }

}
class Pkmn(val resourceId: Int, val name: String)