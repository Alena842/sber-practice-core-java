package ru.sber.base.syntax;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] arg){
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int i1 = 0;
        for(int i = 2; i < num; i++){
            if(num%i == 0){
                System.out.println("Нет");
                System.exit(i1);
            }
        }
        System.out.println("Да");
    }
}
