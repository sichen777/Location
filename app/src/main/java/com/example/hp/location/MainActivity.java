package com.example.hp.location;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.MyLocationData;

public class MainActivity extends AppCompatActivity {

    private MapView mMapView = null;
    private BaiduMap mBaiduMap;
    private LocationClient mLocationClient;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取地图控件引用
        mMapView = (MapView) findViewById(R.id.bmapView);

    }



   @Override
protected void onResume() {
    mMapView.onResume();
    super.onResume();
}

@Override
protected void onPause() {
    mMapView.onPause();
    super.onPause();
}

@Override
protected void onDestroy() {
    mLocationClient.stop();
    mBaiduMap.setMyLocationEnabled(false);
    mMapView.onDestroy();
    mMapView = null;
    super.onDestroy();
}


}








