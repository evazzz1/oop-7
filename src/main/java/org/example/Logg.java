package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Logg {

    private static List<String> ll = new ArrayList<>();

    private Logg() {
    }

    public static void addToLog(String text) {
        ll.add(text);
        if (!(isNumber(text)) && !(isFloat(text))) {
            System.out.println(text);
        }
    }
    public static boolean isNumber(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isFloat(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void printLog() {
        System.out.println("Хотите ли вы вывести логирование? Напишите yes, если да");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextLine().equals("yes")) {
            System.out.println("\n Вывод всех логов:");
            int i = 1;
            for (String element : ll) {
                System.out.println("лог № \t" + i + ": \t" + element + " \n");
                i++;
            }
        }
    }
}