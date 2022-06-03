package ru.netology.topmoviesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ru.netology.topmoviesapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingMain: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)

        toGoActivity(bindingMain.bNew, NewFilm::class.java)

    }

    fun toGoActivity(view: View, nameActivity: Class<*>?) {
        view.setOnClickListener {
            val navigation = Intent(this, nameActivity)
            startActivity(navigation)
        }
    }


}