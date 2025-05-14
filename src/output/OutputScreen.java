package output;

public class OutputScreen implements OutputInterface {

    public static void showMatrixResult2x2(int[][] matrixResult) {
        int rows = matrixResult.length;
        int columns = matrixResult.length;
        int contadorInicioFin = 0;
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (contadorInicioFin == 0) {
                    System.out.print("| " + matrixResult[row][column] + " ");
                } else if (contadorInicioFin == 1) {
                    System.out.print(" " + matrixResult[row][column] + " |");
                } else {
                    System.out.print(matrixResult[row][column]);
                }
                contadorInicioFin++;
            }
            System.out.println();
            contadorInicioFin = 0;
        }
    }

    public static void showMatrixResult3x3(int[][] matrixResult) {
        int rows = matrixResult.length;
        int columns = matrixResult.length;
        int contadorInicioFin = 0;
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (contadorInicioFin == 0) {
                    System.out.print("| " + matrixResult[row][column] + " ");
                } else if (contadorInicioFin == 2) {
                    System.out.print(" " + matrixResult[row][column] + " |");
                } else {
                    System.out.print(matrixResult[row][column]);
                }
                contadorInicioFin++;
            }
            System.out.println();
            contadorInicioFin = 0;
        }
    }
}
