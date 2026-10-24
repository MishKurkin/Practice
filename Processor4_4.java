/** Процессор. */
public class Processor {
    private ProcessorBrand brand;
    private String model;
    private int cores;
    private double frequencyGhz;

    public Processor(ProcessorBrand brand, String model, int cores, double frequencyGhz) {
        this.brand = brand;
        this.model = model;
        this.cores = cores;
        this.frequencyGhz = frequencyGhz;
    }

    public ProcessorBrand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getCores() {
        return cores;
    }

    public double getFrequencyGhz() {
        return frequencyGhz;
    }

    public void setFrequencyGhz(double frequencyGhz) {
        this.frequencyGhz = frequencyGhz;
    }

    // Условный расчет производительности
    public double getPerformance() {
        return cores * frequencyGhz;
    }

    @Override
    public String toString() {
        return brand.getTitle() + " " + model + " (" + cores + " ядер, " + frequencyGhz + " ГГц)";
    }
}
