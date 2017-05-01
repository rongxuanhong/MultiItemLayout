package com.example.hrx.base;

import android.view.View;

/**
 * Created by Administrator on 2017/4/30.
 * 泛型化T 表示各个item的类型 子类必须指定类型
 */

public abstract class BetterViewHolder<T> extends BaseViewHolder {
    public BetterViewHolder(View itemView) {
        super(itemView);
    }

    /**
     * 绑定item的数据
     * @param t 每个item的实体引用
     */
    public abstract void bindDataToItem(T t,int position);
}
