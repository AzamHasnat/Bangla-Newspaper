package apps.hasnat.news;

import androidx.appcompat.app.AppCompatActivity;


import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.tabs.TabLayout;

import apps.hasnat.news.adapter.ViewPagerAdapter;
import apps.hasnat.news.fragment.BanglaFragment;
import apps.hasnat.news.fragment.BanglaIntFragment;
import apps.hasnat.news.fragment.BusinessFragment;
import apps.hasnat.news.fragment.EnglishFragment;
import apps.hasnat.news.fragment.EntertainmentFragment;
import apps.hasnat.news.fragment.EpaperFragment;
import apps.hasnat.news.fragment.InternationalFragment;
import apps.hasnat.news.fragment.JobsFragment;
import apps.hasnat.news.fragment.NewsPortalsFragment;
import apps.hasnat.news.fragment.RadioFragment;
import apps.hasnat.news.fragment.SportsFragment;
import apps.hasnat.news.fragment.TechnologyFragment;
import apps.hasnat.news.fragment.TvNewsFragment;
//import kotlinx.android.synthetic.main.activity_home.*;

public class Home extends AppCompatActivity implements BanglaFragment.OnFragmentInteractionListener,
        BusinessFragment.OnFragmentInteractionListener, EnglishFragment.OnFragmentInteractionListener,
        BanglaIntFragment.OnFragmentInteractionListener, EntertainmentFragment.OnFragmentInteractionListener,
        EpaperFragment.OnFragmentInteractionListener, InternationalFragment.OnFragmentInteractionListener,
        JobsFragment.OnFragmentInteractionListener,  NewsPortalsFragment.OnFragmentInteractionListener,
        RadioFragment.OnFragmentInteractionListener,  SportsFragment.OnFragmentInteractionListener,
        TechnologyFragment.OnFragmentInteractionListener,  TvNewsFragment.OnFragmentInteractionListener{

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Window window = Home.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(ContextCompat.getColor(Home.this, R.color.black));

        initToolBar();
        init();

    }

    private void init() {

        //Home = findViewById(R.id.personal_accounting);
        tabLayout = findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("Bangla"));
        tabLayout.addTab(tabLayout.newTab().setText("English"));
        tabLayout.addTab(tabLayout.newTab().setText("International"));
        tabLayout.addTab(tabLayout.newTab().setText("E-Ppaer"));
        tabLayout.addTab(tabLayout.newTab().setText("News Portal"));
        tabLayout.addTab(tabLayout.newTab().setText("Sports"));
        tabLayout.addTab(tabLayout.newTab().setText("Technology"));
        tabLayout.addTab(tabLayout.newTab().setText("Business"));
        tabLayout.addTab(tabLayout.newTab().setText("TV News"));
        tabLayout.addTab(tabLayout.newTab().setText("Entertainment"));
        tabLayout.addTab(tabLayout.newTab().setText("Job Circular"));
        tabLayout.addTab(tabLayout.newTab().setText("Radio"));


        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        viewPager = findViewById(R.id.viewPager);
        final ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    private boolean isConnected() {
        ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Activity.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected())
            return true;
        else
            return false;
    }

    private void initToolBar() {
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        findViewById(R.id.ibtnBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startTheActvity();
            }
        });
    }

    private void startTheActvity() {
        //startActivity(new Intent(MyDaysSales.this, MainActivity.class));
        finish();
    }
}