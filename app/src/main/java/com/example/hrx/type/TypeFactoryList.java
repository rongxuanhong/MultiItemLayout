package com.example.hrx.type;

import android.view.View;

import com.example.hrx.R;
import com.example.hrx.base.BetterViewHolder;
import com.example.hrx.holder.BannerViewHolder;
import com.example.hrx.holder.CategoryViewHolder;
import com.example.hrx.holder.FooterViewHolder;
import com.example.hrx.holder.ItemViewHolder;
import com.example.hrx.module.Banner;
import com.example.hrx.module.Category;
import com.example.hrx.module.Footer;
import com.example.hrx.module.Item;

/**
 * Created by Administrator on 2017/4/30.
 * 具体的访问者实现了抽象访问者的方法
 * 同时onCreateViewHolder也是利用工厂方法模式创建了各个item的viewholder实例
 */

public class TypeFactoryList extends TypeFactory {
    //声明每个item的布局id
    public static final int BANNER = R.layout.banner;
    public static final int CATEGORY = R.layout.category;
    public static final int ITEM = R.layout.item;
    public static final int FOOTER = R.layout.footer;

    @Override
    public int type(Banner banner) {
        return BANNER;
    }

    @Override
    public int type(Category category) {
        return CATEGORY;
    }

    @Override
    public int type(Item item) {
        return ITEM;
    }

    @Override
    public int type(Footer footer) {
        return FOOTER;
    }

    @Override
    public BetterViewHolder onCreateViewHolder(View itemView, int type) {
        BetterViewHolder viewHolder = null;
        switch (type) {
            case BANNER:
                viewHolder = new BannerViewHolder(itemView);
                break;
            case CATEGORY:
                viewHolder = new CategoryViewHolder(itemView);
                break;
            case ITEM:
                viewHolder = new ItemViewHolder(itemView);
                break;
            case FOOTER:
                viewHolder = new FooterViewHolder(itemView);
                break;
            default:
                break;
        }
        return viewHolder;
    }
}
