package com.myapplicationdev.android.demodatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;



import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    private ArrayList<Task> tasks;
    private Context context;
    private int layout_id;
    private TextView tvID, tvDesc, tvDate;

    public CustomAdapter(Context context, int resource, ArrayList<Task> objects) {
        super(context, resource, objects);

        tasks = objects;
        layout_id = resource;
        this.context = context;
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        tvID = (TextView) rowView.findViewById(R.id.tvID);
        tvDesc = (TextView) rowView.findViewById(R.id.tvDesc);
        tvDate = (TextView) rowView.findViewById(R.id.tvDate);

        Task curent = tasks.get(position);
        String id = Integer.toString(curent.getId());

        tvID.setText(id);
        tvDesc.setText(curent.getDescription());
        tvDate.setText(curent.getData());


        return rowView;

    }
}
