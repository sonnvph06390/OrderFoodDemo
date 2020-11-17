package com.example.orderfooddemo.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.orderfooddemo.R;
import com.example.orderfooddemo.activity.fragments.AllFragment;
import com.example.orderfooddemo.activity.fragments.CartFragment;
import com.example.orderfooddemo.activity.fragments.HomeFragment;
import com.example.orderfooddemo.activity.fragments.NotifyFragment;
import com.example.orderfooddemo.activity.fragments.PersonalFragment;
import com.example.orderfooddemo.activity.fragments.TableFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Menu");
        loadFragment(new HomeFragment());
        bottomNavigation = (BottomNavigationView) findViewById(R.id.bottomNavigation);
        bottomNavigation.setBackgroundColor(000);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment=null;
                switch (item.getItemId()){
                    case R.id.page_home:
                        fragment=new HomeFragment();
                        loadFragment(fragment);
                        return true;
                    case R.id.page_table:
                        fragment=new TableFragment();
                        getSupportActionBar().setTitle("Đặt Bàn");
                        loadFragment(fragment);
                        return true;
                    case R.id.page_cart:
                        fragment=new CartFragment();
                        getSupportActionBar().setTitle("Danh sách đã chọn");
                        loadFragment(fragment);
                        return true;
                    case R.id.page_notifycation:
                        fragment=new NotifyFragment();
                        getSupportActionBar().setTitle("Thông báo");
                        loadFragment(fragment);
                        return true;
                    case R.id.page_personal:
                        fragment=new PersonalFragment();
                        getSupportActionBar().setTitle("Cá nhân");
                        loadFragment(fragment);
                        return true;
                }
                return false;
            }

        });
    }
    private boolean loadFragment(Fragment fragment){
        if ( fragment!=null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame_container,fragment)
                    .commit();
            return true;
        }
        return false;
    }
}