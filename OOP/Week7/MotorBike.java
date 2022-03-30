public class MotorBike extends Vehicle {
    /**
     * Motorbike.
     */
    private boolean hasSidecar;

    /**
     * Constructor.
     */
    public MotorBike(String brand, String model, String registrationNumber,
                     Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
    }

    /**
     * info.
     */
    @Override
    public String getInfo() {
         return "Motor Bike:\n\t" + "Brand: " + brand + "\n\t" + "Model: "
                + model + "\n\t" + "Registration Number: "
                + registrationNumber + "\n\t" + "Has Side Car: " + hasSidecar
                + "\n\t" + "Belongs to " + owner.getName() + " - "
                + owner.getAddress();
    }

    /**
     * side.
     */
    public boolean isHasSidecar() {
        return true;
    }

    /**
     * side.
     */
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

}
