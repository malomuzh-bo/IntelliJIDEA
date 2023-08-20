package Classes;

public class Device {
    String title, color, type;
    int year;
    float price;

    public Device(String title, String color, String type, int year, float price) {
        this.title = title;
        this.color = color;
        this.type = type;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public float getPrice() {
        return price;
    }
}
