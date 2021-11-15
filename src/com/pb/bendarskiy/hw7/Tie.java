package com.pb.bendarskiy.hw7;

public class Tie extends Clothes implements ManClothes {

    public Tie() {
    }

    public Tie(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одевает галстук - " + this);
    }
}
