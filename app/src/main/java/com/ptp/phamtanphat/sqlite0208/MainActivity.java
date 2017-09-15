package com.ptp.phamtanphat.sqlite0208;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Database database;
    HocsinhAdapter hocsinhAdapter;
    ArrayList<Hocsinh> manghocsinh;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listview);
        manghocsinh = new ArrayList<>();
        hocsinhAdapter = new HocsinhAdapter(MainActivity.this,manghocsinh);
        listView.setAdapter(hocsinhAdapter);

        database = new Database(MainActivity.this,"Quanly.sqlite",null,1);

        //Cau lenh tao bang
//        String CreateTable = "CREATE TABLE IF NOT EXISTS HocSinh (Id INTEGER PRIMARY KEY AUTOINCREMENT , Ten VARCHAR(200) , Namsinh INTEGER , Diadiem VARCHAR(200))";
//        database.QueryData(CreateTable);
        //Them du lieu vao trong bang
//        String InsertHocSinh = "INSERT INTO HocSinh VALUES (null,'Nguyen Van A',2000,'Tp Ho Chi Minh')";
//        String InsertHocSinh1 = "INSERT INTO HocSinh VALUES (null,'Thach Thanh Hue',1983,'Binh Chanh')";
//        String InsertHocSinh2 = "INSERT INTO HocSinh VALUES (null,'Luc Thoi Sang',1997,'Tp Ho Chi Minh')";
//        String InsertHocSinh3 = "INSERT INTO HocSinh VALUES (null,'Nguyen Duy Huy',1996,'Quan 9')";
//        String InsertHocSinh4 = "INSERT INTO HocSinh VALUES (null,'Phan Thanh Dat',1995,'Tan Binh')";
//        String InsertHocSinh5 = "INSERT INTO HocSinh VALUES (null,'Truong Tuan Ngan',1997,'Quan 10')";
//        String InsertHocSinh6 = "INSERT INTO HocSinh VALUES (null,'Tran Minh Dat',1993,'Quan 6')";
//        String InsertHocSinh7 = "INSERT INTO HocSinh VALUES (null,'Ngo Trung Thu',1996,'Dong Nai')";
//        String InsertHocSinh8 = "INSERT INTO HocSinh VALUES (null,'Mai Quoc Thuan',1996,'Binh Thanh')";
//        String InsertHocSinh9 = "INSERT INTO HocSinh VALUES (null,'Nguyen Phuc Toan',1993,'An Giang')";
//        String InsertHocSinh10 = "INSERT INTO HocSinh VALUES (null,'Thai Minh Khoa',1996,'Quan 8')";
//        String InsertHocSinh11 = "INSERT INTO HocSinh VALUES (null,'Le Trong Tin',199,'Thu Duc')";
//
//        database.QueryData(InsertHocSinh);
//        database.QueryData(InsertHocSinh1);
//        database.QueryData(InsertHocSinh2);
//        database.QueryData(InsertHocSinh3);
//        database.QueryData(InsertHocSinh4);
//        database.QueryData(InsertHocSinh5);
//        database.QueryData(InsertHocSinh6);
//        database.QueryData(InsertHocSinh7);
//        database.QueryData(InsertHocSinh8);
//        database.QueryData(InsertHocSinh9);
//        database.QueryData(InsertHocSinh10);
//        database.QueryData(InsertHocSinh11);
        //Duyet du lieu
        Cursor cursor = database.GetData("SELECT * FROM HocSinh");
        while (cursor.getCount() != 0 && cursor.moveToNext()){
            int id = cursor.getInt(0);
            String ten = cursor.getString(1);
            int namsinh = cursor.getInt(2);
            String diadiem = cursor.getString(3);
//            Log.d("AAA","Ten hoc vien : " + ten + " Nam Sinh : " + namsinh + " Dia diem : " + diadiem);
            manghocsinh.add(new Hocsinh(id,ten,namsinh,diadiem));
        }
        hocsinhAdapter.notifyDataSetChanged();
    }
}
