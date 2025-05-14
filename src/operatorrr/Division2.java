package operatorrr;

public class Division2 {
    public static float division2(int div1, int div2) {
        try {
            return div1 / div2;
        } catch (ArithmeticException arithmeticException) {
            System.err.println("NO DIVIDIR ENTRE 0");
            return -Integer.MAX_VALUE;
        }
    }
}
