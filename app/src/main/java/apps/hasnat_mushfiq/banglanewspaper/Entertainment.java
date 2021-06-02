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

public class Entertainment extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment);

        mInterstitialAd =new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        adView = findViewById(R.id.adView);

        MobileAds.initialize(this);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    public void ANANDO_ALO(View view) {

        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Entertainment.this, MainActivity.class);
                intent.putExtra("url","https://www.ananda-alo.com/");
                intent.putExtra("name","Ananda Alo");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void BANGLA_STREET(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Entertainment.this, MainActivity.class);
                intent.putExtra("url","https://banglastreet.online/");
                intent.putExtra("name","Bangla Street");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void ANANDOLOK(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Entertainment.this, MainActivity.class);
                intent.putExtra("url","https://www.anandalok.in/");
                intent.putExtra("name","ANANDOLOK");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void SANANDA(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Entertainment.this, MainActivity.class);
                intent.putExtra("url","https://www.sananda.in/");
                intent.putExtra("name","SANANDA");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void KISHORE_ALO(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Entertainment.this, MainActivity.class);
                intent.putExtra("url","https://www.kishoralo.com/");
                intent.putExtra("name","KISHORE ALO");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void NISHORGO(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Entertainment.this, MainActivity.class);
                intent.putExtra("url","https://nishorga.com/");
                intent.putExtra("name","NISHORGO");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void PROTHOL_ALO_BINODON(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Entertainment.this, MainActivity.class);
                intent.putExtra("url","https://www.prothomalo.com/special-supplement");
                intent.putExtra("name","PROTHOL ALO BINODON");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void ITTEFAQ_BINODON(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Entertainment.this, MainActivity.class);
                intent.putExtra("url","https://www.ittefaq.com.bd/entertainment");
                intent.putExtra("name","ITTEFAQ BINODON");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void CANVAS(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Entertainment.this, MainActivity.class);
                intent.putExtra("url","https://www.canvasmagazine.com.bd/");
                intent.putExtra("name","CANVAS");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void KISHORE_BANGLA(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Entertainment.this, MainActivity.class);
                intent.putExtra("url","https://kishorebangla.com/");
                intent.putExtra("name","KISHORE BANGLA");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void PARJATAN_BICHITRA(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Entertainment.this, MainActivity.class);
                intent.putExtra("url","https://www.parjatanbichitra.com/");
                intent.putExtra("name","PARJATAN BICHITRA");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void rupali_alo(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Entertainment.this, MainActivity.class);
                intent.putExtra("url","http://www.rupalialo.com/");
                intent.putExtra("name","Rupali Alo");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void ABASAR(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Entertainment.this, MainActivity.class);
                intent.putExtra("url","https://abasar.net/");
                intent.putExtra("name","ABASAR");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void OBAK_PRITHIBI(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Entertainment.this, MainActivity.class);
                intent.putExtra("url","https://abakprithibi.com/");
                intent.putExtra("name","OBAK PRITHIBI");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void ANANDA_BAZAR_TRAVEL(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Entertainment.this, MainActivity.class);
                intent.putExtra("url","https://www.anandabazar.com/travel");
                intent.putExtra("name","ANANDA BAZAR TRAVEL");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void ANANYA(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Entertainment.this, MainActivity.class);
                intent.putExtra("url","https://anannya.com.bd/");
                intent.putExtra("name","ANANYA");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

}