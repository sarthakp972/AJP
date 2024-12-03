import java.util.Scanner;


abstract class Vaccine {
    int age;
    String nationality;


    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

  
    public void firstDose() {
        if ("Indian".equalsIgnoreCase(nationality) && age >= 18) {
            System.out.println("You are eligible for the first dose.");
            System.out.println("You need to pay 250 Rs for the vaccination.");
         
        } else {
            System.out.println("You are not eligible for the first dose.");
        }
    }

    public void secondDose(boolean firstDoseCompleted) {
        if (firstDoseCompleted) {
            System.out.println("You are eligible for the second dose.");
        } else {
            System.out.println("You must complete the first dose before taking the second dose.");
        }
    }

  
    abstract void boosterDose();
}


class VaccinationSuccessful extends Vaccine {

    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    void boosterDose() {
        System.out.println("You are receiving the booster dose.");
      
    }
}

public class VaccinationAbstract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  
        System.out.print("Enter your nationality: ");
        String nationality = scanner.nextLine();

        
        VaccinationSuccessful vaccinationSuccessful = new VaccinationSuccessful(age, nationality);

  
        vaccinationSuccessful.firstDose();

   
        boolean firstDoseCompleted = true;  
        vaccinationSuccessful.secondDose(firstDoseCompleted);

       
        vaccinationSuccessful.boosterDose();

        scanner.close();
    }
}
