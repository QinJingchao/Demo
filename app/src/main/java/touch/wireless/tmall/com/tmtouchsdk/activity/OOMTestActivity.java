package touch.wireless.tmall.com.tmtouchsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;

/**
 * Created by jingchaoqinjc on 18/2/9.
 */

public class OOMTestActivity extends Activity {

    byte[] bytes = new byte[4 * 1024 * 1024];

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(OOMTestActivity.this, OOMTestActivity.class);
                startActivity(intent);
            }
        }, 1000);

    }
}
