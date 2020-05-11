package com.mnouman.myapplication.ui.fragments

import android.os.Bundle
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.mnouman.myapplication.R
import com.mnouman.myapplication.factory.MovieFragmentFactory
import kotlinx.android.synthetic.main.fragment_star_actors.*
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class StarActorsFragmentTest {

    @Test
    fun test_isStarActorsDataVisible() {
        val movieStarts = arrayListOf(
            "Dwayne Johnson",
            "Seann William Scott",
            "Rosario Dawson",
            "Christopher Walken"
        )
        val fragmenFactory = MovieFragmentFactory()
        var bundle = Bundle()
        bundle.putStringArrayList("args_actors", movieStarts)

        val scenario = launchFragmentInContainer<StarActorsFragment>(
            fragmentArgs = bundle,
            factory = fragmenFactory
        )

        onView(withId(R.id.star_actors_text)).check(
            matches(
                withText(
                    StarActorsFragment.stringBuilderForStarActors(
                        movieStarts
                    )
                )
            )
        )

    }
}