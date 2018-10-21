package ru.bstu.iitus.vt41.lopin.lb1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        Scanner scanner = new Scanner(System.in);
        int num = Check.checkPositiveInteger(scanner,"Введите положительное число продуктов ");
        for (int i = 0; i < num; i++) {
            products.add(FactoryMethod.InitType(scanner));
            products.get(i).init(scanner);
        }
        System.out.println("Минимальная цена - " + searchMaxCost(products));
    }

    private static Product searchMaxCost(List<Product> products) {
        int maxCostProductIndex = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getCostProduct() > products.get(maxCostProductIndex).getCostProduct()) {
                maxCostProductIndex = i;
            }
        }
        return products.get(maxCostProductIndex);
    }
}
