package Test1;

public class Main {
    public static void main(String[] args) {
        int userAge = 19;
        try {
            if (userAge < 18) throw new InvalidAgeException();
            else {
                System.out.println("Возраст пользователя > 18");
            }

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
