package Oop;

import java.util.Arrays;

public class DealerShip {
    private ObjectWorld[] cars;

    public DealerShip(ObjectWorld[] cars) {
        this.cars=new ObjectWorld[cars.length];
        for(int i=0;i<cars.length;i++){
            this.cars[i]=new ObjectWorld(cars[i]);
        }
        //this.cars = Arrays.copyOf(cars,cars.length);
        //this.cars=cars;
    }

    @Override
    public String toString() {
        // String temp="";
        // for (int i = 0; i < cars.length; i++) {
        //     temp+=cars[i].toString()+" \n";
        // }
       return "DealerShip [cars=" +(Arrays.toString(cars)) + "]";
       
    }
    

    
}
