/** Производители процессоров. */
public enum ProcessorBrand {
    INTEL("Intel"),
    AMD("AMD"),
    APPLE("Apple");

    private final String title;

    private ProcessorBrand(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
