package pro.sky.java.course2.lesson2;

public class Main {
    public static void main(String[] args) {
        Transport car1 = new Car("car1", 4);
        Transport car2 = new Car("car2", 4);

        Transport truck = new Truck("truck1", 6);
        Transport truck2 = new Truck("truck2", 8);

        Transport bicycle = new Bicycle("bicycle1", 2);
        Transport bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation station = new ServiceStation();
        station.check(car1);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);
    }
}
