package com.example.myclass.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myclass.R;
import com.example.myclass.model.dataMatkulModel;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.Holder> {
    private ArrayList<dataMatkulModel> dataModel;
    private Activity activity;

    public adapter(Activity activity, ArrayList<dataMatkulModel> dataModel){
        this.dataModel = dataModel;
        this.activity  = activity;
    }

    @NonNull
    @Override
    public adapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapterdata, parent, false);
        Holder holder = new Holder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull adapter.Holder holder, int position) {
        dataMatkulModel model = dataModel.get(position);

        holder.namaMk.setText(model.getMatkul());
        holder.kodeMk.setText(model.getKode());
        holder.namaDs.setText(model.getDosen());
        holder.hariMk.setText(model.getHari());
    }

    @Override
    public int getItemCount() {
        return dataModel.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView namaMk, kodeMk, namaDs, hariMk;

        public Holder(@NonNull View v) {
            super(v);
            kodeMk = v.findViewById(R.id.kodeMk);
            namaMk = (TextView)v.findViewById(R.id.namaMk);
            namaDs = (TextView)v.findViewById(R.id.namaDs);
            hariMk = (TextView)v.findViewById(R.id.hariMk);
        }
    }
}
