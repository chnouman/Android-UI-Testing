package com.mnouman.myapplication

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {

    /**
     * test if onClick second activity is opening
     * */
    @Test
    fun test_activityNavigation() {
        /*launch the activity each time*/
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        /*perform click*/
        onView(withId(R.id.mainButton)).perform(click())
    }

    /**
     * test if onClick second activity is opening
     * and on back click we are coming back correctly
     * */
    @Test
    fun test_activityBackNavigation() {
        /*launch the activity each time*/
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        /*perform click*/
        onView(withId(R.id.mainButton)).perform(click())
        /*check second activity*/
        onView(withId(R.id.mainSecond)).check(matches(isDisplayed()))
        /*perform click*/
        Espresso.onView(withId(R.id.secondBtn)).perform(click())
        /*check previous activity is displayed or not*/
        onView(withId(R.id.main)).check(matches(isDisplayed()))
    }
}