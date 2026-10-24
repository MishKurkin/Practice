public class Main2 {
    public static void main(String[] args) {
        // 1) Переменная с любимым временем года и вся информация о нем
        Season favorite = Season.SUMMER;
        System.out.println("Любимое время года: " + favorite);
        System.out.println("Средняя температура: " + favorite.getAverageTemperature() + " °C");
        System.out.println("Описание: " + favorite.getDescription());
        System.out.println();

        // 2) Метод с оператором switch
        SeasonPrinter.printAttitude(favorite);
        System.out.println();

        // 6) Цикл по всем временам года
        System.out.println("Все времена года:");
        for (Season season : Season.values()) {
            System.out.println(season + ": средняя температура "
                    + season.getAverageTemperature() + " °C, "
                    + season.getDescription());
        }
    }
}
