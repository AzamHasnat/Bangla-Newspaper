package apps.hasnat_mushfiq.banglanewspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Bangla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla);
    }

    public void prothomalo(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.prothomalo.com/");
        intent.putExtra("name","Prothom Alo");
        startActivity(intent);
    }

    public void kalerkontho_bangla(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.kalerkantho.com/");
        intent.putExtra("name","Kaler Kantho");
        startActivity(intent);
    }

    public void ittefaq_bangla(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.ittefaq.com.bd/");
        intent.putExtra("name","Daily Ittefaq");
        startActivity(intent);
    }

    public void noyadigonto_bangla(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://dailynayadiganta.com/");
        intent.putExtra("name","Daily Naya Diganta");
        startActivity(intent);
    }

    public void bdprotidin_bangla(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url",": https://www.bd-pratidin.com/");
        intent.putExtra("name","Bangladesh Pratidin");
        startActivity(intent);
    }

    public void jugantor_bangla(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.jugantor.com/");
        intent.putExtra("name","Jugantor");
        startActivity(intent);
    }

    public void amarshongbad_bangla(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.amarsangbad.com/");
        intent.putExtra("name","Daily Amar Sangbad");
        startActivity(intent);
    }

    public void protidiner_shongbad_bangla(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.protidinersangbad.com/");
        intent.putExtra("name","Protidiner Sangbad");
        startActivity(intent);
    }

    public void shongram_bangla(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://dailysangram.com/");
        intent.putExtra("name","Daily Sangram");
        startActivity(intent);
    }

    public void manob_jomin_bangla(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://mzamin.com/");
        intent.putExtra("name","Daily Manab Zamin");
        startActivity(intent);
    }

    public void amader_somoy_bangla(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.dainikamadershomoy.com/");
        intent.putExtra("name","Dainik Amadershomoy");
        startActivity(intent);
    }

    public void samakal_bangla(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://samakal.com/");
        intent.putExtra("name","Samakal");
        startActivity(intent);
    }

    public void janakantha_bangla(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.dailyjanakantha.com/");
        intent.putExtra("name","Janakantha");
        startActivity(intent);
    }

    public void jayjaydin_bangla(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.jaijaidinbd.com/");
        intent.putExtra("name","Jai Jai Din");
        startActivity(intent);
    }

    public void vorerkagaj_bangla(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.bhorerkagoj.com/");
        intent.putExtra("name","Daily Bhorer Kagoj");
        startActivity(intent);
    }

    public void ARTHONITEER_KAGOJ(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.arthoniteerkagoj.com/");
        intent.putExtra("name","Arthoniteer Kagoj");
        startActivity(intent);
    }

    public void INQILAB(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.dailyinqilab.com/");
        intent.putExtra("name","Daily Inqilab");
        startActivity(intent);
    }

    public void SANGBAD(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://thesangbad.net/");
        intent.putExtra("name","Sangbad");
        startActivity(intent);
    }

    public void MANOB_KANTHA(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.manobkantha.com.bd/");
        intent.putExtra("name","Manob Kantha");
        startActivity(intent);
    }

    public void SUPROVAT(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://suprobhat.com/");
        intent.putExtra("name","Daily Suprobhat");
        startActivity(intent);
    }

    public void BONKI_BARTA(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://bonikbarta.net/");
        intent.putExtra("name","Bonik Barta");
        startActivity(intent);
    }

    public void Daily_DINKAL(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.dailydinkal.net/");
        intent.putExtra("name","Daily Dinkal");
        startActivity(intent);
    }

    public void ALOKITO_BANGLADESH(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.alokitobangladesh.com/");
        intent.putExtra("name","Alokito Bangladesh");
        startActivity(intent);
    }

    public void AJKER_BAZAR(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.allbanglanewspaper.xyz/newspapers.php?q=ajkerbazzar.com");
        intent.putExtra("name","Ajker Bazar");
        startActivity(intent);
    }

    public void AMADER_AURTHONEETI(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://amaderorthoneeti.com/new/");
        intent.putExtra("name","Amadar Orthoneeti");
        startActivity(intent);
    }

    public void BANGLADESH_POST(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://bangladeshpost.net/");
        intent.putExtra("name","Bangladesh Post");
        startActivity(intent);
    }

    public void SOREJOMIN_BARTA(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://sorejominbarta.com/");
        intent.putExtra("name","Sorejomin Barta");
        startActivity(intent);
    }

    public void AJKER_PATRIKA(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://ajkerpatrika.com/");
        intent.putExtra("name","Ajker Patrika");
        startActivity(intent);
    }

    public void KHABAR_PATRA(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://khoborpatrabd.com/");
        intent.putExtra("name","Khabar Patra");
        startActivity(intent);
    }

    public void VORER_PATA(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://dailyvorerpata.com/");
        intent.putExtra("name","Vorer Pata");
        startActivity(intent);
    }

    public void SHOMOYER_ALO(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.shomoyeralo.com/");
        intent.putExtra("name","Shomoyer Alo");
        startActivity(intent);
    }

    public void DHAKAR_DAK(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://dhakardak-bd.com/");
        intent.putExtra("name","Dhakar Dak");
        startActivity(intent);
    }

    public void NOTUN_BARTA(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.natun-barta.com/");
        intent.putExtra("name","Natun Barta");
        startActivity(intent);
    }

    public void SHARE_BIZ(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://sharebiz.net/");
        intent.putExtra("name","Share biz:");
        startActivity(intent);
    }

    public void DAILY_BARTOMAN(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://dailybartoman.com/");
        intent.putExtra("name","Daily Bartoman");
        startActivity(intent);
    }

    public void AJKALER_KHOBOR(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.ajkalerkhobor.net/");
        intent.putExtra("name","Ajkaler Khobor");
        startActivity(intent);
    }

    public void SANGBAD_KONIKA(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.sangbadkonika.com/");
        intent.putExtra("name","Sangbad Konika:");
        startActivity(intent);
    }

    public void SOMOYER_KANTHA(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.gonokantho.com/");
        intent.putExtra("name","Somoyer Kantha");
        startActivity(intent);
    }

    public void KHOLA_KAGOJ(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://kholakagojbd.com/");
        intent.putExtra("name","Khola Kagoj");
        startActivity(intent);
    }

    public void DESH_RUPANTOR(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.deshrupantor.com/");
        intent.putExtra("name","Desh Rupantor:");
        startActivity(intent);
    }

    public void BANGLADESHER_KHABOR(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://bangladesherkhabor.net/");
        intent.putExtra("name","Bangladesher Khabor");
        startActivity(intent);
    }

    public void AMAR_DESH(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://bd-bulletin.com/");
        intent.putExtra("name","Amar Desh");
        startActivity(intent);
    }

    public void DAILY_JAGRAN(View view) {
     Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.dailyjagaran.com/");
        intent.putExtra("name","Daily Jagran");
        startActivity(intent);
    }
}