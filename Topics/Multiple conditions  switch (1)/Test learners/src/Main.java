import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str = scanner.nextLine();
        switch (str) {
            case "1":
                System.out.println("Yes!");
                break;
            case "2", "3", "4":
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number");
        }
    }
}
/*
Нам нужна ваша помощь в улучшении адаптивной системы.
Существует программа, которая спрашивает учащихся, какой язык программирования они изучают.
Есть четыре варианта ответа, один из них правильный:
    Java
    Котлин
    Скала
    Python
Ваша задача: считать число ответа из стандартного ввода и вывести результат проверки:
 «Да!», «Нет!» или «Неизвестное число». Надеемся, вы знаете, какой ответ правильный.
 Сам вопрос выводить не нужно.
 */