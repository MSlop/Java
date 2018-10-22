package ru.bstu.iitus.vt41.lopin.lb1;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Scanner;

@EqualsAndHashCode(callSuper = true)
@Data
public class Technique extends Product {
    private boolean Autonomy; //todo[mslop]: не по конвенции, именование переменных с маленькой буквы
    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        //todo[mslop]: внутри класса использование сеттера оправдано только в том случае, если там есть логика, в данном случае обратиться к полю через this как в классе Product
        setAutonomy(Check.checkBoolean(scanner,"Введите может ли эта техника работать автономно(true/false) "));
    }

}
