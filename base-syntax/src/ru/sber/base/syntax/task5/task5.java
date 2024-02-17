package ru.sber.base.syntax.task5;

import java.util.Arrays;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите n: ");
        int n = in.nextInt();

        if (n > 1 && n < 101) {
            int[] numFi = new int[n];

            for (int i = 0; i < n; i++) {
                if (i < 2) {
                    numFi[i] = i;
                } else {
                    numFi[i] = numFi[i - 1] + numFi[i - 2];
                }
            }

            System.out.println(Arrays.toString(numFi));
        } else {
            System.out.println("Введено недопустимое число " + n);
            System.out.println("Допустимый диапозон значений: [2; 100]");
        }

    }
}
