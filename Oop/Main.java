package Oop;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        
        ObjectWorld toyota=new ObjectWorld("Toyota", 12000, 2010, "blue");
        
        toyota.drive();


        ObjectWorld dodge=new ObjectWorld("Dodge", 10000, 2024, "Black");
       // toyota.carBrand="Nissan";//we can directly access the object variables and can change it 
        //to prevent this we can use that variables as private and instaed of accessing directly we can get 
        //thos varialbes by using getters(public methods)  this is called encapsulation

      //  ObjectWorld toyota2=toyota;  //instead of this we can create new object by using copy constructor
       // System.out.println(toyota.getColor());
       // toyota2.setColor("Red");
        System.out.println(toyota.getColor()); //copy by reference changing the object of original object

        ObjectWorld toyota2=new ObjectWorld(toyota);
        toyota2.setColor("Red");
         System.out.println(toyota.getColor());
        System.out.println(toyota2.getColor());
        // toyota.setPrice(toyota.getPrice()/2);
        // System.out.println(toyota.getPrice());

        // System.out.println("This " + toyota.carBrand + " is worth $" + toyota.price + 
        // ". It was built in " + toyota.year + ". It is " + toyota.color + ".\n");
        // System.out.println("This " + dodge.carBrand + " is worth $" + dodge.price + 
        // ". It was built in " + dodge.year + ". It is " + dodge.color + ".\n");

        System.out.println(dodge.getColor()+" "+dodge.getPrice()+" "+dodge.getCarBrand());
        Person ob=new Person("Abhishek","Indian","24-12-2002");

       
        ob.passport=new String[]{String.valueOf(ob.seatNo),ob.name,ob.dOB,ob.nationality};
        System.out.println(ob.name+"  "+ob.dOB+"  "+ob.nationality+" "+ob.seatNo+" "+ Arrays.toString(ob.passport));
    }
}
