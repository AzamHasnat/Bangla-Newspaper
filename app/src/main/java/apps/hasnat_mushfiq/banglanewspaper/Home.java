package apps.hasnat_mushfiq.banglanewspaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.tabs.TabLayout;

import apps.hasnat_mushfiq.banglanewspaper.adapter.ViewPagerAdapter;
//import kotlinx.android.synthetic.main.activity_home.*;

public class Home extends AppCompatActivity {

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

        init();

    }

    private void init() {

        //Home = findViewById(R.id.personal_accounting);
        tabLayout = findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("Income Entry"));
        tabLayout.addTab(tabLayout.newTab().setText("Expense Entry"));
        tabLayout.addTab(tabLayout.newTab().setText("Dena/Loan Taken"));
        //tabLayout.addTab(tabLayout.newTab().setText("Dena/Loan Payment"));
        tabLayout.addTab(tabLayout.newTab().setText("Paona/Loan Given"));
        //tabLayout.addTab(tabLayout.newTab().setText("Paona/Loan Collection"));
        tabLayout.addTab(tabLayout.newTab().setText("Fund Transfer"));
        tabLayout.addTab(tabLayout.newTab().setText("Monthly Summary"));
        tabLayout.addTab(tabLayout.newTab().setText("Ledger"));
        tabLayout.addTab(tabLayout.newTab().setText("Head of Accounts"));


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
}