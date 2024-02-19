package ru.sber.base.syntax;

public class Task8 {
    public static void main(String[] arg) {
        int[] num = new int[30];
        for (int i = 1; i < 30; i++) {
            double n = Math.round(1000 * Math.random());
            num[i] = (int) n;
        }
        for (int i = 1; i < 30; i++) {
            System.out.print(num[i] + "  ");
        }
        int tmp;
        for(int i = 1; i < 30; i++){
            for(int j = 29; j > i; j--){
                if(num[j] < num[j-1]){
                    tmp = num[j];
                    num[j] = num[j-1];
                    num[j-1] = tmp;
                }
            }
        }
        System.out.println(" ");
        for (int i = 1; i < 30; i++) {
            System.out.print(num[i] + "  ");
        }
    }
}
