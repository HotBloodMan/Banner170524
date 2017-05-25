package com.ljt.banner170524;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements BannerView.BannerItemClick {

    private BannerView bannerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bannerView = (BannerView) findViewById(R.id.banner);
        int[] ints = {R.mipmap.ima1, R.mipmap.ima2, R.mipmap.ima3};
//        bannerView.setImageForId(ints);
        String[] strings={"http://imgbbs.heiguang.net/forum/201510/06/104432cjc7c8tx7xxqqkgq.jpg",
                "http://pic30.nipic.com/20130626/8174275_085522448172_2.jpg",
                "http://pic18.nipic.com/20111215/577405_080531548148_2.jpg",
                "http://pic15.nipic.com/20110722/2912365_092519919000_2.jpg"};
         bannerView.setImageForUrl(strings);
        bannerView.setDelayTime(500);
        bannerView.setItemClickListener(this);
    }

    @Override
    public void OnBannnerItemClick(Object o) {
        Toast.makeText(this, o.toString(), Toast.LENGTH_SHORT).show();
    }
}
