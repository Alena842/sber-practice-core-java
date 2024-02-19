package ru.sber.base.syntax;

import java.util.Scanner;

public class Task1 {
    public static void main (String[] arg){
        System.out.println("Введите ваше имя: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
