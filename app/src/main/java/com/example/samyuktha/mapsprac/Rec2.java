package com.example.samyuktha.mapsprac;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by samyuktha on 9/14/2017.
 */

public class Rec2 extends RecyclerView.Adapter<Rec2.Myviewholder> {


    List<Datafromhere>  hellolist;

    Rec2(List<Datafromhere> a)
    {
        this.hellolist=a;
    }


    @Override
    public Myviewholder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v9= LayoutInflater.from(parent.getContext()).inflate(R.layout.leaaach, parent, false);
        return new Rec2.Myviewholder(v9);

    }

    @Override
    public void onBindViewHolder(Myviewholder holder, int position) {

        Datafromhere dsam= hellolist.get(position);
        holder.t1.setText(dsam.getName1());
        holder.t2.setText(dsam.getLatsdata().toString());
        holder.t3.setText(dsam.getLngsdata().toString());
        holder.t4.setText(dsam.getVicinity1());
double df= dsam.getRating1();
       String mkj=  String.valueOf(df);
        holder.t5.setText(mkj);
    }

    @Override
    public int getItemCount() {
        return hellolist.size();
    }

    public class Myviewholder extends RecyclerView.ViewHolder
    {

        TextView t1,t2,t3,t4,t5;

        public Myviewholder(View itemView) {
            super(itemView);

            t1=(TextView)itemView.findViewById(R.id.mtitletextview);
            t2=(TextView)itemView.findViewById(R.id.mlatText);
            t3=(TextView)itemView.findViewById(R.id.mlongtextview);
            t4=(TextView)itemView.findViewById(R.id.maddtextview);
            t5=(TextView)itemView.findViewById(R.id.mrating);

        }
    }
}
