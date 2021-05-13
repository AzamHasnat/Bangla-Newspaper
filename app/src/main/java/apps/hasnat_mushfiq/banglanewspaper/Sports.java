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
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void PAVILION(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void BD_SPORTS_NEWS(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void TIGER_CRICKET(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void DAILY_SPORTS_BD(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void BD_NEWS_SPORTS(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void UNB(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void JAGO_NEWS(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }
}