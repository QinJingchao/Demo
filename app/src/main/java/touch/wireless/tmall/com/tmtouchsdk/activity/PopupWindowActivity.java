package touch.wireless.tmall.com.tmtouchsdk.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.tmall.R;

import touch.wireless.tmall.com.tmtouchsdk.base.BaseActivity;

/**
 * Created by jingchaoqinjc on 17/4/21.
 */

public class PopupWindowActivity extends BaseActivity {

    private Button mContextButton;
    private Button mActivityButton;

    private PopupWindow mContextPopupWindow;
    private PopupWindow mActivityPopupWindow;

    private TextView mContextPopupName;
    private TextView mActivityPopupName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_test);

        mContextPopupName = (TextView) findViewById(R.id.context_popup_name);
        mActivityPopupName = (TextView) findViewById(R.id.activity_popup_name);

        mContextPopupWindow = new PopupWindow(LayoutInflater.from(this.getApplicationContext()).inflate(R.layout.popup_test, null), 400, 400);
        mContextPopupWindow.setOutsideTouchable(true);

        mContextButton = (Button) findViewById(R.id.context_button);
        mContextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContextPopupWindow.showAsDropDown(mContextButton);

            }
        });


        mActivityPopupWindow = new PopupWindow(LayoutInflater.from(this).inflate(R.layout.popup_test, null), 400, 400);
        mActivityPopupWindow.setOutsideTouchable(true);

        mActivityButton = (Button) findViewById(R.id.activity_button);
        mActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mActivityPopupWindow.showAsDropDown(mActivityButton);
            }
        });

        findViewById(R.id.dismiss).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContextPopupWindow.dismiss();
                mActivityPopupWindow.dismiss();
            }
        });


    }


}
