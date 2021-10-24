package com.pb.bendarskiy.hw3;

import java.util.Scanner;
import java.util.Random;

public class Bingo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int x = random.nextInt(101);
        int operand;
        for (int i = 1; ; i++) {
            System.out.println("Введите число от 0 до 100: ");
            if (scan.hasNextInt()) {
                operand = scan.nextInt();
                if (operand == x) {
                    System.out.println("Вы угадали число " + x + "!" + "\n" + "Количество попыток - " + i);
                    break;
                } else if (operand > 100 || operand < 0) {
                    System.out.println("Введенное число не соответствует диапазону чисел: 0-100." + "\n" + "Чтобы завершить программу введите любую букву");
                } else if (operand > x) {
                    System.out.println("Введенное число больше загаданного." + "\n" + "Чтобы завершить программу введите любую букву");
                } else {
                    System.out.println("Введенное число меньше загаданного." + "\n" + "Чтобы завершить программу введите любую букву");
                }
            } else {
                System.out.println("Программа завершена");
                break;
            }

        }
    }
}