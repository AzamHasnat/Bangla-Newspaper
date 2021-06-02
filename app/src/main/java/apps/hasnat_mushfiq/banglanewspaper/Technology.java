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

public class Technology extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technology);

        mInterstitialAd =new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        adView = findViewById(R.id.adView);

        MobileAds.initialize(this);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    public void BANGLA_TECH24(View view) {


        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Technology.this, MainActivity.class);
                intent.putExtra("url","https://banglatech24.com/");
                intent.putExtra("name","BANGLA TECH24");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void BIZ_TECH24(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.biztech24.com/");
        intent.putExtra("name","BIZ TECH24");
        startActivity(intent);
    }

    public void DAILY_ICT_NEWS(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.dailyictnews.com/");
        intent.putExtra("name","DAILY ICT NEWS");
        startActivity(intent);
    }

    public void TECH_ZOOM(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://techzoom.tv/");
        intent.putExtra("name","TECH ZOOM");
        startActivity(intent);
    }

    public void DIGIT(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.digit.in/bn/");
        intent.putExtra("name","DIGIT");
        startActivity(intent);
    }

    public void TECH_GUP(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://techgup.com/");
        intent.putExtra("name","TECH GUP");
        startActivity(intent);
    }

    public void ASIANET_NEWS_TECH(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://bangla.asianetnews.com/technology");
        intent.putExtra("name","ASIANET NEWS TECH");
        startActivity(intent);
    }
}