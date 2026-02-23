import java.util.Scanner;
import java.util.Arrays;

class Main {
    // implement me
    private static void rotate(int[] arr, int steps) {
        if (arr == null || arr.length <= 1) return;

        int n = arr.length;
        steps = steps % n;
        if (steps < 0) steps += n;
        if (steps == 0) return;

        // 1. Реверсируем весь массив
        reverse(arr, 0, n - 1);
        // 2. Реверсируем первую часть (первые steps элементов)
        reverse(arr, 0, steps - 1);
        // 3. Реверсируем вторую часть (остальные элементы)
        reverse(arr, steps, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
/*
Правое вращение — это операция, которая сдвигает каждый элемент массива вправо.
Например, если массив имеет вид {1,2,3,4,5}, и мы повернем его вправо на 1, новый массив будет {5,1,2,3,4}.
Если мы повернем его на 2, новый массив будет {4,5,1,2,3}. Это выглядит так: {1,2,3,4,5} -> {5,1,2,3,4} -> {4,5,1,2,3}.

Реализуйте метод rotate, который выполняет поворот массива вправо на заданное число.

Обратите внимание: если ваше решение получает предупреждение о качестве кода "System.arraycopy более эффективен",
пожалуйста, просто проигнорируйте его для этого задания по коду.
 */