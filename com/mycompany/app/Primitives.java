package com.mycompany.app;


public class Primitives 
{
   public static int number = 1;
    public static int addInt (int x, int y){
        int result;
        result = 
        Math.addExact(x, x);
        ++result;
        return result;
    }
    public static double addDouble (double x, double y){
        double resultd;
        resultd = x+y;
        if(y > 6){
            --y;
        }
        return resultd;
    }
    public static float addFloat (float x, float y){
		float result;
		result = x+y;
		result = Math.abs(result);
        if(y > 5){
            y++;
        }
        return result;
		
	}
}
