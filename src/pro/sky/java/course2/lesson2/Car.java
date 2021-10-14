package pro.sky.java.course2.lesson2;

public class Car extends Transport {
    private final String modelName;
    private final int wheelsCount;

    public Car(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public int getWheelsCount() {
        return wheelsCount;
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

}
