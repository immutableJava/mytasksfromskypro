package pro.sky.java.course1.lesson4;

import java.util.Arrays;

public class HomeWork4 {


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        task7();
    }

    public static void task1() {
        int[] ints = generateRandomArray();
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }

    public static void task2() {
        int[] ints = generateRandomArray();
        Arrays.sort(ints);
        System.out.println("Минимальная сумма трат за день составила " + ints[0] + " рублей. Максимальная сумма трат за день составила " + ints[ints.length - 1] + " рублей.");
    }

    public static void task3() {
        int[] ints = generateRandomArray();
        double sum = 0;
        for (int i : ints) {
            sum += i;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum / ints.length + " рублей.");
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static void task5() {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i % 2 == 0 && j % 2 == 0 || i == j) {
                    matrix[i][j] = 1;
                }
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void task6() {
        int[] arrayToReverse = {5, 4, 3, 2, 1};
        int[] resultArray = new int[arrayToReverse.length];
        for (int i = 0, k = arrayToReverse.length - 1; i < arrayToReverse.length && k >= 0; i++, k--) {
            resultArray[i] = arrayToReverse[k];
        }
        System.out.println(Arrays.toString(resultArray));
    }

    public static void task7() {
        int[] arrayToReverse = {5, 4, 3, 2, 1};
        for (int i = 0, j = arrayToReverse.length - 1; i < j; i++, j--) {
            int temp = arrayToReverse[i];
            arrayToReverse[i] = arrayToReverse[j];
            arrayToReverse[j] = temp;
        }
        System.out.println(Arrays.toString(arrayToReverse));
    }

    public static void task8() {
        int[] ints = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        boolean flag = true;
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[i] + ints[j] == -2 && flag) {
                    System.out.println(ints[i] + " " + ints[j]);
                    flag = false;
                }
            }
        }
    }

    public static void task9() {
        int[] ints = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[i] + ints[j] == -2) {
                    System.out.println(ints[i] + " " + ints[j]);
                }
            }
        }
    }
}
