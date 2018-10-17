package bstu.lb1;

import java.util.Scanner;

public class Toy extends Product {
    private String nameToy;

    public void setNameToy(String nameToy) {
        this.nameToy = nameToy;
    }

    public String getNameToy() {
        return nameToy;
    }

    @Override
    public void init(Scanner scanner) {
        setCost(scanner.nextInt());
        setNameToy(scanner.next());
    }

    @Override
    public int getCost() {
        return this.cost;
    }

    @Override
    public boolean canBuy(int cost) {
        return false;
    }
}
