package ru.bstu.iitus.vt41.lopin.lb1;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Scanner;

@EqualsAndHashCode(callSuper = true)
@Data
public class Lego extends Toy {
    private  String typeLego;
    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        System.out.print("Ввидите тип Лего(STAR WARS, FRIENDS, LEGO DUPLO и т.д) ");
        this.typeLego = scanner.next();
    }

    @Override
    public String toString(){
        return "Имя: " + super.getNameProduct()+ ", Стоимость: " + super.getCostProduct() +
                ", Возрастное ограничение:" + super.getMinAge() + "+, Тип ЛЕГО: " + this.getTypeLego();
    }
}
