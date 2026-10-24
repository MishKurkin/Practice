public class Main3 {
    public static void main(String[] args) {
        // Массив всех типов одежды (тип массива - суперкласс Clothes)
        Clothes[] clothes = {
                new TShirt(Size.S, 1200, "белый"),
                new Pants(Size.M, 3500, "синий"),
                new Skirt(Size.XS, 2800, "красный"),
                new Tie(Size.L, 900, "черный"),
                new TShirt(Size.XXS, 700, "желтый")
        };

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothes);
        System.out.println();
        atelier.dressMan(clothes);
    }
}
