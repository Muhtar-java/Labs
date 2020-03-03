package Task1;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee (int id, String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.id = id;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getID() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName(){
        return firstName + " " + lastName;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary() {
        return salary*12;
    }
    public int raiseSalary(int per) {
        salary = salary * per / 100 + salary;
        return salary;
    }
    public String toString() {
        return "Employee [id =  " + id + " ,name = " + firstName + " " + lastName + " ,salary = " + salary + "]" ;
    }
}
