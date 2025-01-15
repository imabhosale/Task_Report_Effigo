package Oop;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
    ObjectWorld[] cars = new ObjectWorld[] {
        new ObjectWorld("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
        new ObjectWorld("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
        new ObjectWorld("Nissan", 5000, 2017, "yellow", new String[] {"tires", "filter"}),
        new ObjectWorld("Honda", 7000, 2019, "orange", new String[] {"tires", "filter"}),
        new ObjectWorld("Mercedes", 12000, 2015, "jet black", new String[] {"tires", "filter", "transmission"})
    };
    DealerShip dealership = new DealerShip(cars);
     // Get a deep copy of the car at index 0
    ObjectWorld carAtIndex0 = dealership.getObjectWorld(0);
        System.out.println("Original car make: " + carAtIndex0.getCarBrand());


        // Modify the car's make
        carAtIndex0.setCarBrand("Toyota");
        System.out.println("Modified car make: " + carAtIndex0.getCarBrand());

        // Verify that the car in the dealership is not affected
        System.out.println("Dealership car make: " + dealership.getObjectWorld(0).getCarBrand());

    // Create a new Car object
    ObjectWorld newCar = new ObjectWorld("BMW", 10000, 2018, "silver", new String[] {"tires", "filter", "transmission"});

    // Set the car at index 1 in the dealership to a deep copy of the newCar
    dealership.setObjectWorld(1, newCar);

    // Verify that the car at index 1 in the dealership has been updated
    System.out.println("Dealership car make at index 1: " + dealership.getObjectWorld(1).getCarBrand());

    // Modify the newCar object
    newCar.setCarBrand("Audi");

    // Verify that the car in the dealership is not affected
    System.out.println("Dealership car make at index 1 after modifying newCar: " + dealership.getObjectWorld(1).getCarBrand());

    }
}
