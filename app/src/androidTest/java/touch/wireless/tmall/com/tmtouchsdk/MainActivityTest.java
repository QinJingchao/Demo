package touch.wireless.tmall.com.tmtouchsdk;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import com.tmall.R;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityTest() {
        ViewInteraction textView = onView(
                allOf(withId(R.id.data_item), withText("ListView"),
                        childAtPosition(
                                withId(R.id.main_list),
                                1),
                        isDisplayed()));
        textView.perform(click());

        ViewInteraction linearLayout = onView(
                allOf(withId(R.id.root_view),
                        childAtPosition(
                                withId(R.id.listview),
                                31),
                        isDisplayed()));
        linearLayout.perform(click());

        ViewInteraction linearLayout2 = onView(
                allOf(withId(R.id.root_view),
                        childAtPosition(
                                withId(R.id.listview),
                                32),
                        isDisplayed()));
        linearLayout2.perform(click());

        ViewInteraction linearLayout3 = onView(
                allOf(withId(R.id.root_view),
                        childAtPosition(
                                withId(R.id.listview),
                                96),
                        isDisplayed()));
        linearLayout3.perform(click());

        pressBack();

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.data_item), withText("PopupWindowManager"),
                        childAtPosition(
                                withId(R.id.main_list),
                                13),
                        isDisplayed()));
        textView2.perform(click());

        ViewInteraction button = onView(
                allOf(withId(R.id.button1), withText("PopupWindow Show"), isDisplayed()));
        button.perform(click());

        pressBack();

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.data_item), withText("Recycler"),
                        childAtPosition(
                                withId(R.id.main_list),
                                3),
                        isDisplayed()));
        textView3.perform(click());

        pressBack();

        ViewInteraction textView4 = onView(
                allOf(withId(R.id.data_item), withText("ServiceWindowManager"),
                        childAtPosition(
                                withId(R.id.main_list),
                                12),
                        isDisplayed()));
        textView4.perform(click());

        ViewInteraction textView5 = onView(
                allOf(withId(R.id.data_item), withText("Data"), isDisplayed()));
        textView5.perform(click());

        pressBack();

        ViewInteraction textView6 = onView(
                allOf(withId(R.id.data_item), withText("RadioButton"),
                        childAtPosition(
                                withId(R.id.main_list),
                                5),
                        isDisplayed()));
        textView6.perform(click());

        ViewInteraction radioButton = onView(
                allOf(withId(R.id.radiobutton2), withText("RadioButton2"), isDisplayed()));
        radioButton.perform(click());

        pressBack();

    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
