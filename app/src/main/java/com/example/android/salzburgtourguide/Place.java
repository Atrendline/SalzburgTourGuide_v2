package com.example.android.salzburgtourguide;

public class Place {
    private String mName;
    private String mAddress;
    private String mDescription;
    private int imageResourceId;

    public Place(String name, String address, String description, int imageResourceId) {
        this.mName = name;
        this.mAddress = address;
        this.mDescription = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getImage() {
        return imageResourceId;
    }
}
