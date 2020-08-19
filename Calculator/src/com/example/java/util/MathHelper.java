package com.example.java.util;

public class MathHelper {
    public static double addVal(String s1, String s2){
        return Double.parseDouble(s1) + Double.parseDouble(s2);
    }

    public static double subVal(String s1, String s2){
        return Double.parseDouble(s1) - Double.parseDouble(s2);
    }

    public static double mulVal(String s1, String s2){
        return Double.parseDouble(s1) * Double.parseDouble(s2);
    }

    public static double divVal(String s1, String s2){
        return Double.parseDouble(s1) / Double.parseDouble(s2);
    }
}
