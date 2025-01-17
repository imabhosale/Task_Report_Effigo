package ExceptionHnadle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        System.out.println("We are setting up your user account.");

        // Handle username input
        try {
            System.out.print("Your username is currently " + user.getUsername() + ". Please update it here: ");
            String username = scanner.nextLine();
            if (username.isBlank()) {
                System.out.println("Error: Username cannot be blank.");
            } else {
                user.setUsername(username);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Handle age input
        try {
            System.out.print("Please enter your age: ");
            if (scanner.hasNextInt()) {
                int age = scanner.nextInt();
                if (age > 0) {
                    user.setAge(age);
                } else {
                    System.out.println("Error: Age must be greater than 0.");
                }
            } else {
                System.out.println("Error: Invalid input. Age must be a number.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display updated user details
        System.out.println("Your updated username and age are: " + user.getUsername() + ", " + user.getAge());

        scanner.close();
    }
}
