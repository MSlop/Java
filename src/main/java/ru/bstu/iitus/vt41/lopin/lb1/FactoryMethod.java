package ru.bstu.iitus.vt41.lopin.lb1;


import java.util.Scanner;

class FactoryMethod {
    static Product InitType(Scanner scanner) {
        Product prod;
        int number;
        do {
            System.out.println("1 - Камера , 2-Кефир, 3-Ноутбук, 4-Лего, 5-Молоко ");
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
            //todo: ты ни когда не провалишься в default, т.к. верхний do-while тебя не выпустит до тех пор, пока ты не введешь корректное число, default можно убрать
            default:
                System.out.print("Введено не верное число");
                prod = null;
        }
        return prod;
    }

}
