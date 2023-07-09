package Classes;

public class Person {
    String name;
    String date;
    String number;
    String city;
    String country;
    String address;
    static int count = 0;

    public Person() {
        count++;
    }
    public Person(String name, String date, String number, String city, String country, String address) {
        this.name = name;
        this.date = date;
        this.number = number;
        this.city = city;
        this.country = country;
        this.address = address;
        count++;
    }
    public static int getAmountOfCreated(){
        return count;
    }
    public void Show() {
        System.out.println("Name: " + this.name);
        System.out.println("Date: " + this.date);
        System.out.println("Number: " + this.number);
        System.out.println("City: " + this.city);
        System.out.println("Country: " + this.country);
        System.out.println("Address: " + this.address);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
