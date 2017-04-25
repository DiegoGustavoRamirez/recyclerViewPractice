package com.prodevsmx.recyclerviewpractice.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.prodevsmx.recyclerviewpractice.R;
import com.prodevsmx.recyclerviewpractice.adapter.CardsAdapter;
import com.prodevsmx.recyclerviewpractice.model.CardsData;

public class ListActivity extends AppCompatActivity {

    private RecyclerView recView;
    private CardsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recView = (RecyclerView) findViewById(R.id.recList);
        recView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new CardsAdapter(CardsData.getListData(), this);
        recView.setAdapter(adapter);
    }
}
