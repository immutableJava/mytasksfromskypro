package pro.sky.java.course2.lesson2;

public class Main {
    public static void main(String[] args) {
        Transport[] transports;
        Transport car1 = new Car("car1", 4);
        Transport car2 = new Car("car2", 4);

        Transport truck = new Truck("truck1", 6);
        Transport truck2 = new Truck("truck2", 8);

        Transport bicycle = new Bicycle("bicycle1", 2);
        Transport bicycle2 = new Bicycle("bicycle2", 2);

        transports = new Transport[]{car1, car2, truck, truck2, bicycle, bicycle2};
        ServiceStation station = new ServiceStation();

        for (Transport currentTransport : transports) {
            station.check(currentTransport);
        }
    }
}
