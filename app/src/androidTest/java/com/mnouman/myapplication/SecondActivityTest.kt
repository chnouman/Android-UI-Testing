package com.mnouman.myapplication

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SecondActivityTest {

    @get: Rule
    val activityRule = ActivityScenarioRule(SecondActivity::class.java)

    /**
     * test if activity is visible or not
     * */
    @Test
    fun test_inActivityInView() {
        /*launch the activity each time
        * no need to call activitySceneario bcz we are using activity sceneario rule
        * */
        Espresso.onView(withId(R.id.secondBtn)).check(matches(isDisplayed()))
    }


}