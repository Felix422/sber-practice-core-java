package ru.sber.base.syntax.task6;

public class task6 {
    public static void main(String[] args) {
        int count = 100;
        int[] arr = new int[count];
        int max = -1;
        int maxI = 0;
        double sum = 0;

        for (int i = 0; i < count; i++) {
            arr[i] = (int) (Math.random() * 1001);

            if (arr[i] > max) {
                max = arr[i];
                maxI = i;
            }

            sum += arr[i];
        }

        System.out.println("Максимальное значение = " + max + " находится под номером " + (maxI + 1));
        System.out.println("Среднее значение = " + sum / count);
    }
}
