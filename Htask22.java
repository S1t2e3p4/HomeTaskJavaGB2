/**
 Задача 2:
 Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
 */

import java.util.Scanner;
public class Htask22 {
    public static void main(String[] args) {
        if (CheckingForIncreasingSequence() == true) {
            System.out.println("Последовательность является возрастающей.");
        } else {
            System.out.println("Такая последовательность НЕ является возрастающей.");
        }
    }

    public static boolean CheckingForIncreasingSequence() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число, равное длинне Вашей последовательности чисел, и нажмите enter: ");
        int n = scanner.nextInt();
        System.out.println("Введите ЦЕЛОЕ число и нажмите enter: ");
        boolean flag = true;
        int num1 = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int num2 = scanner.nextInt();
            if (num1 > num2) {
                flag = false;
            }
            num1 = num2;
        }
        scanner.close();
        return flag;
    }
}
