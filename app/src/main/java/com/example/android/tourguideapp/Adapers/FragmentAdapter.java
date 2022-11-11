package com.example.android.tourguideapp.Adapers;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.android.tourguideapp.Fragments.FoodFragment;
import com.example.android.tourguideapp.Fragments.HotelFragment;
import com.example.android.tourguideapp.Fragments.MallsFragment;
import com.example.android.tourguideapp.Fragments.PlacesFragment;

public class FragmentAdapter extends FragmentStateAdapter {
    public FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new HotelFragment();
            case 2:
                return new MallsFragment();
            case 3:
                return new PlacesFragment();
        }
        return new FoodFragment();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
