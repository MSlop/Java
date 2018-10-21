package ru.bstu.iitus.vt41.lopin.lb1;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Scanner;

@EqualsAndHashCode(callSuper = true)
@Data
public class Milk extends Dairy_product {

    private String typeMilk;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        System.out.print("Введите тип молока(натуральное, восстановленное, овечье, козье и т.д) ");
        setTypeMilk(scanner.next());
    }

    @Override
    public String toString(){
        return "Имя: " + super.getNameProduct()+ ", Стоимость: " + super.getCostProduct() +
                ", Срок годности до :" + super.printDateShelfLife() + ", Тип молока: " + this.getTypeMilk();
    }
}
