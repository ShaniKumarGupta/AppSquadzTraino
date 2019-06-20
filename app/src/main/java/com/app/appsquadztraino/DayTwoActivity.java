package com.app.appsquadztraino;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class DayTwoActivity extends AppCompatActivity {

    List<String> data=new ArrayList<>();
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_two);
        context=this;

        for(int i=0;i<20;i++)
            data.add("Data:"+i);

        ListView myList = findViewById(R.id.my_list);
        ArrayAdapter adapter = new ArrayAdapter(context,R.layout.list_text,data);
        myList.setAdapter(adapter);
    }
}
