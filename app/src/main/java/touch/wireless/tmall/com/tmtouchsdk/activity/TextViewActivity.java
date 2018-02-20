package touch.wireless.tmall.com.tmtouchsdk.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

import com.tmall.R;

import touch.wireless.tmall.com.tmtouchsdk.base.BaseActivity;

/**
 * Created by hanting on 17/2/21.
 */
public class TextViewActivity extends BaseActivity{
    private TextView mTextView;
    private EditText mEditText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_textview_test);

        mEditText = (EditText) findViewById(R.id.editview);
        mTextView = (TextView) findViewById(R.id.textview);

    }

}
