package Functions;

public class CalculateArea {
    public static void main(String[] args) {
        System.out.println(calculateArea(2.9, 9.0));
        //the values passed while calling function are callled arguments
        System.out.println(findlanguage("Spanish"));
    }

    public static double calculateArea(Double l , Double b){
      //  values in method are called parameters
      //function is used parameters to execute its tasks
        System.out.println("calculating area : "+l*b);
        return l*b;
      
    }

//     English 
 
// French 

// Spanish 

public static String findlanguage(String l){
    switch (l) {
        case "English":
            return "Area equals length * width";
        case "Spanish":
            return "area es igual a largo * ancho";
        case "French":
            return "La surface est egale a la longueur * la largeur";
        default:
            return " ";
    }
}
}
