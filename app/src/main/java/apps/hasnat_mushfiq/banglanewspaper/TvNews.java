package apps.hasnat_mushfiq.banglanewspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TvNews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv_news);
    }

    public void ATN_NEWS(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://atnnewstv.com/?app=home");
        intent.putExtra("name","Atn News");
        startActivity(intent);
    }

    public void CHANNEL_24(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.channel24bd.tv/");
        intent.putExtra("name","Channel 24");
        startActivity(intent);
    }

    public void BANGLA_VISION_NEWS(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.bvnews24.com/");
        intent.putExtra("name","Bangla Vision News");
        startActivity(intent);
    }

    public void CHANNEL_i(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.channelionline.com/");
        intent.putExtra("name","Channei i");
        startActivity(intent);
    }

    public void EKUSHE_TV(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://ekushey-tv.com/");
        intent.putExtra("name","Ekushey Tv");
        startActivity(intent);
    }

    public void INDEPENDENT_NEWS(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.independent24.com/");
        intent.putExtra("name","Independent");
        startActivity(intent);
    }

    public void JAMUNA_TV(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.jamuna.tv/");
        intent.putExtra("name","Jamuna Tv");
        startActivity(intent);
    }

    public void MAASRANGA_TV(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://maasranga.tv/");
        intent.putExtra("name","Maasranga");
        startActivity(intent);
    }

    public void NTV_NEWS(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.ntvbd.com/");
        intent.putExtra("name","ntv");
        startActivity(intent);
    }

    public void RTV_NEWS(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.rtvonline.com/");
        intent.putExtra("name","rtv");
        startActivity(intent);
    }

    public void SOMOY_NEWS(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.somoynews.tv/");
        intent.putExtra("name","Somoy Tv");
        startActivity(intent);
    }

    public void DBC_NEWS(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://dbcnews.tv/ ");
        intent.putExtra("name","DBC News");
        startActivity(intent);
    }

    public void NEWS_24(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.news24bd.tv/");
        intent.putExtra("name","News 24");
        startActivity(intent);
    }

    public void BOISHAKHI_TV(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://boishakhionline.com/");
        intent.putExtra("name","Boishakhi tv");
        startActivity(intent);
    }

    public void SA_TV(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.satv.tv/");
        intent.putExtra("name","SA tv");
        startActivity(intent);
    }
}