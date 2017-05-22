package com.example.enzo.petshop;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class User extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(3);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_home:
                        Intent intent0 = new Intent(User.this, MainActivity.class);
                        startActivity(intent0);
                        break;

                    case R.id.ic_shopping_cart:
                        Intent intent1 = new Intent(User.this, ShoppingCart.class);
                        startActivity(intent1);
                        break;

                    case R.id.ic_notifications:
                        Intent intent2 = new Intent(User.this, Notifications.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_user:
                        /*Intent intent3 = new Intent(User.this, User.class);
                        startActivity(intent3);*/
                        break;
                }


                return false;
            }
        });
    }
}
