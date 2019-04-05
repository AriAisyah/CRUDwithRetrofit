package com.aisyah.crudwithretrofit;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.aisyah.crudwithretrofit.data.SiswaItem;

import java.util.List;

public class AdapterList extends RecyclerView.Adapter<AdapterList.MyViewHolder> {

    private List<SiswaItem> itemList;
    private Context context;

    public AdapterList(List<SiswaItem> itemList, Context context) {
        this.itemList = itemList;
        this.context = context;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
            TextView nama, alamat, hp;
            LinearLayout layoututama;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.txtnama);
            alamat = itemView.findViewById(R.id.txtalamat);
            hp = itemView.findViewById(R.id.txthp);
            layoututama = itemView.findViewById(R.id.layoututama);
        }
    }

    @NonNull
    @Override
    public AdapterList.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listitem, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterList.MyViewHolder myViewHolder, int i) {
        final SiswaItem item = itemList.get(i);

        myViewHolder.nama.setText(item.getNama());
        myViewHolder.alamat.setText(item.getAlamat());
        myViewHolder.hp.setText(item.getHp());

        myViewHolder.layoututama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(context,DetailActivity.class);
                i.putExtra("id", item.getId());
                i.putExtra("nama", item.getNama());
                i.putExtra("alamat", item.getAlamat());
                i.putExtra("hp", item.getHp());
                i.putExtra("aksi", "edit");
                context.startActivity(i);

            }
        });
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }


}
