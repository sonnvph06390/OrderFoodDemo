package com.example.orderfooddemo.activity.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.orderfooddemo.R;
import com.example.orderfooddemo.activity.adapter.MonAnAdapter;
import com.example.orderfooddemo.activity.model.MonAn;

import java.util.ArrayList;


public class AllFragment extends Fragment {
    public RecyclerView rcvListMonAn;
    public MonAnAdapter monAnAdapter;
    ArrayList<MonAn> listMonAn;
    LinearLayoutManager linearLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_all, container, false);
        rcvListMonAn = (RecyclerView) view.findViewById(R.id.rcvListMonAn);
        listMonAn = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listMonAn.add(new MonAn("1", "Salad", "Do an nhe", "30 min", "50.000d", "", "Ca rot, rau chan vit, ca chua"));
        }
        monAnAdapter = new MonAnAdapter(getContext(), listMonAn);
        linearLayoutManager = new LinearLayoutManager(getContext());
        rcvListMonAn.setAdapter(monAnAdapter);
        rcvListMonAn.setLayoutManager(linearLayoutManager);
        return view;
    }

}