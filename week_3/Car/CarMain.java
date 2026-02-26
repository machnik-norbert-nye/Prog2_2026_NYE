class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void startEngine() {
        System.out.println("The car is started!");
    }

    public static void stopEngine() {
        System.out.println("The car is stopped!");
    }
}

class CarMain{
    public static void main(String[] args) {
        Car car = new Car("Opel", "Corsa", 2002);
        Car.startEngine();
        car.displayInfo();
        Car.stopEngine();
    }
}