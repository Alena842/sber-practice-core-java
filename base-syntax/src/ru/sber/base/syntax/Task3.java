package ru.sber.base.syntax;

public class Task3 {
    public static void main (String[] arg){
        int n = 3;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 10; j++){
                System.out.print("* ");
            }
            System.out.println();
            for(int j = 0; j < 9; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
