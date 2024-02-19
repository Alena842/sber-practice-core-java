package ru.sber.base.syntax;

public class Task6 {
    public static void main(String[] arg){
        int[] num = new int[100];
        int numMax = 0;
        int iMax = 0;
        int sum = 0;
        for(int i = 1; i < 100; i++){
            double n = Math.round(1000 * Math.random());
            num[i] = (int)n;
            if(numMax < num[i]){
                numMax = num[i];
                iMax = i;
            }
            sum = sum + num[i];
        }
        //for(int i = 1; i < 100; i++){
        //    System.out.print("n[" + i + "] = " + num[i] + "   ");
        //}
        //System.out.println();
        System.out.println("Максимальное значение = " + numMax + " находится в элементе под индексом " + iMax);
        System.out.println("Среднее значение = " + sum/100);
    }
}
