package ru.bstu.iitus.vt41.lopin.lb1;

import java.util.Scanner;

class Check {
    static int checkPositiveInteger(Scanner scanner, String outputText) {
        int num;
        do {
            checkNumber(scanner,outputText);
            num = scanner.nextInt();
        } while (num <= 0);
        return num;
    }


    static int checkAge(Scanner scanner, String outputText) {
        int num;
        do {
            checkNumber(scanner,outputText);
            num = scanner.nextInt();
        } while (num <= 0 || num > 100);
        return num;
    }

    static void checkNumber(Scanner scanner, String outputText){
        System.out.print(outputText);
        while (!scanner.hasNextInt()) {
            System.out.print("Это не число");
            scanner.next();
        }
    }

    static boolean checkBoolean(Scanner scanner, String outputText){
        System.out.print(outputText);
        while (!scanner.hasNextBoolean()) {
            System.out.print("Введено не верно");
            scanner.next();
        }
        return scanner.nextBoolean();
    }
}
