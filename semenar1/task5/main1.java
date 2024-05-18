package semenar1.task5;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = pow(a, b);
        System.out.println(c);
    }

    public static int pow(int a, int b) {
        if (b == 1) {
            return a;
        } else {
            return a * pow(a, b - 1);
        }
    }
}
