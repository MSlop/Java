package bstu.lb1;


import java.util.Scanner;

public class FactoryMethod {
    public static Product InitType(){
        Scanner scan = new Scanner(System.in);
        int type = scan.nextInt();
        System.out.print("1 - Камера , 2-Кефир, 3-Ноут, 4-Лего, 5-Молоко");
        Product prod = null;
        switch(type){
            case 1: //"Camera":
                prod = new Camera();
                break;
            case 2: //"Kefir":
                prod = new Kefir();
                break;
            case 3: // "Laptop":
                prod = new Laptop();
                break;
            case 4: //"Lego":
                prod = new Lego();
                break;
            case 5: //"Milk":
                prod = new Milk();
                break;
            default: System.out.print("Error");
                    prod = null;
        }
        return prod;
    }

}
