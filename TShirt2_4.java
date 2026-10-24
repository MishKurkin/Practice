/** Футболка: и мужская, и женская одежда. */
public class TShirt extends Clothes implements MenClothing, WomenClothing {

    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская " + info("футболка"));
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская " + info("футболка"));
    }
}
