package touch.wireless.tmall.com.tmtouchsdk.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

import com.tmall.R;

import touch.wireless.tmall.com.tmtouchsdk.base.BaseActivity;

/**
 * Created by hanting on 17/2/22.
 */
public class GalleryActivity extends BaseActivity {

    ImageView mImageView;
    Gallery mGallery;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_test);

        mImageView = (ImageView) findViewById(R.id.imageview_1);
        mGallery = (Gallery) findViewById(R.id.gallery_1);

        final ImageAdapter imageAdapter = new ImageAdapter(this);
        mGallery.setAdapter(imageAdapter);

        mGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mImageView.setImageResource(imageAdapter.mImageIds[i]);
                Toast.makeText(GalleryActivity.this, " " + i, Toast.LENGTH_LONG).show();

            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mGallery = null;
    }

    public class ImageAdapter extends BaseAdapter {
        private Context mContext;

        private Integer[] mImageIds = {R.mipmap.ic_launcher, R.mipmap.ic_launcher_round,
                R.mipmap.ic_launcher, R.mipmap.ic_launcher_round,
                R.mipmap.ic_launcher, R.mipmap.ic_launcher_round,
                R.mipmap.ic_launcher, R.mipmap.ic_launcher_round};


        public ImageAdapter(Context c) {
            mContext = c;
        }

        @Override
        public int getCount() {
            return mImageIds.length;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int index, View view, ViewGroup viewGroup) {
            ImageView iv = new ImageView(mContext);
            iv.setImageResource(mImageIds[index]);
            iv.setId(index);
            iv.setLayoutParams(new Gallery.LayoutParams(200, 200));
            iv.setScaleType(ImageView.ScaleType.FIT_XY);

            return iv;
        }
    }
}
