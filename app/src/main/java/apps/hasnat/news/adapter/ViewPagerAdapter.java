package apps.hasnat.news.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import apps.hasnat.news.fragment.BanglaFragment;
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

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    int nNoOfTabs;
    public ViewPagerAdapter(FragmentManager fm, int numberOfTabs){
        super(fm);
        this.nNoOfTabs = numberOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {

           /* case 0:
                HeadsOfAccounts headsOfAccounts = new HeadsOfAccounts();
                return headsOfAccounts;

            case 1:
                Ledger ledger = new Ledger();
                return ledger;*/

            case 0:
                BanglaFragment banglaFragment = new BanglaFragment();
                return banglaFragment;

            case 1:
                EnglishFragment englishFragment = new EnglishFragment();
                return englishFragment;
            case 2:
                InternationalFragment internationalFragment = new InternationalFragment();
                return internationalFragment;
          /*  case 5:
                Dena_LoanPorishodh dena_loanPorishodh = new Dena_LoanPorishodh();
                return dena_loanPorishodh;*/
            case 3:
                EpaperFragment epaperFragment = new EpaperFragment();
                return  epaperFragment;
         /*   case 7:
                Paona_LoanCollection paona_loanCollection = new Paona_LoanCollection();
                return paona_loanCollection;*/
            case 4:
                NewsPortalsFragment newsPortalsFragment = new NewsPortalsFragment();
                return newsPortalsFragment;
            case 5:
                SportsFragment sportsFragment = new SportsFragment();
                return sportsFragment;

            case 6:
                TechnologyFragment technologyFragment = new TechnologyFragment();
                return technologyFragment;
            case 7:
                BusinessFragment businessFragment = new BusinessFragment();
                return businessFragment;
            case 8:
                TvNewsFragment tvNewsFragment = new TvNewsFragment();
                return tvNewsFragment;
            case 9:
                EntertainmentFragment entertainmentFragment = new EntertainmentFragment();
                return entertainmentFragment;

          /*  case 10:
                BanglaIntFragment banglaIntFragment = new BanglaIntFragment();
                return banglaIntFragment;*/
            case 10:
                JobsFragment jobsFragment = new JobsFragment();
                return jobsFragment;
            case 11:
                RadioFragment radioFragment = new RadioFragment();
                return radioFragment;


//            case 7:
//                MonthlySummary monthlySummary = new MonthlySummary();
//                return monthlySummary;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return nNoOfTabs;
    }
}
