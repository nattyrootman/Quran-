package com.example.quranmp3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.jean.jcplayer.model.JcAudio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> implements Filterable {

    Context context;

 List<JcAudio> list;


   List<JcAudio>audioList;


   public static String result;
    int posi=0;

   static OnClickList clickList;
    public MyAdapter(Context context) {
        this.context = context;


    }


       public static void setClickList( OnClickList clickLis){
           clickList=clickLis;
       }

            public void setAudioList (List<JcAudio> list){

                this.list = list;
                this.audioList=new ArrayList<>(list);

                notifyDataSetChanged();

            }


    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {




        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_custom,parent,false);


        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {


         holder.Bind(list.get(position));

        holder.sourate.setText(list.get(position).getTitle());



    }

    @Override
    public int getItemCount() {


        return list.size();
    }

    @Override
    public Filter getFilter() {
        return filter;
    }



    Filter filter=new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {

            List<JcAudio>filterList=new ArrayList<>();

            if (constraint.toString().isEmpty()){

                filterList.addAll(audioList);
            }
            else {

                for (JcAudio st:audioList){

                    if (st.toString().toLowerCase().contains(constraint.toString().toLowerCase())){

                        filterList.add(st);

                    }
                }
            }


            FilterResults filterResults=new FilterResults();

            filterResults.values=filterList;

            return filterResults;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {

        list.clear();

         list.addAll((Collection<? extends JcAudio>) results.values);

          notifyDataSetChanged();

        }
    };


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView sourate,reciter;
         ImageView imageView;

        public ViewHolder( View itemView) {
            super(itemView);

            sourate = itemView.findViewById(R.id.sourate);
           imageView = itemView.findViewById(R.id.selected);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {




                    if (clickList!=null) {

                        clickList.Click(getAdapterPosition());
                    }


                    imageView.setVisibility(View.VISIBLE);


                    if (posi!=getAdapterPosition()){

                        notifyItemChanged(posi);
                        posi=getAdapterPosition();
                    }




                }
            });



        }


        public void Bind (final JcAudio jcAudios ){

            if (posi==-1){

                imageView.setVisibility(View.GONE);

            }else {

                if (posi==getAdapterPosition()){

                    imageView.setVisibility(View.VISIBLE);
                }else {
                    imageView.setVisibility(View.GONE);

                }
            }


        }



    }


    interface  OnClickList{

      void Click (int p);

    }


    public JcAudio getSelected(){
        if (posi!=-1){

            return list.get(posi);
        }
        return null;
    }

    


}
