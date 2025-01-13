package Oop;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //create an object of class ObjectWorld 
        // ObjectWorld toyota=new ObjectWorld();
        ObjectWorld toyota=new ObjectWorld("Toyota", 12000, 2010, "blue");
        // toyota.carBrand="Toyota";
        // toyota.price=12000;
        // toyota.year=2020;
        // toyota.color="blue";

        // ObjectWorld dodge=new ObjectWorld();
        // dodge.carBrand="Dodge";
        // dodge.price=11000;
        // dodge.color="black";
        // dodge.year=2019;
        ObjectWorld dodge=new ObjectWorld("Dodge", 10000, 2024, "Black");
       // toyota.carBrand="Nissan";//we can directly access the object variables and can change it 
        //to prevent this we can use that variables as private and instaed of accessing directly we can get 
        //thos varialbes by using getters(public methods)  this is called encapsulation

        // System.out.println("This " + toyota.carBrand + " is worth $" + toyota.price + 
        // ". It was built in " + toyota.year + ". It is " + toyota.color + ".\n");
        // System.out.println("This " + dodge.carBrand + " is worth $" + dodge.price + 
        // ". It was built in " + dodge.year + ". It is " + dodge.color + ".\n");

        System.out.println(dodge.getColor()+" "+dodge.getPrice()+" "+dodge.getCarBrand());
        Person ob=new Person("Abhishek","Indian","24-12-2002");
        // ob.seatNo=112121;
        // ob.name="Abhishek";
        // ob.dOB="24-12-2002";
        // ob.nationality="Indian";
        ob.passport=new String[]{String.valueOf(ob.seatNo),ob.name,ob.dOB,ob.nationality};
        System.out.println(ob.name+"  "+ob.dOB+"  "+ob.nationality+" "+ob.seatNo+" "+ Arrays.toString(ob.passport));
    }
}
