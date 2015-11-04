package com.kediavijay.nanodegreeportfolio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

/**
 * Created by vijaykedia on 03/11/15.
 * Custom adaptor which will work with button in ListView
 */
public class AppListAdapter extends ArrayAdapter<String> {

    private final int resource;
    @NonNull private final List<String> appNameList;

    @NonNull private final Toast toast;

    @SuppressLint("ShowToast")
    public AppListAdapter(Context context, int resource, @NonNull final List<String> appNameList) {
        super(context, resource, appNameList);
        this.resource = resource;
        this.appNameList = appNameList;
        toast = Toast.makeText(getContext(), "temp", Toast.LENGTH_SHORT);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final Button button;
        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            convertView = layoutInflater.inflate(resource, parent, false);
            button = (Button) convertView.findViewById(R.id.app_list_item_button);
            convertView.setTag(button);
        } else {
             button= (Button) convertView.getTag();
        }
        button.setText(appNameList.get(position));

        // Customizing toast message
        final String message = "This will open " + appNameList.get(position) + " app";

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.setText(message);
                toast.show();
            }
        });
        return convertView;
    }
}
