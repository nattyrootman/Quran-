
package com.example.quranmp3;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;
import com.example.quranmp3.RoomData.LivreViewModel;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    MyAdapter myAdapter;
    ViewModels models;
    RecyclerView recyclerView;
    JcPlayerView playerView;
    LivreViewModel livreViewModel;

    List<Model> modelList;

    List<JcAudio> list = new ArrayList<>();


    Toolbar toolbar;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    TabLayout tabLayout;
    TabItem item1, item2, item3;
    ViewPager viewPager;
    Viewpagers viewpagers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        models = new ViewModelProvider(this).get(ViewModels.class);
        livreViewModel = new ViewModelProvider(this).get(LivreViewModel.class);

        setPager();
        setTabLayout();


    }


    private void setPager() {
        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.navigation);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);

        drawerLayout.addDrawerListener(toggle);
        toggle.setDrawerIndicatorEnabled(true);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);

    }


    private void setTabLayout() {
        tabLayout = findViewById(R.id.ta);
        item1 = findViewById(R.id.coranMp3);
        item2 = findViewById(R.id.livre);
        viewPager = findViewById(R.id.pager);

        tabLayout.setSelectedTabIndicatorColor(Color.WHITE);
        tabLayout.setTabTextColors(ColorStateList.valueOf(Color.WHITE));

        viewpagers = new Viewpagers(getSupportFragmentManager(), tabLayout.getTabCount());


        viewPager.setAdapter(viewpagers);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                tabLayout.getTabCount();

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public boolean onNavigationItemSelected(MenuItem item) {

        DrawerLayout drawerLayout = findViewById(R.id.drawer);
        drawerLayout.closeDrawer(GravityCompat.START);

        switch (item.getItemId()) {

            case R.id.twitter:


                Intent intent = null;
                try {

                    this.getPackageManager().getPackageInfo("com.twitter.android", 0);
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?user_id=720335700529385472"));

                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);


                } catch (Exception e) {

                    intent = new Intent(Intent.ACTION_SEND, Uri.parse("https://twitter.com/natty dread"));

                }
                this.startActivity(intent);
                break;


            case R.id.insta:

                Intent in = null;

                try {


                    this.getPackageManager().getPackageInfo("com.instagram.android",0);

                    in = new Intent(Intent.ACTION_VIEW,Uri.parse("http://instagram.com/_u/abathily20"));


                } catch (Exception e) {

                    in = new Intent(Intent.ACTION_SEND, Uri.parse("https://instagram.com/_u/abathily20"));

                }

              this.startActivity(in);

                Toast.makeText(getApplicationContext(), "Instagram", Toast.LENGTH_LONG).show();
                break;


            case R.id.email:

                Intent feed = new Intent(Intent.ACTION_SEND);
                feed.setData(Uri.parse("email"));
                String[] strings = {"abathily20@gmail.com", "xyz@gmail.com"};
                feed.putExtra(Intent.EXTRA_EMAIL, strings);
                feed.putExtra(Intent.EXTRA_SUBJECT, "Sujet");
                feed.putExtra(Intent.EXTRA_EMAIL, "Le corp de du Message");
                feed.setType("message/rfc822");

                startActivity(Intent.createChooser(feed, "Envoyer"));

                Toast.makeText(getApplicationContext(), "email", Toast.LENGTH_LONG).show();
                break;

            case R.id.About:

                Toast.makeText(getApplicationContext(),"vide pour le moment",Toast.LENGTH_LONG).show();

                break;

            case R.id.props:

                setV();
                break;



        }

        return false;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.search, menu);


        MenuItem item = menu.findItem(R.id.Search_Iem);
        SearchView searchView = (SearchView) item.getActionView();


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                Log.i("onQueryTextChange", newText);

                models.setQuery(newText);


                return false;
            }
        });


        return super.onCreateOptionsMenu(menu);
    }


    public void setV() {


        AlertDialog.Builder builder=new AlertDialog.Builder(this);

        builder.setCancelable(true);
        builder.setTitle(R.string.propos);


        String b="";
        try {

            InputStream inputStream=getApplicationContext().getAssets().open("About.txt");

            int size=inputStream.available();
            byte[]bytes=new byte[size];

            inputStream.read(bytes);
            b=new String(bytes);

            inputStream.close();

        }catch (IOException e){


        }

        builder.setMessage(b);

         builder.setNegativeButton("Annuler", new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialog, int which) {

                 dialog.cancel();
             }
         });


        builder.setPositiveButton("Compris", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {


                dialog.dismiss();
            }
        });



        builder.create().show();

    }




    }
