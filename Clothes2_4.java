/**
 * Абстрактный класс "Одежда": размер, стоимость, цвет.
 */
public abstract class Clothes {
    protected Size size;
    protected double price;
    protected String color;

    public Clothes(Size size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    // Общая информация об одежде
    protected String info(String name) {
        return name + ": размер " + size + " (euro " + size.getEuroSize() + ", "
                + size.getDescription() + "), стоимость " + price + " руб., цвет " + color;
    }
}
