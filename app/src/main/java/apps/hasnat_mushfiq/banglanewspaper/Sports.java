package apps.hasnat_mushfiq.banglanewspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class Sports extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        mInterstitialAd =new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        adView = findViewById(R.id.adView);

        MobileAds.initialize(this);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    public void SPORTS_CANVASS(View view) {


        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Sports.this, MainActivity.class);
                intent.putExtra("url","https://www.sportscanvass.com/");
                intent.putExtra("name","SPORTS CANVASS");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void PAVILION(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://pavilion.com.bd/bn");
        intent.putExtra("name","PAVILION");
        startActivity(intent);
    }

    public void BD_SPORTS_NEWS(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://bdsportsnews.com/");
        intent.putExtra("name","BD SPORTS NEWS");
        startActivity(intent);
    }

    public void TIGER_CRICKET(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","TIGER CRICKET");
        startActivity(intent);
    }

    public void DAILY_SPORTS_BD(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://sportsbangla.com/");
        intent.putExtra("name","DAILY SPORTS BD");
        startActivity(intent);
    }

    public void BD_NEWS_SPORTS(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://bdnews24.com/sport/");
        intent.putExtra("name","BD NEWS SPORTS");
        startActivity(intent);
    }

    public void UNB(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://unb.com.bd/category/17/Sports");
        intent.putExtra("name","UNB");
        startActivity(intent);
    }

    public void JAGO_NEWS(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.jagonews24.com/sports");
        intent.putExtra("name","JAGO_NEWS");
        startActivity(intent);
    }
}