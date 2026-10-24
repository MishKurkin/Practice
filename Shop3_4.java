import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** Интернет-магазин: пользователи, товары, меню. */
public class Shop {
    private final List<User> users = new ArrayList<>();
    private final List<Product> products = new ArrayList<>();
    private final Scanner scanner;

    public Shop(Scanner scanner) {
        this.scanner = scanner;
        initData();
    }

    private void initData() {
        users.add(new User("admin", "1234"));
        users.add(new User("user", "pass"));

        products.add(new Product(1, "Смартфон", 29990, Category.ELECTRONICS));
        products.add(new Product(2, "Наушники", 4990, Category.ELECTRONICS));
        products.add(new Product(3, "Ноутбук", 69990, Category.ELECTRONICS));
        products.add(new Product(4, "Java. Полное руководство", 2500, Category.BOOKS));
        products.add(new Product(5, "Чистый код", 1800, Category.BOOKS));
        products.add(new Product(6, "Куртка", 6500, Category.CLOTHES));
        products.add(new Product(7, "Джинсы", 3200, Category.CLOTHES));
        products.add(new Product(8, "Лампа настольная", 1500, Category.HOME));
        products.add(new Product(9, "Плед", 2100, Category.HOME));
    }

    // 1) Аутентификация пользователя (до 3 попыток)
    public User authenticate() {
        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Логин: ");
            String login = scanner.nextLine().trim();
            System.out.print("Пароль: ");
            String password = scanner.nextLine().trim();
            for (User u : users) {
                if (u.getLogin().equals(login) && u.checkPassword(password)) {
                    System.out.println("Добро пожаловать, " + login + "!");
                    return u;
                }
            }
            System.out.println("Неверный логин или пароль (попытка " + attempt + " из 3).");
        }
        return null;
    }

    // 2) Список каталогов
    private void showCategories() {
        System.out.println("Каталоги:");
        for (Category c : Category.values()) {
            System.out.println("  " + (c.ordinal() + 1) + ". " + c.getTitle());
        }
    }

    // Выбор каталога по номеру
    private Category chooseCategory() {
        showCategories();
        System.out.print("Номер каталога: ");
        try {
            int n = Integer.parseInt(scanner.nextLine().trim());
            Category[] all = Category.values();
            if (n >= 1 && n <= all.length) {
                return all[n - 1];
            }
        } catch (NumberFormatException e) {
            // обработано ниже
        }
        System.out.println("Нет такого каталога.");
        return null;
    }

    // 3) Список товаров каталога
    private void showProducts(Category category) {
        System.out.println("Товары каталога \"" + category.getTitle() + "\":");
        for (Product p : products) {
            if (p.getCategory() == category) {
                System.out.println("  " + p);
            }
        }
    }

    // 4) Выбор товара в корзину
    private void addToCart(Cart cart) {
        System.out.print("Номер товара: ");
        try {
            int id = Integer.parseInt(scanner.nextLine().trim());
            for (Product p : products) {
                if (p.getId() == id) {
                    cart.add(p);
                    System.out.println("Добавлено в корзину: " + p.getName());
                    return;
                }
            }
        } catch (NumberFormatException e) {
            // обработано ниже
        }
        System.out.println("Товар не найден.");
    }

    // 5) Покупка товаров из корзины
    private void buy(Cart cart) {
        if (cart.isEmpty()) {
            System.out.println("Корзина пуста, покупать нечего.");
            return;
        }
        cart.print();
        System.out.println("Покупка оформлена. Спасибо за заказ!");
        cart.clear();
    }

    public void run() {
        User user = authenticate();
        if (user == null) {
            System.out.println("Аутентификация не пройдена. Выход.");
            return;
        }
        Cart cart = new Cart();
        boolean running = true;
        while (running) {
            System.out.println();
            System.out.println("Меню:");
            System.out.println("1. Список каталогов");
            System.out.println("2. Товары каталога");
            System.out.println("3. Добавить товар в корзину");
            System.out.println("4. Показать корзину");
            System.out.println("5. Купить товары из корзины");
            System.out.println("0. Выход");
            System.out.print("Ваш выбор: ");
            if (!scanner.hasNextLine()) {
                break;
            }
            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1":
                    showCategories();
                    break;
                case "2":
                    Category c = chooseCategory();
                    if (c != null) {
                        showProducts(c);
                    }
                    break;
                case "3":
                    addToCart(cart);
                    break;
                case "4":
                    cart.print();
                    break;
                case "5":
                    buy(cart);
                    break;
                case "0":
                    running = false;
                    System.out.println("До свидания!");
                    break;
                default:
                    System.out.println("Неизвестная команда.");
            }
        }
    }
}
