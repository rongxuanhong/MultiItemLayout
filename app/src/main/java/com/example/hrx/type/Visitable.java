package com.example.hrx.type;

/**
 * Created by Administrator on 2017/4/30.
 * 定义抽象的被访问者 type方法，用来接收/引用一个抽象访问者对象,以便利用这个对象进行操作;
 */

public abstract class Visitable {
    public abstract int type(TypeFactory factory);
}
