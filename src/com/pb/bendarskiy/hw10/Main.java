package com.pb.bendarskiy.hw10;

public class Main {
    public static void main(String[] args) {
        NumBox<Float> floatNumbers = new NumBox<>(5);
        System.out.println("Created NumBox with capacity 5 and parameterized by Float:");
        floatNumbers.add((float) 10);
        floatNumbers.add((float) 11);
        System.out.println("Length after 2 added element: " + floatNumbers.length());
        floatNumbers.add((float) 12);
        floatNumbers.add((float) 13);
        floatNumbers.add((float) 14);
        System.out.println("Element with index 1: " + floatNumbers.get(1));
        System.out.println("Length after 5 added element: " + floatNumbers.length());
        System.out.println("Среднее арифметическое среди элементов: " + floatNumbers.average());
        System.out.println("Сумма элементов: " + floatNumbers.sum());
        System.out.println("Максимальный элемент: " + floatNumbers.max());

        System.out.println("_____________________________");

        NumBox<Integer> intNumbers = new NumBox<>(4);
        System.out.println("Created NumBox with capacity 4 and parameterized by Integer:");
        intNumbers.add(10);
        System.out.println("Length after 1 added element: " + intNumbers.length());
        intNumbers.add(11);
        intNumbers.add(12);
        intNumbers.add(13);
        System.out.println("Element with index 1: " + intNumbers.get(1));
        System.out.println("Length after 1 added element: " + intNumbers.length());
        System.out.println("Среднее арифметическое среди элементов: " + intNumbers.average());
        System.out.println("Сумма элементов: " + intNumbers.sum());
        System.out.println("Максимальный элемент: " + intNumbers.max());
        System.out.println("_____________________________");

        System.out.println("Try to add 5th element in Integer NumBox:");
        try {
            intNumbers.add(14);
        } catch (IllegalStateException e) {
            System.out.println("Get exception: " + e.getMessage());
        }
    }
}
