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

    public void ukbdnews(View view) {

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
                intent.putExtra("url","");
                intent.putExtra("name","");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void BengaliTimes(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void Vao_Bangla(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void bdprotidin_bangla(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void China_Radio_Bangla(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void Ananabazar_Patrika(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void Zee_24_Ghonta(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void Sangbad_Protidin(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void Bartaman_Patrika(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void kolkata24x7(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void abpananda(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void Sananda(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void AAjkal_net(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void ARTHONITEER_KAGOJ(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void eisamay(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void Ganashakti(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void suprovat(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void anandalok(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void Asomiya_Pratidin(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void dainiksambad(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void amarshongbad_bangla(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void UN_Bangla_Radio(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void ALOKITO_BANGLADESH(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void Bangla_Times(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void Surma_News(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void BANGLADESH_POST(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void UK_Bengali(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void Weekly_Bangladesh(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void Deshebideshe(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void deshebideshe(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void KHABAR_PATRA(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void gssnews(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void londonbanglanews(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void oneindia(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void weeklybangalee(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void thikana(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void Parichoy(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void parstoday(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void Weekly_Janomot(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void BBC_Bangla(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void NHK_World(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }
}

