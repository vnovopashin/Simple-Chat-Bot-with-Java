import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int n = Integer.parseInt(arr[1]);
        if (n < arr[0].length()) {
            String substring = arr[0].substring(n);
            String substring2 = arr[0].substring(0, n);
            System.out.println(substring + substring2);
        } else {
            System.out.println(arr[0]);
        }
    }
}
/*
Напишите программу, которая считывает строку s и целое число n,
а затем перемещает первые n символов строки s в конец строки.
Программа должна вывести измененную строку. Если n больше длины строки,
она должна вывести строку без изменений.

Обратите внимание, что метод подстроки может вам помочь,
но вы можете выбрать другой способ решения проблемы.

Формат входных данных

Единственная входная строка содержит символы s и n, разделённые пробелом.
 */