import java.util.Scanner;

public class Main {

    public static int sign(int number) {
        // write your code here
        return number < 0 ? -1 : number > 0 ? 1 : 0;

    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}
/*
Напишите метод с именем sign, который принимает целое число и проверяет,
является ли это число отрицательным, положительным или равным нулю.
Метод должен возвращать соответственно -1, +1 или 0.
 */