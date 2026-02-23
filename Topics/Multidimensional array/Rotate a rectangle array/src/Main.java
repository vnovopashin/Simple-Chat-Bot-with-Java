import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // строки исходной
        int m = sc.nextInt();  // столбцы исходной
        int[][] arr = new int[n][m];
        int[][] rotate = new int[m][n];  // m строк, n столбцов после поворота

        // Чтение
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Поворот на 90° по часовой стрелке
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rotate[j][n - 1 - i] = arr[i][j];
            }
        }

        // Вывод
        for (int i = 0; i < rotate.length; i++) {
            for (int j = 0; j < rotate[i].length; j++) {
                System.out.print(rotate[i][j] + " ");
            }
            System.out.println();
        }
    }
}
