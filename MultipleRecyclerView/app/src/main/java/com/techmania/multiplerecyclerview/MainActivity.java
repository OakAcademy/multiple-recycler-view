package com.techmania.multiplerecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView1;
    RecyclerView recyclerView2;
    RecyclerView recyclerView3;

    ArrayList<Integer> flagsList = new ArrayList<>();
    ArrayList<String> nameList = new ArrayList<>();

    ArrayList<Integer> animalList = new ArrayList<>();
    ArrayList<String> animalNameList = new ArrayList<>();

    ArrayList<Integer> languageList = new ArrayList<>();
    ArrayList<String> languageNameList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView1 = findViewById(R.id.recyclerView1);
        recyclerView2 = findViewById(R.id.recyclerView2);
        recyclerView3 = findViewById(R.id.recyclerView3);

        recyclerView1.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));
        recyclerView2.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));
        recyclerView3.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));

        fillArray1();
        fillArray2();
        fillArray3();

        AdapterOne adapterOne = new AdapterOne(flagsList,nameList);
        AdapterTwo adapterTwo = new AdapterTwo(animalList,animalNameList);
        AdapterThree adapterThree = new AdapterThree(languageList,languageNameList);

        recyclerView1.setAdapter(adapterOne);
        recyclerView2.setAdapter(adapterTwo);
        recyclerView3.setAdapter(adapterThree);

    }

    public void fillArray1()
    {
        nameList.add("United Kingdom");
        nameList.add("Germany");
        nameList.add("USA");

        flagsList.add(R.drawable.unitedkingdom);
        flagsList.add(R.drawable.germany);
        flagsList.add(R.drawable.usa);
    }

    public void fillArray2()
    {
        animalNameList.add("Bird");
        animalNameList.add("Fish");
        animalNameList.add("Cat");

        animalList.add(R.drawable.bird);
        animalList.add(R.drawable.fish);
        animalList.add(R.drawable.cat);
    }

    public void fillArray3()
    {
        languageNameList.add("Java");
        languageNameList.add("Python");
        languageNameList.add("C#");

        languageList.add(R.drawable.java);
        languageList.add(R.drawable.python);
        languageList.add(R.drawable.csharp);
    }

}