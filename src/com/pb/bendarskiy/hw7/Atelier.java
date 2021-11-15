package com.pb.bendarskiy.hw7;

public class Atelier {

    public static void main(String[] args) {
        Clothes[] clothes = {new Pants(Size.S, 500, "blue"),
                new Skirt(Size.XS, 500, "black"),
                new Tie(Size.M, 500, "gray"),
                new Tshirt(Size.L, 500, "white")};

        dressMan(clothes);
        dressWomen(clothes);
    }

    private static void dressMan(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c instanceof ManClothes) {
                ((ManClothes) c).dressMan();
            }
        }
    }

    private static void dressWomen(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c instanceof WomenClothes) {
                ((WomenClothes) c).dressWomen();
            }
        }
    }
}
