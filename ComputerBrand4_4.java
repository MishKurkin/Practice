/** Марки компьютеров. */
public enum ComputerBrand {
    LENOVO("Lenovo"),
    HP("HP"),
    DELL("Dell"),
    ASUS("ASUS"),
    APPLE("Apple");

    private final String title;

    private ComputerBrand(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
