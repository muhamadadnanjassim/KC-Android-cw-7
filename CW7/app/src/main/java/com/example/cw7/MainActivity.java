package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<item> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        item S1 = new item("chees", 5.3,R.drawable.cheese);
        item S2 = new item("chocolate",2.1,R.drawable.chocolate);
        item S3 = new item("coffee",3,R.drawable.coffee);
        item S4 = new item("donut",2.5,R.drawable.donut);
        item S5 = new item("fries",1.4,R.drawable.fries);
        item S6 = new item("honey",5,R.drawable.honey);

        items.add(S1);
        items.add(S2);
        items.add(S3);
        items.add(S4);
        items.add(S5);
        items.add(S6);

        ListView ListView = findViewById(R.id.listview);

        ItemAdapter i = new ItemAdapter(this,0,items);

        ListView.setAdapter(i);
    }
}