package org.example;

import java.util.Random;
import java.util.Scanner;

public class dsff {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("угадай число");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randNum = random.nextInt(1,100);
        System.out.println(randNum);

        while (count < 100) {
            System.out.println("введите число от 1 до 100:");
            int userNum = scanner.nextInt();
            if (userNum < 1 | userNum > 100){
                System.out.println("ошибка: число должно быть от 1 до 100");
                continue;
            } else if (userNum > randNum) {
                System.out.println("моё число меньше");
                count++;
                continue;
            } else if(userNum < randNum) {
                System.out.println("моё число больше");
                count++;
                continue;
            } else {
                System.out.println("отгадано");
                count++;
                System.out.println("вы угадали за " + count + " попыток");
                System.exit(0);
            }
            break;
        }
        System.out.println("вы проиграли число было: " + randNum);
    }
}