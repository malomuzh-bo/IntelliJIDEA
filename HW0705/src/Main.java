import Classes.*;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //1
        /*Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int choice;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter " + i + " element: ");
            arrayList.add(scanner.nextInt());
        }
        do {
            displayMenu();
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter element: ");
                    arrayList.add(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Enter index of the array: ");
                    try {
                        arrayList.remove(scanner.nextInt());
                    }
                    catch (Exception e){}
                    break;
                case 3:
                    for (int item: arrayList) {
                        System.out.println(item);
                    }
                    break;
                case 4:
                    System.out.println("Enter index: ");
                    try {
                        System.out.println(arrayList.get(scanner.nextInt()));
                    }
                    catch (Exception e){}
                    break;
                case 5:
                    System.out.println("Enter index and set new element: ");
                    arrayList.set(scanner.nextInt(), scanner.nextInt());
                    System.out.println("New array:");
                    for (int item: arrayList) {
                        System.out.println(item);
                    }
                    break;
            }
        }
        while (choice != 0);*/
        //2
        Task2 app = new Task2();
        app.run();
        //3
        /*ServerQueue sq = new ServerQueue();

        sq.addClientRequest(new Client("client1", 3));
        sq.addClientRequest(new Client("client2", 1));
        sq.addClientRequest(new Client("client3", 2));

        while (sq.hasMoreClientRequests()) {
            Client client = sq.getNextClientRequest();
            System.out.println("Processing a client request " + client.getName() + " with priority " +
                    client.getPriority());

            String statistics = "Client " + client.getName() + ", processing time: " +
                    System.currentTimeMillis() / 1000;
            sq.addRequestStatistics(statistics);
        }

        System.out.println("\nQuery statistics:");
        while (sq.hasMoreRequestStatistics()) {
            System.out.println(sq.getRequestStatistics());
        }*/
    }
    public static void displayMenu(){
        System.out.println("MENU");
        System.out.println("1. Add element to the array");
        System.out.println("2. Remove element in the array");
        System.out.println("3. Show the array");
        System.out.println("4. Find element in the array");
        System.out.println("5. Replace element in the array");
        System.out.println("0. Exit");
        System.out.print("Select the menu item: ");
    }
}