package com.example.mshiep.food.activity;
import com.example.mshiep.food.R;
import com.example.mshiep.food.model.MonAn;
import com.example.mshiep.food.model.TrangThai;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NhanVienActivity extends AppCompatActivity {
    DatabaseReference mData;
    Thread thread;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhan_vien);
        anhXa();
        thread = new Thread() {
            @Override
            public void run() {
                try {
                    while (!thread.isInterrupted()) {
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                ValueEventListener valueEventListener = new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                        if (dataSnapshot.exists()){
                                            for ( DataSnapshot snapshot : dataSnapshot.getChildren()){
                                                TrangThai monAn = snapshot.getValue(TrangThai.class);
                                                switch (monAn.getSoBan()){
                                                    case "Bàn 01":
                                                        btn1.setText("Đợi thanh toán, Tổng: " + monAn.getTongTien());
                                                        btn1.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn1.setText("Bàn 01");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                    case "Bàn 02":
                                                        btn2.setText("Đợi thanh toán");
                                                        btn2.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn2.setText("Bàn 02");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                    case "Bàn 03":
                                                        btn3.setText("Đợi thanh toán");
                                                        btn3.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn3.setText("Bàn 03");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                    case "Bàn 04":
                                                        btn4.setText("Đợi thanh toán");
                                                        btn4.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn4.setText("Bàn 04");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                    case "Bàn 05":
                                                        btn5.setText("Đợi thanh toán");
                                                        btn5.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn5.setText("Bàn 05");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                    case "Bàn 06":
                                                        btn6.setText("Đợi thanh toán");
                                                        btn6.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn6.setText("Bàn 06");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                    case "Bàn 07":
                                                        btn7.setText("Đợi thanh toán");
                                                        btn7.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn7.setText("Bàn 07");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                    case "Bàn 08":
                                                        btn8.setText("Đợi thanh toán");
                                                        btn8.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn8.setText("Bàn 08");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                    case "Bàn 09":
                                                        btn9.setText("Đợi thanh toán");
                                                        btn9.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn9.setText("Bàn 09");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                    case "Bàn 10":
                                                        btn10.setText("Đợi thanh toán");
                                                        btn10.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn10.setText("Bàn 10");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                    case "Bàn 11":
                                                        btn11.setText("Đợi thanh toán");
                                                        btn11.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn11.setText("Bàn 11");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                    case "Bàn 12":
                                                        btn12.setText("Đợi thanh toán");
                                                        btn12.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn12.setText("Bàn 12");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                    case "Bàn 13":
                                                        btn13.setText("Đợi thanh toán");
                                                        btn13.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn13.setText("Bàn 13");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                    case "Bàn 14":
                                                        btn14.setText("Đợi thanh toán");
                                                        btn14.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn14.setText("Bàn 14");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                    case "Bàn 15":
                                                        btn15.setText("Đợi thanh toán");
                                                        btn15.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn15.setText("Bàn 15");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                }
                                            }
                                        }
                                    }

                                    @Override
                                    public void onCancelled(@NonNull DatabaseError databaseError) {

                                    }
                                };
                                Query query =  FirebaseDatabase.getInstance().getReference("TrangThai").orderByChild("trangThai").equalTo(1);
                                query.addListenerForSingleValueEvent(valueEventListener);
                            }
                        });
                    }
                } catch (InterruptedException e) {
                }
            }
        };

        thread.start();


    }
   void anhXa (){
       mData = FirebaseDatabase.getInstance().getReference("TrangThai");
       btn1 = findViewById(R.id.button1);
       btn2 = findViewById(R.id.button2);
       btn3 = findViewById(R.id.button3);
       btn4 = findViewById(R.id.button4);
       btn5 = findViewById(R.id.button5);
       btn6 = findViewById(R.id.button6);
       btn7 = findViewById(R.id.button7);
       btn8 = findViewById(R.id.button8);
       btn9 = findViewById(R.id.button9);
       btn10 = findViewById(R.id.button10);
       btn11 = findViewById(R.id.button11);
       btn12 = findViewById(R.id.button12);
       btn13 = findViewById(R.id.button13);
       btn14 = findViewById(R.id.button14);
       btn15 = findViewById(R.id.button15);


    }
}
