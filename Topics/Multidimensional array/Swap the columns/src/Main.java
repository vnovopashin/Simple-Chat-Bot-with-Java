import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int i = sc.nextInt();
        int j = sc.nextInt();
        sc.close();
        for (int k = 0; k < arr.length; k++) {
            int temp = arr[k][i];
            arr[k][i] = arr[k][j];
            arr[k][j] = temp;
        }

        for (int k = 0; k < arr.length; k++) {
            for (int l = 0; l < arr[k].length; l++) {
                System.out.print(arr[k][l] + " ");
            }
            System.out.println();
        }
    }
}

/*
Дана двумерная матрица и два числа: i и j.
Поменяйте местами столбцы с индексами i и j внутри матрицы.

Входные данные содержат матрицу размерами n и m, не превышающую 100,
затем элементы матрицы, а затем индексы i и j.
 */