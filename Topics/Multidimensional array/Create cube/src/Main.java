import java.util.Arrays;

class ArrayOperations {
    public static int[][][] createCube() {
        // write your code here
        int[][][] arr = new int[3][3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    arr[i][j][k] = j * 3 + k;
                }
            }
        }
        return arr;
    }
}