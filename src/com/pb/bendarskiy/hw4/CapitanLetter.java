package com.pb.bendarskiy.hw4;

import java.util.Scanner;

public class CapitanLetter {
    static String function(String a) {
        return a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase();
    }

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        StringBuilder Text2 = new StringBuilder();
        System.out.println("Введите предложение:");
        String Text = scan.nextLine();
        String[] TextParts = Text.split((" "));
        for (int i = 0; i < TextParts.length; i++) {
            String Text1 = function(TextParts[i]);
            if (i != 0) {
                Text2.append(" ");
            }
            Text2.append(Text1);
        }
        System.out.println(Text2);

    }
}