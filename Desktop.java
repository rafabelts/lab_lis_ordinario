
public class Desktop extends Computer {

    private double caseHeight;

    public Desktop(String model, String manufacturer, String operatingSystem, double caseHeight) {
        super(model, manufacturer, operatingSystem);
        this.caseHeight = caseHeight;
    }

    @Override
    public String getComputerType() {
        return "Computadora de escritorio";
    }

    @Override
    public int calculateProtabilityScore() {
        return (int) (5 + caseHeight / 20);
    }

    public double getCaseHeight() {
        return this.caseHeight;
    }

    public void setCaseHeight(double caseHeight) {
        this.caseHeight = caseHeight;
    }

}
