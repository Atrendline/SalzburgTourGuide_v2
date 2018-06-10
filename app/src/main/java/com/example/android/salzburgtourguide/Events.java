package com.example.android.salzburgtourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Events extends Fragment {

    ArrayList<Place> townEvents = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.place_list, container, false );

        String dining[] = getResources().getStringArray( R.array.events_content );
        String address[] = getResources().getStringArray( R.array.events_address );
        String description[] = getResources().getStringArray( R.array.events_description );

        int mArray[] = new int[dining.length];
        mArray[0] = R.drawable.mozart;
        mArray[1] = R.drawable.concert;
        mArray[2] = R.drawable.sommer;
        mArray[3] = R.drawable.magic;
        mArray[4] = R.drawable.tour;

        for (int i = 0; i < dining.length; i++) {
            Place place = new Place( dining[i], address[i], description[i], mArray[i] );
            townEvents.add( place );
        }

        PlaceAdapter adapter = new PlaceAdapter( getActivity(), townEvents );
        ListView listView = (ListView) rootView.findViewById( R.id.list );
        listView.setAdapter( adapter );

        return rootView;
    }
}

