package touch.wireless.tmall.com.tmtouchsdk.activity;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.tmall.R;

import touch.wireless.tmall.com.tmtouchsdk.fragment.TestSystemFragment;

/**
 * Created by jingchaoqinjc on 17/7/14.
 */

public class SystemFragmentActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fragment_test);
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        Fragment fragment = new TestSystemFragment();
        transaction.replace(R.id.id_fragment_content, fragment, "test");
        transaction.commit();
    }

}
