package pro.sky.java.course1.lesson5;

import java.util.Locale;

public class HomeWork5 {

    public static void main(String[] args) {
        task8();
    }

    public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = middleName + " " + firstName + " " + lastName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета – " + fullName.toUpperCase(Locale.ROOT));
    }

    public static void task3() {
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для административного отдела – " + fullName.replaceAll(" ", ";"));
    }

    public static void task4() {
        String fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника - " + fullName.replaceAll("ё", "е"));

    }

    public static void task5() {
        String fullName = "Ivanov Ivan Ivanovich";
        int firstIndexOfSpace = fullName.indexOf(" ");
        int lastIndexOfSpace = fullName.lastIndexOf(" ");
        String middleName = fullName.substring(0, firstIndexOfSpace);
        String firstName = fullName.substring(firstIndexOfSpace + 1, lastIndexOfSpace);
        String lastName = fullName.substring(lastIndexOfSpace + 1);
        System.out.println("Имя сотрудника – " + firstName);
        System.out.println("Фамилия сотрудника – " + middleName);
        System.out.println("Отчество сотрудника – " + lastName);
    }

    public static void task6() {
        String fullName = "ivanov ivan ivanovich";
        String[] splattedFullName = fullName.split(" ");
        String[] copyOfSplattedFullName = new String[splattedFullName.length];
        for (int i = 0; i < splattedFullName.length; i++) {
            copyOfSplattedFullName[i] = Character.toUpperCase(splattedFullName[i].toCharArray()[0]) + splattedFullName[i].substring(1);
        }
        StringBuilder result = new StringBuilder();
        for (String s : copyOfSplattedFullName) {
            result.append(s);
            result.append(" ");
        }
        System.out.println("Верное написание ФИО сотрудника с заглавных букв – " + result.toString());
    }

    public static void task7() {
        String s1 = "123";
        String s2 = "456";
        StringBuilder stringBuilder = new StringBuilder(s1 + s2);
        System.out.println("Данные строки - " + stringBuilder.toString());
    }

    public static void task8() {
        String str = "aabccddefgghiijjkk";
        char[] chars = str.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1])
                result.append(chars[i]);
        }
        System.out.println(result.toString());
    }
}
