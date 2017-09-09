package com.example.hrx;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
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
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        //默认4列
        final GridLayoutManager manager = new GridLayoutManager(this, 4);
        //此方法定义每个item占几列,有点类似线性布局的权重属性
        manager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                if (position > 2 && position < 7) {
                    return 1;
                }
                return 4;
            }
        });
        recyclerView.setLayoutManager(manager);
        initData();
        recyclerView.setAdapter(new MainActivityAdapter(mVisitable));

    }

    private void initData() {
        mVisitable = new ArrayList<>();
        //按布局的顺序依次加入各个被访问者
        Banner banner = new Banner();
        mVisitable.add(banner);
        Category category = new Category();
        mVisitable.add(category);
        //加入4个item
        for (int i = 0; i < 5; i++) {
            Item item = new Item();
            item.setPosition(i + 2);
            mVisitable.add(item);
        }
        Footer footer = new Footer();
        mVisitable.add(footer);
    }
}
