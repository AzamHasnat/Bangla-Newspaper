package apps.hasnat_mushfiq.banglanewspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class English extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
    }

    public void daily_star(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.thedailystar.net/");
        intent.putExtra("name","The Daily Star");
        startActivity(intent);
    }

    public void NEW_AGE(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.newagebd.net/");
        intent.putExtra("name","New Age");
        startActivity(intent);
    }

    public void THE_FINANCIAL_EXPRESS(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://thefinancialexpress.com.bd/");
        intent.putExtra("name","The Financial Express");
        startActivity(intent);
    }

    public void THE_BUSINESS_STANDARD(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.tbsnews.net/");
        intent.putExtra("name","The Business Standard");
        startActivity(intent);
    }

    public void DHAKA_TRIBUNE(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.dhakatribune.com/");
        intent.putExtra("name","Dhaka Tribune");
        startActivity(intent);
    }

    public void DAILY_SUN(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.daily-sun.com/");
        intent.putExtra("name","Daily Sun");
        startActivity(intent);
    }

    public void THE_INDEPENDENT(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://m.theindependentbd.com/");
        intent.putExtra("name","The Independent");
        startActivity(intent);
    }

    public void THE_ASIAN_AGE(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://dailyasianage.com/");
        intent.putExtra("name","The Asian Age");
        startActivity(intent);
    }

    public void THE_BANGLADESH_TODAY(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://thebangladeshtoday.com/");
        intent.putExtra("name","The Bangladesh Today");
        startActivity(intent);
    }

    public void THE_DAILY_OBSERVER(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.observerbd.com/");
        intent.putExtra("name","The Daily Observer");
        startActivity(intent);
    }
}