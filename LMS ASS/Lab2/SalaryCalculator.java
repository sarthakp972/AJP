
class User {
    
    int id;
    String name;

    
    User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


class Employee extends User {
 
    double salary;  

    
    Employee(int id, String name, double salary) {
        super(id, name);  // Call the constructor of User
        this.salary = salary;
    }

    
    double calculateAnnualSalary() {
        return salary * 12;  
    }
}

public class SalaryCalculator {
    public static void main(String[] args) {
      
        Employee employee = new Employee(1, "John Doe", 3000.0);
        
        
        double annualSalary = employee.calculateAnnualSalary();
        
        
        System.out.println("Employee ID: " + employee.id);
        System.out.println("Employee Name: " + employee.name);
        System.out.println("Monthly Salary: $" + employee.salary);
        System.out.println("Annual Salary: $" + annualSalary);
    }
}
