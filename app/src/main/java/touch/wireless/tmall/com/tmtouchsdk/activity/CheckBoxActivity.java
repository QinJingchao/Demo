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
    CheckBox button1;
    CheckBox button2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acivtity_checkbutton_test);

        button1 = (CheckBox) findViewById(R.id.checkBox1);

        button1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //  buttonView.setChecked(isChecked);
                Toast.makeText(CheckBoxActivity.this, "第1个checkbox" + isChecked, Toast.LENGTH_SHORT).show();
            }
        });

        button2 = (CheckBox) findViewById(R.id.checkBox2);

        button2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //  buttonView.setChecked(isChecked);
                Toast.makeText(CheckBoxActivity.this, "第2个checkbox" + isChecked, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
