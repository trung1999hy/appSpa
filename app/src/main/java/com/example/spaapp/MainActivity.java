package com.example.spaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.spaapp.Adapter.HomeAdapter;
import com.example.spaapp.Model.DanhMuc00P;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    HomeAdapter homeAdapter;
    RecyclerView rcvDanhMuc;
    List<DanhMuc00P> danhMuc00PList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addlist();
        initview();
    }

    private void initview() {
        homeAdapter = new HomeAdapter(this, danhMuc00PList);
        rcvDanhMuc = this.findViewById(R.id.rcv_dm);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rcvDanhMuc.setLayoutManager(linearLayout);
        rcvDanhMuc.setLayoutManager(new GridLayoutManager(this, 4));
        rcvDanhMuc.setAdapter(homeAdapter);
    }

    private void addlist() {
        danhMuc00PList = new ArrayList<>();
        danhMuc00PList.add(new DanhMuc00P("Hàng Sale ", R.drawable.sale));
        danhMuc00PList.add(new DanhMuc00P("Váy Hiệu ", R.drawable.vayhieu));
        danhMuc00PList.add(new DanhMuc00P("Nước Hoa ", R.drawable.nuochoa));
        danhMuc00PList.add(new DanhMuc00P("Kem Dưỡng ", R.drawable.kemduong));
        danhMuc00PList.add(new DanhMuc00P(" Giày Hiệu ", R.drawable.giay));
        danhMuc00PList.add(new DanhMuc00P("Túi Sách ", R.drawable.tuisach));
        danhMuc00PList.add(new DanhMuc00P("Đồng Hồ ", R.drawable.dongho));
        danhMuc00PList.add(new DanhMuc00P("Làm Đẹp ", R.drawable.lamdep));
    }

}