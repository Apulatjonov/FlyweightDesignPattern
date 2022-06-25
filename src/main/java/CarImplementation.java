public class CarImplementation implements Vehicle {
    //Intrinsic Attribute
    private final String vehicleType;

    //Extrinsic Attribute
    private String vehicleBrand;

    public CarImplementation() {
        this.vehicleType = "Car";
    }

    @Override
    public void assignVehicleBrand(String brand) {
        this.vehicleBrand = brand;
    }

    @Override
    public void build() {
        System.out.println(vehicleType + " Brand: " + vehicleBrand);
    }
}