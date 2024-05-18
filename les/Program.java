
package les;

/**
 * pogam
 */
/**
 * public class pogam {
 * 
 * public static void main(String[] args) { // снипит "clas"
 * System.out.println("bye worlde"); // снипит "sys"
 * 
 * }
 * }
 */

// Основы: типы данных
/**
 * class Program {
 * public static void main(String[] args) {
 * short age = 10;
 * int salary = 123456;
 * System.out.println(age); // 10
 * System.out.println(salary); // 123456
 * }
 * }
 * 
 * 
 * class Program {
 * public static void main(String[] args) {
 * float e = 2.7f;
 * double pi = 3.1415;
 * System.out.println(e); // 2.7
 * System.out.println(pi); // 3.1415
 * }
 * }
 */
/**
 * class Program {
 * public static void main(String[] args) {
 * char ch = '1';
 * System.out.println(Character.isDigit(ch)); // true
 * ch = 'a';
 * System.out.println(Character.isDigit(ch)); // false
 * }
 * }
 */
/**
 * public class Program {
 * public static void main(String[] args) {
 * boolean flag1 = 123 <= 234;
 * System.out.println(flag1); // true
 * boolean flag2 = 123 >= 234 || flag1;
 * System.out.println(flag2); // true
 * boolean flag3 = flag1 ^ flag2;
 * System.out.println(flag3); // false
 * }
 * }
 */
// Основы: типы данных *Строки не так просты
/**
 * public class Program {
 * public static void main(String[] args) {
 * String msg = "Hello world";
 * System.out.println(msg); // Hello world
 * }
 * }
 */
// Неявная типизация
/**
 * public class Program {
 * public static void main(String[] args) {
 * var a = 123;
 * System.out.println(a); // 123
 * var d = 123.456;
 * System.out.println(d); // 123.456
 * }
 * }
 */
/**
 * public class Program {
 * public static void main(String[] args) {
 * var a = 123;
 * System.out.println(a); // 123
 * var d = 123.456;
 * System.out.println(d); // 123.456
 * System.out.println(getType(a)); // Integer
 * System.out.println(getType(d)); // Double
 * d = 1022;
 * System.out.println(d); // 1022
 * // d = "mistake";
 * // error: incompatible types:
 * // String cannot be converted to double
 * }
 * 
 * static String getType(Object o) {
 * return o.getClass().getSimpleName();
 * }
 * }
 */
/**
 * Операции Java
 * Program
 */
/**
 * public class Program {
 * 
 * public static void main(String[] args) {
 * int a = 20;
 * // a = --a - --a; // 1
 * // a = a-- - --a; // 2
 * //a = --a - a--; // 0
 * System.out.println(a); // Исправлено для вывода значения 'a'
 * }
 * }
 */
/**
 * Program
 */
/**
 * public class Program {
 * 
 * public static void main(String[] args) {
 * int a = 18;
 * // 10010
 * // a = a << 1;
 * System.out.println(a >> 1);
 * } // 1001
 * }
 */

/**
 * Program
 */
/**
 * public class Program {
 * 
 * public static void main(String[] args) {
 * int a = 5;
 * int b = 2;
 * System.out.println(a | b); // 101 // 010 // 111
 * System.out.println(a & b);// 101 // 010 // 000
 * }
 * 
 * }
 */
/**
 * Program
 */

/**
 * public class Program {
 * public static void main(String[] args) {
 * String s = "qwer";// 4. 0..3
 * boolean b = s.length() >= 5 && s.charAt(4) == '1';
 * System.out.println(b);
 * 
 * }
 * }
 */
// Массивы Одноименые
/**
 * public class Program {
 * public static void main(String[] args) {
 * int[] arr = new int[10];
 * System.out.println(arr.length); // 10
 * arr = new int[] { 1, 2, 3, 4, 5 };
 * System.out.println(arr.length); // 5
 * }
 * }
 */
// Массивы Многомерные

/**public class Program {
public static void main(String[] args) {
int[] arr[] = new int[3][5];
for (int[] line : arr) {
for (int item : line) {
System.out.printf("%d ", item);
}
System.out.println();
}
}
}
*/
/**
 * public class Program {
 * public static void main(String[] args) {
 * int[][] arr = new int[3][5];
 * for (int i = 0; i < arr.length; i++) {
 * for (int j = 0; j < arr[i].length; j++) {
 * System.out.printf("%d ", arr[i][j]);
 * }
 * System.out.println();
 * }
 * }
 * }
 */

// Преобразования
/**
 * public class Program {
 * public static void main(String[] args) {
 * int i = 123;
 * double d = i;
 * System.out.println(i); // 123
 * System.out.println(d); // 123.0
 * d = 3.1415;
 * i = (int) d;
 * System.out.println(d); // 3.1415
 * System.out.println(i); // 3
 * d = 3.9415;
 * i = (int) d;
 * System.out.println(d); // 3.9415
 * System.out.println(i); // 3
 * byte b = Byte.parseByte("123");
 * System.out.println(b); // 123
 * b = Byte.parseByte("1234");
 * System.out.println(b); // NumberFormatException: Value out of range
 * }
 * }
 */

// Получение данных из терминала Строки
/**
 * import java.util.Scanner;ivan
 * 
 * public class Program {
 * public static void main(String[] args) {
 * Scanner iScanner = new Scanner(System.in);
 * System.out.printf("name: ");
 * String name = iScanner.nextLine();
 * System.out.printf("Привет, %s!", name);
 * iScanner.close();
 * }
 * }
 */

/**
 * import java.util.Scanner;
 * 
 * public class Program {
 * public static void main(String[] args) {
 * Scanner iScanner = new Scanner(System.in);
 * System.out.printf("int a: ");
 * int x = iScanner.nextInt();
 * System.out.printf("double a: ");
 * double y = iScanner.nextDouble();
 * System.out.printf("%d + %f = %f", x, y, x + y);
 * iScanner.close();
 * }
 * }
 */
/**
 * import java.util.Scanner;
 * 
 * public class Program {
 * public static void main(String[] args) {
 * Scanner iScanner = new Scanner(System.in);
 * System.out.printf("int a: ");
 * boolean flag = iScanner.hasNextInt();
 * System.out.println(flag);
 * int i = iScanner.nextInt();
 * System.out.println(i);
 * iScanner.close();
 * }
 * }
 */

// Форматированный вывод
/**
 * public class Program {
 * public static void main(String[] args) {
 * int a = 1, b = 2;
 * int c = a + b;
 * String res = a + " + " + b + " = " + c;
 * System.out.println(res);
 * }
 * }
 */

/**
 * public class Program {
 * public static void main(String[] args) {
 * int a = 1, b = 2;
 * int c = a + b;
 * String res = String.format("%d + %d = %d \n", a, b, c);
 * System.out.printf("%d + %d = %d \n", a, b, c);
 * System.out.println(res);
 * }
 * }
 */

/**
 * Виды спецификаторов
 * %d: целочисленных значений
 * %x: для вывода шестнадцатеричных чисел
 * %f: для вывода чисел с плавающей точкой
 * %e: для вывода чисел в экспоненциальной форме,
 * например, 3.1415e+01
 * %c: для вывода одиночного символа
 * %s: для вывода строковых значени
 */

/**
 * public class Program {
 * public static void main(String[] args) {
 * float pi = 3.1415f;
 * System.out.printf("%f\n", pi); // 3,141500
 * System.out.printf("%.2f\n", pi); // 3,14
 * System.out.printf("%.3f\n", pi); // 3,141
 * System.out.printf("%e\n", pi); // 3,141500e+00
 * System.out.printf("%.2e\n", pi); // 3,14e+00
 * System.out.printf("%.3e\n", pi); // 3,141e+00
 * }
 * }
 */
// Функции и методы

/**
 * public class Program {
 * static void sayHi() {
 * System.out.println("hi!");
 * }
 * 
 * static int sum(int a, int b) {
 * return a + b;
 * }
 * 
 * static double factor(int n) {
 * if (n == 1)
 * return 1;
 * return n * factor(n - 1);
 * }
 * 
 * public static void main(String[] args) {
 * sayHi(); // hi!
 * System.out.println(sum(1, 3)); // 4
 * System.out.println(factor(5)); // 120.0
 * }
 * }
 */

// Управляющие конструкции: условный оператор

/**
 * public class Program {
 * public static void main(String[] args) {
 * int a = 1;
 * int b = 2;
 * int c;
 * if (a > b) {
 * c = a;
 * } else {
 * c = b;
 * }
 * System.out.println(c);
 * }
 * }
 */

// Оператор выбора

/**
 * import java.util.Scanner;
 * 
 * public class Program {
 * public static void main(String[] args) {
 * Scanner scanner = new Scanner(System.in); // Создание объекта Scanner
 * System.out.print("Введите номер месяца: ");
 * int month = scanner.nextInt(); // Чтение значения месяца от пользователя
 * String text = "";
 * 
 * switch (month) {
 * case 1:
 * case 2:
 * case 3:
 * text = "Winter";
 * break;
 * case 4:
 * case 5:
 * case 6:
 * text = "Spring";
 * break;
 * case 7:
 * case 8:
 * case 9:
 * text = "Summer";
 * break;
 * case 10:
 * case 11:
 * case 12:
 * text = "Autumn";
 * break;
 * default:
 * text = "Mistake";
 * break;
 * }
 * 
 * System.out.println(text);
 * scanner.close(); // Закрытие объекта Scanner
 * }
 * }
 */

// Циклы

// Цикл while

/**
 * public class Program {
 * 
 * public static void main(String[] args) {
 * int value = 321;
 * int count = 0;
 * while (value != 0) {
 * value /= 10;
 * count++;
 * }
 * System.out.println(count);
 * }
 * }
 */
// Цикл do while
/**
 * public class Program {
 * public static void main(String[] args) {
 * int value = 321;
 * int count = 0;
 * do {
 * value /= 10;
 * count++;
 * } while (value != 0);
 * System.out.println(count);
 * }
 * }
 */
// Оператор цикла for
/**
 * public class Program {
 * public static void main(String[] args) {
 * int s = 0;
 * for (int i = 1; i <= 10; i++) {
 * s += i;
 * }
 * System.out.println(s);
 * }
 * }
 */

// Работа с файлами

/**
 * import java.io.FileWriter;
 * import java.io.IOException;
 * 
 * public class Program {
 * public static void main(String[] args) {
 * try (FileWriter fw = new FileWriter("file.txt", false)) {
 * fw.write("line 1");
 * fw.append('\n');
 * fw.append('2');
 * fw.append('\n');
 * fw.write("line 3");
 * fw.flush();
 * } catch (IOException ex) {
 * System.out.println(ex.getMessage());
 * }
 * }
 * }
 */

/**
 * import java.io.*;
 * // Чтение Вариант посимвольно
 * 
 * public class Program {
 * public static void main(String[] args) throws Exception {
 * FileReader fr = new FileReader("file.txt");
 * int c;
 * while ((c = fr.read()) != -1) {
 * char ch = (char) c;
 * if (ch == '\n') {
 * System.out.print(ch);
 * } else {
 * System.out.print(ch);
 * }
 * }
 * }
 * }
 */

// Вариант построчно

import java.io.*;

public class Program {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }
}