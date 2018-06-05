package com.example.android.salzburgtourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class Sights extends Fragment {

    ArrayList<Place> townSights = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.place_list, container, false );

        String sights[] = getResources().getStringArray( R.array.sights_content );
        String address[] = getResources().getStringArray( R.array.sights_address );
        String description[] = getResources().getStringArray( R.array.sights_description );

        int mArray[] = new int[sights.length];
        mArray[0] = R.drawable.main;
        mArray[1] = R.drawable.dom;
        mArray[2] = R.drawable.castle;
        mArray[3] = R.drawable.gasse;
        mArray[4] = R.drawable.hellbrunn;
        mArray[5] = R.drawable.mirabell;

        for (int i = 0; i < sights.length; i++) {
            Place place = new Place( sights[i], address[i], description[i], mArray[i] );
            townSights.add( place );
        }

        PlaceAdapter adapter = new PlaceAdapter( getActivity(), townSights );
        ListView listView = (ListView) rootView.findViewById( R.id.list );
        listView.setAdapter( adapter );

        return rootView;
    }
}
