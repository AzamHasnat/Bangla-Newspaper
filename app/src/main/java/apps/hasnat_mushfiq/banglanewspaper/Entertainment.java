package apps.hasnat_mushfiq.banglanewspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Entertainment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment);
    }

    public void ANANDO_ALO(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.ananda-alo.com/");
        intent.putExtra("name","Ananda Alo");
        startActivity(intent);
    }

    public void BANGLA_STREET(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://banglastreet.org/");
        intent.putExtra("name","Bangla Street");
        startActivity(intent);
    }

    public void ANANDOLOK(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.anandalok.in/");
        intent.putExtra("name","ANANDOLOK");
        startActivity(intent);
    }

    public void SANANDA(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.sananda.in/");
        intent.putExtra("name","SANANDA");
        startActivity(intent);
    }

    public void KISHORE_ALO(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.kishoralo.com/");
        intent.putExtra("name","KISHORE ALO");
        startActivity(intent);
    }

    public void NISHORGO(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://nishorga.com/");
        intent.putExtra("name","NISHORGO");
        startActivity(intent);
    }

    public void PROTHOL_ALO_BINODON(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.prothomalo.com/special-supplement");
        intent.putExtra("name","PROTHOL ALO BINODON");
        startActivity(intent);
    }

    public void ITTEFAQ_BINODON(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.ittefaq.com.bd/entertainment");
        intent.putExtra("name","ITTEFAQ BINODON");
        startActivity(intent);
    }

    public void CANVAS(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.canvasmagazine.com.bd/");
        intent.putExtra("name","CANVAS");
        startActivity(intent);
    }

    public void KISHORE_BANGLA(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://kishorebangla.com/");
        intent.putExtra("name","KISHORE BANGLA");
        startActivity(intent);
    }

    public void PARJATAN_BICHITRA(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.parjatanbichitra.com/");
        intent.putExtra("name","PARJATAN BICHITRA");
        startActivity(intent);
    }

    public void rupali_alo(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","http://www.rupalialo.com/");
        intent.putExtra("name","Rupali Alo");
        startActivity(intent);
    }

    public void ABASAR(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://abasar.net/");
        intent.putExtra("name","ABASAR");
        startActivity(intent);
    }

    public void OBAK_PRITHIBI(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://abakprithibi.com/");
        intent.putExtra("name","OBAK PRITHIBI");
        startActivity(intent);
    }

    public void ANANDA_BAZAR_TRAVEL(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://www.anandabazar.com/travel");
        intent.putExtra("name","ANANDA BAZAR TRAVEL");
        startActivity(intent);
    }

    public void ANANYA(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url","https://anannya.com.bd/");
        intent.putExtra("name","ANANYA");
        startActivity(intent);
    }

}