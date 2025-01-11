package Functions;

public class DocsComment {
    public static void main(String[] args) {
        System.out.println("Calculated are is "+calculateArea(2.4, 3.40));
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
     * print  name and age
     * @param name (String)
     * @param age (age)
     */
    public static void greetingWithname(String name , int age){
        System.out.println("Hi "+name+" welcome "+ " you are "+age+" years old.");
    }


    /**
     * Function Name: calculateArea
     * Inside Function : canculate area with l*B
     * @param length (double)
     * @param width (double)
     * @return       (double)
     */
    public static double calculateArea(double length,double width){
        
        return length*width;
    }
    
}
