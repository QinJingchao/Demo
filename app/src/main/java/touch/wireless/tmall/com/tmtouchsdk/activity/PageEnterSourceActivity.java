package touch.wireless.tmall.com.tmtouchsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.tmall.R;

import touch.wireless.tmall.com.tmtouchsdk.base.BaseActivity;

/**
 * Created by jingchaoqinjc on 17/5/29.
 */

public class PageEnterSourceActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_test);
        TextView textView = (TextView) findViewById(R.id.page_enter);

        boolean z = true;
        byte b = 1;
        char c = 'A';
        short s = 1;
        int i = 1;
        float f = 1.0f;
        long l = 1l;
        double d = 1.0;

        StringBuilder stringBuilder = new StringBuilder("PageEnterSourceActivity:Jump\n");
        stringBuilder.append("z:").append(z).append("\n")
                .append("b:").append(b).append("\n")
                .append("c:").append(c).append("\n")
                .append("s:").append(s).append("\n")
                .append("i:").append(i).append("\n")
                .append("f:").append(f).append("\n")
                .append("l:").append(l).append("\n")
                .append("d:").append(d).append("\n")
                .append("string:").append("TEST");

        textView.setText(stringBuilder.toString());
        textView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
