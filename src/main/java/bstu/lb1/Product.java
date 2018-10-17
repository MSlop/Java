package bstu.lb1;


import java.util.Scanner;

public abstract class Product {
    protected int cost;
    public abstract void init(Scanner scanner);
    public abstract int getCost();

    public void setCost(int cost) {
        this.cost = cost;
    }

    public abstract boolean canBuy(int cost);
    @Override
    public String toString() {
        return Integer.toString(this.cost);
    }

}
