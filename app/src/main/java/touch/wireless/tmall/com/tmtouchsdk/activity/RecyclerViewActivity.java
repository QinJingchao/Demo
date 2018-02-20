package touch.wireless.tmall.com.tmtouchsdk.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import android.widget.Toast;

import com.tmall.R;

import java.util.ArrayList;
import java.util.List;

import touch.wireless.tmall.com.tmtouchsdk.adapter.RecyclerViewAdapter;
import touch.wireless.tmall.com.tmtouchsdk.base.BaseActivity;

/**
 * Created by liangjianzhao on 17/2/23.
 */
public class RecyclerViewActivity extends BaseActivity {

    private RecyclerView mRecyclerView;
    private RecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acivtity_recycler_test);

        mRecyclerView = (RecyclerView) findViewById(R.id.id_recyclerview);

        //mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        mAdapter = new RecyclerViewAdapter(this, initData());
        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.addOnItemTouchListener(new RecyclerViewClickListener(this, new RecyclerViewClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(RecyclerViewActivity.this, "Click " + position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemLongClick(View view, int position) {
                Toast.makeText(RecyclerViewActivity.this, "Long Click " + position, Toast.LENGTH_SHORT).show();
            }
        }));
    }

    protected List<String> initData() {
        List<String> datas = new ArrayList<String>();
        for (int i = 1; i <= 1000; i++) {
            datas.add("" + i);
        }
        return datas;
    }

    public static class RecyclerViewClickListener implements RecyclerView.OnItemTouchListener {

        private int mLastDownX, mLastDownY;
        //该值记录了最小滑动距离
        private int touchSlop;
        private OnItemClickListener mListener;
        //是否是单击事件
        private boolean isSingleTapUp = false;
        //是否是长按事件
        private boolean isLongPressUp = false;
        private boolean isMove = false;
        private long mDownTime;

        //内部接口，定义点击方法以及长按方法
        public interface OnItemClickListener {
            void onItemClick(View view, int position);

            void onItemLongClick(View view, int position);
        }

        public RecyclerViewClickListener(Context context, OnItemClickListener listener) {
            touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            mListener = listener;
        }

        @Override
        public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
            int x = (int) e.getX();
            int y = (int) e.getY();
            switch (e.getAction()) {

                case MotionEvent.ACTION_DOWN:
                    mLastDownX = x;
                    mLastDownY = y;
                    mDownTime = System.currentTimeMillis();
                    isMove = false;
                    break;

                case MotionEvent.ACTION_MOVE:
                    if (Math.abs(x - mLastDownX) > touchSlop || Math.abs(y - mLastDownY) > touchSlop) {
                        isMove = true;
                    }
                    break;

                case MotionEvent.ACTION_UP:
                    if (isMove) {
                        break;
                    }
                    if (System.currentTimeMillis() - mDownTime > 1000) {
                        isLongPressUp = true;
                    } else {
                        isSingleTapUp = true;
                    }
                    break;
            }
            if (isSingleTapUp) {
                //根据触摸坐标来获取childView
                View childView = rv.findChildViewUnder(e.getX(), e.getY());
                isSingleTapUp = false;
                if (childView != null) {
                    //回调mListener#onItemClick方法
                    mListener.onItemClick(childView, rv.getChildLayoutPosition(childView));
                    return true;
                }
                return false;
            }
            if (isLongPressUp) {
                View childView = rv.findChildViewUnder(e.getX(), e.getY());
                isLongPressUp = false;
                if (childView != null) {
                    mListener.onItemLongClick(childView, rv.getChildLayoutPosition(childView));
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override
        public void onTouchEvent(RecyclerView rv, MotionEvent e) {

        }

        @Override
        public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

        }
    }

}
