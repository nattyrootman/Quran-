package com.example.quranmp3.RoomData;

import android.app.Application;
import android.content.Context;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    Context context;

    private DaoBook daoBook;

    int pos=0;

    private LiveData<List<modelClass>> liveData;

    MutableLiveData<List<modelClass>> mutableLiveData = new MutableLiveData<>();

  public   List<modelClass> list = new ArrayList<>();

    public Repository(Application application) {

        MyRoom room;

        room = MyRoom.getInstance(application);

        daoBook = room.daoBook();
        liveData = daoBook.getAllBook();
    }

    private static class AddBookSync extends AsyncTask<List<modelClass>, Void, Void> {

        DaoBook book;

        public AddBookSync(DaoBook daoBook) {

            book = daoBook;

        }

        @Override
        protected Void doInBackground(List<modelClass>... lists) {

            book.AddLivre(lists[0]);

            return null;
        }
    }


    public LiveData<List<modelClass>> getfullBook() {

        return mutableLiveData;
    }

    public void Add(List<modelClass> modelClasses) {

        AddBookSync addBookSync = new AddBookSync(daoBook);

        addBookSync.execute(modelClasses);

    }


    public MutableLiveData<List<modelClass>> getMut() {


        setAdd();


        mutableLiveData.setValue(list);

        return mutableLiveData;

    }


      public  void setNext(){
        if (pos<list.size()-1){

            pos=pos+1;
        }


      }


    private void setAdd() {

        list.add(new modelClass("1","Prologue","Al Fatiha","Mecque","7/aya"));

        list.add(new modelClass("2","La Vache","Al Baqara","Medine","286/aya"));

        list.add(new modelClass("3","La Famille d'imran","Al Imran","Medine","200/aya"));
        list.add(new modelClass("4","Les Femmes","An Nissa","Medine","176/aya"));

        list.add(new modelClass("5","Table servie" ,"Al Maida","Medine","120/aya"));

        list.add(new modelClass("6","Les Bestiaux","Al Anaam","Mecque","165/aya"));

        list.add(new modelClass("7","Araf","Al Aaraf","Mecque","206/aya"));
        list.add(new modelClass("8","Le Butin","Al Anfal","Medine","75/aya"));
        list.add(new modelClass("9","La Répentance","At Tawbah","Medine","129/aya"));
        list.add(new modelClass("10","Yunus","Yunus","Mecque","109/aya"));
        list.add(new modelClass("11","Hud","Hud","Mecque","123/aya"));

        list.add(new modelClass("12","Joseph","Yousouf","Mecque","111/aya"));
        list.add(new modelClass("13","Le Tonnerre","Ar  Raad","Medine","43/aya"));
        list.add(new modelClass("14","Ibrahim","Ibrahim","Mecque","52/aya"));
        list.add(new modelClass("15","Al Hijr","Al Hijr","Mecque","99/aya"));
        list.add(new modelClass("16","Les Abeilles","AL Nahl","Mecque","128/aya"));
        list.add(new modelClass("17","Le Voyage nocturne","Israa","Mecque","111/aya"));
        list.add(new modelClass("18","La Caverne","Al Kahf","Mecque","110/aya"));
        list.add(new modelClass("19","Marie","Mariam","Mecque","98/aya"));
        list.add(new modelClass("20","Ta Ha"," Taha","Mecque","135/aya"));




        list.add(new modelClass("21","Les Prophètes","Al Anbiya","Mecque","112/aya"));
        list.add(new modelClass("22","Le Pélerinage","Al Hajj","Medine","78/aya"));
        list.add(new modelClass("23","Les Croyants","Al Muumin ","Mecque","118/aya"));
        list.add(new modelClass("24","La Lumiere","An Nour","Medine","64/aya"));
        list.add(new modelClass("25","Le Discernement","Al Furqan ","Mecque","77/aya"));

        list.add(new modelClass("26","Les Poétes" ,"As Ashuaraa","Mecque","227/aya"));
        list.add(new modelClass("27","Les Fourmis","An Naml","Mecque","93/aya"));
        list.add(new modelClass("28","Le Recit","Al Qassas","Mecque","88/aya"));
        list.add(new modelClass("29","L'Arraignée","Al Ankabut","Mecque","69/aya"));
        list.add(new modelClass("30","Les Romains","Al Rum","Mecque","60/aya"));

        list.add(new modelClass("31","Luqman","Luqman","Mecque","34/aya"));
        list.add(new modelClass("32","La Prosternation","As Sadjada","Mecque","30/aya"));
        list.add(new modelClass("33","Les Fractions","Al Ahzab","Medine","73/aya"));
        list.add(new modelClass("34","Les Saba","Saba","Mecque","54/aya"));
        list.add(new modelClass("35","Le Createur","Fatir","Mecque","45/aya"));
        list.add(new modelClass("36", "Ya-Sin","Ya sine","Mecque","83/aya"));
        list.add(new modelClass("37","Les Rangés","As Saffat","Mecque","182/aya"));
        list.add(new modelClass("38","Sad","Sad","Mecque","88/aya"));
        list.add(new modelClass("39","Les Groupes","Az Zumar","Mecque","75/aya"));
        list.add(new modelClass("40","Le Pardonneur","Al Gafir","Mecque","85/aya"));

        list.add(new modelClass("41","Les Versets detaillés","Fussilat","Mecque","54/aya"));
        list.add(new modelClass("42","La Consultation","Al Shura","Mecque","53/aya"));
        list.add(new modelClass("43","L'Ornement","Az Zukhruf","Mecque","89/aya"));
        list.add(new modelClass("44","La Fumée","Ad Dukhan","Mecque","59/aya"));
        list.add(new modelClass("45","L'Angenouillée","Al Jathiya","Mecque","37/aya"));


        list.add(new modelClass("46","Ahqaf","Al Ahqaf","Mecque","35/aya"));
        list.add(new modelClass("47","Muhammad","Muhammad","Medine","38/aya"));
        list.add(new modelClass("48","La Victoire","Al Fath","Medine","29/aya"));
        list.add(new modelClass("49","Les Appartements","Al Hujurat","Medine","18/aya"));

        list.add(new modelClass("50","Qaf","Qaf"," ","45/aya"));
        list.add(new modelClass("51","Qui éparpillent","Ad Dhariyat","Mecque","60/aya"));
        list.add(new modelClass("52","Le Mont","At Tur","Mecque","49/aya"));

        list.add(new modelClass("53","L'étoile","Al Nadjm","Mecque","62/aya"));
        list.add(new modelClass("54","La Lune","Al Qamar","Mecque","55/aya"));
        list.add(new modelClass("55","Le Tout Miséricordieux","Ar Rahman","Medine","78/aya"));
        list.add(new modelClass("56","L'évenement","Al Waqiya","Mecque","96/aya"));
        list.add(new modelClass("57","Le Fer","Al Hadid","Medine","29/aya"));
        list .add(new modelClass("58","La Discussion","Al Mujadila","Medine","22/aya"));
        list .add(new modelClass("59","L'éxode","Al Hashre","Medine","24/aya"));
        list .add(new modelClass("60","L'épreuve","Mumtahana","Medine","13/aya"));
        list .add(new modelClass("61","Le Rang","As Saff","Medine","14/aya"));



















        list.add(new modelClass("62","Le Vendredi","Al Jumua","Medine","11/aya"));

        list.add(new modelClass("63","Les Hypocrites","Al Munafiqun","Medine","11/aya"));
        list.add(new modelClass("64", "La Grande perte","At Taghabun","Medine","18/aya"));

        list.add(new modelClass("65","Le Divorce","At Talaq","Medine","12/aya"));

        list.add(new modelClass("66","L'Interdiction","At Tahrim","Medine","12/aya"));

        list.add(new modelClass("67","La Royauté","Al Mulk","Mecque","30/aya"));
        list.add(new modelClass("68","La Plume","Al Qalam","Mecque","52/aya"));
        list.add(new modelClass("69","Celle qui montre la verité","Al Haqqah","Mecque","52/aya"));
        list.add(new modelClass("70","Les Degrés","Al Maarij","Mecque","44/aya"));
        list.add(new modelClass("71","Noé","Nuh","Mecque","28/aya"));

        list.add(new modelClass("72","Les Djinns","Al Jinn","Mecque","28/aya"));
        list.add(new modelClass("73","L'Enveloppé","Al Muzzamil","Mecque","20/aya"));
        list.add(new modelClass("74","Le Revetu d'un manteau","Al Muddattir","Mecque","56/aya"));
        list.add(new modelClass("75","la Résurrection","Al Qiyamah","Mecque","40/aya"));
        list.add(new modelClass("76","L'homme","Al Insan","Medine","31/aya"));
        list.add(new modelClass("77","Les Envoyés","Al Mursalat","Mecque","50/aya"));
        list.add(new modelClass("78","La Nouvelle","An Naba","Mecque","40/aya"));
        list.add(new modelClass("79","Ceux qui arrachent","An Naziat","Mecque","46/aya"));
        list.add(new modelClass("80","Il s'est renfrogné","Abassa","Mecque","42/aya"));




        list.add(new modelClass("81","Décrochement","At Takwir","Mecque","29/aya"));
        list.add(new modelClass("82","La Rupture du ciel","Al Infitar","Mecque","19/aya"));
        list.add(new modelClass("83","les Fraudeurs","Al Mutaffifun ","Mecque","36/aya"));
        list.add(new modelClass("84","La Déchirure","Al Insiqaq","Mecque","25/aya"));
        list.add(new modelClass("85","La Constellation","Al Buruj","Mecque","22/aya"));
        list.add(new modelClass("86","L'Astre nocturne","At Atariq","Mecque","17/aya"));
        list.add(new modelClass("87","Le Très Haut","Al Ala","Mecque","19/aya"));
        list.add(new modelClass("88","L'Enveloppante","Al Ghasiyah","Mecque","26/aya"));
        list.add(new modelClass("89","L'Aube","Al Fajr","Mecque","30/aya"));
        list.add(new modelClass("90","La Cité","Al Balad","Mecque","20/aya"));
        list.add(new modelClass("91","Le Soleil","Ach Chams","Mecque","15/aya"));
        list.add(new modelClass("92","La Nuit","Al Layl","Mecque","21/aya"));

        list.add(new modelClass("93",   "Le jour montant","Ad Duha","Mecque","11/aya"));
        list.add(new modelClass("94","L'Ouverture","As Srah","Mecque","8/aya"));
        list.add(new modelClass("95","Le Figuier","At Tin","Mecque","8/aya"));
        list.add(new modelClass("96","Le Caillot de sang","Al Alaq","Mecque","19/aya"));
        list.add(new modelClass("97","La Décret","Al Qadr","Mecque","5/aya"));
        list.add(new modelClass("98","La Preuve ","Al Bayyinah","Medine","8/aya"));
        list.add(new modelClass("99","Le Tremblement","Az Zalzalah","Medine","8/aya"));
        list.add(new modelClass("100","Les Coursiers","Al Adiyate","Mecque","11/aya"));
        list.add(new modelClass("101","Le Fracas","Al Qariah","Mecque","11/aya"));
        list.add(new modelClass("102","La Course aux richesses","At Takatur","Mecque","8/aya"));

        list.add(new modelClass("103","Le Temps","Al Asr","Mecque","3/aya"));
        list.add(new modelClass("104","Les Calomniateurs","Al Humazah","Mecque","9/aya"));
        list.add(new modelClass("105","L'élephant","Al Fil","Mecque","5/aya"));
        list.add(new modelClass("106","Les Qurais","Qoraish","Mecque","4/aya"));
        list.add(new modelClass("107","L'Ustensile","Al Maun","Mecque","7/aya"));


        list.add(new modelClass("108","L'Abondance","Al Kawthar","Mecque","3/aya"));
        list.add(new modelClass("109","Les Incrédules","Al Kafirune","Mecque","6/aya"));
        list.add(new modelClass("110","Le Secours","An Nasr" +
                "","Medine","3/aya"));
        list.add(new modelClass("111","La Corde","Al Masad","Mecque","5/aya"));

        list.add(new modelClass("112","Le Culte pure","Al Ikhlas","Mecque","4/aya"));
        list.add(new modelClass("113","L'Aurore","Al Falaq","Mecque","5/aya"));
        list.add(new modelClass("114","Les Hommes","An Nas","Mecque","6/aya"));















        Add(list);

        }


















}