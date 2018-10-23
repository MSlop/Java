package ru.bstu.iitus.vt41.lopin.lb1;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

@EqualsAndHashCode(callSuper = true)
@Data
class DairyProduct extends Product{
    private Date shelfLife;
    @Override
    public void init(Scanner scanner){
        super.init(scanner);
        System.out.print("Введите срок годности(последний день) в формате dd/mm/yyyy ");
        try {
            this.setShelfLife(new SimpleDateFormat("dd.MM.yyyy").parse(scanner.next()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    String printDateShelfLife(){
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        return  df.format(getShelfLife().getTime());
    }
}
