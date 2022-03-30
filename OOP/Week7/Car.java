public class Car extends Vehicle {
    /**
     * Car.
     */
    private int numberOfDoors;

    /**
     * Constructor.
     */
    public Car(String brand, String model, String registrationNumber,
               Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * info.
     */
    @Override
    public String getInfo() {
        return "Car:\n\t" + "Brand: " + brand + "\n\t" + "Model: "
                + model + "\n\t" + "Registration Number: "
                + registrationNumber + "\n\t" + "Number of Doors: "
                + numberOfDoors + "\n\t" + "Belongs to "
                + owner.getName() + " - " + owner.getAddress();
    }

    /**
     * set/get.
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

}
