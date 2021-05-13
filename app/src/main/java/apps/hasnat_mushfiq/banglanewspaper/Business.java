package apps.hasnat_mushfiq.banglanewspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Business extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);
    }

    public void ARThOSUCHAK(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.arthosuchak.com/");
        intent.putExtra("name","Arthosuchak");
        startActivity(intent);
    }

    public void CHATTAGRAM_STOCK_EXCHANGE(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.cse.com.bd/");
        intent.putExtra("name","Chattagram Stock Exchange");
        startActivity(intent);
    }

    public void Dhaka_stock_exchange(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.dsebd.org/");
        intent.putExtra("name","Dhaka Stock Exchange");
        startActivity(intent);
    }

    public void SHARE_BIZ(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.dailysharebiz.net/");
        intent.putExtra("name","Share Biz");
        startActivity(intent);
    }

    public void SHARE_MARKET_BD(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.sharemarketbd.com/");
        intent.putExtra("name","Share Market BD");
        startActivity(intent);
    }

    public void STOCK_BANGLADESH(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://stockbangladesh.com/");
        intent.putExtra("name","Stock Bangladesh");
        startActivity(intent);
    }

    public void THE_FINANCIAL_EXPRESS(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://thefinancialexpress.com.bd/");
        intent.putExtra("name","The Financial Express");
        startActivity(intent);
    }

    public void BUSINESS_NEWS_24_BD(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://businessnews24bd.com/");
        intent.putExtra("name","Business News 24 BD");
        startActivity(intent);
    }

    public void PUZI_BAZAR(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://pujibazar.com/");
        intent.putExtra("name","Puzi Bazar");
        startActivity(intent);
    }

    public void DAILY_STOCK_BANGLADESH(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.dailystockbangladesh.com/");
        intent.putExtra("name","Daily Stock Bangladesh");
        startActivity(intent);
    }

    public void SHARE_BUSINESS_24(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.sharebusiness24.com/");
        intent.putExtra("name","Share Business 24");
        startActivity(intent);
    }

    public void AJKER_BAZAR(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.ajkerbazzar.com/");
        intent.putExtra("name","Ajker Bazar");
        startActivity(intent);
    }

    public void BONIK_BARTA(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://bonikbarta.net/");
        intent.putExtra("name","Bonik Barta");
        startActivity(intent);
    }

    public void SHARE_NEWS_24(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.sharenews24.com/");
        intent.putExtra("name","Share News 24");
        startActivity(intent);
    }

    public void SHARE_BAZAR_NEWS(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.sharebazarnews.com/");
        intent.putExtra("name","Share Bazar News");
        startActivity(intent);
    }
}