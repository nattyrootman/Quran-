package com.example.quranmp3;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.SearchView;
import androidx.core.net.ConnectivityManagerCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.jean.jcplayer.JcPlayerManager;
import com.example.jean.jcplayer.JcPlayerManagerListener;
import com.example.jean.jcplayer.general.JcStatus;
import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.net.NetworkInterface;
import java.util.List;

import static androidx.recyclerview.widget.LinearLayoutManager.VERTICAL;


public class coranMp33 extends Fragment implements MyAdapter.OnClickList,JcPlayerManagerListener {


    MyAdapter myAdapter;
    ViewModels models;
    RecyclerView recyclerView;
    JcPlayerView playerView;

    List<Model> modelList;

    androidx.appcompat.widget.SearchView searchView;
    ImageView imageView;

    EditText editText;
   int p ;

    SharedPreferences.Editor edit;

    public coranMp33() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        setHasOptionsMenu(true);
        View view = inflater.inflate(R.layout.fragment_coran_mp33, container, false);

        playerView = view.findViewById(R.id.jc);
        recyclerView = view.findViewById(R.id.recycle);


        recyclerView.setHasFixedSize(true);
        DividerItemDecoration decoration = new DividerItemDecoration(getContext(), VERTICAL);

        recyclerView.addItemDecoration(decoration);


        models = new ViewModelProvider(getActivity()).get(ViewModels.class);


             models.init();

           setModels();


           MyAdapter.setClickList(this);




        return view;

    }


    @Override
    public void onStart() {
        super.onStart();

        SharedPreferences preferences=getActivity().getSharedPreferences("f", Context.MODE_PRIVATE);

        SharedPreferences.Editor   editor=preferences.edit();
        p=preferences.getInt("key",0);

        playerView.playAudio(playerView.getMyPlaylist().get(p));


    }

    private void setModels() {

        models.getAll().observe(getViewLifecycleOwner(), new Observer<List<JcAudio>>() {
            @Override
            public void onChanged(List<JcAudio> jcAudios) {


                    playerView.initPlaylist(jcAudios, null);

                myAdapter = new MyAdapter(getContext());

                myAdapter.setAudioList(jcAudios);
                recyclerView.setAdapter(myAdapter);



            }
        });


    }


    @Override
    public void onViewCreated( View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        models.getQuery().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {

                if (s!=null) {
                    myAdapter.getFilter().filter(s);
                }
            }
        });




    }


    @Override
    public void Click(int po) {


        playerView.playAudio(playerView.getMyPlaylist().get(po));

        playerView.createNotification(R.drawable.cali3);



        SharedPreferences preferences=getActivity().getSharedPreferences("f", Context.MODE_PRIVATE);

        SharedPreferences.Editor   editor=preferences.edit();

        edit.putInt("key",po);

       edit.commit();



    }










    @Override
    public void onCompletedAudio() {

    }

    @Override
    public void onContinueAudio(JcStatus jcStatus) {

    }

    @Override
    public void onJcpError(Throwable throwable) {

    }

    @Override
    public void onPaused(JcStatus jcStatus) {

    }

    @Override
    public void onPlaying(JcStatus jcStatus) {


    }

    @Override
    public void onPreparedAudio(JcStatus jcStatus) {

    }

    @Override
    public void onStopped(JcStatus jcStatus) {

    }

    @Override
    public void onTimeChanged(JcStatus jcStatus) {

    }
}
