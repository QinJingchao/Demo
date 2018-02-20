package touch.wireless.tmall.com.tmtouchsdk;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.tmall.R;

import touch.wireless.tmall.com.tmtouchsdk.adapter.TestDataAdapter;
import touch.wireless.tmall.com.tmtouchsdk.base.BaseActivity;
import touch.wireless.tmall.com.tmtouchsdk.data.TestData;

public class MainActivity extends BaseActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getWindow().setBackgroundDrawable(null);
//        getWindow().getDecorView().setBackgroundDrawable(null);
        setContentView(R.layout.activity_main);

//        try {
//            Thread.sleep(30000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        listView = (ListView) findViewById(R.id.main_list);
        BaseAdapter adapter = new TestDataAdapter();
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Adapter adapter = parent.getAdapter();
                TestData data = (TestData) adapter.getItem(position);
                if (data.getTarget() != null) {
                    Intent intent = new Intent(MainActivity.this, data.getTarget());
                    intent.setPackage("com.tmall");
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "不好意思，改功能正在加紧开发,尽请期待", Toast.LENGTH_SHORT)
                            .show();
                }
            }
        });

    }


    @Override
    public void onLowMemory() {
        super.onLowMemory();

        System.out.println("Telescope" + System.currentTimeMillis() + "onLowMemory");
    }

}
