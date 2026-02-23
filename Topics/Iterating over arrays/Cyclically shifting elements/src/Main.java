import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int length = scanner.nextInt();
        int[] arr = new int[length];

        if (length > 0) {
            for (int i = 0; i < length; i++) {
                arr[(i + 1) % length] = scanner.nextInt();
            }
        }

        for (int i : arr) {
            System.out.printf("%d ", i);
        }
    }
}
