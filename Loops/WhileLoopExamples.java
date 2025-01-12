package Loops;

import java.util.Scanner;

public class WhileLoopExamples {
    //while loop keeps running while condition is true

    public static void main(String[] args) {
        // Example 1: Roll a dice until a 6 is rolled
        // TODO: Write a while loop that simulates rolling a dice until a 6 is rolled
        Scanner sc=new Scanner(System.in);
        int diceroll=-1;
        while(diceroll != 6){
            diceroll=rollDice();
         //   System.out.println(diceroll);
        }

        // Example 2: Generate random numbers between 1 and 100 until a number greater than 90 is generated
        // TODO: Write a while loop that generates random numbers between 1 and 100 until a number greater than 90 is generated

        int num=-1;
        while(!(num > 90)){
            num=generateRandomNumber();
          //  System.out.print(num+" ");
        }
        // Example 3: Keep doubling a random number until it's greater than 1000
        // TODO: Write a while loop that keeps doubling the 'number' variable until it's greater than 1000
        int tocheck1000=generateRandomNumber();
        while(!(tocheck1000 > 1000)){
            tocheck1000 +=  tocheck1000 *2;
            System.out.println(tocheck1000);
        }
    }

    // Function to simulate rolling a dice (returns a random integer between 1 and 6)
    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    // Function to generate a random integer between 1 and 100
    public static int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }
}
