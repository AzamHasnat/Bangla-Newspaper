package apps.hasnat_mushfiq.banglanewspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class home_new extends AppCompatActivity {

    AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_new);

        adView = findViewById(R.id.adView);

        MobileAds.initialize(this);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    public void _bangla(View view) {
        Intent intent = new Intent(home_new.this,Bangla.class);
        startActivity(intent);
    }

    public void english(View view) {
        Intent intent = new Intent(home_new.this,English.class);
        startActivity(intent);
    }

    public void epaper(View view) {
        Intent intent = new Intent(home_new.this,Epaper.class);
        startActivity(intent);
    }

    public void newsportal(View view) {
        Intent intent = new Intent(home_new.this,NewsPortal.class);
        startActivity(intent);
    }

    public void int_bangla(View view) {
        Intent intent = new Intent(home_new.this,Int_Bangla.class);
        startActivity(intent);
    }

    public void sports(View view) {
        Intent intent = new Intent(home_new.this,Sports.class);
        startActivity(intent);
    }

    public void business(View view) {
        Intent intent = new Intent(home_new.this,Business.class);
        startActivity(intent);
    }

    public void tvnews(View view) {
        Intent intent = new Intent(home_new.this,TvNews.class);
        startActivity(intent);
    }

    public void entertainment(View view) {
        Intent intent = new Intent(home_new.this,Entertainment.class);
        startActivity(intent);
    }

    public void jobs(View view) {
        Intent intent = new Intent(home_new.this,Jobs.class);
        startActivity(intent);
    }

    public void technology(View view) {
        Intent intent = new Intent(home_new.this,Technology.class);
        startActivity(intent);
    }
}