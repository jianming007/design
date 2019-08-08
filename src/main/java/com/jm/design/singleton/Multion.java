package com.jm.design.singleton;

import java.util.ArrayList;

/**
 * 多例类
 */
public class Multion {
    private static ArrayList<Multion> list = new ArrayList<Multion>();

    private static int n;

    private Multion(int n) {
        for (int i = 0; i < n; i++) {
            list.add(new Multion(i));
        }
    }

    public static Multion getRandomInstance() {
        int value = (int) (Math.random() * n);
        return list.get(value);
    }

    public static int getN() {
        return n;
    }


}
