package com.mycompany.app;


public class Primitives 
{
   public static int number = 1;
    public static int addInt (int x, int y){
        int result;
        result = 
        Math.addExact(x, x);
        result++;
        return result;
    }
    public static double addDouble (double x, double y){
        double res;
        res = x+y;
        if(x > 5){
            x++;
        }
        return res;
    }
}
