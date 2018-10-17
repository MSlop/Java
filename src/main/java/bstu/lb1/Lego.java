package bstu.lb1;

import java.util.Scanner;


public class Lego extends Toy {
    @Override
    public void init(Scanner scanner) {
        setCost(scanner.nextInt());
        setNameToy(scanner.next());
    }
}
