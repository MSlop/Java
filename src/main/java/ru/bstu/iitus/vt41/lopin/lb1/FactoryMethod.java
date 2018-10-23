package ru.bstu.iitus.vt41.lopin.lb1;


import java.util.Scanner;

class FactoryMethod {
    static Product InitType(Scanner scanner) {
        Product prod = null;
        int number;
        do {
            System.out.println(TypeProductEnum.showAllTypeProduct());
            number = scanner.nextInt();
        } while (number < 1 || number > TypeProductEnum.values().length);
        switch (TypeProductEnum.from(number)) {
            case CAMERA:
                prod = new Camera();
                break;
            case KEFIR:
                prod = new Kefir();
                break;
            case LAPTOP:
                prod = new Laptop();
                break;
            case LEGO:
                prod = new Lego();
                break;
            case MILK:
                prod = new Milk();
                break;
        }
        return prod;
    }

}
