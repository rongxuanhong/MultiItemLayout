package com.example.hrx.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.hrx.base.BetterViewHolder;
import com.example.hrx.type.TypeFactory;
import com.example.hrx.type.TypeFactoryList;
import com.example.hrx.type.Visitable;

import java.util.List;

/**
 * Created by Administrator on 2017/4/30.
 */

public class MainActivityAdapter extends RecyclerView.Adapter<BetterViewHolder> {
    private List<Visitable> mVisitables;
    private TypeFactory factory;

    public MainActivityAdapter(List<Visitable> mVisitables) {
        this.mVisitables = mVisitables;
        factory = new TypeFactoryList();
    }
    //此ViewHolder的创建细节已经抽象到TypeFactoryList中去实现了 此处等同与获取工厂生产的产品
    @Override
    public BetterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = View.inflate(parent.getContext(), viewType, null);
        return factory.onCreateViewHolder(itemView, viewType);
    }
    //此处的实现交由BetterViewHolder的各个子类去实现，故此处JAVA会根据相应的子类去获取其下实现的bindDataToItem（）
    //利用JAVA动态分派而无需进行类型检查
    @Override
    public void onBindViewHolder(BetterViewHolder holder, int position) {
        holder.bindDataToItem(mVisitables.get(position),position);
    }

    //此处即代表访问者模式中的客户端调用被访问者的type()，进行访问操作获取其布局id
    @Override
    public int getItemViewType(int position) {
        return mVisitables.get(position).type(factory);
    }

    @Override
    public int getItemCount() {
        return mVisitables.size();
    }
}
