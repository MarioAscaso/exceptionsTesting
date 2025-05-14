import matrixOperatorr.Matrix1;
import operatorrr.Division1;
import operatorrr.Division2;
import operatorrr.Division3;
import operatorrr.Division4;

public class MyExceptionApp {
    public static void main(String[] args) {

        int div1 = 10;
        int div2 = 5;
        int div3 = 0;

        Division1.division1(div1, div2);
        Division1.division1(div1, div3);

        Division2.division2(div1, div2);
        Division2.division2(div1, div3);

        Division3.division3(div1, div2);
        Division3.division3(div1, div3);

        //Division4.division4(10, 5);
        //Division4.division4(10, 0);

        int matrix1[][] = new int[3][3];
        int matrix2[][] = new int[3][3];

        Matrix1.addMatrix1(matrix1, matrix2);


    }
}
