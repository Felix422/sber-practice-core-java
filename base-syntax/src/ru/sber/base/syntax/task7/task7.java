package ru.sber.base.syntax.task7;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите коэффициенты квадратного уравнения:");
        System.out.print("a = ");
        double a = in.nextDouble();
        System.out.print("b = ");
        double b = in.nextDouble();
        System.out.print("c = ");
        double c = in.nextDouble();

        double d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("Корней нет");
        } else if (d == 0) {
            System.out.println("x = " + (-b / (2 * a)));
        } else {
            System.out.println("x1 = " + ((-b + Math.sqrt(d)) / (2 * a)));
            System.out.println("x2 = " + ((-b - Math.sqrt(d)) / (2 * a)));
        }
    }
}
