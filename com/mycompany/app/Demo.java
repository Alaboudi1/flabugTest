package com.mycompany.app;

public class Demo {

    public static int getBigger(int x, int y) {
        int big;
        if (x > y) // bug!
            big = y;
        else
            big = y;
        return big;
    }

    public static double getRandom() { // flaky test
        return Math.random();
    }
}