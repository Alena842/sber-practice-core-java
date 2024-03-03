package ru.sber.base.syntax;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] arg){
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num <= 1){
            System.out.println("Нет");
            return;
        }
        for(int i = 2; i < num/2; i++){
            if(num%i == 0){
                System.out.println("Нет");
                return;
            }
        }
        System.out.println("Да");
    }
}
