import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        // function calls of isDivByThree, isDivByFive, isDivByThreeAndFive will be here
        if (num % 3 != 0 && num % 5 != 0) {
            System.out.println("None");
        } else {
            isDivByThree(num);
            isDivByFive(num);
            isDivByThreeAndFive(num);
        }
    }

    // function isDivByThree will be here
    public static void isDivByThree(int num) {
        if (num % 3 == 0 && num % 5 != 0) {
            System.out.println("Fizz");
        }
    }

    // function isDivByFive will be here
    public static void isDivByFive(int num) {
        if (num % 5 == 0 && num % 3 != 0) {
            System.out.println("Buzz");
        }
    }

    // function isDivByThreeAndFive will be here
    public static void isDivByThreeAndFive(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        }
    }
}
/*
Напишите программу на Java, которая принимает на вход целое число.
Если число делится на 3, она должна вывести «Fizz», если на 5 — «Buzz». Если число делится и на 3, и на 5, выведите «FizzBuzz».
Для любого другого целого числа просто выведите «None».
Вам необходимо создать отдельные методы для проверки делимости на 3, 5 и на оба числа одновременно.
 */