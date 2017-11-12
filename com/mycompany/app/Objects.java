package com.mycompany.app;

public class Objects {

    public static String createStringFrom(String x) {
		String string = x;
        return string;
    }
    public static String equalsStrings(String x, String y) {
        String string =  x == y && x.equals(y);
        return string;
    }
    public static String Factory(){
        return new String();
    }
}   