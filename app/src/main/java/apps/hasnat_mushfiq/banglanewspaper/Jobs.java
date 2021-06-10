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

public class Jobs extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs);

        mInterstitialAd =new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-4998576540264970/8904049815");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        adView = findViewById(R.id.adView);
        MobileAds.initialize(this);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    public void bdjobs(View view) {

        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Jobs.this, MainActivity.class);
                intent.putExtra("url","https://www.bdjobs.com/");
                intent.putExtra("name","Bd Jobs");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void bdgovjobs(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Jobs.this, MainActivity.class);
                intent.putExtra("url","https://bangladesh.gov.bd/site/view/job_category/");
                intent.putExtra("name","BD Govt Jobs");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void shonarbd(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Jobs.this, MainActivity.class);
                intent.putExtra("url","https://jobs.shonarbd.com/");
                intent.putExtra("name","Shonar BD Jobs");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void alljobscircular(View view) {
        if (mInterstitialAd != null) {
            mInterstitialAd.show();
        } else {
            Log.d("TAGs", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(Jobs.this, MainActivity.class);
                intent.putExtra("url","https://alljobscircularbd.com/?fbclid=IwAR1XJJQtE8M6NUn25a9-oMK-CKeb15HXZ-jfncCWqQATog5eRpumz3OP9uo");
                intent.putExtra("name","All Jobs Circular BD ");
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }
}