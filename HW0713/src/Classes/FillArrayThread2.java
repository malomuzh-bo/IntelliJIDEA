package Classes;

import java.io.*;
import java.util.Random;

public class FillArrayThread2 extends Thread{
    String path;

    public FillArrayThread2(String path) {
        this.path = path;
    }

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            Random random = new Random();
            int num;
            for (int i = 0; i < 10; i++) {
                num = random.nextInt(40);
                writer.write(String.valueOf(num));
                writer.newLine();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Successfully!");
    }
}
