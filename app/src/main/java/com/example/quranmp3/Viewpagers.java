package com.example.quranmp3;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Viewpagers extends FragmentPagerAdapter {

    int count ;
    public Viewpagers(FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.count=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:
                return new coranMp33();
            case 1:
                return new Livres();

            default: return null;

        }
    }

    @Override
    public int getCount() {
        return count;
    }
}
