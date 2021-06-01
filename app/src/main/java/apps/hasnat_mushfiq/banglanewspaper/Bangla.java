package apps.hasnat_mushfiq.banglanewspaper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class Bangla extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla);

        mInterstitialAd =new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

      /*  mInterstitialAd =new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.show();
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }*/

        adView = findViewById(R.id.adView);

        MobileAds.initialize(this);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

    }

    public void prothomalo(View view) {

        /*Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.prothomalo.com/");
        intent.putExtra("name","Prothom Alo");
        startActivity(intent);*/

        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.prothomalo.com/");
                intent.putExtra("name","Prothom Alo");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void kalerkontho_bangla(View view) {
       /* Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.kalerkantho.com/");
        intent.putExtra("name","Kaler Kantho");
        startActivity(intent);*/

        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.kalerkantho.com/");
                intent.putExtra("name","Kaler Kantho");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void ittefaq_bangla(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.ittefaq.com.bd/");
                intent.putExtra("name","Daily Ittefaq");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void noyadigonto_bangla(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://dailynayadiganta.com/");
                intent.putExtra("name","Daily Naya Diganta");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void bdprotidin_bangla(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url",":https://www.bd-pratidin.com/");
                intent.putExtra("name","Bangladesh Pratidin");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void jugantor_bangla(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.jugantor.com/");
                intent.putExtra("name","Jugantor");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void amarshongbad_bangla(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.amarsangbad.com/");
                intent.putExtra("name","Daily Amar Sangbad");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void protidiner_shongbad_bangla(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.protidinersangbad.com/");
                intent.putExtra("name","Protidiner Sangbad");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void shongram_bangla(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://dailysangram.com/");
                intent.putExtra("name","Daily Sangram");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void manob_jomin_bangla(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://mzamin.com/");
                intent.putExtra("name","Daily Manab Zamin");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void amader_somoy_bangla(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","http://www.dainikamadershomoy.com/");
                intent.putExtra("name","Dainik Amadershomoy");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void samakal_bangla(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://samakal.com/");
                intent.putExtra("name","Samakal");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void janakantha_bangla(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.dailyjanakantha.com/");
                intent.putExtra("name","Janakantha");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void jayjaydin_bangla(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.jaijaidinbd.com/");
                intent.putExtra("name","Jai Jai Din");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void vorerkagaj_bangla(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.bhorerkagoj.com/");
                intent.putExtra("name","Daily Bhorer Kagoj");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void ARTHONITEER_KAGOJ(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","http://www.arthoniteerkagoj.com/");
                intent.putExtra("name","Arthoniteer Kagoj");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void INQILAB(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.dailyinqilab.com/");
                intent.putExtra("name","Daily Inqilab");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void SANGBAD(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","http://thesangbad.net/");
                intent.putExtra("name","Sangbad");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void MANOB_KANTHA(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.manobkantha.com.bd/");
                intent.putExtra("name","Manob Kantha");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void SUPROVAT(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://suprobhat.com/");
                intent.putExtra("name","Daily Suprobhat");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void BONKI_BARTA(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://bonikbarta.net/");
                intent.putExtra("name","Bonik Barta");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void Daily_DINKAL(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","http://www.dailydinkal.net/");
                intent.putExtra("name","Daily Dinkal");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void ALOKITO_BANGLADESH(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.alokitobangladesh.com/");
                intent.putExtra("name","Alokito Bangladesh");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void AJKER_BAZAR(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","http://www.allbanglanewspaper.xyz/newspapers.php?q=ajkerbazzar.com");
                intent.putExtra("name","Ajker Bazar");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void AMADER_AURTHONEETI(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","http://amaderorthoneeti.com/new/");
                intent.putExtra("name","Amadar Orthoneeti");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void BANGLADESH_POST(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://bangladeshpost.net/");
                intent.putExtra("name","Bangladesh Post");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void SOREJOMIN_BARTA(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","http://sorejominbarta.com/");
                intent.putExtra("name","Sorejomin Barta");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void AJKER_PATRIKA(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","http://ajkerpatrika.com/");
                intent.putExtra("name","Ajker Patrika");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void KHABAR_PATRA(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://khoborpatrabd.com/");
                intent.putExtra("name","Khabar Patra");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void VORER_PATA(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://dailyvorerpata.com/");
                intent.putExtra("name","Vorer Pata");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void SHOMOYER_ALO(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.shomoyeralo.com/");
                intent.putExtra("name","Shomoyer Alo");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void DHAKAR_DAK(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://dhakardak-bd.com/");
                intent.putExtra("name","Dhakar Dak");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void NOTUN_BARTA(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","http://www.natun-barta.com/");
                intent.putExtra("name","Natun Barta");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void SHARE_BIZ(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://sharebiz.net/");
                intent.putExtra("name","Share biz:");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void DAILY_BARTOMAN(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","http://dailybartoman.com/");
                intent.putExtra("name","Daily Bartoman");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void AJKALER_KHOBOR(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.ajkalerkhobor.net/");
                intent.putExtra("name","Ajkaler Khobor");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void SANGBAD_KONIKA(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.sangbadkonika.com/");
                intent.putExtra("name","Sangbad Konika:");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void SOMOYER_KANTHA(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","http://www.gonokantho.com/");
                intent.putExtra("name","Somoyer Kantha");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void KHOLA_KAGOJ(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","http://kholakagojbd.com/");
                intent.putExtra("name","Khola Kagoj");
                startActivity(intent);
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

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.deshrupantor.com/");
                intent.putExtra("name","Desh Rupantor:");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void BANGLADESHER_KHABOR(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","http://bangladesherkhabor.net/");
                intent.putExtra("name","Bangladesher Khabor");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void AMAR_DESH(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","http://bd-bulletin.com/");
                intent.putExtra("name","Amar Desh");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void DAILY_JAGRAN(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.dailyjagaran.com/");
                intent.putExtra("name","Daily Jagran");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }
}