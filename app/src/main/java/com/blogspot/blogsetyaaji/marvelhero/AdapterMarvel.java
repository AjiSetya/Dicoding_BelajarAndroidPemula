package com.blogspot.blogsetyaaji.marvelhero;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

class AdapterMarvel extends RecyclerView.Adapter<AdapterMarvel.Holder> {

    private ArrayList<Marvel> listData;
    private Context context;

    AdapterMarvel(Context context) {
        this.context = context;
    }

    private ArrayList<Marvel> getListData() {
        return listData;
    }

    void setListData(ArrayList<Marvel> listData) {
        this.listData = listData;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_marvel, viewGroup, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, final int i) {
        holder.titleItem.setText(getListData().get(i).getName());
        Glide.with(context)
                .load(getListData().get(i).getImage())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgItem);
        holder.cardItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("idmarvel", i);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class Holder extends RecyclerView.ViewHolder {
        TextView titleItem;
        ImageView imgItem;
        CardView cardItem;

        Holder(@NonNull View itemView) {
            super(itemView);
            titleItem = itemView.findViewById(R.id.title_item);
            imgItem = itemView.findViewById(R.id.img_item);
            cardItem = itemView.findViewById(R.id.card_item);
        }
    }
}
