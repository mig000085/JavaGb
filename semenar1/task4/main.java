package semenar1.task4;

public class main {
    public static void main(String[] args) {
        String s = "Добро пожаловать на курс JAVA";
        String[] array = s.split(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i] + " ");
        }
    }
}
