public class FlyweightPatternMain {
    private static final String[] types = {"Car", "Ship", "Ship", "Car", "Car", "Ship"};
    private static final String[] brands = {"BMW", "BMW", "Bugatti", "Bentley", "Chevrolet", "Mercedes"};
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            Vehicle vehicle = VehicleFactory.getVehicle(types[i]);
            vehicle.assignVehicleBrand(brands[i]);
            vehicle.build();
        }
    }
}