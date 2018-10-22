package ru.bstu.iitus.vt41.lopin.lb1;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Scanner;

@EqualsAndHashCode(callSuper = true)
@Data
public class Kefir extends Dairy_product {
    private String typeKefir;
    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        System.out.print("Ввелите тип кефира(слабый, кислый и т.д.) ");
        //todo[mslop]: внутри класса использование сеттера оправдано только в том случае, если там есть логика, в данном случае обратиться к полю через this как в классе Product
        setTypeKefir(scanner.next());
    }

    @Override
    public String toString(){
        return "Имя: " + super.getNameProduct()+ ", Стоимость: " + super.getCostProduct() +
                ", Срок годности до :" + super.getShelfLife() + ", Тип Кефира: " + this.getTypeKefir();
    }
}
