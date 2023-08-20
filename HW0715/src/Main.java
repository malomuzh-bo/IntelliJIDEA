import Classes.Device;
import Classes.Product;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        //1
        /*ArrayList<Integer> arr = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Collections.addAll(arr, random.nextInt(-50, 50));
        }
        long pos = arr.stream().filter(n -> n > 0).count();
        long neg = arr.stream().filter(n -> n < 0).count();
        long twoDig = arr.stream().filter(n -> n >= 10 && n <= 99).count();
        long palin = arr.stream().filter(Main::isPalindromic).count();

        System.out.println("Number of positive numbers: " + pos);
        System.out.println("Number of negative numbers: " + neg);
        System.out.println("Number of two-digit numbers: " + twoDig);
        System.out.println("Number of palindromic numbers: " + palin);*/
        //2
        /*ArrayList<Product> products = new ArrayList<>();
        Collections.addAll(products, new Product("Apple", "Fruits"),
                new Product("Banana", "Fruits"),
                new Product("Milk", "Dairy"),
                new Product("Bread", "Bakery"),
                new Product("Egg", "Dairy"),
                new Product("Cheese", "Dairy"),
                new Product("Orange", "Fruits"),
                new Product("Butter", "Dairy"),
                new Product("Fish", "Seafood"),
                new Product("Carrot", "Vegetables"));

        System.out.println("All products:");
        products.stream().forEach(p -> System.out.println(p.getTitle()));

        System.out.println("\nProducts with name less than five characters:");
        products.stream().filter(p -> p.getTitle().length() < 5).forEach(p -> System.out.println(p.getTitle()));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product for searching: ");
        String searchProd = scanner.nextLine();
        long productCount = products.stream().filter(p -> p.getTitle().equals(searchProd)).count();
        System.out.println("\nCount of " + searchProd + ": " + productCount);

        char searchLetter = 'C';
        System.out.println("\nProducts starting with letter " + searchLetter + ":");
        products.stream().filter(p -> p.getTitle().charAt(0) == searchLetter)
                .forEach(p -> System.out.println(p.getTitle()));

        String searchCategory = "Dairy";
        System.out.println("\nProducts from category " + searchCategory + ":");
        products.stream().filter(p -> p.getCategory().equals(searchCategory))
                .forEach(p -> System.out.println(p.getTitle()));
*/
        //3
        ArrayList<Device> devices = new ArrayList<>();
        Collections.addAll(devices, new Device("Laptop", "Silver", "Electronics", 2023, 1600),
                new Device("Smartphone", "White", "Electronics", 2018, 700),
                new Device("PC", "Black", "Electronics", 2020, 1200),
                new Device("Microwave", "White", "Appliance", 2016, 300),
                new Device("Tablet", "Red", "Electronics", 2022, 400),
                new Device("TV", "Gray", "Electronics", 2022, 900)
        );
        devices.forEach(q-> System.out.println(q.getTitle()));

        String searchColor = "White";
        System.out.println("\nDevices of color " + searchColor + ":");
        devices.stream().filter(q -> q.getColor().equals(searchColor)).forEach(q -> System.out.println(q.getTitle()));

        int searchYear = 2022;
        System.out.println("\nDevices of year " + searchYear + ":");
        devices.stream().filter(q -> q.getYear() == searchYear).forEach(q -> System.out.println(q.getTitle()));

        float maxPrice = 1000;
        System.out.println("\nDevices more expensive than " + maxPrice + ":");
        devices.stream().filter(q -> q.getPrice() > maxPrice).forEach(q -> System.out.println(q.getTitle()));

        String searchType = "Appliance";
        System.out.println("\nDevices of type " + searchType + ":");
        devices.stream().filter(q -> q.getType().equals(searchType)).forEach(q -> System.out.println(q.getTitle()));

        int startYear = 2019;
        int endYear = 2021;
        System.out.println("\nDevices with year between " + startYear + " and " + endYear + ":");
        devices.stream().filter(q -> q.getYear() >= startYear && q.getYear() <= endYear)
                .forEach(q -> System.out.println(q.getTitle()));
        //4 (я вирішив не повтрювати один і той самий код, а просто додати новий пошук з останнього завдання)
        System.out.println("\nDevices sorted by price in ascending order:");
        devices.stream()
                .sorted(Comparator.comparingDouble(Device::getPrice))
                .forEach(q -> System.out.println(q.getTitle() + " - " + q.getPrice()));

        System.out.println("\nDevices sorted by price in descending order:");
        devices.stream()
                .sorted(Comparator.comparingDouble(Device::getPrice).reversed())
                .forEach(q -> System.out.println(q.getTitle() + " - " + q.getPrice()));

        System.out.println("\nDevices sorted by year in ascending order:");
        devices.stream()
                .sorted(Comparator.comparingInt(Device::getYear))
                .forEach(q -> System.out.println(q.getTitle() + " - " + q.getYear()));

        System.out.println("\nDevices sorted by year in descending order:");
        devices.stream()
                .sorted(Comparator.comparingInt(Device::getYear).reversed())
                .forEach(q -> System.out.println(q.getTitle() + " - " + q.getYear()));

    }
    public static boolean isPalindromic(int number) {
        String strNumber = String.valueOf(number);
        String reversed = new StringBuilder(strNumber).reverse().toString();
        return strNumber.equals(reversed);
    }
}