package com.pb.bendarskiy.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {

    public Tshirt() {
    }

    public Tshirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одевает футболку - " + this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одевает футболку - " + this);
    }
}
