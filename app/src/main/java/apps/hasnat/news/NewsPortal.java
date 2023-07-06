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

public class NewsPortal extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_portal);

        mInterstitialAd =new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-4998576540264970/8904049815");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        adView = findViewById(R.id.adView);

        MobileAds.initialize(this);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    public void ONE_NEWS_BD(View view) {
      //  Intent intent = new Intent(this, MainActivity.class);


        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","https://www.onenewsbd.com/");
        intent.putExtra("name","One News bd");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void AB_NEWS_24(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","http://www.abnews24.com/");
        intent.putExtra("name","Ab News 24");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void CHANGE_TV_PRESS(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","https://changetv.press/");
        intent.putExtra("name","Change Tv Press");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void AB_NEWS_24_BD(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","https://www.abnews24bd.com/");
        intent.putExtra("name","Ab News24 Bd");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void ALOKITO_PROTIDIN(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","http://www.alokitoprotidin.com/");
        intent.putExtra("name","Alokito protidin");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void AMADER_SOMOY_DOT_COM(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","https://www.amadershomoy.com/");
        intent.putExtra("name","Amader Shomoy Dot Com");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void ASIAN_NEWS_OF_BANGLADESH(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","https://www.anbnewsagency.com/");
        intent.putExtra("name","Asian News Of Bangladesh");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void APARAJEYO_BANGLA(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","https://www.aparajeobangla.com/");
        intent.putExtra("name","Aparajeo Bangla");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void BANGLA_INSIDER(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","http://www.banglainsider.com/");
        intent.putExtra("name","Bangla Insider");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void BANGLA_NEWS_24(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","https://www.banglanews24.com/");
        intent.putExtra("name","Bangla News24");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void BANGLA_TELEGRAPH(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","https://www.banglatelegraph.com/");
        intent.putExtra("name","Bangla Telegraph");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void BANGLA_TRIBUNE(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","https://www.banglatribune.com/");
        intent.putExtra("name","Bangla Tribune");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void BANGLADESH_ONLINE_24(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","http://bangladeshonline24.com/");
        intent.putExtra("name","Bangladesh Online24");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void BARTA_24(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","https://barta24.com/");
        intent.putExtra("name","Barta24");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }


    public void BARTA_KONTHO(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","http://bartakontho.com/");
        intent.putExtra("name","Barta Kontho");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void BD_24_LIVE(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","https://www.bd24live.com/bangla/");
        intent.putExtra("name","BD24 Live");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }


    public void BD_TODAY_24(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","http://bdtoday24.com/");
        intent.putExtra("name","BD Today24");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void BD_TYPE(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","https://www.bdtype.com/");
        intent.putExtra("name","Bdtype");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void BD_NEWS_24(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","https://bangla.bdnews24.com/");
        intent.putExtra("name","BD News24");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void BREAKING_NEWS(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","https://www.breakingnews.com.bd/");
        intent.putExtra("name","Breaking News");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }


    public void CHASHI_SHEBA(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","http://www.chashiseba.com/");
        intent.putExtra("name","Chashi Seba");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }



    public void DHAKA_TIMES_24(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","https://www.dhakatimes24.com/");
        intent.putExtra("name","Dhaka Times24");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }


    public void FAST_NEWS_BD(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","http://www.fastnewsbd.com/");
        intent.putExtra("name","Fast News Bd");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void GO_NEWS_24(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","https://www.gonews24.com/");
        intent.putExtra("name","Go News24");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void HAWKER(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","https://hawker.com.bd/");
        intent.putExtra("name","Hawker");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void DHAKA_NEWS_24(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","http://dhakanews24.com/");
        intent.putExtra("name","Dhaka News24");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void JAGO_NEWS_24(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","https://www.jagonews24.com/");
        intent.putExtra("name","Jago News24");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }


    public void LIVE_PRESS_24(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","http://www.livepress24.com/");
        intent.putExtra("name","Live Press24");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void NAGORIK_BARTA(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","https://nagorikbarta.com/");
        intent.putExtra("name","Nagorik Barta");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void NATUN_BARTA(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","http://www.natunbarta.com/");
        intent.putExtra("name","Natun Barta");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void NEWS_BANGLADESH(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","http://www.newsbangladesh.com/");
        intent.putExtra("name","News Bangladesh");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }


    public void PRIME_NEWS_BD(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","http://www.primenewsbd.com/");
        intent.putExtra("name","Prime NewsBD");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void RISING_BD(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","https://www.risingbd.com/");
        intent.putExtra("name","RisingBD");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }


    public void SAMAKAL_NEWS_24(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","https://samakalnews24.com/shamakal_main_slider/bnmgvfhgdu/");
        intent.putExtra("name","Samakalnews24");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void SARA_BANGLA(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","https://sarabangla.net/");
        intent.putExtra("name","Sarabangla");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void SHERSHA_NEWS_24(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","https://www.shershanews24.com/");
        intent.putExtra("name","Shersha News24");
        startActivity(intent);
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }


    public void THE_REPORT_24(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(NewsPortal.this, MainActivity.class);
        intent.putExtra("url","http://bangla.thereport24.com/");
        intent.putExtra("name","The Report24");
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