package touch.wireless.tmall.com.tmtouchsdk.fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tmall.R;

import touch.wireless.tmall.com.tmtouchsdk.activity.EditTextActivity;

/**
 * Created by jingchaoqinjc on 17/7/14.
 */

public class TestSystemFragment extends Fragment {

    View contentView = null;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        if (contentView == null) {
            contentView = inflater.inflate(R.layout.fragment_test, container, false);
            contentView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(TestSystemFragment.this.getActivity(), EditTextActivity.class);
                    startActivityForResult(intent, 1);
                }
            });
        }
        return contentView;
    }

}
