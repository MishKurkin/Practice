/**
 * Задание 1. Перечисление "Времена года".
 * Каждая константа хранит среднюю температуру (конструктор принимает температуру).
 */
public enum Season {
    WINTER(-10),
    SPRING(10),
    SUMMER(25) {
        // Переопределяем getDescription для константы Лето
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(8);

    // Средняя температура в данном времени года
    private final int averageTemperature;

    // Конструктор, принимающий среднюю температуру
    private Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    // Описание по умолчанию
    public String getDescription() {
        return "Холодное время года";
    }
}
