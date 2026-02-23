import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        // Your code here
        String[] arr = sentence.split(" ");
        int maxWord = 0;
        String result = null;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > maxWord) {
                maxWord = arr[i].length();
                result = arr[i];
            }
        }
        System.out.printf("%s", result);
    }
}
/*
Напишите программу на Java, которая принимает строку, представляющую собой предложение.
Ваша программа должна найти самое длинное слово в предложении и вывести его.
Предположим, что слова в предложении разделены одним пробелом и нет знаков препинания.
 */