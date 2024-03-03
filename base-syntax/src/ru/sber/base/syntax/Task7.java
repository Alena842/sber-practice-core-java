package ru.sber.base.syntax;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] arg){
        double a, b, c, D;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a = ");
        a = in.nextDouble();
        System.out.print("Введите b = ");
        b = in.nextDouble();
        System.out.print("Введите c = ");
        c = in.nextDouble();
        D = b*b - 4*a*c;
        if(D > 0){
            double X1 = (-b + Math.sqrt(D))/2*a;
            double X2 = (-b - Math.sqrt(D))/2*a;
            System.out.println("X1 = " + X1 + "; X2 = " + X2);
        }else if(D == 0){
            double X = (-b + Math.sqrt(D))/2*a;
            System.out.println("X = " + X);
        }else{
            System.out.println("Нет корней");
        }
    }
}
