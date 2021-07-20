package com.example.recycleevening1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements itemClickListner{
    private RecyclerView recyclerView;
    private ArrayList<Model> arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        buildData();
        setRecycleview();
    } private void setRecycleview() {
        Adapter view =new Adapter(arrayList,this);
        //GridLayoutManager linearLayoutManager =new GridLayoutManager(this,2);
         LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(view);
    } private void buildData() {
    }

    private void initView() {
        recyclerView=findViewById(R.id.recycleview);
        for(int i =0;i<50;i++) {
            arrayList.add(new Model(R.drawable.article1, "Blue Ocean Waves Crash", "The rules of Travel have altred so much in the last few years ,with the strict regulateion regradint air travel."));
           arrayList.add (new Model(R.drawable.article1, "Blue Ocean Waves Crash", "The rules of Travel have altred so much in the last few years ,with the strict regulateion regradint air travel."));
            arrayList.add(new Model(R.drawable.article1, "Blue Ocean Waves Crash", "The rules of Travel have altred so much in the last few years ,with the strict regulateion regradint air travel."));
        }
    }

    @Override
    public void onitemClicked(Model model) {
        Toast.makeText(MainActivity.this,model.getName(),Toast.LENGTH_SHORT).show();
    }
}