package com.example.quranmp3;

import android.content.Intent;
import android.util.MutableDouble;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import android.content.Intent;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;



import com.example.jean.jcplayer.model.JcAudio;

import java.util.ArrayList;
import java.util.List;

public class ViewModels extends ViewModel {


    MutableLiveData<List<JcAudio>> liveData=new MutableLiveData<>();

      MutableLiveData<Intent>intent=new MutableLiveData<>();



   static List<JcAudio>list=new ArrayList<>();

       MutableLiveData<String>query=new MutableLiveData<>();

       public void setQuery(String string){

           query.setValue(string);


       }


      public LiveData<String>getQuery(){

           return query;
       }



    public void init() {

             getLiveData();

    }




    public MutableLiveData<List<JcAudio>> getLiveData() {

        setList();

        liveData.setValue(list);
        return liveData;
    }



    public LiveData<List<JcAudio>> getAll() {


        return liveData;


    }




    public   void setList(){





        String fatiha="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/1%20La%20Fatiha%20%20%20%20%D8%A7%D9%84%D9%81%D8%A7%D8%AA%D8%AD%D8%A9.wav?alt=media&token=f6037c3e-495b-4223-86da-5ee6d602ebaf";
        String baqara="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/2%20La%20Vache%20%20%20%20%20%20%D8%A7%D9%84%D8%A8%D9%82%D8%B1%D8%A9.mp3?alt=media&token=915270eb-18d0-4538-a6c5-80697778f3ce";
        String naziat="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/79%20Ceux%20qui%20arrachent%20%20%20%20%20%D8%A7%D9%84%D9%86%D8%A7%D8%B2%D8%B9%D8%A7%D8%AA.mp3?alt=media&token=4e30a5bf-b5f6-4258-a10c-ed1bb5293a32";
        String imran="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/3%20La%20Famille%20de%20%CA%BFImran%20%20%20%20%20%D8%A2%D9%84%20%D8%B9%D9%85%D8%B1%D8%A7%D9%86.mp3?alt=media&token=a266f428-857f-4d6c-b1ef-810cff0b12d3";
        String nissa="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/4%20Les%20Femmes%20%20%20%20%20%20%20%D8%A7%D9%84%D9%86%D8%B3%D8%A7%D8%A1%20%20An%20Nis%C4%81.mp3?alt=media&token=632468c6-d218-42ef-a417-7872e9d43e30";
        String maida="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/5%20La%20Table%20servie%20%20%20%20%20%20%20%20%20%20%D8%A7%D9%84%D9%85%D8%A7%D8%A6%D8%AF%D8%A9.mp3?alt=media&token=b9e07a33-e865-4edc-958a-cf9c049f5d47";
        String naam="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/6%20Les%20Troupeaux%20%20%20%20%20%20%D8%A7%D9%84%D8%A3%D9%86%D8%B9%D8%A7%D9%85%20%20Al%20An%20%C4%81m.mp3?alt=media&token=35443615-4b13-48a0-a9fc-e7af38c49cc1";
        String araf="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/7%20Al%20Araf%20%20%20%20%20%20%20%20%D8%A7%D9%84%D8%A3%D8%B9%D8%B1%D8%A7%D9%81%20%20Al%20A%CA%BFr%C4%81f.mp3?alt=media&token=f65ec0ae-826f-43ed-b291-1e777e05d29a";
        String butin="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/8%20Le%20Butin%20%20%20%20%D8%A7%D9%84%D8%A3%D9%86%D9%81%D8%A7%D9%84.mp3?alt=media&token=4481e6e3-9e58-4e2e-bd45-aaa2e0bf955f";

        String tawb="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/9%20L%E2%80%99Immunit%C3%A9%20%20%20%20%20%20%20%20%D8%A7%D9%84%D8%AA%D9%88%D8%A8%D8%A9.mp3?alt=media&token=b394350c-db0d-4d22-b452-e9132d3a57ae";
        String yunus="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/10%20Yunus.mp3?alt=media&token=fd7c7bd8-6f49-4a83-8400-beedd1844036";
        String hud="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/11%20Houd%20%20%20%20%20%20%20%D9%87%D9%88%D8%AF.mp3?alt=media&token=d5a1e0c2-df26-4481-920a-880693c43c39";
        String yusuf="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/12%20Joseph%20%20%20%20%20%20%20%D9%8A%D9%88%D8%B3%D9%81.mp3?alt=media&token=504e1bcc-73df-4978-95a7-9a97d8b47126";
        String toner="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/13%20Le%20Tonnerre%20%20%20%20%20%20%20%D8%A7%D9%84%D8%B1%D8%B9%D8%AF%20Ar%20Ra%CA%BFd.mp3?alt=media&token=e741d413-c294-4dd9-a83b-68cdc6643ad6";
         String ibrahim="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/14%20Abraham%20%20%20%20%20%20%20%D8%A5%D8%A8%D8%B1%D8%A7%D9%87%D9%8A%D9%85%20%20Ibr%C4%81h%C4%ABm.mp3?alt=media&token=76bbfa06-2411-44af-bd95-05fb143751be";
         String hijr="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/15%20Al%20Hijr%20%20%20%20%D8%A7%D9%84%D8%AD%D8%AC%D8%B1.mp3?alt=media&token=5dd426c4-8782-4de3-8ec3-5eb8693b15ce";
         String hahl="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/16%20Les%20Abeilles%20%20%20%20%20%D8%A7%D9%84%D9%86%D8%AD%D9%84.mp3?alt=media&token=74d93a27-cf5e-470a-abd7-be9c898b397c";
         String voya="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/17%20Le%20Voyage%20nocturne%20%20%20%20%20%20%20%20%20%20%D8%A7%D9%84%D8%A5%D8%B3%D8%B1%D8%A7%D8%A1Al_Isr%C4%81%CA%BE.mp3?alt=media&token=06366030-d01b-49f9-b16e-9524c415bef1";
         String cavern="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/18%20La%20Caverne%20%20%20%20%20%20%20%D8%A7%D9%84%D9%83%D9%87%D9%81.mp3?alt=media&token=f6b0c297-5944-4225-bb41-776bc2dab016";
         String marie="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/19%20%20%20Marie%20%20%20%20%20%20%20%20%20%20%20%20%D9%85%D8%B1%D9%8A%D9%85.mp3?alt=media&token=0b1f80cf-491a-4436-9c84-6805101eab9a";
         String taha="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/20%20Ta.%20Ha%20%20%20%20%20%D8%B7%D9%87.mp3?alt=media&token=fc28442d-efb0-4a58-817f-6cc8998c39ce";

         String prophet="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/021.mp3?alt=media&token=563fa08c-0ba6-44e9-9b12-b113c415570e";
        String hadj="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/022.mp3?alt=media&token=67af9ef1-5d24-4ea9-8aaf-b6c1cf7e5ec2";
        String almumin="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/23%20Les%20Croyants%20%20%20%20%D8%A7%D9%84%D9%85%D8%A4%D9%85%D9%86%D9%88%D9%86.mp3?alt=media&token=7f1a8085-ac99-49a1-b1f2-a2e866397c80";
        String nour="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/24%20La%20Lumi%C3%A8re%20%20%20%20%20%D8%A7%D9%84%D9%86%D9%88%D8%B1.mp3?alt=media&token=fd5b2d61-b6cc-4837-8dc5-0e1f47ce53c7";
        String poet="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/026.mp3?alt=media&token=cd59b9d3-cef9-46a3-936d-6bf50f63064c";
        String fourmi="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/027.mp3?alt=media&token=0e2d008a-57b9-42a5-8369-06cdee1376db";
        String furqan="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/25%20La%20Loi%20%20%20%20%20%20%20%D8%A7%D9%84%D9%81%D8%B1%D9%82%D8%A7%D9%86.mp3?alt=media&token=be0bb013-9e5d-4d32-913c-3ed3f539f333";
        String qassas="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/28%20Le%20R%C3%A9cit%20%20%20%D8%A7%D9%84%D9%82%D8%B5%D8%B5.mp3?alt=media&token=39580b18-d5ca-4650-aeaa-08b4061baa7c";
        String  ankabut="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/29%20L%E2%80%99Araign%C3%A9e%20%20%20%20%20%20%D8%A7%D9%84%D8%B9%D9%86%D9%83%D8%A8%D9%88%D8%AA.mp3?alt=media&token=3bc6f05d-187a-4fcc-b279-d888dc49297b";
        String roum="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/30%20Les%20Romains%20%20%20%20%D8%A7%D9%84%D8%B1%D9%88%D9%85%20%20Ar%20R%C5%ABm.mp3?alt=media&token=19f1549e-60f4-4b83-8bd1-71965d0e2235";
        String luqman="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/31%20Luqman%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%D9%84%D9%82%D9%85%D8%A7%D9%86%20%20%20%20%20Lukman.mp3?alt=media&token=666d0547-9afd-4cbf-904f-e5c5909baefa";
        String prosternation="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/32%20La%20Prosternation%20%20%20%20%20%20%D8%A7%D9%84%D8%B3%D8%AC%D8%AF%D8%A9%20%20As%20Sa%C7%A7da.mp3?alt=media&token=0cf5be13-5fe0-4322-ad27-f6d82e0c4ba5";
        String faction="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/33%20Les%20Factions%20%20%20%20%20%20%D8%A7%D9%84%D8%A3%D8%AD%D8%B2%D8%A7%D8%A8.mp3?alt=media&token=61e16786-2f35-4203-ac08-f1a3ff289ebe";
        String saba="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/34%20%20Les%20Saba%20%20%20%20%20%20%20%D8%B3%D8%A8%D8%A5.mp3?alt=media&token=07060733-d2ec-4a87-96a3-7ecb1001df0d";
        String fatir="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/35%20Le%20Cr%C3%A9ateur%20%20%20%20%20%20%20%D9%81%D8%A7%D8%B7%D8%B1%20F%C4%81%E1%B9%ADir.mp3?alt=media&token=8520918c-34f6-426d-aaec-34239d391290";
        String yasin="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/36%20Ya.%20Sin%20%20%20%20%20%20%20%20%20%20%20%D9%8A%D8%B3%20%20%20%20%20%20Y%C4%81%20S%C4%ABn.mp3?alt=media&token=8810032c-a54e-4b09-8462-f23b6c970d29";
        String safat="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/37%20Ceux%20qui%20sont%20plac%C3%A9s%20en%20rangs%20%20%20%20%D8%A7%D9%84%D8%B5%D8%A7%D9%81%D8%A7%D8%AA%20A%E1%B9%A3%20%E1%B9%A2%C4%81ff%C4%81t.mp3?alt=media&token=71ea67bd-b8f3-4609-8547-914697babd33";

        String çad="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/38%20%C3%87ad%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%D8%B5%20%20%20%20%20%E1%B9%A2%C4%81d.mp3?alt=media&token=bb40eb9e-639e-43af-af45-1f81f10cbdcb";
        String zumar="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/39%20Les%20%20Groupes%20%20%20%20%20%20%20%20%20%20%20%20%20%D8%A7%D9%84%D8%B2%D9%85%D8%B1%20%20%20Az%20Zumar.mp3?alt=media&token=554b5c09-071f-4d38-aae0-fd3ed23504fe";
        String gafir="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/40%20Celui%20qui%20pardonne%20%20%20%20%20%20%20%20%D8%BA%D8%A7%D9%81%D8%B1%20%20%20%20%20%C4%A0%C4%81fir.mp3?alt=media&token=05885441-8b94-4771-8087-2e7c1b711b26";
        String fusilat="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/41%20Les%20Versets%20clairement%20expos%C3%A9s%20%20%20%20%20%20%D9%81%D8%B5%D9%84%D8%AA.mp3?alt=media&token=832393fb-def7-4fdc-8191-0f0a6d2645c7";
        String sura="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/42%20La%20D%C3%A9lib%C3%A9ration%20%20%20%20%20%20%20%20%D8%A7%D9%84%D8%B4%D9%88%D8%B1%D9%89%20%20%20A%C5%A1%20%C5%A0%C5%ABr%C4%81.mp3?alt=media&token=f8904575-bdd1-4a4a-9674-94fba6ea1505";
        String suhurf="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/43%20L%E2%80%99Ornement%20%20%20%20%20%20%20%D8%A7%D9%84%D8%B2%D8%AE%D8%B1%D9%81%20%20%20%20Az%20Zu%E1%BA%96ruf.mp3?alt=media&token=f4dd469d-2edc-48a4-8ff4-59d30f8be72f";
        String dukhan="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/44%20La%20Fum%C3%A9e%20%20%20%20%20%20%D8%A7%D9%84%D8%AF%D8%AE%D8%A7%D9%86%20%20Ad%20Du%E1%BA%96%C4%81n.mp3?alt=media&token=af035efc-301f-4eda-a3f3-a3fb106db4a3";
        String jacia="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/45%20Celle%20qui%20est%20agenouill%C3%A9e%20%20%20%20%20%20%20%20%D8%A7%D9%84%D8%AC%D8%A7%D8%AB%D9%8A%D8%A9%20%20Al%20%C4%9E%C4%81%E1%B9%AFiya.mp3?alt=media&token=889d8890-e55a-4660-a5d6-785f550b5725";
        String ahqaf="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/46%20Al%20%CA%BEAhqaf%20%20%20%20%20%20%20%20%D8%A7%D9%84%D8%A3%D8%AD%D9%82%D8%A7%D9%81.mp3?alt=media&token=3da240e8-e29d-4854-8959-6ced20553d52";
        String muhamad="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/47%20Muhammad%20%20%20%20%20%D9%85%D8%AD%D9%85%D8%AF%20%20Mu%E1%B8%A5ammad.mp3?alt=media&token=686c3c12-7039-402c-ae53-fef1f874d29a";
        String fatha="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/48%20La%20Victoire%20%20%20%20%D8%A7%D9%84%D9%81%D8%AA%D8%AD%20%20Al%20Fat%E1%B8%A5.mp3?alt=media&token=d4f56bda-d5f8-40da-b4a3-9bbc2c906ecc";
        String hujarat="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/49%20Les%20Appartements%20priv%C3%A9s%20%20%20%20%20%20%D8%A7%D9%84%D8%AD%D8%AC%D8%B1%D8%A7%D8%AA%20%20Al%20%E1%B8%A4u%C7%A7ur%C4%81t.mp3?alt=media&token=ccab58a9-f3ec-4db2-9e69-f9fa4d0e55a5";

        String qaf="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/50%20Qaf%20%20%20%20%20%D9%82%20%20Q%C4%81f.mp3?alt=media&token=05644e1a-863d-4813-897a-0a24895bc574";
        String zaria="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/51%20Ceux%20qui%20se%20d%C3%A9placent%20rapidement%20%20%20%20%20%20%20%20%20%20%D8%A7%D9%84%D8%B0%D8%A7%D8%B1%D9%8A%D8%A7%D8%AA%20z.mp3?alt=media&token=10ccd30e-401a-4577-b777-159adee04b46";
        String tur="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/52%20Le%20Mont%20%20%20%20%20%20%20%20%D8%A7%D9%84%D8%B7%D9%88%D8%B1%20%20A%E1%B9%AD%20%E1%B9%AC%C5%ABr.mp3?alt=media&token=c0850801-bc8f-4c50-92b6-24c4ad1c092b";
        String nadjim="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/53%20L%20%C3%89toile%20%20%20%20%20%20%20%20%20%20%D8%A7%D9%84%D9%86%D8%AC%D9%85%20%20%20%20%20An%20Na%C7%A7m.mp3?alt=media&token=8b1b1905-5a85-4989-abf4-47882b05f413";
        String qamar="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/54%20La%20Lune%20%20%20%20%20%20%D8%A7%D9%84%D9%82%D9%85%D8%B1%20%20Al%20Qamar.mp3?alt=media&token=8e9cf62a-8787-425a-b80d-38065b1e8153";
        String rahman="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/55%20Le%20Mis%C3%A9ricordieux%20%20%20%20%20%20%20%20%D8%A7%D9%84%D8%B1%D8%AD%D9%85%D9%86%20%20%20Ar%20Ra%E1%B8%A5m%C4%81n.mp3?alt=media&token=0a635869-f836-4c27-a88b-f2616a48db24";
        String waqiya="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/56%20Celle%20qui%20est%20in%C3%A9luctable%20%20%20%20%20%20%20%D8%A7%D9%84%D9%88%D8%A7%D9%82%D8%B9%D8%A9%20Al%20W%C4%81qi%CA%BFa.mp3?alt=media&token=c21129fa-ad41-420a-b446-f2b51d2233d6";
        String hadid="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/57%20Le%20Fer%20%20%20%20%20%20%D8%A7%D9%84%D8%AD%D8%AF%D9%8A%D8%AF%20Al%20%E1%B8%A4ad%C4%ABd.mp3?alt=media&token=4770c87b-700b-423f-88d1-7569f7fc106a";
        String mujadala="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/58%20%20%20La%20Discussion%20%20%20%20%20%20%20%20%D8%A7%D9%84%D9%85%D8%AC%D8%A7%D8%AF%D9%84%D8%A9%20%20Al%20Mu%C7%A7%C4%81dala.mp3?alt=media&token=b42c8da1-5a07-4969-99c2-dc5f4ff01d5f";
        String hasr="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/59%20Le%20Rassemblement%20%20%20%20%20%D8%A7%D9%84%D8%AD%D8%B4%D8%B1%20Al%20%E1%B8%A4a%C5%A1r.mp3?alt=media&token=d41096fe-c4f4-4b6c-93c0-4456937570f0";
        String mumtiha="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/60%20L%20%C3%89preuve%20%20%20%20%20%D8%A7%D9%84%D9%85%D9%85%D8%AA%D8%AD%D9%86%20%20Al%20Mumta%E1%B8%A5ana.mp3?alt=media&token=650fd97e-0cd4-4c42-8997-aa60a8aa4502";
        String asafa="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/61%20Le%20Rang%20%20%20%20%20%20%20%D8%A7%D9%84%D8%B5%D9%81%20%20A%E1%B9%A3%20%E1%B9%A2af.mp3?alt=media&token=764bcd06-a744-453d-b5bc-62f3004ab587";
        String jumaa="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/62%20%20Le%20Vendred%20%20%20%20%20%20%20%20%D8%A7%D9%84%D8%AC%D9%85%D8%B9%D8%A9%20%20Al%20%C4%9Eumu'a.mp3?alt=media&token=0068ee49-5a3b-4170-9299-1c618268ee6f";
        String munafiq="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/63%20Les%20Hypocrites%20%20%20%20%20%20%D8%A7%D9%84%D9%85%D9%86%D8%A7%D9%81%D9%82%D9%88%D9%86%20%20Al%20Mun%C4%81fiq%C5%ABn.mp3?alt=media&token=63dd9bd0-a190-4d18-be24-c3bcc6d5212d";String tagabun="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/64%20%20La%20Duperie%20r%C3%A9ciproque%20%20%20%20%20%20%D8%A7%D9%84%D8%AA%D8%BA%D8%A7%D8%A8%D9%86%20%20%20%20%20At%20Ta%C4%A1%C4%81bun.mp3?alt=media&token=5b6c6c46-2b35-4b2c-a6c3-4fd593fb5a57";
        String talaq="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/65%20%20La%20R%C3%A9pudiation%20%20%20%20%20%20%20%20%D8%A7%D9%84%D8%B7%D9%84%D8%A7%D9%82%20%20A%E1%B9%AD%20%E1%B9%ACal%C4%81q.mp3?alt=media&token=a0477886-5213-4f9e-a267-d3e554841c2b";
        String tahrim="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/66%20L%E2%80%99Interdiction%20%20%20%20%20%20%D8%A7%D9%84%D8%AA%D8%AD%D8%B1%D9%8A%D9%85%20At%20Ta%E1%B8%A5r%C4%ABm.mp3?alt=media&token=e2ce228e-df29-4ff9-9e43-6de3ee7532bd";
        String mulk="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/67%20La%20Royaut%C3%A9%20%20%20%20%20%20%20%D8%A7%D9%84%D9%85%D9%84%D9%83%20%20Al%20Mulk.mp3?alt=media&token=ce496849-a3ba-4385-afdd-8078646f8912";
        String qalam="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/68%20Le%20Calame%20%20%20%20%20%20%20%D8%A7%D9%84%D9%82%D9%84%D9%85%20%20Al%20Qalam.mp3?alt=media&token=6866c3bc-6709-4ab6-b91b-18e76eb4f5d5";
        String alhaq="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/69%20Celle%20qui%20doit%20venir%20%20%20%20%20%20%20%D8%A7%D9%84%D8%AD%D8%A7%D9%82%20%20%20Al%20%E1%B8%A4%C4%81qqa.mp3?alt=media&token=a5e3c07c-fed6-4ccf-811d-6d62ec167a9c";
        String maarij="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/70%20%20Les%20Degr%C3%A9s%20%20%20%20%20%20%20%20%20%20%D8%A7%D9%84%D9%85%D8%B9%D8%A7%D8%B1%D8%AC%20%20%20Al%20Ma%20%C4%81ri%C7%A7.mp3?alt=media&token=244a0aca-18e8-46ce-83e9-c80c8d93a472";
        String nuha="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/71%20No%C3%A9%20%20%20%20%20%20%20%D9%86%D9%88%D8%AD%20%20N%C5%AB%E1%B8%A5.mp3?alt=media&token=08f04865-728a-4b03-afc8-29aeeb76b0fa";
        String jinn="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/72%20Les%20Djinns%20%20%20%20%D8%A7%D9%84%D8%AC%D9%86%20Al%20%C4%9Einn.mp3?alt=media&token=74f97a7c-8c46-498e-8ca6-c0ac8b48decf";
        String muzzamil="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/73%20Celui%20qui%20s%E2%80%99est%20envelopp%C3%A9%20%20%20%20%20%20%20%D8%A7%D9%84%D9%85%D8%B2%D9%85%D9%84%20%20%20Al%20Muzzammil.mp3?alt=media&token=7ff53a7d-30c3-44d7-98fe-60fe550dd59d";
        String mudathir="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/74%20Celui%20qui%20est%20rev%C3%AAtu%20d%E2%80%99un%20manteau%20%20%20%20%20%20%D8%A7%D9%84%D9%85%D8%AF%D8%AB%D8%B1%20Al%20Mudda%E1%B9%AF%E1%B9%AFir.mp3?alt=media&token=c969a6a9-9ada-4b54-831f-615800ddd41a";
        String qiyama="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/75%20La%20R%C3%A9surrection%20%20%20%20%20%20%20%20%20%D8%A7%D9%84%D9%82%D9%8A%D8%A7%D9%85%D8%A9%20%20%20%20Al%20Qiy%C4%81ma.mp3?alt=media&token=1f86796a-a3e8-4590-86a3-c6cf715d0d78";
        String insan="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/76%20L%E2%80%99Homme%20%20%20%20%20%20%20%D8%A7%D9%84%D8%A5%D9%86%D8%B3%D8%A7%D9%86%20%20%20Al%20Ins%C4%81n.mp3?alt=media&token=483d4ee7-d064-426e-aa64-a7e356afcba5";
         String mursalat="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/77%20Les%20Envoy%C3%A9%20%20%20%20%20%20%20%20%20%20s%D8%A7%D9%84%D9%85%D8%B1%D8%B3%D9%84%D8%A7%D8%AA%20%20%20Al%20Mursal%C4%81t.mp3?alt=media&token=eebabea7-942f-45b1-863d-e5c86cdb2ef6";
         String anaba="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/78%20L%E2%80%99Annonce%20%20%20%20%20%20%20%20%20%D8%A7%D9%84%D9%86%D8%A8%D8%A5%20%20An%20Naba.mp3?alt=media&token=d7de2460-4cc6-4deb-9c60-a02ca8b9bbde";
         String nazia="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/79%20Ceux%20qui%20arrachent%20%20%20%20%20%20%20%20%20%20%20%D8%A7%D9%84%D9%86%D8%A7%D8%B2%D8%B9%D8%A7%D8%AA%20%20%20%20%20An%20N%C4%81zi%20%C4%81t.mp3?alt=media&token=dc9ebc61-073a-452d-b0c1-c9232266166c";
         String abasa="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/80%20%20Il%20s%E2%80%99est%20renfrogn%C3%A9%20%20%20%20%20%20%20%20%20%D8%B9%D8%A8%D8%B3%20%20Abasa.mp3?alt=media&token=3696b7d6-f269-4d3a-ac2d-dbd204296e8c";
         String takwir="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/81%20Le%20D%C3%A9crochement%20%20%20%20%D8%A7%D9%84%D8%AA%D9%83%D9%88%D9%8A%D8%B1%20%20%20%20At%20Takw%C4%ABr.mp3?alt=media&token=189c0227-6db6-4b76-addc-75bdf77f68fb";
         String infitar="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/82%20La%20Rupture%20du%20ciel%20%20%20%20%20%20%D8%A7%D9%84%D8%A5%D9%86%D9%81%D8%B7%D8%A7%D8%B1%20%20%20Al%20Infit%C4%81r.mp3?alt=media&token=29f59d59-fffe-4317-a6e5-de9a0c00c3a9";
         String mutafif="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/83%20Les%20Fraudeurs%20%20%20%20%20%20%20%20%D8%A7%D9%84%D9%85%D8%B7%D9%81%D9%81%D9%8A%D9%86%20%20Al%20Mutaffif%C4%ABn.mp3?alt=media&token=e41cd9f9-210a-432c-ba83-ba15e48926c6";
         String insiqaq="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/84%20La%20D%C3%A9chirure%20%20%20%20%20%20%D8%A7%D9%84%D8%A7%D9%86%D8%B4%D9%82%D8%A7%D9%82%20Al%20In%C5%A1iq%C4%81q.mp3?alt=media&token=9f2841fe-946d-477d-8c90-3329ea13fed4";
         String buruj="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/85%20Les%20Constellations%20%20%20%D8%A7%D9%84%D8%A8%D8%B1%D9%88%D8%AC%20%20%20Al%20Bur%C5%AB%C7%A7.mp3?alt=media&token=09660004-ace1-41b8-b659-3a9a8617f6af";
          String atarq="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/86%20L%E2%80%99Astre%20nocturne%20%20%20%20%20%20%20%20%20%D8%A7%D9%84%D8%B7%D8%A7%D8%B1%D9%82%20%20%20%20%20%20%20A%E1%B9%AD%20%E1%B9%AC%C4%81riq.mp3?alt=media&token=97d8084b-3eb8-4891-a90e-6edb48c0cc8d";
         String ala="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/87%20Le%20Tr%C3%A8s%20Haut%20%20%20%20%20%20%20%20%20%D8%A7%D9%84%D8%A3%D8%B9%D9%84%D9%89%20Al%20A%20l%C4%81.mp3?alt=media&token=c8f93176-053c-40f9-bac6-c84c16029105";
         String gasia="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/88%20Celle%20qui%20enveloppe%20%20%20%20%20%20%20%20%D8%A7%D9%84%D8%BA%D8%A7%D8%B4%D9%8A%D8%A9%20%20Al%20%C4%A0%C4%81%C5%A1iya.mp3?alt=media&token=97342354-9e9a-4b1a-8a32-ab99184f0f3d";
        String fajr="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/89%20L%E2%80%99Aube%20%20%20%20%D8%A7%D9%84%D9%81%D8%AC%D8%B1%20%20Al%20Fa%C7%A7r.mp3?alt=media&token=470b5ff5-ba37-410a-afed-2cebd82ed016";
        String balad="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/90%20La%20Cit%C3%A9%20%20%20%20%20%D8%A7%D9%84%D8%A8%D9%84%D8%AF%20%20Al%20Balad.mp3?alt=media&token=614c6fd1-6ba8-49ff-ada7-8bee7fa48601";
       String samsi="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/91%20Le%20Soleil%20%20%20%20%20%20%20%20%D8%A7%D9%84%D8%B4%D9%85%D8%B3%20%20A%C5%A1%20%C5%A0ams.mp3?alt=media&token=7b5965a6-5c13-4b4f-ac9d-6bf211825d68";
        String layl="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/92%20La%20Nuit%20%20%20%20%20%20%20%20%D8%A7%D9%84%D9%84%D9%8A%D9%84%20%20Al%20Layal.mp3?alt=media&token=8ea7c959-7aa0-44b7-a820-078ca28e6d1b";
        String aduha="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/93%20La%20Clart%C3%A9%20du%20jour%20%20%20%20%20%20%20%20%D8%A7%D9%84%D8%B6%D8%AD%D9%89%20%20A%E1%B8%8D%20%E1%B8%8Cu%E1%B8%A5%C4%81.mp3?alt=media&token=7afe115b-4cc3-4b0a-902d-8c4b541856cf";
       String asrah="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/94%20L%E2%80%99Ouverture%20%20%20%20%20%D8%A7%D9%84%D8%B4%D8%B1%D8%AD%20%20A%C5%A1%20%C5%A0ar%E1%B8%A5.mp3?alt=media&token=d9ea35aa-e933-4cdc-be98-33d604c5ce48";
       String attin="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/95%20Le%20Figuier%20%20%20%20%20%20%D8%A7%D9%84%D8%AA%D9%8A%D9%86%20%20At%20T%C4%ABn.mp3?alt=media&token=bb1d1438-150a-4a5a-95d4-54ea7158ea90";
       String alaq="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/96%20Le%20Caillot%20de%20sang%20%20%20%20%20%D8%A7%D9%84%D8%B9%D9%84%D9%82%20%20Al%20Alaq.mp3?alt=media&token=8c7f78fa-736e-4696-99ee-840d53b78912";
       String alqadr="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/97%20Le%20D%C3%A9cret%20%20%20%D8%A7%D9%84%D9%82%D8%AF%D8%B1%20%20%20Al%20Qadr.mp3?alt=media&token=051962e6-6fcd-45f4-9016-198e82c5ac98";
       String bayna="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/98%20La%20Preuve%20d%C3%A9cisive%20%20%20%20%20%D8%A7%D9%84%D8%A8%D9%8A%D9%86%D8%A9%20%20Al%20Bayyina.mp3?alt=media&token=e2f8e933-912c-43c7-bfb4-0cd0ab752096";
       String zulzila="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/99%20Le%20Tremblement%20de%20terre%20%20%20%20%20%20%D8%A7%D9%84%D8%B2%D9%84%D8%B2%D9%84%D8%A9%20Az%20Zalzala.mp3?alt=media&token=ced73d79-eaa9-4773-acb8-93f58790f34a";
       String diyat="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/100%20Les%20Coursiers%20rapides%20%20%20%20%20%20%20%20%D8%A7%D9%84%D8%B9%D8%A7%D8%AF%D9%8A%D8%A7%D8%AA%20%20%20%20Al%20%C4%80diy%C4%81t.mp3?alt=media&token=fb63ae98-8bd1-4b9c-bb4a-36d335dfeabe";
      String qaria="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/101.mp3?alt=media&token=00413ba0-8872-4639-98ca-4e8a4232af6b";
       String takatur="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/102%20La%20Rivalit%C3%A9%20%20%20%20%20%20%20%20%D8%A7%D9%84%D8%AA%D9%83%D8%A7%D8%AB%D8%B1%20%20%20At%20Tak%C4%81%E1%B9%AFur.mp3?alt=media&token=b00a8460-1a13-4d6e-9893-a5027749edfe";

       String asr="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/103%20L'%20Instant%20%20%20%20%20%20%20%D8%A7%D9%84%D8%B9%D8%B5%D8%B1%20%20Al%20A%E1%B9%A3r.mp3?alt=media&token=a87ec3a1-f7e5-4041-9a24-ab2eddfff364";
        String calm="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/104%20Le%20Calomniateur%20%20%20%20%20%D8%A7%D9%84%D9%87%D9%85%D8%B2%D8%A9%20Al%20Humaza.mp3?alt=media&token=cb09df22-ff1d-446c-ab05-d0f169ac1124";
        String elepha="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/105%20L%E2%80%99%C3%89l%C3%A9phant%20%20%20%20%20%20%20%20%20%20%D8%A7%D9%84%D9%81%D9%8A%D9%84%20%20Al%20F%C4%ABl.mp3?alt=media&token=1b13b6a1-f15b-402a-833c-1d7e3e4c508c";
       String qurai="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/106%20Les%20Qura%C3%AFch%20%20%20%20%D9%82%D8%B1%D9%8A%D8%B4%20%20Quray%C5%A1.mp3?alt=media&token=6e3b0686-26e1-4ec6-a622-7a8424d9157b";
        String maunn="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/ali-jaber-107-al-maun-2559-8902.mp3?alt=media&token=dc461c30-ec70-46fa-b1b2-3f05aad9c715";

        String kaw="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/108%20L%E2%80%99Abondance%20%20%20%20%20%20%20%D8%A7%D9%84%D9%83%D9%88%D8%AB%20%20Al%20Kaw%E1%B9%AFar.mp3?alt=media&token=adc74100-18a3-44b1-8af4-7afb49d544ad";
        String kafir="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/109%20Les%20Incr%C3%A9dules%20%20%20%20%20%20%20%20%D8%A7%D9%84%D9%83%D8%A7%D9%81%D8%B1%D9%88%D9%86%20%20Al%20K%C4%81fir%C5%ABn.mp3?alt=media&token=b8088a7d-fb8f-4a6d-b4ba-644d52a39ac6";
       String jaja="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/110%20Le%20Secours%20%20%20%20%20%20%20%20%D8%A7%D9%84%D9%86%D8%B5%D8%B1%20An%20Na%E1%B9%A3r.mp3?alt=media&token=b440b156-efcc-4acc-a778-00d445522869";
        String nasre="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/110%20Le%20Secours%20%20%20%20%20%20%20%20%D8%A7%D9%84%D9%86%D8%B5%D8%B1%20An%20Na%E1%B9%A3r.mp3?alt=media&token=b440b156-efcc-4acc-a778-00d445522869";
       String masad="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/111%20La%20Corde%20%20%20%20%20%D8%A7%D9%84%D9%85%D8%B3%D8%AF%20%20%20Al%20Masad.mp3?alt=media&token=c913cb11-28cf-472d-8ecf-014ac59103a6";
      String klass="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/112%20Le%20Culte%20pur%20%20%20%20%20%20%D8%A7%D9%84%D8%A5%D8%AE%D9%84%D8%A7%D8%B5%20%20%20%20Al%20I%E1%BA%96l%C4%81%E1%B9%A3.mp3?alt=media&token=f0d8a715-c70b-494f-8631-2b5d5f5fba36";
        String falaq="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/113%20L%E2%80%99Aurore%20%20%20%20%20%20%20%20%20%20%D8%A7%D9%84%D9%81%D9%84%D9%82%20%20Al%20Falaq.mp3?alt=media&token=7463cf9c-d1e0-4521-90d4-1680cdfd2145";
        String nass="https://firebasestorage.googleapis.com/v0/b/quranmp3-2269d.appspot.com/o/114%20Les%20Hommes%20%20%20%20%20%20%D8%A7%D9%84%D9%86%D8%A7%D8%B3%20%20An%20N%C4%81s.mp3?alt=media&token=8940ef36-6d47-4d2e-9e72-cd24ba1cab98";



        list.add(JcAudio.createFromURL("1  Al Fatiha (L'ouverture)"+"\n     Mishary Al Afassy\n",fatiha));
        list.add(JcAudio.createFromURL("2  Al Baqara (La Vache)"+"\n       Ali Jabr",baqara));

        list.add(JcAudio.createFromURL("3  Al Imran (La famille D'Imran)"+"\n     Maher Muaqli\n",imran));
        list.add(JcAudio.createFromURL("4  An Nissaa (Les Femmes)"+"\n      Abdullah Matroud\n",nissa));
        list.add(JcAudio.createFromURL("5  Al Maida (la Table servie)"+"\n     Mishary Al Afassy\n",maida));
        list.add(JcAudio.createFromURL("6  Al An aam (Les Troupeaux)"+"\n     Saad AlGhamdi\n",hud));
        list.add(JcAudio.createFromURL("7  Al Araf (Araf )"+"\n     Abdullah Juany\n",araf));
        list.add(JcAudio.createFromURL("8  Al Anfal (Le butin)"+"\n     Abubakr Shatry\n",butin));
        list.add(JcAudio.createFromURL("9  Tawba (La Répentance)"+"\n    Abdullah Basfar\n",tawb));
        list.add(JcAudio.createFromURL("10  Yunus (Yunus La Délibération)"+"\n       Abdelziz Ahamad\n",yunus));
        list.add(JcAudio.createFromURL("11  Hud (Hud)"+"\n      Saad AlGhamdi\n",hud));
        list.add(JcAudio.createFromURL("12  Yusuf (Joseph)"+"\n       Nabil Ar Rafai\n",yusuf));
        list.add(JcAudio.createFromURL("13  Ar Rad (Le Tonnerre) "+"\n       Abdurraman Sudais\n",toner));
        list.add(JcAudio.createFromURL("14  Ibrahim (Ibrahim)"+"\n      Maher Muaqli\n",ibrahim));
        list.add(JcAudio.createFromURL("15  Hijr (Hidjr)"+"\n     Ibrahim Jibreen\n",hijr));
        list.add(JcAudio.createFromURL("16  Al Nahl (les Abeilles)"+"\n       Ahmed Ajami\n",hahl));
        list.add(JcAudio.createFromURL("17  Al Isra' (Le voyage nocturne)"+"\n       Abdullah Matroud\n",voya));
        list.add(JcAudio.createFromURL("18  Kahf (La Caverne)"+"\n       Salah Bukhatir\n",cavern));
        list.add(JcAudio.createFromURL("19  Mariam (Marie)"+"\n      Saoud Shuraim\n",marie));
        list.add(JcAudio.createFromURL("20  Ta.Ha (Taha)"+"\n       Saad AlGhamdi\n",taha));
        list.add(JcAudio.createFromURL("21  Al Anbiya (les Prophetes)"+"\n       Khalil Jalil\n",prophet));
        list.add(JcAudio.createFromURL("22  Al Hadj (le Pèlerinage)"+"\n       Salah  Al Bedair\n",hadj));
        list.add(JcAudio.createFromURL("23  Al Muumin (les Croyants)"+"\n       Fawaz Alkabi\n",almumin));
        list.add(JcAudio.createFromURL("24  An Nour (la Lumiere)"+"\n       Abdullah Juany\n",nour));
        list.add(JcAudio.createFromURL("25  Al Furqan (La Loi)"+"\n       Abdullah Matroud\n",furqan));
        list.add(JcAudio.createFromURL("26  As Suaraa (Les Poétes)"+"\n       Abdullah Khalaf\n",poet));
        list.add(JcAudio.createFromURL("27  An Naml (les Fourmis)"+"\n       Abdulmohsen Al Qasim\n",fourmi));
        list.add(JcAudio.createFromURL("28  Al Qassas (Le Recit)"+"\n       Saad AlGhamdi\n",qassas));
        list.add(JcAudio.createFromURL("29  Al Ankabut (L'Araignée)"+"\n       Nabil Ar Rafai\n",ankabut));
        list.add(JcAudio.createFromURL("30  Ar Rum (les Romains)"+"\n       Maher Muaqli\n",roum));
        list.add(JcAudio.createFromURL("31  Luqman (Luqman)"+"\n       Abubakr Shatry\n",luqman));
        list.add(JcAudio.createFromURL("32  As Sadjada (La Prosternation)"+"\n       Abdullah Juany\n",prosternation));
        list.add(JcAudio.createFromURL("33  AL Ahzab (les fractions)"+"\n       Nasser Qatami\n",faction));
        list.add(JcAudio.createFromURL("34  Saba (les Saba)"+"\n       Ali Jabr",saba));
        list.add(JcAudio.createFromURL("35  Fatir (Le créateur)"+"\n       Abdullah Basfar\n",fatir));
        list.add(JcAudio.createFromURL("36  Ya.sine (Ya.Sin)"+"\n       Abdullah Matroud\n",yasin));
        list.add(JcAudio.createFromURL("37  As Saffat (Les Rangés)"+"\n       Abdurrahman Sudais\n",safat));
        list.add(JcAudio.createFromURL("38  Sad (çad)"+"\n        Abubakr Shatry\n",çad));
        list.add(JcAudio.createFromURL("39  Al Az Zummar (Les Groupes)"+"\n        Abdelwadood Hanife\n",zumar));
        list.add(JcAudio.createFromURL("40  Al Ghafur (Celui qui pardonne)"+"\n       Ibrahim Jibreen\n",gafir));
        list.add(JcAudio.createFromURL("41  Fussilat (Les versest detaillés)"+"\n       Salah Bukhatir\n",fusilat));
        list.add(JcAudio.createFromURL("42  As Sura (La Délibération)"+"\n        Abdelziz Ahamad\n",sura));
        list.add(JcAudio.createFromURL("43  Az Zuhruf (L'Ornement)"+"\n       Abdullah Matroud\n",suhurf));
        list.add(JcAudio.createFromURL("44  Ad Dukhan (La Fumée)"+"\n        Abdullah Juany\n",dukhan));
        list.add(JcAudio.createFromURL("45  Al Jathia (L'Agenouillée)"+"\n       Nasser Qatami\n",jacia));
        list.add(JcAudio.createFromURL("46  Al Ahqaf ( Ahqaf)"+"\n        Salah Bukhatir\n",ahqaf));
        list.add(JcAudio.createFromURL("47  Muhammad (Muhammad)"+"\n        Abdullah Basfar\n",muhamad));
        list.add(JcAudio.createFromURL("48  Al Fath (La Victoire)"+"\n       Saad AlGhamdi\n",fatha));
        list.add(JcAudio.createFromURL("49  Al Hujurat (les Appartements) "+"\n       Maher Muaqli\n",hujarat));
        list.add(JcAudio.createFromURL("50  Al Qaf (Qaf)"+"\n       Abdurraman Sudais\n",qaf));
        list.add(JcAudio.createFromURL("51  Adh Dhariat (Qui éparpillent)"+"\n       Nabil Ar Rafai\n",zaria));
        list.add(JcAudio.createFromURL("52  At Tur (Le Mont)"+"\n       Abdullah Juany\n",tur));
        list.add(JcAudio.createFromURL("53  An Najm (L'etoile)"+"\n       Abubakr Shatry\n",nadjim));
        list.add(JcAudio.createFromURL("54  Al Qamar (La Lune)"+"\n       Ibrahim Jibreen\n",qamar));
        list.add(JcAudio.createFromURL("55  Ar Rahman (Le Très Misericordieux) "+"\n        Mishary Al Afassy\n",rahman));
        list.add(JcAudio.createFromURL("56  Al Waqiya (L'Inéluctable)"+"\n        Ali Jabr\n",waqiya));
        list.add(JcAudio.createFromURL("57  Al Hadid (Le Fer)"+"\n       Saad AlGhamdi\n",hadid));
        list.add(JcAudio.createFromURL("58  Al Mudjadala (La Discussion)"+"\n       Abdullah Matroud\n",mujadala));
        list.add(JcAudio.createFromURL("59  Al Hasr (L'éxode)"+"\n       Abdullah Basfar\n",hasr));
        list.add(JcAudio.createFromURL("60  Al Mumtahan (L'Epreuve)"+"\n       Abubakr Shatry\n",aduha));
        list.add(JcAudio.createFromURL("61  As Saff (Le Rang)"+"\n       Abdullah Basfar\n",asafa));
        list.add(JcAudio.createFromURL("62  Al Jumaa (Le Vendredi)"+"\n        Nasser Qatami\n",jumaa));
        list.add(JcAudio.createFromURL("63  Al Munafiqun (les Hypocrites)"+"\n       Maher Muaqli\n",munafiq));
        list.add(JcAudio.createFromURL("64  At Tagabun (La Duperie Reciproque)"+"\n       Nasser Qatami\n",tagabun));
        list.add(JcAudio.createFromURL("65  At Talaq (La Répudation)"+"\n       Abdullah Matroud\n",talaq));
        list.add(JcAudio.createFromURL("66  A Tahrim (L'interdiction)"+"\n       Mishary Al Afassy\n",tahrim));
        list.add(JcAudio.createFromURL("67  Al Mulk (La Royauté)"+"\n        Fawaz Alkabi\n",mulk));
        list.add(JcAudio.createFromURL("68  Al Qalam (la Plume"+"\n       Abdullah Matroud\n",qalam));
        list.add(JcAudio.createFromURL("69  Al Haqq (celle qui doit venir)"+"\n       Mishary Al Afassy\n",alhaq));
        list.add(JcAudio.createFromURL("70  Al Maarij (Les Degrés)"+"\n       Abdullah Matroud\n",maarij));
        list.add(JcAudio.createFromURL("71  Nuh (Noé)"+"\n       Nabil Ar Rafai",nuha));
        list.add(JcAudio.createFromURL("72  Al Djinn (Les Djinns)"+"\n       Abdurraman Sudais\n",jinn));
        list.add(JcAudio.createFromURL("73  Muzzammil (L'enveloppé)"+"\n       Ibrahim Jibreen\n",muzzamil));
        list.add(JcAudio.createFromURL("74  Mudathir (Le revêtu d’un manteau)"+"\n       Abdullah Juany\n",mudathir));
        list.add(JcAudio.createFromURL("75  Al Qiyam (La Résurrection)"+"\n       Ali Jabr\n",qiyama));
        list.add(JcAudio.createFromURL("76  Al Insan (L'Homme)"+"\n       Ali Jabr\n",insan));
        list.add(JcAudio.createFromURL("77  Al Mursalat (Les Envoyés)"+"\n       Salah Bukhatir\n",mursalat));
        list.add(JcAudio.createFromURL("78  An Naba (L’Annonce)"+"\n       Mishary Al Afassy\n",anaba));
        list.add(JcAudio.createFromURL("79  An Naziat (Ceux qui arrachent) "+"\n       Ahmed Ajami\n",nazia));
        list.add(JcAudio.createFromURL("80  Abassa (Il s’est renfrogné)"+"\n       Mishary Al Afassy\n",abasa));
        list.add(JcAudio.createFromURL("81  At Takwir (Le Décrochement) "+"\n        Nasser Qatami\n",takwir));
        list.add(JcAudio.createFromURL("82  Al Infitar (La Rupture du ciel) "+"\n       Nabil Ar Rafai\n",infitar));
        list.add(JcAudio.createFromURL("83  Al Mutaffifin (Les Fraudeurs)"+"\n       Mishary Al Afassy\n",mutafif));
        list.add(JcAudio.createFromURL("84  Al Insiqaq (La Déchirure)"+"\n        Maher Muaqli\n",insiqaq));
        list.add(JcAudio.createFromURL("85  Al Buruj (La Constellation)"+"\n       Abdullah Matroud\n",buruj));
        list.add(JcAudio.createFromURL("86  At Tariq (L'Astre Nocturne)"+"\n       Ahmed Ajami\n",atarq));
        list.add(JcAudio.createFromURL("87  Al Aala (Les Très Haut)"+"\n       Abdullah Basfar\n",ala));
        list.add(JcAudio.createFromURL("88  Al Gashia (Celle qui enveloppe)"+"\n       Abdurraman Sudais\n",gasia));
        list.add(JcAudio.createFromURL("89  Al Fajr (L’Aube)"+"\n        Mishary Al Afassy\n",fajr));
        list.add(JcAudio.createFromURL("90  Al Balad (La Cité)"+"\n        Abdullah Juany\n",balad));
        list.add(JcAudio.createFromURL("91  As Sams (Le Soleil)"+"\n       Abubakr Shatry\n",samsi));
        list.add(JcAudio.createFromURL("92  Al Layl (La Nuit)"+"\n        Abubakr Shatry\n",layl));
        list.add(JcAudio.createFromURL("93  Ad Duha (La Clarté)"+"\n       Abubakr Shatry\n",aduha));
        list.add(JcAudio.createFromURL("94  As Srah (L'Ouverture)"+"\n       Saad AlGhamdi\n",asrah));
        list.add(JcAudio.createFromURL("95  At Tin (Le Figuier)"+"\n       Abdullah Juany\n",attin));
        list.add(JcAudio.createFromURL("96  Al Alaq (Le Caillot de Sang)"+"\n       Saad AlGhamdi\n",alaq));
        list.add(JcAudio.createFromURL("97  Al Qadre (Le Décret)"+"\n        Abdullah Juany\n",alqadr));
        list.add(JcAudio.createFromURL("98  Al Bayyina (La Preuve décisive)"+"\n        Nasser Qatami\n",bayna));
        list.add(JcAudio.createFromURL("99  Az Zalzala (Le Tremblement)"+"\n       Maher Muaqli\n",zulzila));
        list.add(JcAudio.createFromURL("100  Al Adiyat (les coursiers)"+"\n        Nabil Ar Rafai\n",diyat));
        list.add(JcAudio.createFromURL("101  Al Qaria (Le fracas)"+"\n         Abdullah Khalaf\n",qaria));
        list.add(JcAudio.createFromURL("102  At takathur (La rivalité)"+"\n        Nabil Ar Rafai\n",takatur));
        list.add(JcAudio.createFromURL("103  Al Asr (Le Temps)"+"\n       Abdullah Matroud\n",asr));
        list.add(JcAudio.createFromURL("104  Al Humaza (le calomniateur)"+"\n        Abdullah Juany\n",calm));
        list.add(JcAudio.createFromURL("105  Al Fil (L'élephant)"+"\n         Abdullah Matroud\n",elepha));
        list.add(JcAudio.createFromURL("106  Qurays (les Qurais)"+"\n         Maher Muaqli\n",qurai));
        list.add(JcAudio.createFromURL("107  Al Ma'un (L’Ustensile)"+"\n          Ali Jabr\n",maunn));
        list.add(JcAudio.createFromURL("108  Al Kawthar (L'anbondance)"+"\n         Abdurraman Sudais\n",kaw));
        list.add(JcAudio.createFromURL("109  Al Kafirun (Les Incrédules)"+"\n         Abdullah Basfar\n",kafir));
        list.add(JcAudio.createFromURL("110  An Nasr (Le Secours)"+"\n         Nabil Ar Rafai\n",nasre));
        list.add(JcAudio.createFromURL("111  Al Masad (la Corde)"+"\n          Nasser Qatami\n",masad));
        list.add(JcAudio.createFromURL("112  Ihlas (Le Culte pur)"+"\n         Saad AlGhamdi\n",klass));
        list.add(JcAudio.createFromURL("113  Al Falaq (L'Aurore)"+"\n         Saoud Shuraim\n",falaq));
        list.add(JcAudio.createFromURL("114  An Nass (Les Hommes)"+"\n         Ahmed Ajami\n",nass));









    }









}