package com.example.quranmp3.RoomData;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Ignore;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DaoBook {

@Insert
    void AddLivre(  List<modelClass>modelClasses);


@Query("SELECT * FROM MyBook")
  LiveData<List<modelClass>>getAllBook();


}
