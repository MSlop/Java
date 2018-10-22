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
        //todo[mslop]: внутри класса использование сеттера оправдано только в том случае, если там есть логика, в данном случае обратиться к полю через this как в классе Product
        setTypeMilk(scanner.next());
    }

    @Override
    public String toString(){
        return "Имя: " + super.getNameProduct()+ ", Стоимость: " + super.getCostProduct() +
                ", Срок годности до :" + super.printDateShelfLife() + ", Тип молока: " + this.getTypeMilk();
    }
}
