package Oop;

import java.util.Scanner;
public class Main {
   public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        ObjectWorld[] cars = new ObjectWorld[] {
            new ObjectWorld("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
            new ObjectWorld("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
            new ObjectWorld("Nissan", 5000, 2017, "yellow", new String[] {"tires", "filter"}),
            new ObjectWorld("Honda", 7000, 2019, "orange", new String[] {"tires", "filter"}),
            new ObjectWorld("Mercedes", 12000, 2015, "jet black", new String[] {"tires", "filter", "transmission"})
        };
        
       DealerShip dealership=new DealerShip(cars);
        

        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");        
        System.out.println("Feel free to browse through our collection of cars.\n");
        System.out.println(dealership);
        System.out.println("Which car are you interested in? (0 – 4).\n");
        int index = scan.nextInt();

        // sell car here... 
        dealership.sell(index);

        scan.close();
}
}
