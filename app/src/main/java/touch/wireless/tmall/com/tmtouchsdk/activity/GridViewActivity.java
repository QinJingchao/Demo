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

    private GridView gridView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_test);
        gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(new ListViewAdapter());
//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(GridViewActivity.this, "item click position:" + position, Toast.LENGTH_SHORT).show();
//            }
//        });

//        gridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(GridViewActivity.this, "item long click position:" + position, Toast.LENGTH_SHORT).show();
//                return false;
//            }
//        });


    }

}
