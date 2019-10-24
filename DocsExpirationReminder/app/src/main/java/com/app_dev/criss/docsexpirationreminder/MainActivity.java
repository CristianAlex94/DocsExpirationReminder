package com.app_dev.criss.docsexpirationreminder;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;

import android.support.v4.view.ViewPager;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ViewPagerAdapter adapter;
    private TabLayout tabLayout;
    private Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //this creates the three-dot button in the right on the toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        //uses toolbar as action bar
        setSupportActionBar(toolbar);

        ViewPager viewPager = findViewById(R.id.pager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            // launch settings activity
           startActivity(new Intent(MainActivity.this, SettingsActivity.class));
        } else if(id == R.id.about_app) {
            startActivity(new Intent(MainActivity.this, AboutAppActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }
}
