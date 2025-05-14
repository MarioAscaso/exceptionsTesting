package exception;

public class MyException extends Exception {

    public MyException(String msg) {super(msg);}

    public static MyException fromArithmeticException () {return new MyException("NO DIVIDIR ENTRE 0..");}
    public static MyException fromIOException(String msg){return new MyException(msg);}
    public static MyException fromIndexOutOfBounds(){return new MyException("NO COINCIDEN LAS FILAS CON LAS COLUMNAS..");}

}
