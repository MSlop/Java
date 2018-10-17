package bstu.lb1;

import java.util.Scanner;

public class Dairy_product extends Product{
    @Override
    public void init(Scanner scanner) {
        setCost(scanner.nextInt());
    }

    @Override
    public int getCost() {
        return this.cost;
    }
    @Override
    public boolean canBuy(int cost) {
        return cost > getCost();
}

}
