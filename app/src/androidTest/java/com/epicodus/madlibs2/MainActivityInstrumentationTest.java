package com.epicodus.madlibs2;

/**
 * Created by Guest on 6/27/16.
 */
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityInstrumentationTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void validateEditText() {
        onView(withId(R.id.madLibs)).perform(typeText("Portland"))
                .check(matches(withText("Portland")));
    }
    @Test
    public void wordsAreSentToMadLibs() {
        onView(withId(R.id.madLibs)).perform(typeText("firefighter"));
        onView(withId(R.id.madLibs2)).perform(typeText("jumped"));
        onView(withId(R.id.madLibs3)).perform(typeText("red"));
        onView(withId(R.id.submitWordsButton)).perform(click());
        onView(withId(R.id.madLibsSentence)).check(matches
                (withText("A firefighter jumped near a red poodle.")));
    }


}