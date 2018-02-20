package touch.wireless.tmall.com.tmtouchsdk.activity;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TabHost;

import com.tmall.R;

/**
 * Created by jingchaoqinjc on 17/10/24.
 */

public class TabActivityActivity extends TabActivity {

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_activity_test);
        Resources res = getResources();
        TabHost tabHost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;
        intent = new Intent().setClass(this, ButtonActivity.class);
        spec = tabHost.newTabSpec("最近播放").setIndicator("最近播放",
                res.getDrawable(R.drawable.ic_launcher))
                .setContent(intent);
        tabHost.addTab(spec);
        intent = new Intent().setClass(this, ButtonActivity.class);
        spec = tabHost.newTabSpec("音乐").setIndicator("音乐",
                res.getDrawable(R.drawable.ic_launcher))
                .setContent(intent);
        tabHost.addTab(spec);
        tabHost.setCurrentTab(0);
    }

}
