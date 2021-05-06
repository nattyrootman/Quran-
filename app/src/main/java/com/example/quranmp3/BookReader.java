package com.example.quranmp3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.quranmp3.RoomData.LivreViewModel;
import com.example.quranmp3.RoomData.Repository;

import icepick.State;

public class BookReader extends AppCompatActivity {

     String result;

    WebView webView;
    TextView textView;
     String grey,maron,orange,white;
    @State String data;
    Repository repository;

    LivreViewModel livreViewModel;
    SharedPreferences.Editor editor;

    int pos=-1;
     HorizontalScrollView scrollView;
    WebSettings webSettings;
    int color;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_reader);
        Toolbar toolbar = findViewById(R.id.toolRed);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });




        webView=findViewById(R.id.Web);

         webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

          setResult();

           SharedPreferences preferences=getSharedPreferences("f", Context.MODE_PRIVATE);

           editor=preferences.edit();
            color=preferences.getInt("color",0);
            webView.setBackgroundColor(color);

    }





    @Override
    protected void onDestroy() {
        super.onDestroy();


        SharedPreferences preferences=getSharedPreferences("f", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor=preferences.edit();
       editor.putString("title",result);
        editor.putString("key",data);



        editor.commit();


    }


    private void setResult(){

        Intent intent=getIntent();
        result=intent.getStringExtra("name");

        getSupportActionBar().setTitle(result);

        data="file:///android_asset/"+result;

        webView.loadUrl(data);




    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.couleur,menu);
        return super.onCreateOptionsMenu(menu);

    }


    @Override
    public boolean onOptionsItemSelected( MenuItem item) {

        switch (item.getItemId()){

            case R.id.noir:

                color=getResources().getColor(R.color.grey);

                webView.setBackgroundColor(color);


                break;

            case R.id.orange:

                color=getResources().getColor(R.color.orange);

                webView.setBackgroundColor(color);

                break;

            case R.id.blanc:

                color=getResources().getColor(R.color.rosty);

                webView.setBackgroundColor(color);
                break;

            case R.id.chocola:


                color=getResources().getColor(R.color.chocolat);

                webView.setBackgroundColor(color);

                break;

            case R.id.vert:

                color=getResources().getColor(R.color.vert);
                webView.setBackgroundColor(color);

                break;


            case R.id.blue:

                color=getResources().getColor(R.color.blue);
                webView.setBackgroundColor(color);

                break;


            case R.id.find:
                webView.setBackgroundColor(Color.argb(54,45,57,50));
                SharedPreferences sharedPreferences=getSharedPreferences("f",Context.MODE_PRIVATE);
                String b=sharedPreferences.getString("key",data);
                String d=sharedPreferences.getString("title",result);
                getSupportActionBar().setTitle(d);
                webView.loadUrl(b);

                break;


        }

        editor.putInt("color",color);
        editor.commit();
        return super.onOptionsItemSelected(item);
    }






         }












