import java.util.ArrayList;
import java.util.List;

public class Person {
    /**
     * Person.
     */
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<>();

    /**
     * Constructor.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * add.
     */
    public void addVehicle(Vehicle vehicle) {
        if (vehicle == null) {
            return;
        }
        vehicleList.add(vehicle);
    }

    /**
     * remove.
     */
    public void removeVehicle(String registrationNumber) {
        for (int i = vehicleList.size() - 1; i >= 0; i--) {
            if (vehicleList.get(i).getRegistrationNumber().equals(registrationNumber)) {
                vehicleList.remove(i);
            }
        }
    }

    /**
     * info.
     */
    public String getVehiclesInfo() {
        if (vehicleList.size() == 0) {
            return name + " has no vehicle!";
        }
        String s = name + " has:\n\n";
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i) instanceof Car) {
                Car newCar = (Car) vehicleList.get(i);
                s += newCar.getInfo() + "\n";
            } else {
              MotorBike newMotorBike = (MotorBike) vehicleList.get(i);
              s += newMotorBike.getInfo() + "\n";
            }
        }
        return s;
    }

    /**
     * set/get.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * set/get.
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
