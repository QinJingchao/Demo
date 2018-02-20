package touch.wireless.tmall.com.tmtouchsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.tmall.R;

import java.lang.reflect.Array;

import touch.wireless.tmall.com.tmtouchsdk.base.BaseActivity;

/**
 * Created by jingchaoqinjc on 17/5/29.
 */

public class PageEnterTargetActivity extends BaseActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_test);
        TextView textView = (TextView) findViewById(R.id.page_enter);

        Intent intent = getIntent();
        boolean z = intent.getBooleanExtra("boolean", false);
        byte b = intent.getByteExtra("byte", (byte) 0);
        char c = intent.getCharExtra("char", 'a');
        short s = intent.getShortExtra("short", (short) 0);
        int i = intent.getIntExtra("int", 0);
        float f = intent.getFloatExtra("float", 0f);
        long l = intent.getLongExtra("long", 0l);
        double d = intent.getDoubleExtra("double", 0.0);
        int[] ints = intent.getIntArrayExtra("ints");
        String string = intent.getStringExtra("string");
        Intent intent1 = intent.getParcelableExtra("intent");

        StringBuilder stringBuilder = new StringBuilder("PageEnterTargetActivity:\n");
        stringBuilder.append("z:").append(z).append("\n")
                .append("b:").append(b).append("\n")
//                .append("c:").append(c).append("\n")
//                .append("s:").append(s).append("\n")
//                .append("i:").append(i).append("\n")
                .append("f:").append(f).append("\n")
                .append("l:").append(l).append("\n")
                .append("d:").append(d).append("\n")
                .append("string:").append(string).append("\n")
                .append("ints:").append(ints).append("\n")
                .append("intent:").append(intent1.toString());

        textView.setText(stringBuilder.toString());
    }


}
