package Loops;

import java.util.Scanner;

public class Workbook_ForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to count by :");
        int count=sc.nextInt();
        System.out.println("Enter the number to start counting from:");
        int start=sc.nextInt();
        System.out.println("Enter the number to count to");
        int end=sc.nextInt();
        for(int i=start;i<=end;i+=count){
            if(i%2 == 0){
                System.out.print(i+"  EVEN");
                System.out.println();
            }else{
                System.out.println(i+" ODD");
            }
            
        }
        sc.close();
    }
}
