package apps.hasnat.news;

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

public class International extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    AdView adView;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_international);

        mInterstitialAd =new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-4998576540264970/8904049815");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        adView = findViewById(R.id.adView);

        MobileAds.initialize(this);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    public void THE_GUARDIAN(View view) {

        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(International.this, MainActivity.class);
        intent.putExtra("url","https://www.theguardian.com/uk");
        intent.putExtra("name","THE GUARDIAN (UK)");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void THE_WALL_STREET_JOURNAL(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(International.this, MainActivity.class);
        intent.putExtra("url","https://www.wsj.com/");
        intent.putExtra("name","THE WALL STREET JOURNAL (USA)");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void THE_NEW_YORK_TIMES(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(International.this, MainActivity.class);
        intent.putExtra("url","https://www.nytimes.com/");
        intent.putExtra("name","THE NEW YORK TIMES (USA)");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void THE_WASHINGTON_POST(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(International.this, MainActivity.class);
        intent.putExtra("url","https://www.washingtonpost.com/");
        intent.putExtra("name","THE WASHINGTON POST (USA)");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void CHINA_DAILY(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(International.this, MainActivity.class);
        intent.putExtra("url","http://global.chinadaily.com.cn/");
        intent.putExtra("name","CHINA DAILY (CHINA)");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void THE_TIMES_OF_INDIA(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(International.this, MainActivity.class);
        intent.putExtra("url","https://timesofindia.indiatimes.com/");
        intent.putExtra("name","THE TIMES OF INDIA (INDIA)");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void THE_SYDNEY_MORNING_HERALD(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(International.this, MainActivity.class);
        intent.putExtra("url","https://www.smh.com.au/");
        intent.putExtra("name","THE SYDNEY MORNING HERALD (AUSTRALIA)");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void ZAMAN(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(International.this, MainActivity.class);
        intent.putExtra("url","http://www.dailyzaman.com/");
        intent.putExtra("name","ZAMAN (TURKEY)");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }


    public void DAWN(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(International.this, MainActivity.class);
        intent.putExtra("url","https://www.dawn.com/");
        intent.putExtra("name","DAWN (PAKISTAN)");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void THE_ASAHI_SHIMBUN(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(International.this, MainActivity.class);
        intent.putExtra("url","http://www.asahi.com/ajw/");
        intent.putExtra("name","THE ASAHI SHIMBUN (JAPAN)");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }
}