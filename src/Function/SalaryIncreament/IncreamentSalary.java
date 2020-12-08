package Function.SalaryIncreament;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class IncreamentSalary {
    public static void main(String[] args){
        List<Employee> empList = new ArrayList();
        List<Employee> newEmpList = new ArrayList();

        populateEmployee(empList);
        Predicate<Employee> p = emp->emp.salary<=3500;
        Function<Employee,Employee> f= emp-> {
            emp.salary = emp.salary + 477;
            return emp;
        };
        System.out.println("Employee Detials: "+empList);
        for (Employee emp:empList) {
            if(p.test(emp)){
                f.apply(emp);
               newEmpList.add(emp); 
            }
            else 
                newEmpList.add(emp);
        }

        System.out.println("New Employee Details after salary revision: "+newEmpList);
        
    }

    private static void populateEmployee(List<Employee> empList) {
        empList.add(new Employee("Arka",50000));
        empList.add(new Employee("Debajyoti",80000));
        empList.add(new Employee("Shyam",3200));
        empList.add(new Employee("Ram",3000));
    }
}
