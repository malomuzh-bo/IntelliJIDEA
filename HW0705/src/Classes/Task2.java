package Classes;

import java.util.*;

public class Task2 {
    private Map<String, String> users = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addUser();
                    break;
                case 2:
                    removeUser();
                    break;
                case 3:
                    checkUser();
                    break;
                case 4:
                    changeLogin();
                    break;
                case 5:
                    changePass();
                    break;
                case 0:
                    System.out.println("...");
                    break;
                default:
                    System.out.println("Error_&$#%");
            }
        } while (choice != 0);
    }

    void displayMenu() {
        System.out.println("\nМеню:");
        System.out.println("1. Add new user");
        System.out.println("2. Delete an existing user");
        System.out.println("3. Check if the user exists");
        System.out.println("4. Change login of existing user");
        System.out.println("5. Change password of existing user");
        System.out.println("0. Exit");
        System.out.print("Select menu item: ");
    }

    void addUser() {
        System.out.print("Enter the login of the new user: ");
        String login = scanner.nextLine();
        if (users.containsKey(login)) {
            System.out.println("A user with this login already exists.");
        } else {
            System.out.print("Enter the password of the new user: ");
            String password = scanner.nextLine();
            users.put(login, password);
            System.out.println("Successfully!");
        }
    }

    void removeUser() {
        System.out.print("Enter the user login: ");
        String login = scanner.nextLine();
        if (users.containsKey(login)) {
            users.remove(login);
            System.out.println("Successfully!");
        } else {
            System.out.println(login + "' not found");
        }
    }

    void checkUser() {
        System.out.print("Enter the user login: ");
        String login = scanner.nextLine();
        if (users.containsKey(login)) {
            System.out.println(login + "' is exist.");
        } else {
            System.out.println(login + "' not found");
        }
    }

    void changeLogin() {
        System.out.print("Enter the old user login: ");
        String oldLogin = scanner.nextLine();
        if (users.containsKey(oldLogin)) {
            System.out.print("Enter the new user login: ");
            String newLogin = scanner.nextLine();
            String password = users.remove(oldLogin);
            users.put(newLogin, password);
            System.out.println("Successfully!");
        } else {
            System.out.println(oldLogin + "' not found");
        }
    }

    void changePass() {
        System.out.print("Enter the login of the user: ");
        String login = scanner.nextLine();
        if (users.containsKey(login)) {
            System.out.print("Enter a new user password: ");
            String newPassword = scanner.nextLine();
            users.put(login, newPassword);
            System.out.println("Successfully!");
        } else {
            System.out.println(login + "' not found");
        }
    }
}
