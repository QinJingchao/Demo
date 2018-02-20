package touch.wireless.tmall.com.tmtouchsdk.data;

import android.app.Activity;

/**
 * Created by jingchaoqinjc on 17/2/19.
 */

public class TestData {

    private String mName;
    private Class<? extends Activity> mTarget;

    public TestData(String name, Class<? extends Activity> target) {
        this.mName = name;
        this.mTarget = target;
    }

    public String getName() {
        return mName;
    }

    public TestData setName(String name) {
        this.mName = name;
        return this;
    }

    public Class getTarget() {
        return mTarget;
    }

    public TestData setTarget(Class target) {
        this.mTarget = target;
        return this;
    }
}
