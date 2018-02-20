package touch.wireless.tmall.com.tmtouchsdk.activity;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.tmall.R;

/**
 * Created by jingchaoqinjc on 17/10/12.
 */

public class AnimationActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_animation_test);

        final View view = findViewById(R.id.animation);

//        ObjectAnimator anim = ObjectAnimator
//                .ofFloat(view, "alpha", 1.0F, 0.0F)
//                .setDuration(500);
//
//        anim.addListener(new Animator.AnimatorListener() {
//            @Override
//            public void onAnimationStart(Animator animation) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animator animation) {
//                view.setAlpha(0.5f);
//                ObjectAnimator anim = ObjectAnimator
//                        .ofFloat(view, "alpha", 1.0F, 0.0F)
//                        .setDuration(5000);
//
//                anim.init();
//            }
//
//            @Override
//            public void onAnimationCancel(Animator animation) {
//
//            }
//
//            @Override
//            public void onAnimationRepeat(Animator animation) {
//
//            }
//        });
//
//        anim.init();

    }


    @Override
    protected void onResume() {
        super.onResume();

        final View view = findViewById(R.id.animation);

        ObjectAnimator anim = ObjectAnimator
                .ofFloat(view, "scaleX", 1.0F, 0.0F)
                .setDuration(5000);

        anim.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                view.setAlpha(0.5f);
                ObjectAnimator anim = ObjectAnimator
                        .ofFloat(view, "alpha", 1.0F, 0.0F)
                        .setDuration(5000);

                anim.start();
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });

        anim.start();
    }
}
