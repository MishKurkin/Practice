package Object_Oriented;

import java.util.Scanner;

public class Practice_1_3 {
    public static void main(String[] args) {
        System.out.println("Введите предполагаемый размер массива");
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println("Среднее арифметическое равно " + (sum/arr.length));
    }
}
