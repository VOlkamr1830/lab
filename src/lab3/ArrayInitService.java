package lab3;

import java.util.Scanner;

public class ArrayInitService {

    public int[] init() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розмір множини:");
        int size = scanner.nextInt();
        System.out.println("Введіть елементи множини:");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Ваша множина:");
        for (int i = 0; i < size; i++) {
            System.out.println(" " + array[i]);
        }
        System.out.println();

        return array;
    }
}
