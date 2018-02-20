package touch.wireless.tmall.com.tmtouchsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SlidingPaneLayout;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.tmall.R;

/**
 * Created by jingchaoqinjc on 17/10/25.
 */

public class SlidingPanelActivity extends Activity implements View.OnClickListener {

    SlidingPaneLayout slidingPaneLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliding_panel_test);
        slidingPaneLayout = (SlidingPaneLayout) findViewById(R.id.sliding_layout);

        findViewById(R.id.text1).setOnClickListener(this);
        findViewById(R.id.text2).setOnClickListener(this);
        findViewById(R.id.text3).setOnClickListener(this);
        findViewById(R.id.text4).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, ((TextView) v).getText(), Toast.LENGTH_LONG).show();
        slidingPaneLayout.openPane();
    }
}
