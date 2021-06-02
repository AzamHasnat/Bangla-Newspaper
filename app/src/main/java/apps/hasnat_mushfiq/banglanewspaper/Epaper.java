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

public class Epaper extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epaper);

        mInterstitialAd =new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
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

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Epaper.this, MainActivity.class);
                intent.putExtra("url","https://epaper.alokitobangladesh.com/");
                intent.putExtra("name","ALOKITO BANGLADESH");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void BHORER_DAK(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://ebhorerdak.com/2021/04/16/index.php");
        intent.putExtra("name","BHORER DAK");
        startActivity(intent);
    }

    public void BHORER_KAGAJ(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.bhorerkagoj.com/epaper");
        intent.putExtra("name","BHORER KAGAJ");
        startActivity(intent);
    }

    public void BANIK_BARTA(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://epaper.bonikbarta.net/");
        intent.putExtra("name","BANIK BARTA");
        startActivity(intent);
    }

    public void BANGLADESH_PROTIDIN(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.ebdpratidin.com/");
        intent.putExtra("name","BANGLADESH PROTIDIN");
        startActivity(intent);
    }

    public void DAILY_JANAKANTHA(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.edailyjanakantha.com/");
        intent.putExtra("name","DAILY JANAKANTHA");
        startActivity(intent);
    }

    public void AMADER_SOMOY(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://epaper.dainikamadershomoy.com/2021/04/16/page-01");
        intent.putExtra("name","AMADER SOMOY");
        startActivity(intent);
    }

    public void DESH_RUPANTOR(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.deshrupantor.com/epaper/");
        intent.putExtra("name","DESH RUPANTOR");
        startActivity(intent);
    }

    public void JUGANTOR(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://epaper.jugantor.com/2021/04/16/index.php");
        intent.putExtra("name","JUGANTOR");
        startActivity(intent);
    }

    public void KALER_KANTHO(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.ekalerkantho.com/");
        intent.putExtra("name","KALER KANTHO");
        startActivity(intent);
    }

    public void PROTHOM_ALO(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://epaper.prothomalo.com/home.php?ref=ine1");
        intent.putExtra("name","PROTHOM ALO");
        startActivity(intent);
    }

    public void SAMAKAL(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://epaper.samakal.com/");
        intent.putExtra("name","SAMAKAL");
        startActivity(intent);
    }

    public void JAI_JAI_DIN(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://ejjdin.com/");
        intent.putExtra("name","JAI JAI DIN");
        startActivity(intent);
    }

    public void MANAB_KANTHO(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://ejjdin.com/");
        intent.putExtra("name","MANAB KANTHO");
        startActivity(intent);
    }

    public void PROTIDINER_SANGBAD(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://epaper.protidinersangbad.com/");
        intent.putExtra("name","PROTIDINER SANGBAD");
        startActivity(intent);
    }

    public void SOMOYER_ALO(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://epaper.shomoyeralo.com/2021/04/16/index.php");
        intent.putExtra("name","SOMOYER ALO");
        startActivity(intent);
    }
}