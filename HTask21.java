/*
Задача 1:
 Дана последовательность N целых чисел. Найти сумму простых чисел.
 */

import java.util.Scanner;

public class HTask21 {
    public static void main(String[] args) {

        System.out.printf("Сумма простых чисел = %d", getSum(0));
    }

    public static int getSum(int sumOfPrimeNumbersm) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число, равное длинне Вашей последовательности чисел, и нажмите enter: ");
        int n = scanner.nextInt();
        System.out.println("Введите ЦЕЛОЕ число и нажмите enter: ");

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (Math.abs(num) == 1 || Math.abs(num) == 2 || Math.abs(num) == 3) {
                sumOfPrimeNumbersm += num;
            } else if (num % 2 == 0) {
                continue;
            } else {
                int j = 3;
                while (j < (Math.abs(num) / 2 + 1)) {
                    if (num % j == 0) {
                        break;
                    }
                    j = j + 2;
                }

                if (num % j != 0) {
                    sumOfPrimeNumbersm += num;
                }
            }
        }
        scanner.close();
        return sumOfPrimeNumbersm;
    }
}