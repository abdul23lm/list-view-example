package com.pbm.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.listview);

        ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("Kalkulus");
        arrayList.add("Aljabar Linear");
        arrayList.add("Fisika Telekomunikasi");
        arrayList.add("Basis Data");
        arrayList.add("Pemrograman Berorientasi Objek");
        arrayList.add("Pemrograman Berbasis Web");
        arrayList.add("Pemrograman Berbasis Dekstop");
        arrayList.add("Pengolahan Basis Data");
        arrayList.add("Matematika Diskrit");
        arrayList.add("Metode Numerik");
        arrayList.add("E-Bisnis");
        arrayList.add("Algoritma Pemrograman");
        arrayList.add("Struktur Data");
        arrayList.add("Multimedia");
        arrayList.add("Sistem Pakar");
        arrayList.add("Cloud Computing");
        arrayList.add("Analisis Desain Berorientasi Objek");
        arrayList.add("Sistem Informasi Manajemen");
        arrayList.add("Manajamen Proyek Perangkat Lunak");
        arrayList.add("Komunikasi Data dan Jaringan");
        arrayList.add("Kewirausahaan");
        arrayList.add("Elektronika dan Instrumentasi");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);

    }
}
