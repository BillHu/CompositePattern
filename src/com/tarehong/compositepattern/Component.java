package com.tarehong.compositepattern;

/**
 * @author billhu
 */
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    /**
     * 打印输出组件
     */
    public abstract void printComponent();

}
