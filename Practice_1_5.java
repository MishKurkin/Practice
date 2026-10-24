package Object_Oriented;

public class Practice_1_5 {
        public static void main(String[] args) {
            System.out.println("Аргументы командной строки:");
            // Цикл for для вывода аргументов
            for (int i = 0; i < args.length; i++) {
                System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
            }
        }
    }
