package ru.bstu.iitus.vt41.lopin.lb1;


import lombok.Data;

import java.util.Scanner;

@Data
public abstract class Product {
    private String nameProduct;
    private int costProduct;

    public void init(Scanner scanner) {
        System.out.print("Введите имя продукта ");
        this.setNameProduct(scanner.next());
        this.setCostProduct(Check.checkPositiveInteger(scanner, "Введите стоимость продукта "));
    }
}
