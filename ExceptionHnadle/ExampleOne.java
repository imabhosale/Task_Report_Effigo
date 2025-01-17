package ExceptionHnadle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleOne {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("ExceptionHnadle\\greetings.txt");
            Scanner scanner = new Scanner(fileInputStream);
            System.out.println(scanner.nextLine());
            scanner.close();
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("THe process is completed");
        }
        // ExceptionHnadle\greetings.txt
    }

}
