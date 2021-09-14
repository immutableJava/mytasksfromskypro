package pro.sky.java.course1.lesson5;

public class HomeWork5 {

    public static void main(String[] args) {
        task7();
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
        System.out.println("Данные ФИО сотрудника для заполнения отчета – " + fullName.toUpperCase());
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
        StringBuilder sb = new StringBuilder(fullName.trim());
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                sb.setCharAt(i + 1, Character.toUpperCase(sb.charAt(i + 1)));
            }
            if (i == 0) {
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            }
        }
        System.out.println("Верное написание ФИО сотрудника с заглавных букв – " + sb.toString());
    }

    public static void task7() {
        String s1 = "135";
        String s2 = "246";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            stringBuilder.append(s1.charAt(i));
            stringBuilder.append(s2.charAt(i));
        }
        System.out.println("Данные строки - " + stringBuilder.toString());
    }

    public static void task8() {
        String str = "aabccddefgghiijjkk";
        char[] chars = str.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < chars.length; i++) {
            if (i < chars.length - 1 && chars[i] == chars[i - 1] && chars[i] != chars[i + 1]) {
                result.append(chars[i]);
            } else if (chars[i] == chars[i - 1]) {
                result.append(chars[i]);
            }
        }
        System.out.println(result.toString());
    }
}
