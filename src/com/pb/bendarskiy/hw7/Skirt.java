package com.pb.bendarskiy.hw7;

public class Skirt extends Clothes implements WomenClothes{

    public Skirt() {
    }

    public Skirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одевает юбку - " + this);
    }
}
