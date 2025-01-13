class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0];
        }

        int[][] result = new int[m][n];
        for (int i = 0; i < original.length; i++) {
            result[i / n][i % n] = original[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 2, 3, 4};
        int m1 = 2;
        int n1 = 2;

        int[][] result = s.construct2DArray(arr, m1, n1);

        print2DArray(result);
    }

    public static void print2DArray(int[][] arr) {
        if (arr.length == 0) {
            System.out.println("Cannot construct 2D array.");
            return;
        }

        System.out.println("2D Array:");
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

