package com.example.hrx.module;

import com.example.hrx.type.TypeFactory;
import com.example.hrx.type.Visitable;

/**
 * Created by Administrator on 2017/4/30.
 */

public class Category extends Visitable {
    @Override
    public int type(TypeFactory factory) {
        return factory.type(this);
    }
}
