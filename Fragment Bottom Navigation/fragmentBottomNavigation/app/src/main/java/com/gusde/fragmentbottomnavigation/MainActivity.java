package com.gusde.fragmentbottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView botomNavigation ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botomNavigation = findViewById(R.id.bottom_navigation) ;

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmaent_container,new HomeFragment()).commit() ;


        botomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment selectedFragment = null ;

                switch (item.getItemId()){
                    case R.id.nav_home:
                        selectedFragment=new HomeFragment();
                        break;
                    case R.id.nav_add:
                        selectedFragment=new AddFragment();
                        break;
                    case R.id.nav_profil:
                        selectedFragment=new ProfilFragment();
                        break;
                    case R.id.nav_search:
                        selectedFragment=new SearchFragment();
                        break;
                    case R.id.nav_favorit:
                        selectedFragment=new FavoritFragment();
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.fragmaent_container,selectedFragment).commit() ;

                return true;
            }
        });
    }
}