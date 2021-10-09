package pro.sky.java.course2.lesson2;

public class Main {
    public static void main(String[] args) {
        Transport car1 = new Car();
        Transport car2 = new Car();
        car1.setModelName("car1");
        car2.setModelName("car2");
        car1.setWheelsCount(4);
        car2.setWheelsCount(4);

        Transport truck = new Truck();
        Transport truck2 = new Truck();
        truck.setModelName("truck1");
        truck2.setModelName("truck2");
        truck.setWheelsCount(6);
        truck2.setWheelsCount(8);

        Transport bicycle = new Bicycle();
        Transport bicycle2 = new Bicycle();
        bicycle.setModelName("bicycle1");
        bicycle2.setModelName("bicycle2");
        bicycle.setWheelsCount(2);
        bicycle2.setWheelsCount(2);

        ServiceStation station = new ServiceStation();
        station.check(car1);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);
    }
}
