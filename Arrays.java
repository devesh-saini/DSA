import java.util.Scanner;

class Arrays {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int rows = matrix.length;
        int cols = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        for (int inputRow = 0; inputRow < rows; inputRow++) {
            System.out.println("Row: " + (inputRow+1));
            for (int inputCol = 0; inputCol < cols; inputCol++) {
                System.out.print("Col: " + (inputCol+1) + ": ");
                matrix[inputRow][inputCol] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.print("Enter value to search: ");
        int value = sc.nextInt();

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == value) {
                    System.out.println("Value found at: [" + row + ", " + col + "]");
                }
            }
        }
    }
}
