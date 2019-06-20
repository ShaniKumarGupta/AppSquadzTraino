package com.app.appsquadztraino;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.Items> {

    Activity activity;
    List<DataModel> data;
    LayoutInflater mInflater;

    public RecyclerAdapter(Activity activity, List<DataModel> data) {
        this.activity = activity;
        this.data = data;
        mInflater = LayoutInflater.from(activity);
    }

    @NonNull
    @Override
    public Items onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new RecyclerAdapter.Items(mInflater.inflate(R.layout.card_view, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Items items, int i) {

        DataModel dataModel = data.get(i);
        items.miniTittle.setText(dataModel.getMini());
        items.mainTittle.setText(dataModel.getMainTittle());
        items.desc.setText(dataModel.getDesc());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class Items extends RecyclerView.ViewHolder {

        TextView miniTittle, mainTittle, desc;

        public Items(@NonNull View itemView) {
            super(itemView);
            miniTittle = itemView.findViewById(R.id.txt_mini);
            mainTittle = itemView.findViewById(R.id.txt_main);
            desc = itemView.findViewById(R.id.txt_desc);
        }
    }


}