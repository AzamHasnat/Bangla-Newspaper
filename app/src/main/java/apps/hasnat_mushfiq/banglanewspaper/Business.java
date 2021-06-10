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

public class Business extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);

        mInterstitialAd =new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-4998576540264970/8904049815");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        adView = findViewById(R.id.adView);

        MobileAds.initialize(this);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    public void ARThOSUCHAK(View view) {


        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Business.this, MainActivity.class);
        intent.putExtra("url","https://www.arthosuchak.com/");
        intent.putExtra("name","Arthosuchak");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void CHATTAGRAM_STOCK_EXCHANGE(View view) {


        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Business.this, MainActivity.class);
        intent.putExtra("url","https://www.cse.com.bd/");
        intent.putExtra("name","Chattagram Stock Exchange");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void Dhaka_stock_exchange(View view) {

        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Business.this, MainActivity.class);
        intent.putExtra("url","https://www.dsebd.org/");
        intent.putExtra("name","Dhaka Stock Exchange");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void SHARE_BIZ(View view) {
        //Intent intent = new Intent(this, MainActivity.class);


        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Business.this, MainActivity.class);
        intent.putExtra("url","https://sharebiz.net/");
        intent.putExtra("name","Share Biz");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void SHARE_MARKET_BD(View view) {
       // Intent intent = new Intent(this, MainActivity.class);


        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Business.this, MainActivity.class);
        intent.putExtra("url","https://www.sharemarketbd.com/");
        intent.putExtra("name","Share Market BD");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void STOCK_BANGLADESH(View view) {


        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Business.this, MainActivity.class);
        intent.putExtra("url","https://stockbangladesh.com/");
        intent.putExtra("name","Stock Bangladesh");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void THE_FINANCIAL_EXPRESS(View view) {
        //Intent intent = new Intent(this, MainActivity.class);


        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Business.this, MainActivity.class);
        intent.putExtra("url","https://thefinancialexpress.com.bd/");
        intent.putExtra("name","The Financial Express");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void BUSINESS_NEWS_24_BD(View view) {
       // Intent intent = new Intent(this, MainActivity.class);


        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Business.this, MainActivity.class);
        intent.putExtra("url","https://businessnews24bd.com/");
        intent.putExtra("name","Business News 24 BD");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void PUZI_BAZAR(View view) {
        //Intent intent = new Intent(this, MainActivity.class);


        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Business.this, MainActivity.class);
        intent.putExtra("url","http://pujibazar.com/");
        intent.putExtra("name","Puzi Bazar");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void DAILY_STOCK_BANGLADESH(View view) {
        //Intent intent = new Intent(this, MainActivity.class);


        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Business.this, MainActivity.class);
        intent.putExtra("url","https://www.dailystockbangladesh.com/");
        intent.putExtra("name","Daily Stock Bangladesh");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void SHARE_BUSINESS_24(View view) {
        //Intent intent = new Intent(this, MainActivity.class);


        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Business.this, MainActivity.class);
        intent.putExtra("url","http://www.sharebusiness24.com/");
        intent.putExtra("name","Share Business 24");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void AJKER_BAZAR(View view) {
       // Intent intent = new Intent(this, MainActivity.class);


        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Business.this, MainActivity.class);
        intent.putExtra("url","https://www.ajkerbazzar.com/");
        intent.putExtra("name","Ajker Bazar");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void BONIK_BARTA(View view) {
        //Intent intent = new Intent(this, MainActivity.class);


        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Business.this, MainActivity.class);
        intent.putExtra("url","https://bonikbarta.net/");
        intent.putExtra("name","Bonik Barta");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void SHARE_NEWS_24(View view) {
    //    Intent intent = new Intent(this, MainActivity.class);


        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Business.this, MainActivity.class);
        intent.putExtra("url","http://www.sharenews24.com/");
        intent.putExtra("name","Share News 24");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void SHARE_BAZAR_NEWS(View view) {
       // Intent intent = new Intent(this, MainActivity.class);


        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Business.this, MainActivity.class);
        intent.putExtra("url","http://www.sharebazarnews.com/");
        intent.putExtra("name","Share Bazar News");
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