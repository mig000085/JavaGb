package semenar1.task5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        System.out.println(result);
    }
}
