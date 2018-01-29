package fr.wcs.testrecyclerview.ListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import fr.wcs.testrecyclerview.R;

/**
 * Created by apprenti on 11/30/17.
 */

public class LauraAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<LauraModel> mArrayList;

    public LauraAdapter(Context context, ArrayList<LauraModel> arrayList) {
        this.mContext = context;
        this.mArrayList = arrayList;
    }

    @Override
    public int getCount() {
        return mArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return mArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_laura, parent, false);
        }

        LauraModel lauraModel = (LauraModel) getItem(position);

        TextView name = convertView.findViewById(R.id.name);
        TextView address = convertView.findViewById(R.id.address);
        TextView age = convertView.findViewById(R.id.age);

        name.setText(lauraModel.getName());
        address.setText(lauraModel.getAdress());
        age.setText(lauraModel.getAge());

        return convertView;
    }
}
