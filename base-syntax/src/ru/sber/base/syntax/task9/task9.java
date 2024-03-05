package ru.sber.base.syntax.task9;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char hideLet = (char) (Math.random() * 26 + 65);
        //System.out.println(hideLet);

        char letter;
        boolean game = true;
        while (game) {
            System.out.print("Введите букву: ");
            letter = in.next().toUpperCase().charAt(0);

            if (letter >= 65 && letter <= 90) {
                if (letter > hideLet) {
                    System.out.println("\nИщи букву, которая перед ней в алфавите");
                } else if (letter < hideLet) {
                    System.out.println("\nИщи букву, которая после неё в алфавите");
                } else {
                    System.out.println("Верно!");
                    game = false;
                }
            } else {
                System.out.println("\nВведён недопустимый символ");
            }
        }
    }
}
