package touch.wireless.tmall.com.tmtouchsdk.adapter;

import android.support.v4.view.PagerAdapter;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by jingchaoqinjc on 17/5/29.
 */

public class ViewPagerAdapter extends PagerAdapter {

    View[] views = new View[10];

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    // 实例化一个页卡
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        if (views[position % 10] == null) {
            TextView textView = new TextView(container.getContext());
            textView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            textView.setText("" + position);
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 40);
            textView.setGravity(Gravity.CENTER);
            views[position % 10] = textView;
        }
        ((TextView) views[position % 10]).setText("" + position);
        container.addView(views[position % 10]);
        return views[position % 10];
    }

    // 销毁一个页卡
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        View view = views[position % 10];
        if (view != null) {
            container.removeView(view);
        }
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
