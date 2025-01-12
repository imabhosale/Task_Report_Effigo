package Functions;

import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {

        int diceNum1 = createRandomNum();
        int diceNum2 = createRandomNum();
        int diceNum3 = createRandomNum();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers from 1 to 6");
        int userNum1 = sc.nextInt();
        int userNum2 = sc.nextInt();
        int userNum3 = sc.nextInt();
        if (isGreaterThan6(userNum1, userNum2, userNum3) || isLessThan1(userNum1, userNum2, userNum3)) {
            System.out.println("You have entered wrong input :(");
            System.exit(0);
        }

        int diceSum = diceNum1 + diceNum2 + diceNum3;
        int userSum = userNum1 + userNum2 + userNum3;
        System.out.println(diceSum + "  and user sum is " + userSum);
        if (UserWon(userSum, diceSum)) {
            System.out.println("Congrates You won dice game");
        } else {
            System.out.println("Sorrry Better luck on next try......");
        }

        sc.close();

    }

    public static boolean UserWon(int userSum, int diceSum) {
        return (userSum > diceSum) && ((userSum - diceSum) < 3);
    }

    public static boolean isLessThan1(int userNum1, int userNum2, int userNum3) {
        return (userNum1 < 1) || (userNum2 < 1) || (userNum3 < 1);
    }

    public static boolean isGreaterThan6(int userNum1, int userNum2, int userNum3) {
        return (userNum1 > 6) || (userNum2 > 6) || (userNum3 > 6);
    }

    public static int createRandomNum() {
        // create random function from 0 - 0.999999999
        int randomNum = (int) (Math.random() * 6); // make range of random num from 0-5.9999999
        randomNum += 1;
        return randomNum;
    }

}
