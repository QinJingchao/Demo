package touch.wireless.tmall.com.tmtouchsdk.activity;

import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.tmall.R;

import touch.wireless.tmall.com.tmtouchsdk.base.BaseActivity;

/**
 * Created by jingchaoqinjc on 17/2/21.
 */

public class EditTextActivity extends BaseActivity {

    private static final String TAG = "EditTextActivity";
    private TextView mTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_test);
        mTextView = (TextView) findViewById(R.id.editview);

        mTextView.setBackgroundDrawable(new StateListDrawable());
        mTextView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                doNothing();
                return false;
            }
        });


        mTextView = (TextView) findViewById(R.id.editview2);

        mTextView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                doNothing();
                return false;
            }
        });

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EditTextActivity.this, "Button is clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void doNothing() {
    }
}
