package apps.hasnat_mushfiq.banglanewspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sports extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
    }

    public void SPORTS_CANVASS(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.sportscanvass.com/");
        intent.putExtra("name","SPORTS CANVASS");
        startActivity(intent);
    }

    public void PAVILION(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://pavilion.com.bd/bn");
        intent.putExtra("name","PAVILION");
        startActivity(intent);
    }

    public void BD_SPORTS_NEWS(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://bdsportsnews.com/");
        intent.putExtra("name","BD SPORTS NEWS");
        startActivity(intent);
    }

    public void TIGER_CRICKET(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","TIGER CRICKET");
        startActivity(intent);
    }

    public void DAILY_SPORTS_BD(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://sportsbangla.com/");
        intent.putExtra("name","DAILY SPORTS BD");
        startActivity(intent);
    }

    public void BD_NEWS_SPORTS(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://bdnews24.com/sport/");
        intent.putExtra("name","BD NEWS SPORTS");
        startActivity(intent);
    }

    public void UNB(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://unb.com.bd/category/17/Sports");
        intent.putExtra("name","UNB");
        startActivity(intent);
    }

    public void JAGO_NEWS(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.jagonews24.com/sports");
        intent.putExtra("name","JAGO_NEWS");
        startActivity(intent);
    }
}