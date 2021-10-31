package com.pb.bendarskiy.hw5;

import java.util.Arrays;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Война и Мир", "Л.Н.Толстой", 1867);
        Book book2 = new Book("Мастер и Маргарита", "М.А.Булгаков", 1966);
        Book book3 = new Book("Преступление и наказание", "Ф.М. Достоевский", 1866);
        Book book4 = new Book("Идиот", "Ф.М. Достоевский", 1868);


        Reader reader1 = new Reader("Иванов И.И.", "11", "ЕМС", 1995, "380501234567");
        Reader reader2 = new Reader("Петров П.П.", "22", "ЕМС", 1997, "380971234567");
        Reader reader3 = new Reader("Александров А.А.", "33", "ЕМС", 1999, "380631234567");

        System.out.println("Перечень читателей:");
        System.out.println("1. " + reader1.getInfo());
        System.out.println("2. " + reader2.getInfo());
        System.out.println("3. " + reader3.getInfo());

        System.out.println("Перечень книг:");
        System.out.println("1. " + book1.getInfo());
        System.out.println("2. " + book2.getInfo());
        System.out.println("3. " + book3.getInfo());
        System.out.println("4. " + book4.getInfo());

        reader1.takeBook(reader1.getFio(), 3);

        String[] array = new String[4];
        array[0] = book1.getNameBook();
        array[1] = book2.getNameBook();
        array[2] = book3.getNameBook();
        array[3] = book4.getNameBook();
        reader2.takeBook(reader2.getFio(), Arrays.toString(array).replace("[", "").replace("]", ""));

        reader3.takeBook(reader3.getFio());
        System.out.println(book1.getInfo() + ", " + book2.getInfo() + ", " + book3.getInfo() + ", "
                + book4.getInfo());

        reader1.returnBook(reader1.getFio(), 2);

        reader2.returnBook(reader2.getFio(), Arrays.toString(array).replace("[", "").replace("]", ""));
        reader3.returnBook(reader3.getFio());
        System.out.println(book1.getInfo() + ", " + book2.getInfo() + ", " + book3.getInfo() + ", "
                + book4.getInfo());
    }
}

