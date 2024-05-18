package semenar1.Homeword;

public class Answer {
    public int countNTriangle(int n) {
        // Проверка на ненатуральное число
        if (n < 1) {
            return -1;
        }
        // Вычисление n-го треугольного числа
        return n * (n + 1) / 2;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
class Printer {
    public static void main(String[] args) {
        int n = 0;

        if (args.length == 0) {
            // При отправке кода на выполнение, вы можете варьировать эти параметры
            n = 4;
        } else {
            n = Integer.parseInt(args[0]);
        }

        // Вывод результата на экран
        Answer ans = new Answer();
        int itresume_res = ans.countNTriangle(n);
        System.out.println(itresume_res);
    }
}
