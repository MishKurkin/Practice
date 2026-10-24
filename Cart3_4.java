import java.util.ArrayList;
import java.util.List;

/** Корзина пользователя. */
public class Cart {
    private final List<Product> items = new ArrayList<>();

    public void add(Product product) {
        items.add(product);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public double getTotal() {
        double total = 0;
        for (Product p : items) {
            total += p.getPrice();
        }
        return total;
    }

    public void print() {
        if (items.isEmpty()) {
            System.out.println("Корзина пуста.");
            return;
        }
        System.out.println("Товары в корзине:");
        for (Product p : items) {
            System.out.println("  " + p);
        }
        System.out.println("Итого: " + getTotal() + " руб.");
    }

    public void clear() {
        items.clear();
    }
}
