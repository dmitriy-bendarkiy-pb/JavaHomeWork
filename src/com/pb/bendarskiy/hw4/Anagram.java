package com.pb.bendarskiy.hw4;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое предложение:");
        String Text1 = scan.nextLine();
        Text1 = Text1.replaceAll("\\p{Punct}+|\\s+", "");
        System.out.println("Введите втрое предложение:");
        String Text2 = scan.nextLine();
        Text2 = Text2.replaceAll("\\p{Punct}+|\\s+", "");
        boolean Result = isAnagram(Text1, Text2);
        if (!Result) {
            System.out.println("Ввведенные предложения не являются анаграммой");
        } else {
            System.out.println("Введенные предложения являются анаграммой");
        }
    }

    static boolean isAnagram(String t1, String t2) {

        if (t1.length() != t2.length()) {
            return false;
        }
        t1 = t1.toLowerCase();
        t2 = t2.toLowerCase();
        char[] c1 = t1.toCharArray();
        char[] c2 = t2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String s1 = new String(c1);
        String s2 = new String(c2);
        return s1.equals(s2);
    }
}