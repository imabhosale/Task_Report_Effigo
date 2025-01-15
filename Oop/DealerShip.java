package Oop;


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
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            String carDescription = this.cars[i].toString();
            temp += carDescription + "\n";
        }
        return temp;
    }


    public void sell(int index){
        cars[index].drive();
        
    }

    
    

    
}
