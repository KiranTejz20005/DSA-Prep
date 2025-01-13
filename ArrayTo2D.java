public class ArrayTo2D {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int m = 2;
        int n = 2;
        int[][] result = new int[m][n];

        if (arr.length > m * n) {
            System.out.println("Input array is too large.");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            int row = i / n;
            int col = i % n;

            result[row][col] = arr[i];

        }
        
        System.out.println("2D Array:");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
