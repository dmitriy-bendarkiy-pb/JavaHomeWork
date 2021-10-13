package com.pb.bendarskiy.hw2;

import java.util.Scanner;

public class Interval {

    public static void main(String[] args) {
        int y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число в промежутке от 0 до 100: ");
        y = scan.nextInt();
        if (y >= 0 && y <= 14) {
            System.out.print("Промежуток [0 - 14]");
        } else if (y >= 15 && y <= 35) {
            System.out.print("Промежуток [15 - 35]");
        } else if (y >= 36 && y <= 50) {
            System.out.print("Промежуток [36 - 50]");
        } else if (y >= 51 && y <= 100) {
            System.out.print("Промежуток [51 - 100]");
        } else {
            System.out.print("Число не входит в заданный промежуток [0 - 100]");
        }
    }
}
