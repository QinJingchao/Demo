package touch.wireless.tmall.com.tmtouchsdk.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.tmall.R;

import touch.wireless.tmall.com.tmtouchsdk.base.BaseActivity;

/**
 * Created by liangjianzhao on 17/2/22.
 */
public class CheckBoxActivity extends BaseActivity {
    private CheckBox mCheckBox1;
    private CheckBox mCheckBox2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acivtity_checkbutton_test);

        mCheckBox1 = (CheckBox) findViewById(R.id.checkBox1);
        mCheckBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //  buttonView.setChecked(isChecked);
                Toast.makeText(CheckBoxActivity.this, "第1个checkbox" + isChecked, Toast.LENGTH_SHORT).show();
            }
        });

        mCheckBox2 = (CheckBox) findViewById(R.id.checkBox2);
        mCheckBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //  buttonView.setChecked(isChecked);
                Toast.makeText(CheckBoxActivity.this, "第2个checkbox" + isChecked, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
