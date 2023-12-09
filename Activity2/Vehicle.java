class Vehicle {
    String type;

    Vehicle() {
        this.type = "Generic Vehicle";
    }

    Vehicle(String type) {
        this.type = type;
    }

    void start() {
        System.out.println(type + " is starting.");
    }
}

class Car extends Vehicle {
    int numberOfWheels;

    Car(int wheels) {
        super("Car");
        this.numberOfWheels = wheels;
    }

    void start() {
        super.start(); // Calls the start method of the base class
        System.out.println(type + " with " + numberOfWheels + " wheels is starting.");
    }
}

