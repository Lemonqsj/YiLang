package com.yilang.lemon.yilang;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.yilang.lemon.yilang.ui.base.TabPagerAdapter;
import com.yilang.lemon.yilang.view.NoAutoScallViewPager;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    private String[]             mTitles;
    private NoAutoScallViewPager mViewPager;
    private Fragment[]           mFragments;
    private TabPagerAdapter      mTabPagerAdapter;
    private DrawerLayout         mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mTitles = getResources().getStringArray(R.array.main_titles);
        mViewPager = (NoAutoScallViewPager) findViewById(R.id.viewpager);

        mFragments = new Fragment[2];

        mTabPagerAdapter = new TabPagerAdapter(getSupportFragmentManager(), mFragments);
        mViewPager.setAdapter(mTabPagerAdapter);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.draw_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView nav_View = (NavigationView) findViewById(R.id.nav_view);
        nav_View.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START))
            mDrawerLayout.closeDrawer(GravityCompat.START);
        super.onBackPressed();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_settings)
            return true;
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
            mViewPager.setCurrentItem(0);


        } else if (id == R.id.nav_gallery) {
            Toast.makeText(getApplicationContext(),
                    "还在开发中O_O", Toast.LENGTH_LONG).show();

        } else if (id == R.id.nav_slideshow) {
            // Handle the camera action
            mViewPager.setCurrentItem(1);

        } else if (id == R.id.nav_manage) {
            Toast.makeText(getApplicationContext(),
                    "还在开发中O_O", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_share) {
            Toast.makeText(getApplicationContext(),
                    "还在开发中O_O", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_send) {
            Toast.makeText(getApplicationContext(),
                    "还在开发中O_O", Toast.LENGTH_LONG).show();
        }

        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
