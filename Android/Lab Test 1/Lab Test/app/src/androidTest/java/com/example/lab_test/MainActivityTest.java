package com.example.lab_test;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.TypeTextAction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.example.demo1.R;

import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

   @Test
   public void areaButton(){
       Espresso.onView(ViewMatchers.withId(R.id.et1)).perform(ViewActions.typeText("2"));
       Espresso.onView(ViewMatchers.withId(R.id.area)).perform(ViewActions.click());

       Espresso.onView(ViewMatchers.withId(R.id.textView)).check(ViewAssertions.matches(ViewMatchers.withText("12.56")));
   }
   @Test
   public void colorButton(){ Espresso.onView(ViewMatchers.withId(R.id.color)).perform(ViewActions.click());

       Espresso.onView(ViewMatchers.withId(R.id.textView)).check(ViewAssertions.matches(ViewMatchers.withText("Color is : Red")));
   }

}
