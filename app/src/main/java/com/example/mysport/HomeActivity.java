package com.example.mysport;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.navigation.NavigationView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, new homeFragment());
        transaction.commit();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,toolbar,R.string.Opnen_navigation,R.string.Close_navigation);
        drawer.addDrawerListener(toggle);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        toggle.syncState();

    }

    @Override
    public void onBackPressed() {

        if (drawer.isDrawerOpen(GravityCompat.START)){


            drawer.isDrawerOpen(GravityCompat.START);
        }else {

            super.onBackPressed();


        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch(menuItem.getItemId()){


            case R.id.Athletics:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new AthleticsFragment()).commit();

                break;

            case R.id.Developer:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new developerFragment()).commit();

                break;

            case R.id.Volley:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new VolleyFragment()).commit();

                break;

            case R.id.Help:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HelpFragment()).commit();

                break;

            case R.id.logout:

                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ExitFragment newFragment = new ExitFragment();
                newFragment.show(ft,"Dialog");
                break;


        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
