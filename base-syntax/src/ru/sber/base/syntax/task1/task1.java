package ru.sber.base.syntax.task1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = in.nextLine();
        System.out.println("Hello, " + name);
    }
}
