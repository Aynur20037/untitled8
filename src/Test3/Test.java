package Test3;

public class Test extends Exception {
    public static void generatorExceptions(String str) throws Exception {
        if (str.equals("NullPointerException")) {
            throw new NullPointerException("Сгенерировано NullPointerException");
        } else if (str.equals("ArithmeticException")) {
            throw new ArithmeticException("СгенерированоArithmeticException");
        } else if (str.equals("ArrayIndexOutOfBoundsException")) {
            throw new ArrayIndexOutOfBoundsException("Сгенерировано ArrayIndexOutOfBoundsException");
        } else throw new Exception("Неверный тип исключения " );

    }
}