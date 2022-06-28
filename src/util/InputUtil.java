package util;

import java.util.Scanner;

public class InputUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static String inputSelection(String message) {
        System.out.print("message: " + message);
        return scanner.nextLine();
    }

    public static String inputString(String s) {
        return scanner.nextLine();
    }
}
