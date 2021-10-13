package com.pb.bendarskiy.hw2;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int operand1;
        int operand2;
        String sign;
        float result;

        System.out.println("Введите первый операнд: ");
        operand1 = scan.nextInt();
        System.out.println("Введите второй операнд: ");
        operand2 = scan.nextInt();
        System.out.println("Введите знак арифметической операции: ");
        sign = scan.next();

        switch (sign) {
            case "+":
                result = operand1 + operand2;
                System.out.println(operand1 + "+" + operand2 + "=" + result);
                break;
            case "-":
                result = operand1 - operand2;
                System.out.println(operand1 + "-" + operand2 + "=" + result);
                break;
            case "*":
                result = operand1 * operand2;
                System.out.println(operand1 + "*" + operand2 + "=" + result);
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Делить на ноль мог только Кернес");
                    break;
                }
                result = (float) operand1 / operand2;
                System.out.println(operand1 + "/" + operand2 + "=" + result);
                break;
            default:
                System.out.println("Ввведен неверный оператор");
        }
    }
}
