package ru.sber.base.syntax;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args){
        double I = Math.round(Math.random()*(122 - 97) + 97);
        int i = (int)I;
        char a = (char)i;
        Scanner in = new Scanner(System.in);
        while (true) {
            String B = in.next();
            if (B.length() == 1) {
                char b = B.charAt(0);
                int j = (int)b;
                if(i == j){
                    System.out.println("Верно!");
                    System.exit(0);
                }else if(i > j){
                    System.out.println("Ищи букву, которая после нее в алфавите.");
                }else{
                    System.out.println("Ищи букву, которая перед ней в алфавите.");
                }
            } else {
                System.out.println("Введен недопустимый символ");
            }
        }
    }
}
