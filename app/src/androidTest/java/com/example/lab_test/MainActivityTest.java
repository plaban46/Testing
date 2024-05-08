package com.example.lab_test;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.example.demo1.R;

import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<MainActivity>(MainActivity.class);

    @Test
    public void motorDriveTest(){
        Espresso.onView(ViewMatchers.withId(R.id.button)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.tv)).check(ViewAssertions.matches(ViewMatchers.withText(".5")));
    }


}
