package ru.bstu.iitus.vt41.lopin.lb1;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Scanner;

@EqualsAndHashCode(callSuper = true)
@Data
public class Camera extends Technique {
    private float cameraResolution;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        System.out.print("Введите разрешение снимков камеры(Мп) ");
        setCameraResolution(scanner.nextFloat());
    }

    @Override
    public String toString(){
        return "Имя: " + super.getNameProduct()+ ", Стоимость: " + super.getCostProduct() +
                ", Автономность:" + super.isAutonomy() + ", Разрешение снимков камеры: " + this.getCameraResolution();
    }

}
