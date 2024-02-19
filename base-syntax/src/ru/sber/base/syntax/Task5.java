package ru.sber.base.syntax;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] arg){
        System.out.print("Введите количество чисел: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n >= 2 && n <= 100){
            int a = 0;
            int b = 1;
            int c;
            System.out.print(a + " " + b + " ");
            for(int i = 2; i < n; i++){
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }else{
            System.out.println("Введено недопустимое число " + n + ". Допустимый диапозон значений: 2 - 100.");
        }
    }
}
