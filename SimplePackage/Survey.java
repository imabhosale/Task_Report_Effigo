package SimplePackage;

import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //*********PART A: PICKING UP THE USER'S ANSWERS*********
        System.out.println("Welcome. Thank you for taking the survey");
        int counter = 0;
        System.out.println("What is your name?");
        String name;
        name=sc.nextLine();


        System.out.println("\nHow much money do you spend on coffee?");
        double coffeePrice;
        coffeePrice=sc.nextDouble();
        counter++;
        

        System.out.println("How much money do you spend on fast food?");
        double foodPrice = sc.nextDouble();

        counter++;



        System.out.println("How many times a week do you buy coffee?");
        int coffeeAmount = sc.nextInt();
        counter++;

        System.out.println("How many times a week do you buy fast food?");
        int foodAmount = sc.nextInt();
        counter++;

        //*********PART B: RESPONDING TO THE USER**********
        System.out.println("Thank you "+name+" for answering all "+counter+ " questions");
        System.out.println("Weekly, you spend "+(coffeeAmount)*(coffeePrice)+" on coffee");
        System.out.println("Weekly, you spend "+(foodAmount)*(foodPrice) +" on food");

        sc.close();

    }
}
