package com.example.hrx;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.hrx.adapter.MainActivityAdapter;
import com.example.hrx.module.Banner;
import com.example.hrx.module.Category;
import com.example.hrx.module.Footer;
import com.example.hrx.module.Item;
import com.example.hrx.type.Visitable;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Visitable> mVisitable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        initData();
        recyclerView.setAdapter(new MainActivityAdapter(mVisitable));
    }

    private void initData() {
        mVisitable=new ArrayList<>();
       //按布局的顺序依次加入各个被访问者
        Banner banner=new Banner();
        mVisitable.add(banner);
        Category category=new Category();
        mVisitable.add(category);
        Item item=new Item();
        mVisitable.add(item);
        Footer footer=new Footer();
        mVisitable.add(footer);
    }
}
