package touch.wireless.tmall.com.tmtouchsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;

import com.tmall.R;

import touch.wireless.tmall.com.tmtouchsdk.service.WindowManagerService;

/**
 * Created by jingchaoqinjc on 17/3/11.
 */

public class ServiceActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startService(new Intent(this, WindowManagerService.class));

    }
}
