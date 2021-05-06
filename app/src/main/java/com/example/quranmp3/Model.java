package com.example.quranmp3;

import com.example.jean.jcplayer.model.JcAudio;

import java.util.List;

public class Model {

    public    List<JcAudio>list;
    public String reciter;

    public Model(List<JcAudio> list, String reciter) {
        this.list = list;
        this.reciter = reciter;
    }



    public List<JcAudio> getList() {
        return list;
    }

    public void setList(List<JcAudio> list) {
        this.list = list;
    }

    public String getReciter() {
        return reciter;
    }

    public void setReciter(String reciter) {
        this.reciter = reciter;
    }





}
