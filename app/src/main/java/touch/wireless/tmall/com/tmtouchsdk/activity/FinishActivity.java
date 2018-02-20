package touch.wireless.tmall.com.tmtouchsdk.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.tmall.R;

import touch.wireless.tmall.com.tmtouchsdk.base.BaseActivity;

/**
 * Created by jingchaoqinjc on 17/3/7.
 */

public class FinishActivity extends BaseActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_test);
        mTextView = (TextView) findViewById(R.id.textview);
        mTextView.setText("Finish Activity");

        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FinishActivity.this.finish();
            }
        });
    }
}
