package ru.sber.base.syntax.task8;

import java.util.Arrays;

public class task8 {
    public static void main(String[] args) {
        int count = 30;
        int[] arr = new int[count];

        for (int i = 0; i < count; i++)
            arr[i] = (int) (Math.random() * 1001);

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int buf = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buf;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
