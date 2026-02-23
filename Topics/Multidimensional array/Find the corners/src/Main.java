class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        // write your code here
        int rows = twoDimArray.length;
        int firstRowLastIndex = twoDimArray[0].length - 1;
        int lastRowLastIndex = twoDimArray[rows - 1].length - 1;

        System.out.println(twoDimArray[0][0] + " " +
                twoDimArray[0][firstRowLastIndex] + " \n" +
                twoDimArray[rows - 1][0] + " " +
                twoDimArray[rows - 1][lastRowLastIndex]);

    }
}
