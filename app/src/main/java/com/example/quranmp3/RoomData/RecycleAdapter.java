package com.example.quranmp3.RoomData;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quranmp3.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHold>implements Filterable {


    Context context;

    List<modelClass>list;
    onClickListener onClickListener;
    List<modelClass>allList;

    int p=0;


    public  RecycleAdapter(Context context,onClickListener onClickListener){

        this.context=context;
        this.onClickListener=onClickListener;

    }



    public void setList(List<modelClass>list){

        this.list=list;

        this.allList=new ArrayList<>(list);
        notifyDataSetChanged();
    }



    @NonNull
    @Override
    public ViewHold onCreateViewHolder( ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.book_custom,parent,false);

        ViewHold hold=new ViewHold(view);

        return hold;
    }

    @Override
    public void onBindViewHolder( ViewHold holder, int position) {

     holder.setFocus(list.get(position));

     holder.sourate.setText(list.get(position).getSourate());
     holder.aya.setText(list.get(position).getCity());
     holder.city.setText(list.get(position).getVerses());
     holder.number.setText(list.get(position).getNumero());
     holder.fran.setText(list.get(position).getFranc());




    }

    @Override
    public int getItemCount() {
        return list==null ? 0: list.size();
    }

    @Override
    public Filter getFilter() {



        return filter;
    }



    Filter filter=new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {

            List<modelClass>filt=new ArrayList<>();

            if (constraint==null||constraint.length()==0) {
                filt.addAll(allList);


            }
            else {

                String na=constraint.toString().toLowerCase().trim();
                for (modelClass loop : allList) {

                    if (loop.getSourate().toLowerCase().contains(na)||loop.getFranc().toLowerCase().contains(na)) {

                        filt.add(loop);
                    }

                }
            }


             FilterResults results=new FilterResults();
            results.values=filt;

                return results;

        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {

            list.clear();
              list.addAll((Collection<? extends modelClass>)results.values);
              notifyDataSetChanged();

        }
    };



    public class ViewHold extends RecyclerView.ViewHolder {
       CardView cardView;
        TextView number;
        TextView sourate,aya,city,fran;
        ImageView done;

        public ViewHold( View itemView) {
            super(itemView);
            cardView=itemView.findViewById(R.id.card);
            number=itemView.findViewById(R.id.image);
            sourate=itemView.findViewById(R.id.textSourat);
            aya=itemView.findViewById(R.id.number);
            city=itemView.findViewById(R.id.city);
            fran=itemView.findViewById(R.id.fran);
            done=itemView.findViewById(R.id.done);




            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (onClickListener!=null){
                        onClickListener.onClicMe(list.get(getAdapterPosition()));
                    }

                      done.setVisibility(View.VISIBLE);

                    if (p!=getAdapterPosition()){

                        notifyItemChanged(p);
                        p=getAdapterPosition();
                    }

                }
            });
        }


      public  void setFocus(modelClass focus){
            if (p==-1){

                done.setVisibility(View.GONE);


            }else {

                if (p==getAdapterPosition()){


                    done.setVisibility(View.VISIBLE);

                }else {

                    done.setVisibility(View.GONE);

                }

            }


      }


    }

  public   interface onClickListener{


        void onClicMe(modelClass p);




    }
}
