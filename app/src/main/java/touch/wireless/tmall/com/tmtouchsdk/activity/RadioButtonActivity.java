package touch.wireless.tmall.com.tmtouchsdk.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

import com.tmall.R;

import touch.wireless.tmall.com.tmtouchsdk.base.BaseActivity;

/**
 * Created by liangjianzhao on 17/2/21.
 */
public class RadioButtonActivity extends BaseActivity {
    private RadioButton mButton1;
    private RadioButton mButton2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acivtity_radiobutton_test);

        mButton1 = (RadioButton) findViewById(R.id.radiobutton1);
        mButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //  buttonView.setChecked(isChecked);
                Toast.makeText(RadioButtonActivity.this, "第1个radio" + isChecked, Toast.LENGTH_SHORT).show();
            }
        });

        mButton2 = (RadioButton) findViewById(R.id.radiobutton2);
        mButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //  buttonView.setChecked(isChecked);
                Toast.makeText(RadioButtonActivity.this, "第2个radio" + isChecked, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
