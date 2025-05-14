import matrixOperatorr.Matrix1;
import operatorrr.Division1;
import operatorrr.Division2;
import operatorrr.Division3;
import operatorrr.Division4;
import output.OutputScreen;

public class MyExceptionApp {
    public static void main(String[] args) {

        int div1 = 10;
        int div2 = 5;
        int div3 = 0;

        /*Division1.division1(div1, div2);
        Division1.division1(div1, div3);

        Division2.division2(div1, div2);
        Division2.division2(div1, div3);

        Division3.division3(div1, div2);
        Division3.division3(div1, div3);*/

        //Division4.division4(10, 5);
        //Division4.division4(10, 0);

        int matrix1[][] = new int[2][2];
        int matrix2[][] = new int[2][2];

        matrix1[0][0] = 3;
        matrix1[0][1] = 1;
        matrix1[1][0] = 2;
        matrix1[1][1] = 2;

        matrix2[0][0] = 4;
        matrix2[0][1] = 2;
        matrix2[1][0] = 5;
        matrix2[1][1] = 7;

        OutputScreen.showMatrixResult2x2(Matrix1.addMatrix1(matrix1, matrix2));

        int matrix3[][] = new int[3][3];
        int matrix4[][] = new int[3][3];

        matrix3[0][0] = 3;
        matrix3[0][1] = 1;
        matrix3[0][2] = 1;
        matrix3[1][0] = 2;
        matrix3[1][1] = 4;
        matrix3[1][2] = 2;
        matrix3[2][0] = 7;
        matrix3[2][1] = 8;
        matrix3[2][2] = 1;

        matrix4[0][0] = 3;
        matrix4[0][1] = 1;
        matrix4[0][2] = 1;
        matrix4[1][0] = 2;
        matrix4[1][1] = 2;
        matrix4[1][2] = 4;
        matrix4[2][0] = 2;
        matrix4[2][1] = 1;
        matrix4[2][2] = 6;

        OutputScreen.showMatrixResult3x3(Matrix1.addMatrix1(matrix3, matrix4));

    }
}
