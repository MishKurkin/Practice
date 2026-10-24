/** Монитор. */
public class Monitor {
    private MonitorBrand brand;
    private double diagonalInches;
    private String resolution;

    public Monitor(MonitorBrand brand, double diagonalInches, String resolution) {
        this.brand = brand;
        this.diagonalInches = diagonalInches;
        this.resolution = resolution;
    }

    public MonitorBrand getBrand() {
        return brand;
    }

    public double getDiagonalInches() {
        return diagonalInches;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return brand.getTitle() + " " + diagonalInches + "\", " + resolution;
    }
}
