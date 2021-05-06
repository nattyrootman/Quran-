package com.example.quranmp3.RoomData;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "MyBook")
public class modelClass {


    @PrimaryKey(autoGenerate = true)
    @NonNull

    @ColumnInfo(name = "IdBoook")
    private int Id;


    @ColumnInfo(name = "numeroId")
    private String numero;


    public String getFranc() {
        return franc;
    }

    public void setFranc(String franc) {
        this.franc = franc;
    }

    @ColumnInfo(name = "franId")
    private String franc;

    @ColumnInfo(name = "souratId")
    private String sourate;


    @ColumnInfo(name = "cityId")
    private String city;

    @ColumnInfo(name = "versesId")
    private String verses;

    public modelClass(String numero , String franc,String sourate, String city, String verses) {
        this.sourate = sourate;
        this.city = city;
        this.verses = verses;
        this.numero=numero;
        this.franc=franc;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getSourate() {
        return sourate;
    }

    public void setSourate(String sourate) {
        this.sourate = sourate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getVerses() {
        return verses;
    }

    public void setVerses(String verses) {
        this.verses = verses;
    }
}