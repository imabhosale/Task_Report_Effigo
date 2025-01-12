package Arrays;

import java.util.Scanner;

public class WorkBook6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] str={"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("Welcome to Java Grocers.");
        System.out.println("What can I help you find?");
        String toFind=sc.nextLine();
        for(int i=0;i<str.length;i++){
            if(toFind.equals(str[i])){
                System.out.println("We have "+str[i]+" in aisle "+i);
            }
        }
        // int [] random10Num=new int[10];
        // int i=0;
        // while(random10Num.length != 10){
        //     random10Num[i]=generaterandom();
        //     i++;
        // }
        sc.close();
    }


    //Create an array that stores 10 random numbers.
    // public static int generaterandom(){
    //     return (int) (Math.random()*10);
    // }
    
    
}
