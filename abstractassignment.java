abstract class Vehicle {

    abstract double calculateSpeed(double distance, double time);
    abstract double calculateVelocity(double displacement, double time);
}

// Car class
class Car extends Vehicle {

    double calculateSpeed(double distance, double time) {
        return distance / time;
    }
    double calculateVelocity(double displacement, double time) {
        return displacement / time;
    }
}

// Bike class
class Bike extends Vehicle {
    double calculateSpeed(double distance, double time) {
        return distance / time;
    }
    double calculateVelocity(double displacement, double time) {
        return displacement / time;
    }
}

public class SpeedVelocityDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        double distance = 100;     
        double displacement = 80;   
        double time = 2;            

        System.out.println("---- Car ----");
        System.out.println("Speed: " + car.calculateSpeed(distance, time) + " km/h");
        System.out.println("Velocity: " + car.calculateVelocity(displacement, time) + " km/h");

        System.out.println("---- Bike ----");
        System.out.println("Speed: " + bike.calculateSpeed(distance, time) + " km/h");
        System.out.println("Velocity: " + bike.calculateVelocity(displacement, time) + " km/h");
    }
}
