package bstu.lb1;

import java.util.Scanner;

public class Milk extends Dairy_product {

    private String typeMilk;

    public void getTypeMilk(String typeMilk){
        this.typeMilk = typeMilk;
    }

    public void setTypeMilk(String typeMilk) {
        this.typeMilk = typeMilk;
    }

    @Override
    public void init(Scanner scanner) {
        setCost(scanner.nextInt());
        setTypeMilk(scanner.next());
    }
}
