package touch.wireless.tmall.com.tmtouchsdk.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.tmall.R;

import touch.wireless.tmall.com.tmtouchsdk.fragment.TestFragment;


/**
 * Created by jingchaoqinjc on 17/7/14.
 */

public class FragmentTestActivity extends FragmentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fragment_test);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        Fragment fragment = new TestFragment();
        transaction.replace(R.id.id_fragment_content, fragment, "test");
        transaction.commitAllowingStateLoss();
    }


    @Override
    protected void onDestroy() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        Fragment fragment = new TestFragment();
        transaction.replace(R.id.id_fragment_content, fragment, "test2");
        transaction.commitAllowingStateLoss();
        super.onDestroy();
    }
}
