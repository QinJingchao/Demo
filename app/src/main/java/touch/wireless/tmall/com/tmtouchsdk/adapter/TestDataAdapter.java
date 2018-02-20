package touch.wireless.tmall.com.tmtouchsdk.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.tmall.R;

import touch.wireless.tmall.com.tmtouchsdk.activity.ActionActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.AnimationActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.ButtonActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.CheckBoxActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.DialogActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.EditTextActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.FinishActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.FragmentTestActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.GalleryActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.GridViewActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.ImageActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.ListViewActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.MultiActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.NestedScrollViewActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.OOMTestActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.OverDrawActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.PageEnterSourceActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.PermissionActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.PopupWindowActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.ProcessActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.RadioButtonActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.RecyclerViewActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.ScrollViewActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.ServiceActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.SimpleSmartActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.SlidingPanelActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.SystemFragmentActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.TabActivityActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.TenActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.UCWebViewActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.ViewPagerActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.WebViewActivity;
import touch.wireless.tmall.com.tmtouchsdk.activity.WindowManagerActivity;
import touch.wireless.tmall.com.tmtouchsdk.data.TestData;

/**
 * Created by jingchaoqinjc on 17/2/19.
 */

public class TestDataAdapter extends BaseAdapter {

    TestData[] testDatas = new TestData[]{
            new TestData("OverDraw", OverDrawActivity.class),
            new TestData("TabActivity", TabActivityActivity.class),
            new TestData("Sliding View", SlidingPanelActivity.class),
            new TestData("Action", ActionActivity.class),
            new TestData("Button", ButtonActivity.class),
            new TestData("Process", ProcessActivity.class),
            new TestData("OOM", OOMTestActivity.class),
            new TestData("Animation", AnimationActivity.class),
//            new TestData("Pre Record Fragment", ScriptPreRecordActivity.class),
            new TestData("NestedScrollView", NestedScrollViewActivity.class),

            new TestData("GridView", GridViewActivity.class),
            new TestData("ListView", ListViewActivity.class),
            new TestData("Ten", TenActivity.class),
            new TestData("Dialog", DialogActivity.class),
            new TestData("Recycler", RecyclerViewActivity.class),
            new TestData("CheckBox", CheckBoxActivity.class),
            new TestData("RadioButton", RadioButtonActivity.class),
            new TestData("Gallery", GalleryActivity.class),
            new TestData("EditText", EditTextActivity.class),
            new TestData("WebView", WebViewActivity.class),
            new TestData("UCWebView", UCWebViewActivity.class),
            new TestData("WindowManager", WindowManagerActivity.class),
            new TestData("ScrollView", ScrollViewActivity.class),
            new TestData("Finish", FinishActivity.class),
            new TestData("ServiceWindowManager", ServiceActivity.class),
            new TestData("PopupWindowManager", PopupWindowActivity.class),
            new TestData("ImageActivity", ImageActivity.class),
            new TestData("ViewPagerActivity", ViewPagerActivity.class),
            new TestData("PageEnterActivity", PageEnterSourceActivity.class),
            new TestData("SimpleSmartActivity", SimpleSmartActivity.class),
            new TestData("Permission", PermissionActivity.class),
            new TestData("Fragment", FragmentTestActivity.class),

            new TestData("SystemFragment", SystemFragmentActivity.class),
            new TestData("MultiActivity", MultiActivity.class)

    };

    @Override
    public int getCount() {
        return testDatas.length;
    }

    @Override
    public Object getItem(int position) {
        return testDatas[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_item_test, null);
            convertView.setTag(new ViewHolder((TextView) convertView));
        }
        ViewHolder holder = (ViewHolder) convertView.getTag();
        holder.textView.setText(testDatas[position].getName());
        return convertView;
    }

    private static class ViewHolder {
        TextView textView;

        public ViewHolder(TextView textView) {
            this.textView = textView;
        }
    }
}
