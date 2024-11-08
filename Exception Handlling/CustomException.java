
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
        System.out.println("we are inside the custom class");
    }
}


class AgeValidator {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older. Provided age: " + age);
        } else {
            System.out.println("Age is valid: " + age);
        }
    }
}


public class CustomException {
    public static void main(String[] args) {
      

        try {
            AgeValidator.validateAge(11); 
            
        } catch (InvalidAgeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
