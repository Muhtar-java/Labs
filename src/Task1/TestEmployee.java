package Task1;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(01,"Muhtar","Kalken",2000);
        System.out.println("id = " + e1.getID() + " First Name: " + e1.getFirstName() + " Last Name: " + e1.getLastName());
        System.out.println("Employee: " + e1.getName() + ", Salary: " + e1.getSalary() + ", Annual salary: " + e1.getAnnualSalary());
        e1.setSalary(2500);
        System.out.println("Salary + 500: " + e1.getSalary());
        System.out.println("Salary + 20%: " + e1.raiseSalary(20));
        System.out.println(e1);
    }
}
