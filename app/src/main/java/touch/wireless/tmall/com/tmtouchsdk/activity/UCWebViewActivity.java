package touch.wireless.tmall.com.tmtouchsdk.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.view.Window;

import com.tmall.R;
import com.uc.webview.export.WebView;

import touch.wireless.tmall.com.tmtouchsdk.base.BaseActivity;

/**
 * Created by jingchaoqinjc on 17/3/1.
 */

public class UCWebViewActivity extends BaseActivity {

    private WebView webView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        // 隐藏标题栏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_uc_webview_test);
        webView = (WebView) findViewById(R.id.webview);
        webView.setWebChromeClient(new WVUCWebChromeClient());
        webView.setWebViewClient(new WVUCWebViewClient(this));
        webView.loadUrl("https://mbd.baidu.com/webpage?action=icard&type=subscribe&channel=wise_home");

    }
}
