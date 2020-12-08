package Function.SalaryIncreament;

public class Employee {
    String name;
    float salary;


    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        String s = String.format("(%s,%.2f)",name,salary);
        return s;
    }
}
