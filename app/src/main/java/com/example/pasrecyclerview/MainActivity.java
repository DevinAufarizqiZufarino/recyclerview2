package com.example.pasrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass>userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        initData();
        initRecyclerView();


    }

    private void initData() {

        userList = new ArrayList<>();

        userList.add(new ModelClass(R.drawable.a, "Funi", "10:45am", "hayy", "--------------------------------------------------------------------------------------" ));

        userList.add(new ModelClass(R.drawable.b, "Alya", "`12:50am", "login yuk", "--------------------------------------------------------------------------------------" ));

        userList.add(new ModelClass(R.drawable.c, "Jeje", "15:55am", "pushrank ga?", "--------------------------------------------------------------------------------------" ));

        userList.add(new ModelClass(R.drawable.d, "Nisa", "16:45am", "oke", "--------------------------------------------------------------------------------------" ));

        userList.add(new ModelClass(R.drawable.e, "Mutty", "19:00am", "siapp", "--------------------------------------------------------------------------------------" ));

        userList.add(new ModelClass(R.drawable.a, "Funi", "10:45am", "hayy", "--------------------------------------------------------------------------------------" ));

        userList.add(new ModelClass(R.drawable.b, "Alya", "`12:50am", "login yuk", "--------------------------------------------------------------------------------------" ));

        userList.add(new ModelClass(R.drawable.c, "Jeje", "15:55am", "pushrank ga?", "--------------------------------------------------------------------------------------" ));

        userList.add(new ModelClass(R.drawable.d, "Nisa", "16:45am", "oke", "--------------------------------------------------------------------------------------" ));



    }

    private void initRecyclerView() {

        recyclerView.findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}