package com.example.student.baitap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    private Item[] Data = new Item[] {
            new Item("https://shopee.vn/", "h1"),
            new Item("https://www.youtube.com/?gl=VN", "h2"),
            new Item("https://vi-vn.facebook.com/", "h3"),

            new Item("https://www.instagram.com/?hl=vi", "h4"),
            new Item("https://vntaobao.com/", "h5"),
            new Item("https://www.w3schools.com/", "h6"),

            new Item("https://teamtreehouse.com/", "h7"),
            new Item("https://nodejs.org/en/", "h8"),
            new Item("https://github.com/", "h9"),
            new Item("http://www.hui.edu.vn/vi/sinh-vien-fi23", "h10"),
            new Item("https://www.lazada.vn/", "h11"),
            new Item("https://tiki.vn/", "h12"),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListView();
    }

    private void initListView() {
        gridView = findViewById(R.id.gridView);
        ItemListView adapter = new ItemListView(this, Data);
        gridView.setAdapter(adapter);
    }
}

