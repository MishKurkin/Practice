/**
 * Задание 2. Перечисление размеров одежды.
 * Содержит европейский размер (euroSize) и метод getDescription.
 */
public enum Size {
    XXS(32) {
        // Для XXS описание переопределено
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euroSize;

    // Конструктор, принимающий euroSize
    private Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }
}
