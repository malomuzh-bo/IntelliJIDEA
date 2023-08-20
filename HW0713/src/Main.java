import Classes.*;

import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        //1
        /*int[] array = new int[7];

        Thread fill = new FillArrayThread(array);
        Thread sum = new SumThread(array);
        Thread avg = new AvgThread(array);

        fill.start();

        try {
            fill.join();
        } catch (Exception e) {

        }

        sum.start();
        avg.start();

        try {
            sum.join();
            avg.join();
        } catch (Exception e) {
        }

        int sumT = ((SumThread) sum).getSum();
        double average = ((AvgThread) avg).getAverage();

        System.out.println("Array: " + java.util.Arrays.toString(array));
        System.out.println("Sum: " + sumT);
        System.out.println("Average: " + average);*/
        //2
        /*try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter path: ");
            String path = reader.readLine();
            String p_path = "prime_digits.txt";
            Thread fill = new FillArrayThread(new int[10]);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(p_path))) {
                writer.write("Prime digits: ");
                writer.newLine();
                ExecutorService executorService = Executors.newFixedThreadPool(3);

                executorService.submit(new FillArrayThread2(path));

                executorService.shutdown();
                while (!executorService.isTerminated()) {}

                executorService = Executors.newFixedThreadPool(2);
                executorService.submit(new PrimeDigits(path, writer));
                executorService.submit(new FactorialsDigits(path));

                executorService.shutdown();
                while (!executorService.isTerminated()) {}
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }*/
        //4
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter path: ");
        String path = scanner.nextLine();

        System.out.print("Enter word for searching: ");
        String word = scanner.nextLine();

        List<String> list = new ArrayList<>();

        Thread searchThread = new Thread(() -> {
            searchFiles(path, word, list);
        });

        Thread processThread = new Thread(() -> {
            try {
                searchThread.join();
                processFiles(list);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        searchThread.start();
        processThread.start();

        try {
            searchThread.join();
            processThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Successuflly!");

    }
    public static void searchFiles(String path, String word, List<String> list) {
        File directory = new File(path);

        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile() && file.getName().endsWith(".txt")) {
                        try {
                            BufferedReader reader = new BufferedReader(new FileReader(file));
                            String line;
                            while ((line = reader.readLine()) != null) {
                                if (line.contains(word)) {
                                    list.add(file.getAbsolutePath());
                                    break;
                                }
                            }
                            reader.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    public static void processFiles(List<String> foundFiles) {
        List<String> forbiddenWords = readForbiddenWordsFromFile("/Users/malomuzh_bo/InteliJIDEA/IntelliJIDEA/forbidden_words.txt");

        for (String filePath : foundFiles) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filePath));
                StringBuilder content = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
                reader.close();

                for (String forbiddenWord : forbiddenWords) {
                    content = new StringBuilder(content.toString().replace(forbiddenWord, ""));
                }

                String outputFilePath = filePath.replace(".txt", "_processed.txt");
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
                writer.write(content.toString());
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> readForbiddenWordsFromFile(String filePath) {
        List<String> forbiddenWords = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                forbiddenWords.add(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return forbiddenWords;
    }
}