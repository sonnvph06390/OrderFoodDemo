package com.example.orderfooddemo.activity.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.orderfooddemo.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private TabLayout tabHomeFragment;
    private TabItem tabItemAllFragment;
    private ViewPager viewpagerHomeFragment;
    ArrayList<Fragment>listFragment;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_home, container, false);
        tabHomeFragment = view.findViewById(R.id.tab_home_fragment);
        tabItemAllFragment=view.findViewById(R.id.tabAllFragment);
        viewpagerHomeFragment = view.findViewById(R.id.viewpager_home_fragment);
        tabHomeFragment.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
//                viewpagerHomeFragment.setCurrentItem(tab.getPosition());
//                if (tab.getPosition()==1){
//                    listFragment.add(new AllFragment());
//                    tabHomeFragment.setupWithViewPager(viewpagerHomeFragment);
//                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return view;
    }
}