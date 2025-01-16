class Animal{
    public void eat(){
        System.out.println("In eat method ");
    }
}

class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("In eat method");
    }

    public void bark(){
        System.out.println("dog specific method: bark");
    }
}

public class Casting {
    public static void main(String[] args) {
       Animal ob = new Dog();
       if(ob instanceof Dog){
        Dog d=(Dog) ob; 
        d.bark();
       }
           
       
    }
    
}
