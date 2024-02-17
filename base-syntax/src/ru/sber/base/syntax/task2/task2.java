package ru.sber.base.syntax.task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int count = in.nextInt();

        if (count > 0 && count < 501) {
            for (int i = 1; i <= count; i++) {
                System.out.print(i * 7 + " ");
            }
        } else {
            System.out.println("Введено недопустимое число " + count);
            System.out.println("Допустимый диапозон значений: [1; 500]");
        }
    }
}
