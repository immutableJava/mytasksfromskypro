package pro.sky.java.course2.lesson2;

public class ServiceStation {
    public void check(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                transport.updateTyre();
            }
            if (transport instanceof Car || transport instanceof Truck) {
                transport.checkEngine();
            }
            if (transport instanceof Truck) {
                transport.checkTrailer();
            }
        }
    }
}
