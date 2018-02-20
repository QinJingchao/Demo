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

    Button contextButton;
    Button activityButton;

    PopupWindow contextPopupWindow;
    PopupWindow activityPopupWindow;

    TextView contextPopupName;
    TextView activityPopupName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_test);

        contextPopupName = (TextView) findViewById(R.id.context_popup_name);
        activityPopupName = (TextView) findViewById(R.id.activity_popup_name);

        contextPopupWindow = new PopupWindow(LayoutInflater.from(this.getApplicationContext()).inflate(R.layout.popup_test, null), 400, 400);
        contextPopupWindow.setOutsideTouchable(true);

        contextButton = (Button) findViewById(R.id.context_button);
        contextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contextPopupWindow.showAsDropDown(contextButton);

            }
        });


        activityPopupWindow = new PopupWindow(LayoutInflater.from(this).inflate(R.layout.popup_test, null), 400, 400);
        activityPopupWindow.setOutsideTouchable(true);

        activityButton = (Button) findViewById(R.id.activity_button);
        activityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityPopupWindow.showAsDropDown(activityButton);
            }
        });

        findViewById(R.id.dismiss).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contextPopupWindow.dismiss();
                activityPopupWindow.dismiss();
            }
        });


    }


}
