import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = scanner.nextInt();
        int result = 0;
        for (int i : arr) {
            if (i > max) {
                result += i;
            }
        }
        System.out.println(result);
    }
}
/*
Сумма элементов массива, превышающих значение.

Напишите программу, которая считывает массив целых чисел и целое число n.
Программа должна суммировать все элементы массива, превышающие n.

Формат входных данных

Первая строка содержит размер массива.
Вторая строка содержит элементы массива, разделенные пробелами.
В третьей строке содержится число n.

Формат выходных данных

Сумма представлена ​​только одним числом.
 */