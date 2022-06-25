import java.util.HashMap;

public class VehicleFactory {
    private static final HashMap<String, Vehicle> vehicleMap = new HashMap();

    public static Vehicle getVehicle(String type){
        Vehicle vehicle = null;
        if (vehicleMap.containsKey(type)){
            vehicle = vehicleMap.get(type);
        }else{
            switch (type){
                case "Car": {
                    vehicle = new CarImplementation();
                    break;
                }
                case "Ship":{
                    vehicle = new ShipImplementation();
                    break;
                }
                default:{
                    System.out.println("Unreachable Code!");
                }
            }
            vehicleMap.put(type, vehicle);
            System.out.println(type + " has been created!");
        }
        return vehicle;
    }
}