package Classes;

public class AvgThread extends Thread {
    private int[] array;
    private double average;

    public AvgThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        average = (double) sum / array.length;
    }

    public double getAverage() {
        return average;
    }
}
