package bstu.lb1;


import java.util.Scanner;

public class Application{
    public  static void main(String[] args) {
        Product product = null;
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        Product[] arr_prod = new Product[num];
        for (int i=0; i<num; i++){
            product = FactoryMethod.InitType();
            product.init(in);
            arr_prod[i] = product;
        }
        if (arr_prod != null){
            Product MaxObject = arr_prod[0];
            int maxCost = MaxObject.getCost();
            for (int i=1; i<num; i++){
                if (arr_prod[i].getCost() > maxCost ){
                    MaxObject =  arr_prod[i];
                }
            }
            MaxObject.toString();
            System.out.print(MaxObject.getCost());

        }

    }

}
