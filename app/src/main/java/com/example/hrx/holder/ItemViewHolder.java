package com.example.hrx.holder;

import android.view.View;
import android.widget.TextView;

import com.example.hrx.R;
import com.example.hrx.base.BetterViewHolder;
import com.example.hrx.module.Item;

/**
 * Created by Administrator on 2017/4/30.
 */

public class ItemViewHolder extends BetterViewHolder<Item> {
    TextView text;

    public ItemViewHolder(View itemView) {
        super(itemView);
        text = getView(R.id.textView3);
    }

    @Override
    public void bindDataToItem(Item item, int position) {
        text.setText("我是第" + item.getPosition() + "个item");
    }


}
