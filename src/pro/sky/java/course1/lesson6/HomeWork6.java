package pro.sky.java.course1.lesson6;

public class HomeWork6 {
    public static void main(String[] args) {
        System.out.println(calculateAverageSalary(generateRandomArray()));
    }

    public static void checkIsLeapYear(int year) {
        if (!(year % 100 == 0 && year % 400 != 0 || year % 4 != 0)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static void printVersionAndSystemOS(int clientOS, int clientDeviceYear) {
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

    public static String calculateDeliveryDistance(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance >= 20) {
            day++;
        }
        if (deliveryDistance >= 60) {
            day++;
        }
        return "Количество дней для доставки : " + day;
    }

    public static void checkDoubles(String str) {
        char[] chars = str.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                System.out.println("Дубль найден - " + chars[i]);
                return;
            }
        }
        System.out.println("Дубль не найден.");
    }

    public static void reverse(int[] arrayToReverse) {
        for (int i = 0, j = arrayToReverse.length - 1; i < j; i++, j--) {
            int temp = arrayToReverse[i];
            arrayToReverse[i] = arrayToReverse[j];
            arrayToReverse[j] = temp;
        }
    }

    public static String calculateAverageSalary(int[] ints) {
        double sum = 0;
        for (int i : ints) {
            sum += i;
        }
        return "Средняя сумма трат за месяц составила " + sum / ints.length + " рублей.";
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
