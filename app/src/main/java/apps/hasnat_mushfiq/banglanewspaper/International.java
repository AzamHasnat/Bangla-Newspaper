package apps.hasnat_mushfiq.banglanewspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class International extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_international);
    }

    public void THE_GUARDIAN(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","THE GUARDIAN (UK): https://www.theguardian.com/uk");
        intent.putExtra("name","THE GUARDIAN (UK)");
        startActivity(intent);
    }

    public void THE_WALL_STREET_JOURNAL(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.wsj.com/");
        intent.putExtra("name","THE WALL STREET JOURNAL (USA)");
        startActivity(intent);
    }

    public void THE_NEW_YORK_TIMES(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.nytimes.com/");
        intent.putExtra("name","THE NEW YORK TIMES (USA)");
        startActivity(intent);
    }

    public void THE_WASHINGTON_POST(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.washingtonpost.com/");
        intent.putExtra("name","THE WASHINGTON POST (USA)");
        startActivity(intent);
    }

    public void CHINA_DAILY(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://global.chinadaily.com.cn/");
        intent.putExtra("name","CHINA DAILY (CHINA)");
        startActivity(intent);
    }

    public void THE_TIMES_OF_INDIA(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://timesofindia.indiatimes.com/");
        intent.putExtra("name","THE TIMES OF INDIA (INDIA)");
        startActivity(intent);
    }

    public void THE_SYDNEY_MORNING_HERALD(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.smh.com.au/");
        intent.putExtra("name","THE SYDNEY MORNING HERALD (AUSTRALIA)");
        startActivity(intent);
    }

    public void ZAMAN(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.dailyzaman.com/ ");
        intent.putExtra("name","ZAMAN (TURKEY)");
        startActivity(intent);
    }


    public void DAWN(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.dawn.com/");
        intent.putExtra("name","DAWN (PAKISTAN)");
        startActivity(intent);
    }

    public void THE_ASAHI_SHIMBUN(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.asahi.com/ajw/");
        intent.putExtra("name","THE ASAHI SHIMBUN (JAPAN)");
        startActivity(intent);
    }
}