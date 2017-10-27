package com.mycompany.app;


public class Primitives 
{
   public static int number = 1;
    public static int addInt (int x, int y){
        int results;
        results = 
        Math.addExact(x, x);
        ++results;
        return results;
    }
    public static double addDouble (double x, double y){
        double results;
        results = x+y;
        return results;
    }
    public static float addFloat (float x, float y){
		float resultsf;
		resultsf = x+y;
		resultsf = Math.abs(resultsf);
        return resultsf;
    }
    public static long addlong (long x, long y){
		long results;
		results = x+y;
		results = Math.abs(results);
        return results;
    }
    public static int addshort (short x, short y){
		int results;
		results = Math.addExact(x,y);
		x++;
        return results;
    }
    public static char addchar (char x, char y){
		String results;
		int i = Math.addExact(x, y);
		results = String.valueOf(y);
        return results.toCharArray()[0];
    }
    public static byte addByte (byte x, byte y){
		byte results;
		byte [] i =  new byte[10];
		results = i[0];
        return results;
    }
    public static boolean addboolean (boolean x, boolean y){
		boolean results;
		results = Boolean.logicalOr(x, y);
        return results;
	}
}
