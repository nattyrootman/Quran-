package com.example.quranmp3.RoomData;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

public class LivreViewModel extends AndroidViewModel {




    LiveData<List<modelClass>>liveData;
    MutableLiveData<String>query=new MutableLiveData<>();

    Repository repository;
    public LivreViewModel( Application application) {
        super(application);

        repository=new Repository(application);

        liveData=repository.getfullBook();
    }




    public void init() {

        getLiveData();

    }



    public void initial(){

        repository.getMut();

    }


    public LiveData<List<modelClass>>getLiveData(){

        return liveData;
    }


    public void Adder(List<modelClass>modelClasses){

        repository.Add(modelClasses);
    }

}
