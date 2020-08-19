package com.example.java.model;

public enum OliveName {

    KALAMATA("Kalamata"), LIGURIAN("Ligurian");

    //to solve the casing issue

    private String name;

    OliveName(String name){
        this.name = name;
    }

    //over ride toString method

    @Override
    public String toString() {
        return name;
    }
}
