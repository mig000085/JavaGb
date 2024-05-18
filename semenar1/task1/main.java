package semenar1.task1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String out = new String("Привет, %s");
        System.out.printf(out, s);
    }
}
