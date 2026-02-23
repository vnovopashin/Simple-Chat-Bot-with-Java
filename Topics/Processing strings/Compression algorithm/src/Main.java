import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder compressed = new StringBuilder();
        char currentChar = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                count++;
            } else {
                compressed.append(currentChar).append(count);
                currentChar = s.charAt(i);
                count = 1;
            }
        }

        // Добавляем последнюю группу
        compressed.append(currentChar).append(count);

        System.out.println(compressed.toString());
    }
}
