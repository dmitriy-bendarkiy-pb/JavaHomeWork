package com.pb.bendarskiy.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes {

    public Pants() {
    }

    public Pants(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одевает штаны - " + this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одевает штаны - " + this);
    }

}
