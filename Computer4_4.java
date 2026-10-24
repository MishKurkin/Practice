/** Компьютер, состоящий из процессора, памяти и монитора. */
public class Computer {
    private ComputerBrand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    private boolean on;

    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public ComputerBrand getBrand() {
        return brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public boolean isOn() {
        return on;
    }

    public void turnOn() {
        on = true;
        System.out.println(brand.getTitle() + ": компьютер включен");
    }

    public void turnOff() {
        on = false;
        System.out.println(brand.getTitle() + ": компьютер выключен");
    }

    public void printInfo() {
        System.out.println("Компьютер " + brand.getTitle());
        System.out.println("  Процессор: " + processor);
        System.out.println("  Память:    " + memory);
        System.out.println("  Монитор:   " + monitor);
        System.out.println("  Состояние: " + (on ? "включен" : "выключен"));
    }
}
