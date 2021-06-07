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

public class Int_Bangla extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_int__bangla);

        mInterstitialAd =new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        adView = findViewById(R.id.adView);

        MobileAds.initialize(this);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    public void BengaliTimes(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Int_Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.thebengalitimes.com/");
                intent.putExtra("name","Bengali Times");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void Vao_Bangla(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Int_Bangla.this, MainActivity.class);
                intent.putExtra("url","voabangla.com");
                intent.putExtra("name","Vao Bangla");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void China_Radio_Bangla(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Int_Bangla.this, MainActivity.class);
                intent.putExtra("url","http://bengali.cri.cn/");
                intent.putExtra("name","China Radio Bangla");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void Ananabazar_Patrika(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Int_Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.anandabazar.com/");
                intent.putExtra("name","Ananabazar Patrika");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void Zee_24_Ghonta(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Int_Bangla.this, MainActivity.class);
                intent.putExtra("url","https://zeenews.india.com/bengali");
                intent.putExtra("name","Zee 24 Ghonta");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void Sangbad_Protidin(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Int_Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.sangbadpratidin.in/");
                intent.putExtra("name","Sangbad Protidin");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void Bartaman_Patrika(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Int_Bangla.this, MainActivity.class);
                intent.putExtra("url","https://bartamanpatrika.com/home");
                intent.putExtra("name","Bartaman Patrika");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void kolkata24x7(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Int_Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.kolkata24x7.com/");
                intent.putExtra("name","kolkata24x7");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void abpananda(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Int_Bangla.this, MainActivity.class);
                intent.putExtra("url","https://bengali.abplive.com/");
                intent.putExtra("name","Abpananda: ");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void AAjkal_net(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Int_Bangla.this, MainActivity.class);
                intent.putExtra("url",": https://aajkaal.in/");
                intent.putExtra("name","AAjkal.net");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void eisamay(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Int_Bangla.this, MainActivity.class);
                intent.putExtra("url","https://eisamay.indiatimes.com/");
                intent.putExtra("name","Eisamay.com");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void Ganashakti(View view) { if (mInterstitialAd != null) {
        mInterstitialAd.show();
    } else {
        Log.d("TAGs", "The interstitial wasn't loaded yet.");
    }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Int_Bangla.this, MainActivity.class);
                intent.putExtra("url","http://bangla.ganashakti.co.in/");
                intent.putExtra("name","Ganashakti");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void suprovat(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Int_Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.suprovat.com/");
                intent.putExtra("name","Suprovat.com");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }


    public void Asomiya_Pratidin(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Int_Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.asomiyapratidin.in/");
                intent.putExtra("name"," Asomiya Pratidin");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void dainiksambad(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Int_Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.dainiksambad.net/");
                intent.putExtra("name","Dainiksambad.net");
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
                Intent intent = new Intent(Int_Bangla.this, MainActivity.class);
                intent.putExtra("url","https://news.un.org/en/tags/bangla");
                intent.putExtra("name","UN Bangla Radio");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void UN_Bangla_Radio(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Int_Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.janomot.com/");
                intent.putExtra("name","Weekly Janomot");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }


    public void UK_Bengali(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Int_Bangla.this, MainActivity.class);
                intent.putExtra("url","http://portal.ukbengali.com/");
                intent.putExtra("name","UK Bengali");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void Weekly_Bangladesh(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Int_Bangla.this, MainActivity.class);
                intent.putExtra("url","https://weeklybangladeshusa.com/");
                intent.putExtra("name","Weekly Bangladesh");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }


    public void deshebideshe(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Int_Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.deshebideshe.com/");
                intent.putExtra("name","Deshebideshe.com");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }


    public void weeklybangalee(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Int_Bangla.this, MainActivity.class);
                intent.putExtra("url","http://weeklybangalee.com/");
                intent.putExtra("name","weeklybangalee.com");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void thikana(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Int_Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.thikana.us/");
                intent.putExtra("name","Thikana.net");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }


    public void parstoday(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Int_Bangla.this, MainActivity.class);
                intent.putExtra("url","https://parstoday.com/bn");
                intent.putExtra("name","Parstoday");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void Weekly_Janomot(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Int_Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.janomot.com/");
                intent.putExtra("name","Weekly Janomot");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void BBC_Bangla(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Int_Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www.bbc.com/bengali");
                intent.putExtra("name","BBC Bangla");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void NHK_World(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Int_Bangla.this, MainActivity.class);
                intent.putExtra("url","https://www3.nhk.or.jp/nhkworld/bengali/");
                intent.putExtra("name","NHK World");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }
}

