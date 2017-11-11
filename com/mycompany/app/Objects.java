package com.mycompany.app;

public class Objects {

    public static String createStringFrom(String x) {
		String str = x;
        return str;
    }
    public static boolean equalsStrings(String x, String y) {
        Boolean str =  x == y && x.equals(y);
        return str;
    }
    public static String Factory(){
           return new String();
    }
}   