package touch.wireless.tmall.com.tmtouchsdk.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.tmall.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jingchaoqinjc on 17/10/16.
 */

public class NestedScrollViewActivity extends AppCompatActivity {

    List<String> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nested_test);
        initData(1);
        initView();
    }

    private void initData(int pager) {
        mData = new ArrayList<>();
        for (int i = 1; i < 50; i++) {
            mData.add("pager" + pager + " 第" + i + "个item");
        }
    }

    private void initView() {
        //设置ToolBar
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        toolbar.setTitle("");
//        toolbar.setNavigationContentDescription("Back");
//        setSupportActionBar(toolbar);//替换系统的actionBar

        setScrollViewContent();
    }

    /**
     * 刷新ScrollView的内容
     */
    private void setScrollViewContent() {
        //NestedScrollView下的LinearLayout
        LinearLayout layout = (LinearLayout) findViewById(R.id.ll_sc_content);
        layout.removeAllViews();
        for (int i = 0; i < mData.size(); i++) {
            View view = View.inflate(NestedScrollViewActivity.this, R.layout.data_item_test, null);
            ((TextView) view.findViewById(R.id.data_item)).setText(mData.get(i));

            final int index = i;
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(NestedScrollViewActivity.this, "item  click position:" + index, Toast.LENGTH_SHORT).show();
                }
            });
            //动态添加 子View
            layout.addView(view, i);
        }
    }

}
