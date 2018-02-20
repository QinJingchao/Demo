package touch.wireless.tmall.com.tmtouchsdk.activity;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.tmall.R;

import touch.wireless.tmall.com.tmtouchsdk.base.BaseActivity;

/**
 * Created by jingchaoqinjc on 17/2/19.
 */

// TODO: 17/2/24 设备兼容性问题需要处理
public class DialogActivity extends BaseActivity implements View.OnClickListener {

    TextView textView1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_test);
        textView1 = (TextView) findViewById(R.id.textview);
        textView1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        final Dialog dialog = new Dialog(DialogActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_test);
        TextView view1 = (TextView) dialog.findViewById(R.id.textview);
        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dialog.isShowing()) {
                    dialog.dismiss();
                }
            }
        });
        if (!dialog.isShowing()) {
            dialog.show();
        }
    }
}
