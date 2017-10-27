package com.mycompany.app;


public class Primitives 
{
   public static int number = 1;
    public static int addInt (int x, int y){
        int resulti;
        resulti = 
        Math.addExact(y, x);
        ++resulti;
        return resulti;
    }
    public static double addDouble (double x, double y){
        double resultd;
        resultd = x+y;
        if(y > 6){
            --y;
        }
        return resultd;
    }
}
