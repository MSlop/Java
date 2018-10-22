package ru.bstu.iitus.vt41.lopin.lb1;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Scanner;

@EqualsAndHashCode(callSuper = true)
@Data
public class Toy extends Product {
    private int minAge;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        //todo[mslop]: внутри класса использование сеттера оправдано только в том случае, если там есть логика, в данном случае обратиться к полю через this как в классе Product
        setMinAge(Check.checkAge(scanner,"Введите минимальный возраст, при котором можно использовать эту игрушку"));
    }


}
