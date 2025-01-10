package SimplePackage;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hey Whats your name? ");
        String name=sc.nextLine();
        System.out.println("\nwelcome "+name+" in our chatbot .  "+" how old are you?");
        int old=sc.nextInt();
        System.out.println("OK "+name+" i will remember your age "+old);

        System.out.println("what is your favarate language ? ");
        sc.nextLine();//throwaway next line to be wasted on empty space
        String language=sc.nextLine();
        System.out.println("Yes "+name+" "+language+" is very good lanaguage.."); 
       sc.close(); 
    }
    
}
