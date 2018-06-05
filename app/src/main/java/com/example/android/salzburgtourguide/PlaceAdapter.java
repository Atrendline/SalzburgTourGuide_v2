package com.example.android.salzburgtourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class PlaceAdapter extends ArrayAdapter {
    public PlaceAdapter(@NonNull Context context, @NonNull List objects) {
        super( context, 0, objects );
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from( getContext() ).inflate(
                    R.layout.place_item, parent, false );
        }

        Place currentPlace = (Place) getItem( position );

        TextView name = (TextView) listItemView.findViewById( R.id.placeName );
        name.setText( currentPlace.getName() );

        TextView address = (TextView) listItemView.findViewById( R.id.placeAddress );
        address.setText( currentPlace.getAddress() );

        TextView description = (TextView) listItemView.findViewById( R.id.placeDescription );
        if (currentPlace.getDescription() != null) {
            description.setText( currentPlace.getDescription() );
            description.setVisibility( View.VISIBLE );
        } else {
            description.setVisibility( View.GONE );
        }

        ImageView image = (ImageView) listItemView.findViewById( R.id.placePic );
        image.setImageResource( currentPlace.getImage() );

        return listItemView;
    }
}


