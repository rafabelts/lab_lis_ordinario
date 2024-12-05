
public abstract class Computer {

    protected String model;
    protected String manufacturer;
    protected String operatingSystem;

    protected Computer(
            String model, String manufacturer, String operatingSystem
    ) {

        this.model = model;
        this.manufacturer = manufacturer;
        this.operatingSystem = operatingSystem;
    }

    public abstract String getComputerType();

    public abstract int calculateProtabilityScore();

    @Override
    public String toString() {
        return String.format("\t %s \t %s \t %s \t", this.model, this.manufacturer, this.operatingSystem);
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

}
