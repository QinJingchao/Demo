package touch.wireless.tmall.com.tmtouchsdk.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.tmall.R;

import touch.wireless.tmall.com.tmtouchsdk.base.BaseActivity;

/**
 * Created by jingchaoqinjc on 17/3/6.
 */

public class ScrollViewActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_test);
        View view = findViewById(R.id.scroll_view_text);

        ViewGroup viewGroup = (ViewGroup) view.getParent();

        for (int i = 0, size = viewGroup.getChildCount(); i < size; i++) {
            View child = viewGroup.getChildAt(i);
            child.setOnClickListener(this);
        }

    }

    @Override
    public void onClick(View v) {
        if (v instanceof TextView) {
            Toast.makeText(ScrollViewActivity.this, "Click:" + ((TextView) v).getText(), Toast.LENGTH_SHORT).show();
        }
    }
}
