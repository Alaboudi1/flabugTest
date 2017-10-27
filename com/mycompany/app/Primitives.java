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
        double result;
        result = x+y;
        return result;
    }
    public static float addFloat (float x, float y){
		float resultf;
		resultf = x+y;
		resultf = Math.abs(resultf);
        return resultf;
		
    }
    public static long addlong (long x, long y){
		long result;
		result = x+y;
		result = Math.abs(result);
        return result;
		
	}
}
