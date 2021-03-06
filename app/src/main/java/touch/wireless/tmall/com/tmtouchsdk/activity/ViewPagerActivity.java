package touch.wireless.tmall.com.tmtouchsdk.activity;

import android.os.Bundle;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.tmall.R;

import java.util.ArrayList;
import java.util.List;

import touch.wireless.tmall.com.tmtouchsdk.adapter.ViewPagerAdapter;
import touch.wireless.tmall.com.tmtouchsdk.base.BaseActivity;

/**
 * Created by jingchaoqinjc on 17/5/29.
 */

public class ViewPagerActivity extends BaseActivity {


    private ViewPager mPager = null;
    private ViewPagerAdapter mAdapter = null;
    //数据源
//    private List<View> viewList = null;
//    private List<String> titleList = null;

    // 标题
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_test);
        initViews();
        mAdapter = new ViewPagerAdapter();
        mPager.setAdapter(mAdapter);

    }

    private void initViews() {
        mPager = (ViewPager) findViewById(R.id.view_pager);
    }

}
