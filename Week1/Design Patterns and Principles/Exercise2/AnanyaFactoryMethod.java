package Anu;

interface Vehicle {
    void show();
}

class Car implements Vehicle {
    public void show() {
        System.out.println("Ananya's Car is ready");
    }
}

class Bike implements Vehicle {
    public void show() {
        System.out.println("Ananya's Bike is ready");
    }
}

class VehicleFactory {
    public Vehicle getVehicle(String type) {
        if ("car".equalsIgnoreCase(type)) {
            return new Car();
        } else if ("bike".equalsIgnoreCase(type)) {
            return new Bike();
        }
        return null;
    }
}

public class AnanyaFactoryMethod {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();
        Vehicle v1 = factory.getVehicle("car");
        Vehicle v2 = factory.getVehicle("bike");
        v1.show();
        v2.show();
    }
}
