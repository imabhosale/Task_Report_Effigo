package Loops;

import java.util.Scanner;

public class BlackJack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        scan.nextLine();
        // Task 3 – Wait for the user to press enter.
        // Task 4 – Get two random cards.
        int card1 = generateRandomNumber();
        int card2 = generateRandomNumber();
        System.out.println("\n" + " You get a \n" + 
                "\" " + cardString(card1) + "\n" + //
                " and a \n" + //
                "\n" + cardString(card2));

        // – Print them: \n You get a \n" + <randomCard> + "\n and a \n" + <randomCard>

        // Task 5 – Print the sum of your hand value.
        // – print: your total is: <hand value>
        int totalSumUser=Math.min(card1,10)+Math.min(10, card2);
        System.out.println("The sum of the hand value is "+card1+" and "+card2+" and total is "+totalSumUser);


        // Task 6 – Get two random cards for the dealer.
        int dealerCard1=generateRandomNumber();
        int dealerCard2=generateRandomNumber();
        System.out.println("The dealer shows \n" +""+cardString(dealerCard1)+" \n" + //
                        "and has a card facing down\r \n" + //
                        "        \n" +faceDown());
        // – Print: The dealer shows \n" + <first card> + "\nand has a card facing down
        // \n" + <facedown card>
        // – Print: \nThe dealer's total is hidden

        int dealerTotalSum=Math.min(dealerCard1,10)+Math.min(dealerCard2,10);
        System.out.println("The dealers toatl is hidden");
        // Task 8 – Keep asking the player to hit or stay (while loop).
        // 1. Every time the player hits
        // – draw a new card.
        // – calculate their new total.
        // – print: (new line) You get a (new line) <show new card>.
        // - print: your new total is <total>
        if(totalSumUser > 21){
            System.out.println("Bust . Player Loses ....!");
            System.exit(0);
        }

        while(true){
            String response = hitOrStay();
            if(response.equals("stay")){
                break;
            }
            if(response.equals("hit")){
                int newCard=generateRandomNumber();
                totalSumUser+=Math.min(newCard,10);
                System.out.println("\n U get a \n"+cardString(newCard));
                System.out.println("Your total is now :"+totalSumUser);

                if(totalSumUser > 21){
                    System.out.println("Bust..! player Losses");
                    System.exit(0);
                }
            }

           
        }

        System.out.println("Dealers Turn:  \n");
        System.out.println("The dealers first card is "+dealerCard1+" \n"+" and second card"+"\n "+dealerCard2);
        while(dealerTotalSum < 17){
            int newCard=generateRandomNumber();
            System.out.println("\n Dealers new card that added \n"+cardString(newCard));
            dealerTotalSum+=Math.min(newCard,10);
            System.out.println("Dealers total is "+dealerTotalSum);
        }

        if(dealerTotalSum >21){
            System.out.println("Dealer Losses");
            System.exit(0);
        }

        if(totalSumUser > dealerTotalSum){
            System.out.println("You wins ..");
            System.exit(0);
        }else{
            System.out.println("Dealer wins");
            System.exit(0);
        }

        // 2. Once the player stays, break the loop.

        // For tasks 9 to 13, see the article: Blackjack Part II.
        scan.close();

    }

    /**
     * Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     * 
     * @return (int)
     *
     *         Inside the function:
     *         1. Gets a random number between 1 and 13.
     *         2. Returns a card.
     */

    public static int generateRandomNumber() {
        double randomNum = Math.random() * 13; // 0-12.9999
        randomNum += 1;
        return (int) randomNum;
    }

    /**
     * Task 2 – make a function that returns a String drawing of the card.
     * Function name – cardString
     * 
     * @param cardNumber (int)
     * @return (String)
     *
     *         Inside the function:
     *         1. Returns a String drawing of the card.
     */
    public static String cardString(int cardNum) {
        switch (cardNum) {
            case 1:
                return "   _____\n" +
                        "  |A _  |\n" +
                        "  | ( ) |\n" +
                        "  |(_'_)|\n" +
                        "  |  |  |\n" +
                        "  |____V|\n";

            case 2:
                return "   _____\n" +
                        "  |2    |\n" +
                        "  |  o  |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____Z|\n";
            case 3:
                return "   _____\n" +
                        "  |3    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____E|\n";

            case 4:
                return "   _____\n" +
                        "  |4    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  | o o |\n" +
                        "  |____h|\n";
            case 5:
                return "   _____ \n" +
                        "  |5    |\n" +
                        "  | o o |\n" +
                        "  |  o  |\n" +
                        "  | o o |\n" +
                        "  |____S|\n";
            case 6:
                return "   _____ \n" +
                        "  |6    |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  |____6|\n";

            case 7:
                return "   _____ \n" +
                        "  |7    |\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |____7|\n";
            case 8:
                return "   _____ \n" +
                        "  |8    |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  |____8|\n";

            case 9:
                return "   _____ \n" +
                        "  |9    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____9|\n";
            case 10:
                return "   _____ \n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___10|\n";
            case 11:
                return "   _____\n" +
                        "  |J  ww|\n" +
                        "  | o {)|\n" +
                        "  |o o% |\n" +
                        "  | | % |\n" +
                        "  |__%%[|\n";
            case 12:
                return "   _____\n" +
                        "  |Q  ww|\n" +
                        "  | o {(|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%O|\n";
            case 13:
                return "   _____\n" +
                        "  |K  WW|\n" +
                        "  | o {)|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%>|\n";

            default:
                return "This should not happen...!";
        }
    }

    public static String faceDown() {
        return "   _____\n" +
                "  |     |\n" +
                "  |  J  |\n" +
                "  | JJJ |\n" +
                "  |  J  |\n" +
                "  |_____|\n";
    }

    /**
     * Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * 
     * @return (String)
     *
     *         Inside the function:
     *         1. Asks the user to hit or stay.
     *         2. If the user doesn't enter "hit" or "stay", keep asking them to try
     *         again by printing:
     *         Please write 'hit' or 'stay'
     *         3. Returns the user's option
     */

     public static String hitOrStay(){
        System.out.println("Would you like to hit or stay..");
        String resp=scan.nextLine();
        while(!((resp.equalsIgnoreCase("hit")) || ((resp.equalsIgnoreCase("stay"))))){
            System.out.println("Please enter hit or stay");
            resp=scan.nextLine();
        }

       return resp;
     }
}
