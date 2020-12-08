package Function.TotalSalary;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class CalculateSalary {
    public static void main(String[] args){
        float totalSalary=0;
        List<Employee>listEmployee = new ArrayList();
        populateEmployee(listEmployee);
        Function<Employee,Float> f = emp -> emp.salary;

        for (Employee emp:listEmployee) {
            totalSalary  =totalSalary+ f.apply(emp);
        }
        System.out.println("Total Salary is: "+totalSalary);
    }

    private static void populateEmployee(List<Employee> listEmployee) {
        listEmployee.add(new Employee("Arka",60000));
        listEmployee.add((new Employee("Debajyoti",100000)));
        listEmployee.add(new Employee("Ram",150000));
    }
}
