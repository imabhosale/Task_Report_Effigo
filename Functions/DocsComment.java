package Functions;

public class DocsComment {
    public static void main(String[] args) {
        
    }

    /**  doc comment 
     * function name : greet
     * inside the function:
     * print hii
     */
    public static void greet(){
        System.out.println("HII");
    }

    /**
     * Fuction name: greetingWithname
     * Inside the function:
     * greeting with name and age
     * @param name
     * @param age
     */
    public static void greetingWithname(String name , int age){
        System.out.println("Hi "+name+" welcome "+ " you are "+age+" years old.");
    }
    
}
