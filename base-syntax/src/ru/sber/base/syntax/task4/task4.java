package ru.sber.base.syntax.task4;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите натуральное целое число: ");
        int number = in.nextInt();

        boolean simple = false;

        if (number > 1) {
            simple = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    simple = false;
                    System.out.println("Нет");
                    break;
                }
            }
        } else System.out.println("Нет");

        if (simple) System.out.println("Да");
    }
}
