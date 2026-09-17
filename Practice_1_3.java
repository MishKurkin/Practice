package Object_Oriented;

import java.util.Scanner;

public class Practice_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предполагаемый размер массива");
        int m = sc.nextInt();
        int[] arr = new int[m];
        int sum = 0;

        for (int i = 0; i < m; i++) {
            System.out.println("Введите элемент массива");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println("Среднее арифметическое равно " + (sum/arr.length));
    }
}
