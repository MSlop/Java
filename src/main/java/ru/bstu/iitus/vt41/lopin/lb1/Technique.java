package ru.bstu.iitus.vt41.lopin.lb1;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Scanner;

@EqualsAndHashCode(callSuper = true)
@Data
public class Technique extends Product {
    private boolean Autonomy;
    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        setAutonomy(Check.checkBoolean(scanner,"Введите может ли эта техника работать автономно(true/false) "));
    }

}
