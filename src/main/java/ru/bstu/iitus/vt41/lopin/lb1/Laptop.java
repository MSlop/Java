package ru.bstu.iitus.vt41.lopin.lb1;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Scanner;


@EqualsAndHashCode(callSuper = true)
@Data
public class Laptop extends Technique {
    private float screenSize;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        System.out.print("Введите размер экрана ");
        this.screenSize = scanner.nextFloat();
    }

    @Override
    public String toString(){
        return "Имя: " + super.getNameProduct()+ ", Стоимость: " + super.getCostProduct() +
                ", Автономность:" + super.isAutonomy() +
                 ", Размер экрана: " + this.getScreenSize();
    }

}
