package ExceptionHnadle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ExampleTwo {
    public static void main(String[] args) {
        try{
            readFile("ExceptionHnadle\\greetings.txt");
        }catch(FileNotFoundException exception){
            System.out.println(exception.getMessage());
        }finally{
            System.out.println("The process is completed");
        }
    }
    public static void readFile(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("ExceptionHnadle\\greetings.txt");
        Scanner scanner = new Scanner(fis);
        System.out.println(scanner.nextLine());
        scanner.close();
    }
}
