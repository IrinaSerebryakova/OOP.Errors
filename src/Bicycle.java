public class Bicycle extends Vehicle implements WheeledTransport{
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }
    @Override
    public void check() {
        updateTyre();
        super.check();
    }
}

