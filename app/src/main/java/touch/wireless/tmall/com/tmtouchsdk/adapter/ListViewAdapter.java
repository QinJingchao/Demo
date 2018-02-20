package touch.wireless.tmall.com.tmtouchsdk.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.tmall.R;

/**
 * Created by jingchaoqinjc on 17/2/16.
 */

public class ListViewAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        return 1000;
    }

    @Override
    public Object getItem(int position) {
        return new Object();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_test, null);
            ViewHolder viewHolder = new ViewHolder((TextView) convertView.findViewById(R.id.id_num));
            convertView.setTag(viewHolder);
            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(parent.getContext(), ""+position, Toast.LENGTH_SHORT).show();
                }
            });
        }
        ViewHolder viewHolder = (ViewHolder) convertView.getTag();
        viewHolder.textView.setText("" + (position));

        return convertView;
    }

    private static class ViewHolder {
        TextView textView;

        public ViewHolder(TextView textView) {
            this.textView = textView;
        }
    }
}
