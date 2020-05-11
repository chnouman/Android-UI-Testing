package com.mnouman.myapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mnouman.myapplication.ui.fragments.MovieDetailFragment
import com.mnouman.myapplication.factory.MovieFragmentFactory
import com.mnouman.myapplication.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        supportFragmentManager.fragmentFactory =
            MovieFragmentFactory()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        if (supportFragmentManager.fragments.size == 0) {
            val movieId = 1
            val bundle = Bundle()
            bundle.putInt("movie_id", movieId)
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MovieDetailFragment::class.java, bundle)
                .commit()
        }
    }
}
