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

public class Epaper extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epaper);

        mInterstitialAd =new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-4998576540264970/8904049815");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        adView = findViewById(R.id.adView);

        MobileAds.initialize(this);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

    }

    public void ALOKITO_BANGLADESH(View view) {


        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Epaper.this, MainActivity.class);
        intent.putExtra("url","https://epaper.alokitobangladesh.com/");
        intent.putExtra("name","ALOKITO BANGLADESH");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void BHORER_DAK(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Epaper.this, MainActivity.class);
        intent.putExtra("url","http://ebhorerdak.com/2021/04/16/index.php");
        intent.putExtra("name","BHORER DAK");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void BHORER_KAGAJ(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Epaper.this, MainActivity.class);
        intent.putExtra("url","https://www.bhorerkagoj.com/epaper");
        intent.putExtra("name","BHORER KAGAJ");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void BANIK_BARTA(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Epaper.this, MainActivity.class);
        intent.putExtra("url","http://epaper.bonikbarta.net/");
        intent.putExtra("name","BANIK BARTA");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void BANGLADESH_PROTIDIN(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Epaper.this, MainActivity.class);
        intent.putExtra("url","http://www.ebdpratidin.com/");
        intent.putExtra("name","BANGLADESH PROTIDIN");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void DAILY_JANAKANTHA(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Epaper.this, MainActivity.class);
        intent.putExtra("url","http://www.edailyjanakantha.com/");
        intent.putExtra("name","DAILY JANAKANTHA");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void AMADER_SOMOY(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Epaper.this, MainActivity.class);
        intent.putExtra("url","https://epaper.dainikamadershomoy.com/2021/04/16/page-01");
        intent.putExtra("name","AMADER SOMOY");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void DESH_RUPANTOR(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Epaper.this, MainActivity.class);
        intent.putExtra("url","https://www.deshrupantor.com/epaper/");
        intent.putExtra("name","DESH RUPANTOR");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void JUGANTOR(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Epaper.this, MainActivity.class);
        intent.putExtra("url","https://epaper.jugantor.com/2021/04/16/index.php");
        intent.putExtra("name","JUGANTOR");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void KALER_KANTHO(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Epaper.this, MainActivity.class);
        intent.putExtra("url","http://www.ekalerkantho.com/");
        intent.putExtra("name","KALER KANTHO");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void PROTHOM_ALO(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Epaper.this, MainActivity.class);
        intent.putExtra("url","https://epaper.prothomalo.com/home.php?ref=ine1");
        intent.putExtra("name","PROTHOM ALO");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void SAMAKAL(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Epaper.this, MainActivity.class);
        intent.putExtra("url","https://epaper.samakal.com/");
        intent.putExtra("name","SAMAKAL");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void JAI_JAI_DIN(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Epaper.this, MainActivity.class);
        intent.putExtra("url","https://ejjdin.com/");
        intent.putExtra("name","JAI JAI DIN");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void MANAB_KANTHO(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Epaper.this, MainActivity.class);
        intent.putExtra("url","https://epaper.manobkantha.com.bd/2021/06/07/");
        intent.putExtra("name","MANAB KANTHO");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void PROTIDINER_SANGBAD(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Epaper.this, MainActivity.class);
        intent.putExtra("url","https://epaper.protidinersangbad.com/");
        intent.putExtra("name","PROTIDINER SANGBAD");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void SOMOYER_ALO(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(Epaper.this, MainActivity.class);
        intent.putExtra("url","https://epaper.shomoyeralo.com/2021/04/16/index.php");
        intent.putExtra("name","SOMOYER ALO");
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