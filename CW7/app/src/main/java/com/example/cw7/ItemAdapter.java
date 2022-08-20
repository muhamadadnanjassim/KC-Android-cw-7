package com.example.cw7;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemAdapter extends ArrayAdapter<item> {

    List<item> itemsList2;

    public ItemAdapter(@NonNull Context context, int resource, @NonNull List<item> objects) {
        super(context, resource, objects);
        itemsList2 = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        item currentItem = itemsList2.get(position);

        TextView ItemName = v.findViewById(R.id.ItemName);
        TextView ItemPrice = v.findViewById(R.id.ItemPrice);
        ImageView ItemImage = v.findViewById(R.id.ItemImage);

        ItemName.setText(currentItem.getItemName());
        ItemPrice.setText(currentItem.toString());
        ItemImage.setImageResource(currentItem.getItemImage());

        return v;
    }
}