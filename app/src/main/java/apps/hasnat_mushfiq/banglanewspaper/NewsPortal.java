package apps.hasnat_mushfiq.banglanewspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NewsPortal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_portal);
    }

    public void ONE_NEWS_BD(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.onenewsbd.com/");
        intent.putExtra("name","One News bd");
        startActivity(intent);
    }

    public void AB_NEWS_24(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.abnews24.com/");
        intent.putExtra("name","Ab News 24");
        startActivity(intent);
    }

    public void CHANGE_TV_PRESS(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://changetv.press/");
        intent.putExtra("name","Change Tv Press");
        startActivity(intent);
    }

    public void AB_NEWS_24_BD(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.abnews24bd.com/");
        intent.putExtra("name","Ab News24 Bd");
        startActivity(intent);
    }

    public void ALOKITO_PROTIDIN(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.alokitoprotidin.com/");
        intent.putExtra("name","Alokito protidin");
        startActivity(intent);
    }

    public void AMADER_SOMOY_DOT_COM(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","amader shomoy dot comhttps://www.amadershomoy.com/");
        intent.putExtra("name","Amader Shomoy Dot Com");
        startActivity(intent);
    }

    public void ASIAN_NEWS_OF_BANGLADESH(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.anbnewsagency.com/");
        intent.putExtra("name","Asian News Of Bangladesh");
        startActivity(intent);
    }

    public void APARAJEYO_BANGLA(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.aparajeobangla.com/");
        intent.putExtra("name","Aparajeo Bangla");
        startActivity(intent);
    }

    public void BANGLA_INSIDER(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.banglainsider.com/");
        intent.putExtra("name","Bangla Insider");
        startActivity(intent);
    }

    public void BANGLA_NEWS_24(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.banglanews24.com/");
        intent.putExtra("name","Bangla News24");
        startActivity(intent);
    }

    public void BANGLA_TELEGRAPH(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.banglatelegraph.com/");
        intent.putExtra("name","Bangla Telegraph");
        startActivity(intent);
    }

    public void BANGLA_TRIBUNE(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.banglatribune.com/");
        intent.putExtra("name","Bangla Tribune");
        startActivity(intent);
    }

    public void BANGLADESH_ONLINE_24(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://bangladeshonline24.com/");
        intent.putExtra("name","Bangladesh Online24");
        startActivity(intent);
    }

    public void BARTA_24(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://barta24.com/");
        intent.putExtra("name","Barta24");
        startActivity(intent);
    }

    public void BARTA_BANGLA(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://bartabangla.com/");
        intent.putExtra("name","Barta Bangla");
        startActivity(intent);
    }

    public void BARTA_KONTHO(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://bartakontho.com/");
        intent.putExtra("name","Barta Kontho");
        startActivity(intent);
    }

    public void BD_24_LIVE(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.bd24live.com/bangla/");
        intent.putExtra("name","BD24 Live");
        startActivity(intent);
    }

    public void BD_TIMES_365(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.bdtimes365.com/");
        intent.putExtra("name","BD Times365");
        startActivity(intent);
    }

    public void BD_TODAY_24(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://bdtoday24.com/");
        intent.putExtra("name","BD Today24");
        startActivity(intent);
    }

    public void BD_TYPE(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.bdtype.com/");
        intent.putExtra("name","Bdtype");
        startActivity(intent);
    }

    public void BD_NEWS_24(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://bangla.bdnews24.com/");
        intent.putExtra("name","BD News24");
        startActivity(intent);
    }

    public void BREAKING_NEWS(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.breakingnews.com.bd/");
        intent.putExtra("name","Breaking News");
        startActivity(intent);
    }

    public void BSS_NEWS(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.bssnews.net/bangla/");
        intent.putExtra("name","Bss News");
        startActivity(intent);
    }

    public void CHASHI_SHEBA(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.chashiseba.com/");
        intent.putExtra("name","Chashi Seba");
        startActivity(intent);
    }

    public void DAILY_BANGLADESH(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.daily-bangladesh.com/");
        intent.putExtra("name","Daily Bangladesh");
        startActivity(intent);
    }

    public void DHAKA_TIMES_24(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.dhakatimes24.com/");
        intent.putExtra("name","Dhaka Times24");
        startActivity(intent);
    }

    public void DMP_NEWS(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://dmpnews.org/");
        intent.putExtra("name","Dmp News");
        startActivity(intent);
    }

    public void FNS_24(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.fns24.com/");
        intent.putExtra("name","Fns 24");
        startActivity(intent);
    }

    public void FAST_NEWS_BD(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.fastnewsbd.com/");
        intent.putExtra("name","Fast News Bd");
        startActivity(intent);
    }

    public void GO_NEWS_24(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.gonews24.com/");
        intent.putExtra("name","Go News24");
        startActivity(intent);
    }

    public void HAWKER(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://hawker.com.bd/");
        intent.putExtra("name","Hawker");
        startActivity(intent);
    }

    public void DHAKA_NEWS_24(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://dhakanews24.com/");
        intent.putExtra("name","Dhaka News24");
        startActivity(intent);
    }

    public void JAGO_NEWS_24(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.jagonews24.com/");
        intent.putExtra("name","Jago News24");
        startActivity(intent);
    }

    public void KACHER_DEYAL(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://kacherdeyal.com/");
        intent.putExtra("name","Kacher Deyal");
        startActivity(intent);
    }

    public void LAKHO_KANTHO(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.lakhokantho.com/");
        intent.putExtra("name","Lakho Kantho");
        startActivity(intent);
    }

    public void LIVE_PRESS_24(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.livepress24.com/");
        intent.putExtra("name","Live Press24");
        startActivity(intent);
    }

    public void NAGORIK_BARTA(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://nagorikbarta.com/");
        intent.putExtra("name","Nagorik Barta");
        startActivity(intent);
    }

    public void NATUN_BARTA(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.natunbarta.com/");
        intent.putExtra("name","Natun Barta");
        startActivity(intent);
    }

    public void NEWS_BANGLADESH(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.newsbangladesh.com/");
        intent.putExtra("name","News Bangladesh");
        startActivity(intent);
    }

    public void NIRAPAD_NEWS(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.nirapadnews.com/");
        intent.putExtra("name","Nirapad News");
        startActivity(intent);
    }

    public void NOTUN_KHOBOR(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://notunkhobor.com/");
        intent.putExtra("name","Notun Khobor");
        startActivity(intent);
    }

    public void ODHIKAR_NEWS(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.odhikar.news/");
        intent.putExtra("name","Odhikar");
        startActivity(intent);
    }

    public void PRIME_NEWS_BD(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.primenewsbd.com/");
        intent.putExtra("name","Prime NewsBD");
        startActivity(intent);
    }

    public void RISING_BD(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.risingbd.com/");
        intent.putExtra("name","RisingBD");
        startActivity(intent);
    }

    public void RTNN(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.rtnn.net/bangla/");
        intent.putExtra("name","Rtnn");
        startActivity(intent);
    }

    public void SAHOS_24(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.sahos24.com/");
        intent.putExtra("name","Sahos24");
        startActivity(intent);
    }

    public void SAMAKAL_NEWS_24(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://samakalnews24.com/shamakal_main_slider/bnmgvfhgdu/");
        intent.putExtra("name","Samakalnews24");
        startActivity(intent);
    }

    public void SARA_BANGLA(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://sarabangla.net/");
        intent.putExtra("name","Sarabangla");
        startActivity(intent);
    }

    public void SHERSHA_NEWS_24(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.shershanews24.com/");
        intent.putExtra("name","Shersha News24");
        startActivity(intent);
    }

    public void SOMOYER_KONTHOSOR(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.somoyerkonthosor.com/");
        intent.putExtra("name","Somoyer Konthosor");
        startActivity(intent);
    }

    public void THE_REPORT_24(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://bangla.thereport24.com/");
        intent.putExtra("name","The Report24");
        startActivity(intent);
    }
}