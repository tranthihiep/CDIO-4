package com.example.mshiep.food.activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.mshiep.food.R;

import java.util.ArrayList;

import com.example.mshiep.food.adapter.OrderAdapter;
import com.example.mshiep.food.adapter.OrderNhanVienAdapter;
import com.example.mshiep.food.model.Order;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class OrderNhanVien extends AppCompatActivity {
    DatabaseReference mData;
    ListView lvgoimon;
    Button btnOrderXOng, btnQuayLai;
    String value1;
    ArrayList<Order> orderArrayList;
    OrderNhanVienAdapter orderNhanVienAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_nhan_vien);
        anhXa();
        Intent intent = getIntent();
        value1 = intent.getStringExtra("tt");

        ValueEventListener valueEventListener = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                orderArrayList.clear();
                if (dataSnapshot.exists()){
                    for ( DataSnapshot snapshot : dataSnapshot.getChildren()){

                        Order monAn = snapshot.getValue(Order.class);
                        if(monAn.getSoBan().equals(value1)) {
                        orderArrayList.add(monAn);}
                    }
                    orderNhanVienAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        Query query =  FirebaseDatabase.getInstance().getReference("Order").orderByChild("trangThaiOrder").equalTo(1);
        query.addListenerForSingleValueEvent(valueEventListener);
        catchOnItemListview();
        eventButton();
    }



    private void eventButton() {
        btnQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(OrderNhanVien.this, NhanVienActivity.class);
               startActivity(intent1);
            }
        });
        btnOrderXOng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(OrderNhanVien.this, NhanVienActivity.class);
                intent1.putExtra("ttt", value1+" đợi giao...");
                startActivity(intent1);

            }
        });

    }

    private void catchOnItemListview() {
        lvgoimon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              orderArrayList.get(i).setTrangThaiOrder(0);
                mData.child( orderArrayList.get(i).getMaOrder()).child("trangThaiOrder").setValue(0);
                orderArrayList.get(i).setSoLuong(0);
                orderNhanVienAdapter.notifyDataSetChanged();
            }
        });

    }
    private void anhXa() {
        mData = FirebaseDatabase.getInstance().getReference("Order");
        lvgoimon = findViewById(R.id.lvOrderNV);
        btnOrderXOng = findViewById(R.id.btnOrderXong);
        btnQuayLai = findViewById(R.id.btnQuayLaiNV);
        orderArrayList = new ArrayList<>();
        orderNhanVienAdapter = new OrderNhanVienAdapter(OrderNhanVien.this, orderArrayList);
        lvgoimon.setAdapter(orderNhanVienAdapter);
    }}
