

package com.example.quranmp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quranmp3.RoomData.LivreViewModel;
import com.example.quranmp3.RoomData.RecycleAdapter;
import com.example.quranmp3.RoomData.modelClass;

import java.util.List;


public class Livres extends Fragment implements RecycleAdapter.onClickListener {



    public Livres() {

    }





    RecyclerView recyclerView;
    RecycleAdapter adapter;
    LivreViewModel livreViewModel;
    ViewModels models;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    View view= inflater.inflate(R.layout.fragment_livre, container, false);

    recyclerView=view.findViewById(R.id.mycycle);
    recyclerView.setHasFixedSize(true);


    DividerItemDecoration decoration=new DividerItemDecoration(getActivity(), LinearLayout.VERTICAL);

    recyclerView.addItemDecoration(decoration);

    livreViewModel=new ViewModelProvider(getActivity()).get(LivreViewModel.class);
    models=new ViewModelProvider(getActivity()).get(ViewModels.class);



        livreViewModel.initial();

        adapter=new RecycleAdapter(getContext(),this::onClicMe);


      setModel();


        return view;

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }

    private void setModel(){

        livreViewModel.getLiveData().observe(getActivity(), new Observer<List<modelClass>>() {
            @Override
            public void onChanged(List<modelClass> modelClasses) {


                adapter.setList(modelClasses);

                recyclerView.setAdapter(adapter);


            }
        });

    }


    @Override
    public void onViewCreated( View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        models.getQuery().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                if (s!=null){

                    adapter.getFilter().filter(s);
                }
            }
        });

    }

    @Override
    public void onClicMe(modelClass p) {



        Toast.makeText(getActivity(),"nom"+p,Toast.LENGTH_LONG).show();

        Intent intent=new Intent(getActivity(), BookReader.class);

        intent.putExtra("name",p.getSourate());


        getActivity().startActivity(intent);



    }
}


