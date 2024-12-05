
public final class Notebook extends Laptop {

    public Notebook(String model, String manufacturer, String operatingSystem, int batteryCapacity, double weight) {
        super(model, manufacturer, operatingSystem, batteryCapacity, weight);
    }

    @Override
    public int calculateProtabilityScore() {
        return 1;
    }

    @Override
    public String getComputerType() {
        return "Computadora-laptop: NOTEBOOK";

    }

    @Override
    public String getModel() {
        return super.model;
    }

    @Override
    public int getBatteryCapacity() {
        return super.getBatteryCapacity();
    }

}
