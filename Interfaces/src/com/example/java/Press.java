package com.example.java;

import com.example.java.model.Olive;

import java.util.List;

public interface Press {

    public int getOil(List<Olive> olives);

    //abstract class -> define a method and how it looks like, but never defined the functionality
    public void setOil(int oil);
}
