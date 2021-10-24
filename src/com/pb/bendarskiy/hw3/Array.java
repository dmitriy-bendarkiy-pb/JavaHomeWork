package com.pb.bendarskiy.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sumElement = 0;
        int moreNull = 0;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + (i + 1) + "-й элемент массива: ");
            array[i] = scan.nextInt();
            sumElement = sumElement + array[i];
            if (array[i] > 0) {
                moreNull = moreNull + 1;
            }
        }
        int n = array.length;
        int temp;
        int[] arraySort;
        arraySort = array;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    arraySort[j] = temp;
                }

            }
        }
        System.out.println("Массив до сортировки: " + Arrays.toString(array));
        System.out.println("Массив после сортировки: " + Arrays.toString(arraySort));
        System.out.println("Количество положительных элементов: " + moreNull);
        System.out.println("Сумма элементов массива: " + sumElement);
    }
}