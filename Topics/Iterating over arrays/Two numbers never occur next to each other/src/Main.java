import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean result = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == n && arr[i - 1] == m
                    || arr[i] == m && arr[i - 1] == n) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}