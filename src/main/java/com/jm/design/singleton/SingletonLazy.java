package com.jm.design.singleton;

/**
 * 懒汉式单例模式模拟产生美国当今总统对象
 */
public class SingletonLazy {
    public static void main(String[] args) {
        President president1 = President.getInstance();
        president1.getName();
        President president2 = President.getInstance();
        president2.getName();
        if (president1 == president2) {
            System.out.println("他们是同一人");
        } else {
            System.out.println("他们不是同一人");
        }
    }
}

class President {
    private static volatile President instance = null;

    private President() {
        System.out.println("产生一个总统!");
    }

    public static synchronized President getInstance() {
        if (instance == null) {
            instance = new President();
        } else {
            System.out.println("已经有一个总统,不能产生新总统!");
        }
        return instance;
    }

    public void getName() {
        System.out.println("我是美国总统：特朗普。");
    }

}