package com.example.demo;

public class phonetester {
    public static void main(String[] args) {
        galaxy s9 = new galaxy("S9", 99, "T-Mobile","RING RING");
        iphone iPhone10 = new iphone("X", 100, "ATT", "Zzz zzz zzz");
        s9.displayInfo();
        iPhone10.displayInfo();
    }
}