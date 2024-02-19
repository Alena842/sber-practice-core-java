package ru.sber.base.syntax;

import java.util.Scanner;

public class Task2 {
    public static void main (String[] arg){
        System.out.println("Введите количество чисел: ");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int a = 7;
        if(i > 0 && i <= 500){
            for(int j = 0; j < i; j++){
                System.out.print(a);
                System.out.print(" ");
                a = a + 7;
            }
        }else{
            System.out.println("Введено недопустимое число " + i + ". Допустимый диапозон значений: 1 - 500.");
        }

    }
}
