package Predicate.IsEqualMethod;

import java.util.Objects;

public class Employee {
    private String name;
    private String location;
    private float salary;
    private String designation;

    public Employee(String name, String location, float salary, String designation) {
        this.name = name;
        this.location = location;
        this.salary = salary;
        this.designation = designation;
    }


    @Override
    public String toString() {

        String s = String.format("(%s,%s,%.2f,%s)",name,location,salary,designation);
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Float.compare(employee.salary, salary) == 0 &&
                Objects.equals(name, employee.name) &&
                Objects.equals(location, employee.location) &&
                Objects.equals(designation, employee.designation);
    }

}
