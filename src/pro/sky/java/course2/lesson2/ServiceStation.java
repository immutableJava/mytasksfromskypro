package pro.sky.java.course2.lesson2;

public class ServiceStation {
    public void check(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                transport.updateTyre();
            }
            if (transport.getClass() == Car.class) {
                ((Car) transport).checkEngine();
            } else if (transport.getClass() == Truck.class) {
                ((Truck) transport).checkEngine();
                ((Truck) transport).checkTrailer();
            }
        }
    }
}
