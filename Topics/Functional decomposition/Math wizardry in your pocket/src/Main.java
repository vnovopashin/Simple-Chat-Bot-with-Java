import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        double num1 = Double.parseDouble(parts[0]);
        String operator = parts[1];
        double num2 = Double.parseDouble(parts[2]);

        double result = 0;

        switch (operator) {
            case "+":
                result = add(num1, num2);
                break;
            case "-":
                result = subtract(num1, num2);
                break;
            case "*":
                result = multiply(num1, num2);
                break;
            case "/":
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println(result);
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return b != 0 ? a / b : 0;
    }
}
/*
Разработайте простую программу-калькулятор, используя функциональную декомпозицию.
Создайте методы для сложения, вычитания, умножения и деления.
Основной метод должен принимать на вход два числа и оператор, а затем вызывать соответствующий метод в зависимости от оператора.
Обрабатывайте деление на ноль и недопустимые операторы.
Формат ввода: 'число1 оператор число2' (например, '5 + 3'). Выводите результат операции.
 */