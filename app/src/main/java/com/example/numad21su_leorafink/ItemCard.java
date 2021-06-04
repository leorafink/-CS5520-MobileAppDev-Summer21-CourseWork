package com.example.numad21su_leorafink;


import android.os.Parcel;
import android.os.Parcelable;

public class ItemCard implements ItemClickListener {

    private final String name;
    private final String url;


    //Constructor
    public ItemCard(String name, String url) {

        this.name = name;
        this.url = url;
    }

    //Getters for the imageSource, itemName and itemDesc

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public void onItemClick(int position) {
        //isChecked = !isChecked;
    }

//    @Override
//    public void onCheckBoxClick(int position) {
//        isChecked = !isChecked;
//    }

}
