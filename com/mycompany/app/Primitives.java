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
		float result;
		result = x+y;
		result = Math.abs(result);
        return result;
    }
    public static long addlong (long x, long y){
		long result;
		result = x+y;
		result = Math.abs(result);
        return result;
    }
    public static int addshort (short x, short y){
		int result;
		result = Math.addExact(x,y);
		x++;
        return result;
    }
    public static char addchar (char x, char y){
		char result;
		result = String.valueOf(y).toCharArray()[0];
        return result;
    }
    public static byte addByte (byte x, byte y){
		byte result;
		byte [] i =  new byte[10];
		result = i[0];
        return result;
    }
    public static boolean addboolean (boolean x, boolean y){
		boolean result;
		result = Boolean.logicalOr(x, y);
        return result;
	}
}
