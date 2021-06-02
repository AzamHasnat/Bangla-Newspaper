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

public class TvNews extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv_news);

        mInterstitialAd =new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        adView = findViewById(R.id.adView);

        MobileAds.initialize(this);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    public void ATN_NEWS(View view) {

        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(TvNews.this, MainActivity.class);
                intent.putExtra("url","http://atnnewstv.com/?app=home");
                intent.putExtra("name","Atn News");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void CHANNEL_24(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.channel24bd.tv/");
        intent.putExtra("name","Channel 24");
        startActivity(intent);
    }

    public void BANGLA_VISION_NEWS(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.bvnews24.com/");
        intent.putExtra("name","Bangla Vision News");
        startActivity(intent);
    }

    public void CHANNEL_i(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.channelionline.com/");
        intent.putExtra("name","Channei i");
        startActivity(intent);
    }

    public void EKUSHE_TV(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://ekushey-tv.com/");
        intent.putExtra("name","Ekushey Tv");
        startActivity(intent);
    }

    public void INDEPENDENT_NEWS(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.independent24.com/");
        intent.putExtra("name","Independent");
        startActivity(intent);
    }

    public void JAMUNA_TV(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.jamuna.tv/");
        intent.putExtra("name","Jamuna Tv");
        startActivity(intent);
    }

    public void MAASRANGA_TV(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://maasranga.tv/");
        intent.putExtra("name","Maasranga");
        startActivity(intent);
    }

    public void NTV_NEWS(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.ntvbd.com/");
        intent.putExtra("name","ntv");
        startActivity(intent);
    }

    public void RTV_NEWS(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.rtvonline.com/");
        intent.putExtra("name","rtv");
        startActivity(intent);
    }

    public void SOMOY_NEWS(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.somoynews.tv/");
        intent.putExtra("name","Somoy Tv");
        startActivity(intent);
    }

    public void DBC_NEWS(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://dbcnews.tv/ ");
        intent.putExtra("name","DBC News");
        startActivity(intent);
    }

    public void NEWS_24(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.news24bd.tv/");
        intent.putExtra("name","News 24");
        startActivity(intent);
    }

    public void BOISHAKHI_TV(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://boishakhionline.com/");
        intent.putExtra("name","Boishakhi tv");
        startActivity(intent);
    }

    public void SA_TV(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.satv.tv/");
        intent.putExtra("name","SA tv");
        startActivity(intent);
    }
}