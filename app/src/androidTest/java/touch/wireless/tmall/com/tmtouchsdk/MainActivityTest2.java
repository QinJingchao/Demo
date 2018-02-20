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
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.action.ViewActions.swipeLeft;
import static android.support.test.espresso.action.ViewActions.swipeRight;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest2 {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityTest2() {
//        ViewInteraction textView = onView(
//                allOf(withId(R.id.text_destory), withText("最小化"), isDisplayed()));
//        textView.perform(click());

        ViewInteraction appCompatTextView = onView(
                allOf(withId(R.id.data_item), withText("Action"),
                        childAtPosition(
                                withId(R.id.main_list),
                                0),
                        isDisplayed()));
        appCompatTextView.perform(click());

        pressBack();

        ViewInteraction appCompatTextView2 = onView(
                allOf(withId(R.id.data_item), withText("MultiActivity"),
                        childAtPosition(
                                withId(R.id.main_list),
                                27),
                        isDisplayed()));
        appCompatTextView2.perform(click());

        pressBack();

        ViewInteraction appCompatTextView3 = onView(
                allOf(withId(R.id.data_item), withText("Recycler"),
                        childAtPosition(
                                withId(R.id.main_list),
                                8),
                        isDisplayed()));
        appCompatTextView3.perform(click());

        pressBack();

        ViewInteraction appCompatTextView4 = onView(
                allOf(withId(R.id.data_item), withText("ScrollView"),
                        childAtPosition(
                                withId(R.id.main_list),
                                16),
                        isDisplayed()));
        appCompatTextView4.perform(click());

        ViewInteraction appCompatTextView5 = onView(
                withText("3"));
        appCompatTextView5.perform(scrollTo(), click());

        ViewInteraction appCompatTextView6 = onView(
                withText("3"));
        appCompatTextView6.perform(scrollTo(), click());

        pressBack();

        ViewInteraction appCompatTextView7 = onView(
                allOf(withId(R.id.data_item), withText("PopupWindowManager"),
                        childAtPosition(
                                withId(R.id.main_list),
                                19),
                        isDisplayed()));
        appCompatTextView7.perform(click());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.context_button), withText("Context PopupWindow Show"), isDisplayed()));
        appCompatButton.perform(click());

        pressBack();

        ViewInteraction appCompatTextView8 = onView(
                allOf(withId(R.id.data_item), withText("ViewPagerActivity"),
                        childAtPosition(
                                withId(R.id.main_list),
                                21),
                        isDisplayed()));
        appCompatTextView8.perform(click());

        ViewInteraction viewPager = onView(
                allOf(withId(R.id.view_pager), isDisplayed()));
        viewPager.perform(swipeRight());

        ViewInteraction viewPager2 = onView(
                allOf(withId(R.id.view_pager), isDisplayed()));
        viewPager2.perform(swipeRight());

        ViewInteraction viewPager3 = onView(
                allOf(withId(R.id.view_pager), isDisplayed()));
        viewPager3.perform(swipeRight());

        ViewInteraction viewPager4 = onView(
                allOf(withId(R.id.view_pager), isDisplayed()));
        viewPager4.perform(swipeRight());

        ViewInteraction viewPager5 = onView(
                allOf(withId(R.id.view_pager), isDisplayed()));
        viewPager5.perform(swipeRight());

        ViewInteraction viewPager6 = onView(
                allOf(withId(R.id.view_pager), isDisplayed()));
        viewPager6.perform(swipeRight());

        ViewInteraction viewPager7 = onView(
                allOf(withId(R.id.view_pager), isDisplayed()));
        viewPager7.perform(swipeLeft());

        ViewInteraction viewPager8 = onView(
                allOf(withId(R.id.view_pager), isDisplayed()));
        viewPager8.perform(swipeLeft());

        ViewInteraction viewPager9 = onView(
                allOf(withId(R.id.view_pager), isDisplayed()));
        viewPager9.perform(swipeLeft());

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
