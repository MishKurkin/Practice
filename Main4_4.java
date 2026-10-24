public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor(ProcessorBrand.INTEL, "Core i7-13700", 16, 3.4);
        Memory memory = new Memory(MemoryType.DDR5, 16);
        Monitor monitor = new Monitor(MonitorBrand.SAMSUNG, 27, "2560x1440");

        Computer computer = new Computer(ComputerBrand.LENOVO, processor, memory, monitor);

        computer.printInfo();
        System.out.println();

        computer.turnOn();
        memory.upgrade(16);
        processor.setFrequencyGhz(3.8);
        System.out.println("Производительность процессора: " + processor.getPerformance());
        System.out.println();

        computer.printInfo();
        System.out.println();
        computer.turnOff();
    }
}
