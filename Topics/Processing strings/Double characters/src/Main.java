import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        char first;
        char second;
        for (int i = 0; i < str.length(); i++) {
            first = str.charAt(i);
            second = str.charAt(i);
            System.out.printf("%s%s", first, second);
        }
    }
}
