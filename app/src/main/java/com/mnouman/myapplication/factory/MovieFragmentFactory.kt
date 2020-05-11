package com.mnouman.myapplication.factory

import androidx.fragment.app.FragmentFactory
import com.mnouman.myapplication.ui.fragments.DirectorsFragment
import com.mnouman.myapplication.ui.fragments.MovieDetailFragment
import com.mnouman.myapplication.ui.fragments.StarActorsFragment

class MovieFragmentFactory : FragmentFactory(){

    private val TAG: String = "AppDebug"

    override fun instantiate(classLoader: ClassLoader, className: String) =

        when(className){

            MovieDetailFragment::class.java.name -> {
                MovieDetailFragment()
            }

            DirectorsFragment::class.java.name -> {
                DirectorsFragment()
            }

            StarActorsFragment::class.java.name -> {
                StarActorsFragment()
            }

            else -> {
                super.instantiate(classLoader, className)
            }
        }


}

