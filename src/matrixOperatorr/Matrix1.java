package matrixOperatorr;

public class Matrix1 {
    public static int[][] addMatrix1(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix2.length;
        int[][] matrixResult = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                matrixResult[row][column] = matrix1[row][column] + matrix2[row][column];
            }
        }
        return matrixResult;
    }

}
