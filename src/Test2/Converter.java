package Test2;

public class Converter {
    public static void converter(String n) {

        try {
            if (n == null) {
                throw new NullPointerException();
            }
            int number = Integer.parseInt(n);
            System.out.println(number);
        } catch (NullPointerException e) {
            System.out.println("передана null строка");
        } catch ( NumberFormatException e ){
            System.out.println("не может быть преобразована в число");
        }
    }


}

