package Classes;

public class Car {
    private String carName;
    private String manufacturer;
    private int yearOfManufacture;
    private float engineSize;

    public Car(String carName, String manufacturerName, int yearOfManufacture, float engineSize) {
        this.carName = carName;
        this.manufacturer = manufacturerName;
        this.yearOfManufacture = yearOfManufacture;
        this.engineSize = engineSize;
    }
    public Car(String carName, String manufacturerName, int yearOfManufacture) {
        this.carName = carName;
        this.manufacturer = manufacturerName;
        this.yearOfManufacture = yearOfManufacture;
        this.engineSize = 0.0f;
    }
    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getManufacturerName() {
        return manufacturer;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturer = manufacturerName;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }
    public void show() {
        System.out.println("Car Name: " + carName);
        System.out.println("Manufacturer Name: " + manufacturer);
        System.out.println("Year of Manufacture: " + yearOfManufacture);
        if (engineSize == 0.0){}
        else {
            System.out.println("Engine Size: " + engineSize + "L");
        }
    }
}

