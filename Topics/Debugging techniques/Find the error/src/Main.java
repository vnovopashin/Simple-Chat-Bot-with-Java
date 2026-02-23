import java.util.Scanner;

class Util {
    public static int[] swapInts(int[] ints) {
        int temp = ints[0];
        ints[0] = ints[1];
        ints[1] = temp;
        return ints;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ints = new int[2];
        ints[0] = Integer.parseInt(scanner.nextLine());
        ints[1] = Integer.parseInt(scanner.nextLine());

        Util.swapInts(ints);

        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }
}
/*
Ваши друзья попросили вас помочь им решить задачу по программированию.
Они пытались создать вспомогательный метод для обмена двух целых чисел,
но что-то пошло не так, и метод работает не так, как ожидалось.
Используйте свои навыки отладки, чтобы исправить проблему.
 */