package Test1;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(){
        super(" Возраст пользователя < 18");
    }
}
