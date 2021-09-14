package pro.sky.java.course1.lesson6;

import java.util.Arrays;

public class HomeWork6 {
    public static void main(String[] args) {

    }

    public static void task1(int year) {
        if (!(year % 100 == 0 && year % 400 != 0 || year % 4 != 0)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static void task2(int clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            if (clientDeviceYear < 2019) {
                System.out.println("Установите lite-версию приложения для IOS по ссылке.");
            } else {
                System.out.println("Установите полную версию приложения для IOS по ссылке.");
            }
        } else {
            if (clientDeviceYear < 2019) {
                System.out.println("Установите lite-версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите полную версию приложения для Android по ссылке.");
            }
        }
    }

    public static void task3(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance >= 20) {
            day++;
        }
        if (deliveryDistance >= 60) {
            day++;
        }
        System.out.println("Количество дней для доставки : " + day);
    }

    public static void task4(String str) {
        char[] chars = str.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                System.out.println("Дубль найден - " + chars[i]);
                break;
            }
            if (i == chars.length - 1)
                System.out.println("Дубль не найден.");
        }
    }

    public static void task5(int[] arrayToReverse) {
        for (int i = 0, j = arrayToReverse.length - 1; i < j; i++, j--) {
            int temp = arrayToReverse[i];
            arrayToReverse[i] = arrayToReverse[j];
            arrayToReverse[j] = temp;
        }
        System.out.println(Arrays.toString(arrayToReverse));
    }

    public static void task6(int[] ints) {
        ints = generateRandomArray();
        double sum = 0;
        for (int i : ints) {
            sum += i;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum / ints.length + " рублей.");
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
