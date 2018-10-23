package ru.bstu.iitus.vt41.lopin.lb1;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Scanner;

@EqualsAndHashCode(callSuper = true)
@Data
public class Kefir extends DairyProduct {
    private String typeKefir;
    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        System.out.print("Ввелите тип кефира(слабый, кислый и т.д.) ");
        setTypeKefir(scanner.next());
    }

    @Override
    public String toString(){
        return "Имя: " + super.getNameProduct()+ ", Стоимость: " + super.getCostProduct() +
                ", Срок годности до :" + super.getShelfLife() + ", Тип Кефира: " + this.getTypeKefir();
    }
}
