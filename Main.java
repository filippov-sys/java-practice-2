package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7, 2, 3, 4, 10, 1));

        while (true) {
            System.out.print("сделайте выбор (1 добавить, 2 удалить из массива): ");
            Scanner scanner = new Scanner(System.in);
            int userchoice = scanner.nextInt();
            switch (userchoice) {
                case 1:
                    dobavlenie(list);
                    continue;
                case 2:
                    udalenye(list);
                    continue;
                default:
                    System.out.print("первого и второго нет");
                    return;
            }
        }
    }

    public static void dobavlenie(ArrayList<Integer> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("напишите число для добавления элемента в конец списка: ");
        int vvod = scanner.nextInt();
        list.add(vvod);
        vivod(list);
    }

    public static void vivod(ArrayList<Integer> list) {
        System.out.println("текущий список: " + list);
    }

    public static void udalenye(ArrayList<Integer> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("напишите индекс который удалим из массива: ");
        int udalyenie = scanner.nextInt();
        if (udalyenie > list.toArray().length) {
            System.out.println("индекс введеный для удаления нет в массиве");
        } else {
            list.remove(udalyenie);
            vivod(list);
        }
    }
}
