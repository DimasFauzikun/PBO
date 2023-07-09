package com.example.fragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.setOnItemReselectedListener(new NavigationBarView.OnItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
               Fragment selectedFragment = null;

<<<<<<< HEAD

                switch (item.getItemId()){
                    case R.id.nav_Chats:
                        selectedFragment = new ChatsFragment();
                        break;
                    case R.id.nav_Status:
                        selectedFragment = new StatusFragment();
                        break;
                    case R.id.nav_Calls:
                        selectedFragment = new CallsFragment();
                        break;
                }
=======
                int id = item.getItemId();
                if (id == R.id.nav_Chats) {
                    selectedFragment = new ChatsFragment();
                } else if (id == R.id.nav_Status) {
                    selectedFragment = new StatusFragment();
                } else if (id == R.id.nav_Calls) {
                    selectedFragment = new CallsFragment();
                }
//                switch (item.getItemId()){
//                    case R.id.nav_Chats:
//                        selectedFragment = new ChatsFragment();
//                        break;
//                    case R.id.nav_Status:
//                        selectedFragment = new StatusFragment();
//                        break;
//                    case R.id.nav_Calls:
//                        selectedFragment = new CallsFragment();
//                        break;
//                }
>>>>>>> 1f403d1 (Update Error)

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();

            }
        });
    }
}
