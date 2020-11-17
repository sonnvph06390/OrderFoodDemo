package com.example.orderfooddemo.activity.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.orderfooddemo.R;
import com.example.orderfooddemo.activity.model.MonAn;

import java.util.List;

public class MonAnAdapter extends RecyclerView.Adapter<MonAnAdapter.ViewHolder> {
    Context context;
    List<MonAn>listMonAn;

    public MonAnAdapter(Context context, List<MonAn> listMonAn) {
        this.context = context;
        this.listMonAn = listMonAn;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_mon_an,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.anhMonAn.setImageResource(R.drawable.image_login);
        holder.tenMonAn.setText(listMonAn.get(position).tenMonAn);
        holder.giaMonAn.setText(listMonAn.get(position).giaMonAn);
        holder.thoiGian.setText(listMonAn.get(position).thoiGian);
    }

    @Override
    public int getItemCount() {
        return listMonAn.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView anhMonAn;
        TextView tenMonAn;
        TextView giaMonAn;
        TextView thoiGian;
        ImageView btnAdd;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            anhMonAn=itemView.findViewById(R.id.ivMonAn);
            tenMonAn=itemView.findViewById(R.id.tvTenMonAn);
            giaMonAn=itemView.findViewById(R.id.tvGiaMonAn);
            thoiGian=itemView.findViewById(R.id.tvThoiGianNau);
            btnAdd=itemView.findViewById(R.id.btnAddMonAn);

        }
    }
}
