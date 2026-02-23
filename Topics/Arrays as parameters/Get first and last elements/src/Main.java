import java.util.*;

public class Main {

    // write a method here
    public static int[] getFirstAndLast(int[] array) {
        return new int[]{array[0], array[array.length - 1]};
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}
/*
Напишите метод с именем getFirstAndLast. Метод должен принимать массив целых чисел и возвращать новый массив целых чисел.
Возвращаемый массив должен содержать два элемента: первый и последний элементы входного массива.

Гарантируется, что входной массив всегда будет содержать как минимум один элемент.
 */