package touch.wireless.tmall.com.tmtouchsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.tmall.R;

import touch.wireless.tmall.com.tmtouchsdk.adapter.ListViewAdapter;

/**
 * Created by jingchaoqinjc on 17/10/1.
 */

public class GridViewActivity extends Activity {

    private GridView mGridView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_test);
        mGridView = (GridView) findViewById(R.id.gridview);
        mGridView.setAdapter(new ListViewAdapter());
    }

}
