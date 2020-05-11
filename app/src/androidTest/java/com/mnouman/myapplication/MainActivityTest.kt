package com.mnouman.myapplication

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {

    /**
     * test if activity is visible or not
     * */
    @Test
    fun test_inActivityInView() {
        /*launch the activity each time*/
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        Espresso.onView(withId(R.id.main)).check(matches(isDisplayed()))
    }

    /***
     *
     * check if text view is displayed or not
     * check if main Button is visible or not
     *
     * */
    @Test
    fun test_visibility_title_secondActivityBtn() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.mainTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.mainButton)).check(matches(isDisplayed()))
    }

    /**
     *
     * check if text view text matches the text view we are giving
     * */
    @Test
    fun test_is_textTitle_isSame() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.mainTitle)).check(matches(withText(R.string.mainTitle)))
    }
}