package com.app.appsquadztraino;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DayThreeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DataModel> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_three);

        for (int i = 0; i < 50; i++) {
            DataModel model = new DataModel();
            model.setMini("mini:" + i);
            model.setMainTittle("main:" + i);
            model.setDesc("Desc:" + i);
            data.add(model);
        }

        recyclerView = findViewById(R.id.my_list);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));

        //  recyclerView.setLayoutManager(new GridLayoutManager(this, 2));


        RecyclerAdapter adapter = new RecyclerAdapter(this,data);
        recyclerView.setAdapter(adapter);
    }

}
