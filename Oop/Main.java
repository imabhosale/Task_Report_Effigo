package Oop;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        
        
        ObjectWorld[] cars=new ObjectWorld[]{
            new ObjectWorld("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
            new ObjectWorld("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
            new ObjectWorld("Nissan", 5000, 2017, "yellow", new String[] {"tires", "filter"}),
            new ObjectWorld("Honda", 7000, 2019, "orange", new String[] {"tires", "filter"}),
            new ObjectWorld("Mercedes", 12000, 2015, "jet black", new String[] {"tires", "filter", "transmission"})
    
        };
        DealerShip dealerShip=new DealerShip(cars);
        
        cars[3]=new ObjectWorld("Hyundai", 7000, 2019, "orange", new String[] {"tires", "filter"});
       
        System.out.println(dealerShip);
        System.out.println("\n");
        System.out.println(Arrays.toString(cars));

    }       
}
