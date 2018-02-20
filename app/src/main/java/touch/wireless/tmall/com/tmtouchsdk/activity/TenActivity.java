package touch.wireless.tmall.com.tmtouchsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.tmall.R;

import touch.wireless.tmall.com.tmtouchsdk.base.BaseActivity;

/**
 * Created by jingchaoqinjc on 17/8/29.
 */

public class TenActivity extends BaseActivity implements View.OnClickListener {

    View nextPage;
    View prePage;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten_test);

        nextPage = findViewById(R.id.button_next);
        nextPage.setOnClickListener(this);

        prePage = findViewById(R.id.button_back);
        prePage.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.button_next: {
                Intent intent = new Intent(this, this.getClass());
                startActivity(intent);
                break;
            }
            case R.id.button_back: {
                finish();
                break;
            }
        }
    }
}
