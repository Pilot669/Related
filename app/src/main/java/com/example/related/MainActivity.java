package com.example.related;


import android.app.Activity;
import android.os.Bundle;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.mapview.MapView;

public class MainActivity extends Activity {

    private MapView mapView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        MapKitFactory.setApiKey("ec9c5eca-4299-48f6-9ab1-12aaeeb7cbfd");
        MapKitFactory.initialize(this);

        setContentView(R.layout.activity_maps);

        mapView = (MapView)findViewById(R.id.mapView);

//        addMarker();
        onStart();
        onStop();

        mapView.getMap().move(
                new CameraPosition(new Point(55.751574, 37.573856), 11.0f, 0.0f, 0.0f),
                new Animation(Animation.Type.SMOOTH, 0),
                null);
    }
    // добаваляем маркер
//    private void addMarker(){
//        if (null != mapView){
//            mapView.addMarker(new MarkerOptions()
//            .position(new LatLng(0,0)))
//                    .title("Marker")
//                    .draggable(true)
//        };
//    }

    @Override
    protected void onStop() {

        mapView.onStop();
        MapKitFactory.getInstance().onStop();
        super.onStop();
    }

    @Override
    protected void onStart() {

        super.onStart();
        MapKitFactory.getInstance().onStart();
        mapView.onStart();
    }
}

