package com.example.student.baitap;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemListView extends ArrayAdapter<Item> {
    private final Context context;
    private final Item[] items;

    public ItemListView(Context context, Item[] items) {
        super(context, -1, items);
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.layout_row, parent, false);

        ImageView imageView = rowView.findViewById(R.id.label);
        int id = context.getResources().getIdentifier("com.example.student.baitap:drawable/" + items[position].getImagePath(), null, null);
        imageView.setImageResource(id);
        setViewCallback(rowView, items[position].getUrl());

        return rowView;
    }

    private void setViewCallback(View view, final String url) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                context.startActivity(browserIntent);
            }
        });
    }
}
