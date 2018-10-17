package bstu.lb1;


import java.util.Scanner;

public class FactoryMethod {
    public static Product InitType(){
        Scanner scan = new Scanner(System.in);
        int type = scan.nextInt();
        Product prod = null;
        switch(type){
            case 1: //"Camera":
                prod = new Camera();
                break;
            case 2: //"Dairy_Prodact":
                prod = new Dairy_product();
                break;
            case 3: //"Kefir":
                prod = new Kefir();
                break;
            case 4: // "Laptop":
                prod = new Laptop();
                break;
            case 5: //"Lego":
                prod = new Lego();
                break;
            case 6: //"Milk":
                prod = new Milk();
                break;
            case 7: //"Technology":
                prod = new Technology();
                break;
            case 8: //"Toy":
                prod = new Toy();
                break;
        }
        return prod;
    }

}
