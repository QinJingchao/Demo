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

//import com.ali.telescope.api.Telescope;
////import com.ali.telescope.base.plugin.INameConverter;
////import com.ali.telescope.ui.TelescopeUI;
////import com.ali.telescope.util.TelescopeLog;
//import com.ali.telescope.base.plugin.INameConverter;
//import com.ali.telescope.util.TelescopeLog;
//import com.ali.test.Test;
//import com.ali.watchmem.core.INativeLowMemoryListener;
//import com.ali.watchmem.core.WatchmemLevel;
//import com.ali.watchmem.core.WatchmemNativeMemoryManager;

import com.ali.watchmem.Watchmem;
import com.ali.watchmem.core.WatchmemActivityManager;

import java.io.IOException;
import java.lang.reflect.Method;
//import com.tmall.galileo.api.Galileo;
//import com.tmall.wireless.scriptmanager.ScriptManager;
//import com.tmall.wireless.scriptmanager.console.ScriptExchangeConsole;
//import com.tmall.wireless.touchsdk.utils.EventProcessUtils;


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


//        new GCDetector();

//        new Thread() {
//            @Override
//            public void run() {
//                super.run();
//                Test.memLeak(EventApplication.this);
//            }
//        }.start();

//        WatchmemNativeMemoryManager.instance().addNativeLowMemoryListener(new INativeLowMemoryListener() {
//            @Override
//            public void onNativeLowMemory(WatchmemLevel level) {
//                if (level == WatchmemLevel.CRITICAL) {
//                    System.out.println("WatchmemLevel.CRITICAL");
//                    Test.stop = true;
//                }
//            }
//        });

//        test();

//        initTelescope();
//        initTouchSDK();
//        Galileo.launch(this);
//        TouchSDK.init(this, true);
//        ViewManagerManager.getInstance().addFactory(new TracesViewManagerFactory());
//
//        EventWeakViewManager manager = EventWeakViewManager.instance();
//
//        String pageName = "MainActivity_DecorView";
//        EventWeakPage.Builder builder = new EventWeakPage.Builder();
//        builder.setId("id:valid:main_list Lw8");
//        EventWeakPage.WeakViewInfo info = builder.build();
//        manager.addEventWeakView(new EventWeakPage(pageName, info));

//        ScriptManager.init(this, true, true, "tmall_android");
//        CrashReporter.getInstance().initialize(this, "jdjddhdg", "383366", "5.31.1", "20600", null);
//        CrashReporter.getInstance().enable();
//        ScriptManager.init(this, true, true, "tmall_android");
//
////        NewConsole.instance().show();
//        if (this.getPackageName().equals(EventProcessUtils.getCurProcessName(this))) {
//            ScriptExchangeConsole.instance().show();
//        }
//        SpiderSDK.init(this, true);
//        WindowHook.init(this, true);
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
