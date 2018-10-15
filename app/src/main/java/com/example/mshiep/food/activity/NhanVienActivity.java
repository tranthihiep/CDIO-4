package com.example.mshiep.food.activity;
import com.example.mshiep.food.R;
import com.example.mshiep.food.model.MonAn;
import com.example.mshiep.food.model.Order;
import com.example.mshiep.food.model.TrangThai;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NhanVienActivity extends AppCompatActivity {
    DatabaseReference mData,mData2;
    Thread thread;
   public Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15;
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
                        Thread.sleep(5000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                ValueEventListener valueEventListener2 = new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                        if (dataSnapshot.exists()){
                                            for ( DataSnapshot snapshot : dataSnapshot.getChildren()){
                                                Order monAn = snapshot.getValue(Order.class);
                                                switch (monAn.getSoBan()){
                                                    case "Bàn 01":

                                                        btn1.setText("Bàn 01 đợi giao...");
                                                        btn1.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                Intent intent1 = new Intent(NhanVienActivity.this,
                                                                        OrderNhanVien.class);
                                                                intent1.putExtra("tt", "Bàn 01");
                                                                startActivity(intent1);
                                                            }
                                                        });

                                                        break;
                                                    case "Bàn 02":

                                                        btn2.setText("Bàn 02 đợi giao...");
                                                        btn2.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                Intent intent1 = new Intent(NhanVienActivity.this,
                                                                        OrderNhanVien.class);
                                                                intent1.putExtra("tt", "Bàn 02");
                                                                startActivity(intent1);
                                                            }
                                                        });

                                                        break;
                                                    case "Bàn 03":

                                                        btn3.setText("Bàn 03 đợi giao...");
                                                        btn3.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                Intent intent1 = new Intent(NhanVienActivity.this,
                                                                        OrderNhanVien.class);
                                                                intent1.putExtra("tt", "Bàn 03");
                                                                startActivity(intent1);
                                                            }
                                                        });

                                                        break;
                                                    case "Bàn 04":

                                                        btn4.setText("Bàn 04 đợi giao...");
                                                        btn4.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                Intent intent1 = new Intent(NhanVienActivity.this,
                                                                        OrderNhanVien.class);
                                                                intent1.putExtra("tt", "Bàn 04 đợi giao...");
                                                                startActivity(intent1);
                                                            }
                                                        });

                                                        break;
                                                    case "Bàn 05":

                                                        btn5.setText("Bàn 05 đợi giao...");
                                                        btn5.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                Intent intent1 = new Intent(NhanVienActivity.this,
                                                                        OrderNhanVien.class);
                                                                intent1.putExtra("tt", "Bàn 05 đợi giao...");
                                                                startActivity(intent1);
                                                            }
                                                        });

                                                        break;
                                                    case "Bàn 06":

                                                        btn6.setText("Bàn 06 đợi giao...");
                                                        btn6.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                Intent intent1 = new Intent(NhanVienActivity.this,
                                                                        OrderNhanVien.class);
                                                                intent1.putExtra("tt", "Bàn 06 đợi giao...");
                                                                startActivity(intent1);
                                                            }
                                                        });

                                                        break;
                                                    case "Bàn 07":

                                                        btn7.setText("Bàn 07 đợi giao...");
                                                        btn7.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                Intent intent1 = new Intent(NhanVienActivity.this,
                                                                        OrderNhanVien.class);
                                                                intent1.putExtra("tt", "Bàn 07 đợi giao...");
                                                                startActivity(intent1);
                                                            }
                                                        });

                                                        break;
                                                    case "Bàn 08":

                                                        btn8.setText("Bàn 08 đợi giao...");
                                                        btn8.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                Intent intent1 = new Intent(NhanVienActivity.this,
                                                                        OrderNhanVien.class);
                                                                intent1.putExtra("tt", "Bàn 08");
                                                                startActivity(intent1);
                                                            }
                                                        });

                                                        break;
                                                    case "Bàn 09":

                                                        btn9.setText("Bàn 09 đợi giao...");
                                                        btn9.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                Intent intent1 = new Intent(NhanVienActivity.this,
                                                                        OrderNhanVien.class);
                                                                intent1.putExtra("tt", "Bàn 09");
                                                                startActivity(intent1);
                                                            }
                                                        });

                                                        break;
                                                    case "Bàn 10":

                                                        btn10.setText("Bàn 10 đợi giao...");
                                                        btn10.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                Intent intent1 = new Intent(NhanVienActivity.this,
                                                                        OrderNhanVien.class);
                                                                intent1.putExtra("tt", "Bàn 10");
                                                                startActivity(intent1);
                                                            }
                                                        });

                                                        break;
                                                    case "Bàn 11":

                                                        btn11.setText("Bàn 11 đợi giao...");
                                                        btn11.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                Intent intent1 = new Intent(NhanVienActivity.this,
                                                                        OrderNhanVien.class);
                                                                intent1.putExtra("tt", "Bàn 11");
                                                                startActivity(intent1);
                                                            }
                                                        });

                                                        break;
                                                    case "Bàn 12":

                                                        btn12.setText("Bàn 12 đợi giao...");
                                                        btn12.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                Intent intent1 = new Intent(NhanVienActivity.this,
                                                                        OrderNhanVien.class);
                                                                intent1.putExtra("tt", "Bàn 12");
                                                                startActivity(intent1);
                                                            }
                                                        });

                                                        break;
                                                    case "Bàn 13":

                                                        btn13.setText("Bàn 13 đợi giao...");
                                                        btn13.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                Intent intent1 = new Intent(NhanVienActivity.this,
                                                                        OrderNhanVien.class);
                                                                intent1.putExtra("tt", "Bàn 13");
                                                                startActivity(intent1);
                                                            }
                                                        });

                                                        break;
                                                    case "Bàn 14":

                                                        btn14.setText("Bàn 14 đợi giao...");
                                                        btn14.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                Intent intent1 = new Intent(NhanVienActivity.this,
                                                                        OrderNhanVien.class);
                                                                intent1.putExtra("tt", "Bàn 14");
                                                                startActivity(intent1);
                                                            }
                                                        });

                                                        break;
                                                    case "Bàn 15":

                                                        btn15.setText("Bàn 15 đợi giao...");
                                                        btn15.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                Intent intent1 = new Intent(NhanVienActivity.this,
                                                                        OrderNhanVien.class);
                                                                intent1.putExtra("tt", "Bàn 15");
                                                                startActivity(intent1);
                                                            }
                                                        });

                                                        break;

                                                }
                                            }
                                        }
                                    }

                                    @Override
                                    public void onCancelled(@NonNull DatabaseError databaseError) {

                                    }
                                };
                                Query query2 =  FirebaseDatabase.getInstance().getReference("Order").orderByChild("trangThaiOrder").equalTo(1);
                                query2.addListenerForSingleValueEvent(valueEventListener2);

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
                                                        btn2.setText("Đợi thanh toán, Tổng: " + monAn.getTongTien());
                                                        btn2.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn2.setText("Bàn 02");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                    case "Bàn 03":
                                                        btn3.setText("Đợi thanh toán, Tổng: " + monAn.getTongTien());
                                                        btn3.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn3.setText("Bàn 03");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                    case "Bàn 04":
                                                        btn4.setText("Đợi thanh toán, Tổng: " + monAn.getTongTien());
                                                        btn4.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn4.setText("Bàn 04");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                    case "Bàn 05":
                                                        btn5.setText("Đợi thanh toán, Tổng: " + monAn.getTongTien());
                                                        btn5.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn5.setText("Bàn 05");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                    case "Bàn 06":
                                                        btn6.setText("Đợi thanh toán, Tổng: " + monAn.getTongTien());
                                                        btn6.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn6.setText("Bàn 06");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                    case "Bàn 07":
                                                        btn7.setText("Đợi thanh toán, Tổng: " + monAn.getTongTien());
                                                        btn7.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn7.setText("Bàn 07");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                    case "Bàn 08":
                                                        btn8.setText("Đợi thanh toán, Tổng: " + monAn.getTongTien());
                                                        btn8.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn8.setText("Bàn 08");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                    case "Bàn 09":
                                                        btn9.setText("Đợi thanh toán, Tổng: " + monAn.getTongTien());
                                                        btn9.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn9.setText("Bàn 09");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                    case "Bàn 10":
                                                        btn10.setText("Đợi thanh toán, Tổng: " + monAn.getTongTien());
                                                        btn10.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn10.setText("Bàn 10");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                    case "Bàn 11":
                                                        btn11.setText("Đợi thanh toán, Tổng: " + monAn.getTongTien());
                                                        btn11.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn11.setText("Bàn 11");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                    case "Bàn 12":
                                                        btn12.setText("Đợi thanh toán, Tổng: " + monAn.getTongTien());
                                                        btn12.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn12.setText("Bàn 12");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                    case "Bàn 13":
                                                        btn13.setText("Đợi thanh toán, Tổng: " + monAn.getTongTien());
                                                        btn13.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn13.setText("Bàn 13");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                    case "Bàn 14":
                                                        btn14.setText("Đợi thanh toán, Tổng: " + monAn.getTongTien());
                                                        btn14.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                btn14.setText("Bàn 14");
                                                            }
                                                        });
                                                        mData.child(monAn.getMaTrangThai()).child("trangThai").setValue(0);
                                                        break;
                                                    case "Bàn 15":
                                                        btn15.setText("Đợi thanh toán, Tổng: " + monAn.getTongTien());
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

    @Override
    protected void onStart() {
        Intent intent = getIntent();
        String value1 = intent.getStringExtra("ttt");
        if (btn1.getText().toString().equals(value1)){
            btn1.setText("Đã đủ");
        }
        else if (btn2.getText().toString().equals(value1)){
            btn2.setText("Đã đủ");
        }
        else if (btn3.getText().toString().equals(value1)){
            btn3.setText("Đã đủ");
        }
        else if (btn4.getText().toString().equals(value1)){
            btn4.setText("Đã đủ");
        }
        else if (btn5.getText().toString().equals(value1)){
            btn5.setText("Đã đủ");
        }
        else if (btn6.getText().toString().equals(value1)){
            btn6.setText("Đã đủ");
        }
        else if (btn7.getText().toString().equals(value1)){
            btn7.setText("Đã đủ");
        } else if (btn8.getText().toString().equals(value1)){
            btn8.setText("Đã đủ");
        } else if (btn9.getText().toString().equals(value1)){
            btn9.setText("Đã đủ");
        } else if (btn10.getText().toString().equals(value1)){
            btn10.setText("Đã đủ");
        } else if (btn11.getText().toString().equals(value1)){
            btn11.setText("Đã đủ");
        } else if (btn12.getText().toString().equals(value1)){
            btn12.setText("Đã đủ");
        } else if (btn13.getText().toString().equals(value1)){
            btn13.setText("Đã đủ");
        } else if (btn14.getText().toString().equals(value1)){
            btn14.setText("Đã đủ");
        } else if (btn15.getText().toString().equals(value1)){
            btn15.setText("Đã đủ");
        }
        super.onStart();
    }

    void anhXa (){
       mData = FirebaseDatabase.getInstance().getReference("TrangThai");
       mData2 = FirebaseDatabase.getInstance().getReference("Order");
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
