package ru.netology.topmoviesapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import ru.netology.topmoviesapp.databinding.ActivityNewFilmBinding

class NewFilm : AppCompatActivity() {
    private lateinit var binding: ActivityNewFilmBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewFilmBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bKriterii.setOnClickListener {

            if (binding.editTextTextPersonName.text.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Сперва введите название фильма",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                binding.tShapka.visibility = View.VISIBLE
                binding.Dinamic.visibility = View.VISIBLE
                binding.textDinamic.visibility = View.VISIBLE
                binding.valueDinamic.visibility = View.VISIBLE
                binding.Humor.visibility = View.VISIBLE
                binding.textHumor.visibility = View.VISIBLE
                binding.valueHumor.visibility = View.VISIBLE
                binding.textStory.visibility = View.VISIBLE
                binding.ValueStory.visibility = View.VISIBLE
                binding.story.visibility = View.VISIBLE
                binding.heroes.visibility = View.VISIBLE
                binding.textHeroes.visibility = View.VISIBLE
                binding.ValueHeroes.visibility = View.VISIBLE
                binding.antiheroes.visibility = View.VISIBLE
                binding.textAntiheroes.visibility = View.VISIBLE
                binding.ValueAntiheroes.visibility = View.VISIBLE
                binding.drama.visibility = View.VISIBLE
                binding.textDrama.visibility = View.VISIBLE
                binding.valueDrama.visibility = View.VISIBLE
                binding.Musik.visibility = View.VISIBLE
                binding.textMusik.visibility = View.VISIBLE
                binding.ValueMusik.visibility = View.VISIBLE
                binding.Image.visibility = View.VISIBLE
                binding.textImage.visibility = View.VISIBLE
                binding.valueImage.visibility = View.VISIBLE
                binding.dialog.visibility = View.VISIBLE
                binding.textDialog.visibility = View.VISIBLE
                binding.valueDialog.visibility = View.VISIBLE
                binding.switchRepeat.visibility = View.VISIBLE

                binding.buttonSaveAll.visibility = View.VISIBLE
                binding.bKriterii.visibility = View.GONE
                binding.buttomBack.visibility = View.GONE
                binding.buttomSaveWithout.visibility = View.VISIBLE

                movementSeekBar(binding.Humor, binding.valueHumor)
                movementSeekBar(binding.Dinamic, binding.valueDinamic)
                movementSeekBar(binding.story, binding.ValueStory)
                movementSeekBar(binding.heroes, binding.ValueHeroes)
                movementSeekBar(binding.antiheroes, binding.ValueAntiheroes)
                movementSeekBar(binding.drama, binding.valueDrama)
                movementSeekBar(binding.Musik, binding.ValueMusik)
                movementSeekBar(binding.Image, binding.valueImage)
                movementSeekBar(binding.dialog, binding.valueDialog)
            }
        }

        binding.buttomBack.setOnClickListener {
            val navigation = Intent(this, MainActivity::class.java)
            startActivity(navigation)
        }

        binding.buttomSaveWithout.setOnClickListener {
            Toast.makeText(applicationContext, "Фильм без параметров сохранен", Toast.LENGTH_SHORT)
                .show()
            val navigation = Intent(this, MainActivity::class.java)
            startActivity(navigation)
        }

        binding.buttonSaveAll.setOnClickListener {
            Toast.makeText(applicationContext, "Все данные сохранены", Toast.LENGTH_SHORT).show()
            val navigation = Intent(this, MainActivity::class.java)
            startActivity(navigation)
        }
    }

    fun movementSeekBar(seekBar: SeekBar, valueSeekBar: TextView) {
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                valueSeekBar.text = "$p1"
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }
        })
    }

}