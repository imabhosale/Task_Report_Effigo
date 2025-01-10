package Section3;

public class IfElse {

    public static void main(String[] args) {

        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("Me: Hi Java, did I score better in biology?");
        // Add if-else statement here
        if(biologyGrade > chemistryGrade){
            System.out.println("Yes you did. congrats");
        }else{
            System.out.println("You No");
        }
        double sales = 37.55;
        double costs = 5.55;
        System.out.println("Me: Hi Java, did we make money?");
        // Add if-else statement here
        if(sales > costs){
            System.out.println("Yes u are rich");
        }else{
            System.out.println("You are not");
        }

        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("Me: Hi Java, is the temperature colder than our target?");
        // Add if-else statement here
        if(temperature < targetTemperature){
            System.out.println("Yes temp is colder than usual");
        }else{
            System.out.println("No temp is not colder than usual");
        }
        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("Me: Hi Java, am I driving slower than the speed limit?");
        if(currentSpeed < speedLimit){
            System.out.println("You are driving lower than sl");
        }else{
            System.out.println("pls slow down");
        }
        // Add if-else statement here

        int age = 45;
        int retirementAge = 65;
        System.out.println("Me: Hi Java, am I old enough to retire?");
        // Add if-else statement here
        if(age < retirementAge){
            System.out.println("No you are not enough to retire");
        }else{
            System.out.println("Yes can take retirment");
        }
        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("Me: Hi Java, did I get the best possible grade?");
        if(myGrade >= bestGrade){
            System.out.println(" yers you got best posssible grade");
        }else{
            System.out.println("You did not get best posssible grade");
        }



        String word = "hello";
        String secondWord = "hello";
        System.out.println("Me: Are the two words the same?");
        if(word.equals(secondWord)){
            System.out.println("Yes these are same words");
        }else{
            System.out.println("No these to words are not same");
        }
        // Add if-else statement here

        String thirdWord = "hello";
        String fourthWord = "goodbye";
        System.out.println("Me: Are the two words different");
        if(!thirdWord.equals(fourthWord)){
            System.out.println("Yes these are diff words");
        }else{
            System.out.println("NO these are same words");
        }
        // Add if-else statement here
    }
}
