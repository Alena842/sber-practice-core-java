package ru.sber.base.syntax;

import java.util.Scanner;
import java.util.Locale;

public class Task9 {
    public static void main(String[] args){
        double I = Math.round(Math.random()*(122 - 97) + 97);
        int i = (int)I;
        char a = (char)i;
        Scanner in = new Scanner(System.in);
        while (true) {
            String B = in.next().toLowerCase();
            if (B.length() == 1) {
                char b = B.charAt(0);
                if(b >= 'a' && b <= 'z') {
                    if (a == b) {
                        System.out.println("Верно!");
                        return;
                    } else if (b <= a) {
                        System.out.println("Ищи букву, которая после нее в алфавите.");
                    } else {
                        System.out.println("Ищи букву, которая перед ней в алфавите.");
                    }
                }else {
                    System.out.println("Введен недопустимый символ");
                }
            }else {
                System.out.println("Введен недопустимый символ");
            }
        }
    }
}
