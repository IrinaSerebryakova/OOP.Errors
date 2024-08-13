public class ServiceStation {

    public void check(Vehicle vehicle) {
        if (vehicle != null) {
            if (vehicle instanceof Bicycle) {
                System.out.println("Обслуживаем " + vehicle.getModelName());
                for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                    vehicle.updateTyre();
                }
                if (vehicle instanceof Car) {
                    vehicle.checkEngine();
                }
                if (vehicle instanceof Truck) {
                    vehicle.checkTrailer();
                }
            }
        }
    }
}



