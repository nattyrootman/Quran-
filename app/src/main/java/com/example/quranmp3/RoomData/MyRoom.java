package com.example.quranmp3.RoomData;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
@Database(entities =modelClass.class,version = 1)
public abstract class MyRoom extends RoomDatabase {


    public abstract  DaoBook daoBook();

    private static MyRoom instance;

 static   MyRoom getInstance(final Context context){



     if (instance==null){

         synchronized (MyRoom.class){

             if(instance==null){

                 instance= Room.databaseBuilder(context.getApplicationContext(),MyRoom.class,"book_base").build();
             }
         }
     }

     return instance;
 }


}
