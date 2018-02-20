package touch.wireless.tmall.com.tmtouchsdk;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import android.os.Debug;
import android.util.Log;

import com.ali.watchmem.Watchmem;
import com.ali.watchmem.core.WatchmemActivityManager;

import java.io.IOException;
import java.lang.reflect.Method;


/**
 * Created by jingchaoqinjc on 17/2/13.
 */

public class EventApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }


    @Override
    public void onCreate() {
        super.onCreate();

        Debug.startMethodTracing(this.getFilesDir() + "/test");
        Watchmem.init(this);
        Watchmem.registerCallback(new WatchmemActivityManager.ForceFinishActivityCallback() {
            @Override
            public void callback(String info) {
                Log.i("EventApplication", info);
            }
        });
        initTelescope();
        Debug.stopMethodTracing();

        this.getApplicationContext().getSharedPreferences("", 0);
    }

    private void initTouchSDK() {
//        ScriptManager.init(this, true, true, "tmall_android");
    }

    private void initTelescope() {
//        TelescopeWebViewSDK.init(this);

//        TelescopeUI.init(this);
//        Telescope.TelescopeConfig config = new Telescope.TelescopeConfig()
//                .application(this)
//                .logLevel(TelescopeLog.LOG_LEVEL_I)
//                .strictMode(true)
//                .appKey("23181017")
//                .appVersion("1.0.0")
//                .packageName("com.taobao.taobao")
//                .nameConverter(INameConverter.DEFAULT_CONVERTR)
//                .channel("123");
//        Telescope.start(config);


    }

    @Override
    public Context getBaseContext() {
        Context context = super.getBaseContext();
        if (context instanceof ContextWrapper) {
            return ((ContextWrapper) context).getBaseContext();
        }

        return context;
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();

        System.out.println("Telescope" + System.currentTimeMillis() + "onLowMemory");
    }


    @TargetApi(19)
    private static boolean openLmkdSocket() {
        try {
            LocalSocket sLmkdSocket = new LocalSocket(LocalSocket.SOCKET_SEQPACKET);
            sLmkdSocket.connect(
                    new LocalSocketAddress("lmkd",
                            LocalSocketAddress.Namespace.RESERVED));
        } catch (IOException ex) {
            return false;
        }

        return true;
    }

    private Object test() {
        try {
            Class clazz = Class.forName("com.android.server.am.ProcessList");
            Object o = clazz.newInstance();
            Method method = clazz.getDeclaredMethod("updateOomLevels", int.class, int.class, boolean.class);
            method.setAccessible(true);
            method.invoke(o, 0, 0, false);
            return o;
        } catch (Exception e) {
            e.printStackTrace();
        }

        ActivityManager activityManager;
        return null;
    }

}
