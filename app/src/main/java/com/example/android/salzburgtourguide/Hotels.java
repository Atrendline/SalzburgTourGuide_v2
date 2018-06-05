package com.example.android.salzburgtourguide;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class Hotels extends Fragment {
    ArrayList<Place> townHotels = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.place_list, container, false );

        String hotel[] = getResources().getStringArray( R.array.hotel_content );
        String address[] = getResources().getStringArray( R.array.hotel_address );
        String description[] = getResources().getStringArray( R.array.hotel_description );

        int mArray[] = new int[hotel.length];
        mArray[0] = R.drawable.hotelweisse;
        mArray[1] = R.drawable.hotelrosen;
        mArray[2] = R.drawable.hotelwolf;
        mArray[3] = R.drawable.hotelamadeo;
        mArray[4] = R.drawable.hotelgmachl;


        for (int i = 0; i < hotel.length; i++) {
            Place place = new Place( hotel[i], address[i], description[i], mArray[i] );
            townHotels.add( place );
        }

        PlaceAdapter adapter = new PlaceAdapter( getActivity(), townHotels );
        ListView listView = (ListView) rootView.findViewById( R.id.list );
        listView.setAdapter( adapter );

        return rootView;
    }
}


