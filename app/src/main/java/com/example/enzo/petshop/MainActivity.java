package com.example.enzo.petshop;

import android.app.LauncherActivity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    //recyclerview objects
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    //model object for our list data
    private List<MyList> list;

    //
    private static final String TAG = "MainActivity";

    private SectionsPageAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing views
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();

        loadRecyclerViewItem();

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        /*mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);*/

        /*TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);*/

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_home:
                        break;

                    case R.id.ic_shopping_cart:
                        Intent intent1 = new Intent(MainActivity.this, ShoppingCart.class);
                        startActivity(intent1);
                        break;

                    case R.id.ic_notifications:
                        Intent intent2 = new Intent(MainActivity.this, Notifications.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_user:
                        Intent intent3 = new Intent(MainActivity.this, User.class);
                        startActivity(intent3);
                        break;
                }


                return false;
            }
        });
    }

    private void loadRecyclerViewItem() {
        //you can fetch the data from server or some apis
        //for this tutorial I am adding some dummy data directly
        for (int i = 1; i <= 8; i++) {
            MyList myList = new MyList(
                    "Veterinaria " + i,
                    "Descripcion de la Veterinaria",
                    "direccion Veterinaria"
            );
            list.add(myList);
        }
        adapter = new CustomAdapter(list, this);
        recyclerView.setAdapter(adapter);

//        StringRequest stringrequest = new StringRequest(Request.Method.GET,
//                "http://localhost/py_webservices/obtener_veterinarias.php",
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        try {
//                            JSONObject jsonObject = new JSONObject(response);
//                            JSONArray array = jsonObject.getJSONArray("metas");
//
//                            for (int i = 0; i < array.length(); i++){
//                                JSONObject object = array.getJSONObject(i);
//                                MyList lisItem = new MyList(
//                                        object.getString("nombre"),
//                                        object.getString("descripcion"),
//                                        object.getString("direccion")
//                                );
//                                list.add(lisItem);
//
//                                Toast.makeText(getApplicationContext(),array.length() , Toast.LENGTH_LONG).show();
//
//
//                                adapter = new CustomAdapter(list, getApplicationContext());
//                                recyclerView.setAdapter(adapter);
//
//                            }
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_LONG).show();
//                    }
//                });
//        RequestQueue requestQueue = Volley.newRequestQueue(this);
//        requestQueue.add(stringrequest);

    }
}
