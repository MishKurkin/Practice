/** Производители мониторов. */
public enum MonitorBrand {
    SAMSUNG("Samsung"),
    LG("LG"),
    DELL("Dell"),
    ACER("Acer");

    private final String title;

    private MonitorBrand(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
