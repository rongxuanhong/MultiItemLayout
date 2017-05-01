package com.example.hrx.base;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;

/**
 * Created by Administrator on 2017/4/30.
 * 封装的viewholder 用于获取各个item上的控件 采用集合换成取过的控件
 */

public  class BaseViewHolder extends RecyclerView.ViewHolder {
    protected View itemView;
    protected SparseArray<View> list;

    public BaseViewHolder(View itemView) {
        super(itemView);
        this.itemView = itemView;
        list=new SparseArray<>();
    }

    public View  getView(int id) {
        View view=list.get(id);
        if (view==null){
            view=itemView.findViewById(id);
            list.put(id,view);
        }
        return view;
    }
}
