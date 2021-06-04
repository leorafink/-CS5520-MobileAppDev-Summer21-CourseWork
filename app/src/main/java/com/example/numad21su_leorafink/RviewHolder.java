package com.example.numad21su_leorafink;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RviewHolder extends RecyclerView.ViewHolder {
  //  public ImageView itemIcon;
    public TextView name;
    public TextView url;
   // public CheckBox checkBox;

    public RviewHolder(View itemView, final ItemClickListener listener) {
        super(itemView);
    //    itemIcon = itemView.findViewById(R.id.item_icon);
        name = itemView.findViewById(R.id.name);
        url = itemView.findViewById(R.id.url);
    //    checkBox = itemView.findViewById(R.id.checkbox);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    int position = getLayoutPosition();
                    if (position != RecyclerView.NO_POSITION) {

                        listener.onItemClick(position);
                    }
                }
            }
        });

//        checkBox.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (listener != null) {
//                    int position = getLayoutPosition();
//                    if (position != RecyclerView.NO_POSITION) {
//                        listener.onCheckBoxClick(position);
//                    }
//                }
//            }
//        });
    }
}
