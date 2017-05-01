package com.example.hrx.type;

import android.view.View;

import com.example.hrx.base.BetterViewHolder;
import com.example.hrx.module.Banner;
import com.example.hrx.module.Category;
import com.example.hrx.module.Footer;
import com.example.hrx.module.Item;

/**
 * Created by Administrator on 2017/4/30.
 * 抽象访问者
 */

public abstract class TypeFactory {
    public abstract int type(Banner banner);

    public abstract int type(Category category);

    public abstract int type(Item item);

    public abstract int type(Footer footer);
    //抽象工厂模式应用
    public  abstract BetterViewHolder onCreateViewHolder(View itemView,int type);
}
