/**
 * Задача 3:
 * Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */
import java.util.Scanner;
import java.util.Arrays;
public class HTask23 {
    public static void main(String[] args) {
        System.out.printf("Массив с заменеными отрицательными элементами на сумму индексов двузначных элементов массива: " + Arrays.toString(replacementOfNegativeElements()));
    }

    public static int[] replacementOfNegativeElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, равное колличеству элементов в Вашем массиве, и нажмите enter: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sumOfTheIndicesOfTwodigitElements = 0;
        System.out.println("Введите ЦЕЛОЕ число и нажмите enter: ");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (Math.abs(array[i])>=10 && Math.abs(array[i])<=99) {
                sumOfTheIndicesOfTwodigitElements+=i;
            }
        }
        scanner.close();

        for (int i = 0; i < n; i++) {
            if (array[i] <0) {
                array[i]=sumOfTheIndicesOfTwodigitElements;
            }
        }
        return array;
    }
}
