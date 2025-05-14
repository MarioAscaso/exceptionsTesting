package operatorrr;

import exception.MyException;

public class Division4 {
    public static float division4(int div1, int div2) throws MyException {
        try {
            return div1 / div2;
        } catch (ArithmeticException arithmeticException) {
            throw MyException.fromArithmeticException();
        }
    }

}
