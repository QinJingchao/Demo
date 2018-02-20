package touch.wireless.tmall.com.tmtouchsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.tmall.R;

import touch.wireless.tmall.com.tmtouchsdk.base.BaseActivity;

/**
 * Created by jingchaoqinjc on 17/2/13.
 */

public class ButtonActivity extends BaseActivity implements View.OnClickListener, View.OnLongClickListener {

    Button button1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acivtity_button_test);

        button1 = (Button) findViewById(R.id.button1);

        ViewGroup viewGroup = (ViewGroup) button1.getParent();

        for (int i = 0, size = viewGroup.getChildCount(); i < size; i++) {
            View child = viewGroup.getChildAt(i);
            child.setOnClickListener(this);
            child.setOnLongClickListener(this);
        }

        button1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                throw new NullPointerException();
//                return true;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String title = item.getTitle().toString();
        Toast.makeText(this, title, Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if (v instanceof TextView) {
            Toast.makeText(ButtonActivity.this, "Click:" + ((TextView) v).getText(), Toast.LENGTH_SHORT).show();
        }

        Intent intent = new Intent(ButtonActivity.this, ActionActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onLongClick(View v) {
        if (v instanceof TextView) {
            Toast.makeText(ButtonActivity.this, "LongClick:" + ((TextView) v).getText(), Toast.LENGTH_SHORT).show();
        }
        return true;
    }

}
