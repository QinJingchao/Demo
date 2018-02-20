package touch.wireless.tmall.com.tmtouchsdk.data;

import android.app.Activity;

/**
 * Created by jingchaoqinjc on 17/2/19.
 */

public class TestData {

    private String name;
    private Class<? extends Activity> target;

    public TestData(String name, Class<? extends Activity> target) {
        this.name = name;
        this.target = target;
    }

    public String getName() {
        return name;
    }

    public TestData setName(String name) {
        this.name = name;
        return this;
    }

    public Class getTarget() {
        return target;
    }

    public TestData setTarget(Class target) {
        this.target = target;
        return this;
    }
}
