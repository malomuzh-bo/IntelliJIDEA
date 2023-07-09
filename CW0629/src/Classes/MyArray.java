package Classes;

public class MyArray implements IShow{
    int[] array;

    public MyArray(int[] array) {
        this.array = array;
    }

    @Override
    public void show() {
        System.out.print("Items: ");
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    @Override
    public void show(String info) {
        show();
        System.out.println("Information: " + info);
    }
}
