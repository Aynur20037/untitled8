package Test3;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.generatorExceptions("abc");
        } catch (NullPointerException e) {
            System.out.println("Перехвачено исключение NullPointerException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Перехвачено исключение ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Перехвачено исключение ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Перехвачено исключение Exception: " + e.getMessage());
        }
    }
}
