package com.decorator;

/**
 * 2.炒面类
 * 具体的构建角色
 */
public class FriedNoodles extends FastFood{
    public FriedNoodles() {
        super(12, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
