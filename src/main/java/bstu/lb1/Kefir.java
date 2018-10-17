package bstu.lb1;

import java.util.Scanner;

public class Kefir extends Dairy_product {
    @Override
    public void init(Scanner scanner) {
        setCost(scanner.nextInt());
    }
}
