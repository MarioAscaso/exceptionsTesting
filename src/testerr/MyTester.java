package testerr;

import exception.MyException;
import operatorrr.Division1;
import matrixOperatorr.Matrix1;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyTester {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void setUpAfterClass() throws Exception {
    }

    @Test
    public void pruebaJUnit() {
        assertTrue(true);
    }

    @Test
    public void testWhenHappyPathDivision() {
        int div1 = 10;
        int div2 = 5;
        int div3 = 0;

        assertEquals(2, Division1.division1(div1, div2));
        assertNotEquals(1, Division1.division1(div1, div2));
    }

    @Test
    public void testWhenDivideByZero() {

        MyException arithmeticException = assertThrows(MyException.class, () -> {
            Division1.division1(0, 0);
        });

        String expectedMessage = "NO DIVIDIR ENTRE 0";
        String actualMessage = MyException.fromArithmeticException().getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }


    @Test
    public void testWhenHappyPathMatrix() {
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        int rows = matrix1.length;
        int columns = matrix2.length;
        int[][] matrixResult = new int[rows][columns];

        matrix1[0][0] = 3;
        matrix1[0][1] = 1;
        matrix1[1][0] = 2;
        matrix1[1][1] = 2;

        matrix2[0][0] = 4;
        matrix2[0][1] = 2;
        matrix2[1][0] = 5;
        matrix2[1][1] = 7;

        matrixResult[0][0] = 7;
        matrixResult[0][1] = 3;
        matrixResult[1][0] = 7;
        matrixResult[1][1] = 9;

        assertEquals(matrixResult, Matrix1.addMatrix1(matrix1, matrix2));

    }


}
