
import Product.Shirt;
import static Product.Shirt.Size.*;

import Product.Pants;
import Product.Product;
public class Main {   
    public static void main(String[] args) {
        Shirt s1=new Shirt(12.0, "black", "Nike", LARGE);
      
        s1.fold();

        Pants p=new Pants(100.0, "Red", "Levis", 21, 23);
       
        productStore(s1);
        productStore(p);
        p.fold();
    }

    public static void productStore(Product p){
        System.out.println("thank you for "+p.getBrand()+" "+p.getClass().getSimpleName().toLowerCase()+" your total price is "+p.getPrice());
        p.wear();
    }

    // public static void ShirtStore(Shirt s){
    //     System.out.println("thank you for "+s.getBrand()+" shirt your total price is "+s.getPrice());
    // }

    // public static void pantStore(Pants p){
    //     System.out.println("Thank you for "+p.getBrand()+" pants your total price comes to be "+p.getPrice());
    // }

}