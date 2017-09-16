package com.example.samyuktha.mapsprac;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

/**
 * Created by samyuktha on 9/15/2017.
 */

public class CustomInfoViewAdapter implements GoogleMap.InfoWindowAdapter {



        private final LayoutInflater mInflater;
        public CustomInfoViewAdapter(LayoutInflater inflater) {
            this.mInflater = inflater;
        }
        @Override public View getInfoWindow(Marker marker) {
            final View popup = mInflater.inflate(R.layout.infobubble, null);

            TextView name = (TextView)popup.findViewById(R.id.text2);
            TextView lat = (TextView) popup.findViewById(R.id.text4);
            TextView longs = (TextView) popup.findViewById(R.id.text41);
            TextView  address = (TextView) popup.findViewById(R.id.text6);

            LatLng ll =marker.getPosition();
            Double latso=ll.latitude;
            Double longso = ll.longitude;
            name.setText(marker.getTitle());
            lat.setText(latso.toString());
            longs.setText(longso.toString());
            address.setText(marker.getSnippet());
            return popup;

        }
        @Override public View getInfoContents(Marker marker) {
            final View popup = mInflater.inflate(R.layout.infobubble, null);

            TextView name = (TextView)popup.findViewById(R.id.text2);
            TextView lat = (TextView) popup.findViewById(R.id.text4);
            TextView longs = (TextView) popup.findViewById(R.id.text41);
            TextView  address = (TextView) popup.findViewById(R.id.text6);

            LatLng ll =marker.getPosition();
            Double latso=ll.latitude;
            Double longso = ll.longitude;
            name.setText(marker.getTitle());
            lat.setText(latso.toString());
            longs.setText(longso.toString());
            address.setText(marker.getSnippet());

            return popup;
        }

}
