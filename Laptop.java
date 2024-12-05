
public class Laptop extends Computer implements PortableDevice {

    private int batteryCapacity;
    private double weight;

    public Laptop(String model, String manufacturer, String operatingSystem, int batteryCapacity, double weight) {
        super(model, manufacturer, operatingSystem);
        this.batteryCapacity = batteryCapacity;
        this.weight = weight;
    }

    @Override
    public String getComputerType() {
        return "Computadora portátil";
    }

    @Override
    public int calculateProtabilityScore() {
        return (int) Math.round(weight);
    }

    @Override
    public String getModel() {
        return super.model;
    }

    @Override
    public int getBatteryCapacity() {
        return this.batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
