package com.mnouman.myapplication.ui.fragments

import android.os.Bundle
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.mnouman.myapplication.R
import com.mnouman.myapplication.factory.MovieFragmentFactory
import kotlinx.android.synthetic.main.fragment_directors.*
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class DirectorsFragmentTest {

    @Test
    fun test_isDirectoryVisible() {


        val directoriesList = arrayListOf("R.J. Stewart", "James Vanderbilt")
        val fragmFactory = MovieFragmentFactory()
        val bundle = Bundle()
        bundle.putStringArrayList("args_directors", directoriesList)

        val scenario = launchFragmentInContainer<DirectorsFragment> (
            fragmentArgs = bundle,
            factory = fragmFactory
        )

        //setup is done now lets verify the scenario
        onView(ViewMatchers.withId(R.id.directors_text)).check(matches(withText(DirectorsFragment.stringBuilderForDirectors(directoriesList))))
    }

}