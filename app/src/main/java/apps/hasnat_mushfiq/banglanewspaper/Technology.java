package apps.hasnat_mushfiq.banglanewspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Technology extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technology);
    }

    public void BANGLA_TECH24(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void BIZ_TECH24(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void DAILY_ICT_NEWS(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void TECH_ZOOM(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void DIGIT(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void TECH_GUP(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }

    public void ASIANET_NEWS_TECH(View view) {
    Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","");
        intent.putExtra("name","");
        startActivity(intent);
    }
}