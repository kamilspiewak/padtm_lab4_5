package com.example.padtm_lab4_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayList<List<String>> target;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] values = new String[] {"Pies", "Kot","Dzik","Lis","Mysz","Wilk"};
        this.target = new ArrayList<java.util.List<String>>();
        this.target.add(Arrays.asList(values));
        this.adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,this.target);
        ListView listview = (ListView) findViewById(R.id.ListView);
        listview.setAdapter(this.adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    public void nowyWpis(MenuItem menuItem){
        Intent intencja = new Intent(this,DodajWpis.class);
        startActivityForResult(intencja,1);
    }
}
