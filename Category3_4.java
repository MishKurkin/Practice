/** Перечисление каталогов товаров. */
public enum Category {
    ELECTRONICS("Электроника"),
    BOOKS("Книги"),
    CLOTHES("Одежда"),
    HOME("Товары для дома");

    private final String title;

    private Category(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
