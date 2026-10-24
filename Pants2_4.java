/** Штаны: и мужская, и женская одежда. */
public class Pants extends Clothes implements MenClothing, WomenClothing {

    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские " + info("штаны"));
    }

    @Override
    public void dressWomen() {
        System.out.println("Женские " + info("штаны"));
    }
}
