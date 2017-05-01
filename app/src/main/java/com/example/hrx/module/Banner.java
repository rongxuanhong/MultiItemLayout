package com.example.hrx.module;

import com.example.hrx.type.TypeFactory;
import com.example.hrx.type.Visitable;

/**
 * Created by Administrator on 2017/4/30.
 * 具体的被访问者
 * 实现type抽象方法，通过传入的具体访问者参数、调用具体访问者对该对象的访问操作方法实现访问逻辑;
 * 比如这就是利用具体访问者调用操作方法获取对应该Banner关联的布局id
 */

public class Banner extends Visitable{
    @Override
    public int type(TypeFactory factory) {
        return factory.type(this);
    }
}
